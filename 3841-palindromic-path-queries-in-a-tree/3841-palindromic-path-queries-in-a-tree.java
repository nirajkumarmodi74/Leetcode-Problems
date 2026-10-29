import java.util.*;

class LazyPropagationSegmentTree {
    int n;
    int[] tree, lazy;
    LazyPropagationSegmentTree(int[] a) {
        n = a.length;
        tree = new int[4 * n];
        lazy = new int[4 * n];
        build(1, 0, n - 1, a);
    }
    void build(int i, int l, int r, int[] a) {
        if (l == r) {
            tree[i] = a[l];
            return;
        }
        int m = (l + r) / 2;
        build(2 * i, l, m, a);
        build(2 * i + 1, m + 1, r, a);
        tree[i] = tree[2 * i] ^ tree[2 * i + 1];
    }
    void push(int i, int l, int r) {
        if (lazy[i] == 0) return;
        tree[i] ^= lazy[i];
        if (l != r) {
            lazy[2 * i] ^= lazy[i];
            lazy[2 * i + 1] ^= lazy[i];
        }
        lazy[i] = 0;
    }
    void update(int i, int l, int r, int ql, int qr, int val) {
        push(i, l, r);
        if (ql > r || qr < l) return;
        if (ql <= l && r <= qr) {
            lazy[i] ^= val;
            push(i, l, r);
            return;
        }
        int m = (l + r) / 2;
        update(2 * i, l, m, ql, qr, val);
        update(2 * i + 1, m + 1, r, ql, qr, val);
        tree[i] = tree[2 * i] ^ tree[2 * i + 1];
    }
    int query(int i, int l, int r, int ql, int qr) {
        push(i, l, r);
        if (ql > r || qr < l) return 0;
        if (ql <= l && r <= qr) return tree[i];
        int m = (l + r) / 2;
        return query(2 * i, l, m, ql, qr)
                ^ query(2 * i + 1, m + 1, r, ql, qr);
    }
    void updateRange(int l, int r, int val) {
        update(1, 0, n - 1, l, r, val);
    }
    int queryRange(int l, int r) {
        return query(1, 0, n - 1, l, r);
    }
}
class Lift {
    int[][] up;
    int[] depth;
    int log;
    Lift(int n, List<Integer>[] g) {
        log = Math.max(1, 32 - Integer.numberOfLeadingZeros(n));
        up = new int[log][n];
        depth = new int[n];
        int[] par = new int[n];
        Arrays.fill(par, -1);
        int[] st = new int[n];
        int top = 0;
        st[top++] = 0;
        par[0] = 0;
        while (top > 0) {
            int u = st[--top];
            up[0][u] = par[u];
            for (int k = 1; k < log; k++)
                up[k][u] = up[k - 1][up[k - 1][u]];
            for (int v : g[u]) {
                if (v == par[u]) continue;
                par[v] = u;
                depth[v] = depth[u] + 1;
                st[top++] = v;
            }
        }
    }
    int lca(int a, int b) {
        if (depth[a] < depth[b]) {
            int t = a;
            a = b;
            b = t;
        }
        int d = depth[a] - depth[b];
        for (int k = 0; k < log; k++)
            if (((d >> k) & 1) != 0) a = up[k][a];
        if (a == b) return a;
        for (int k = log - 1; k >= 0; k--) {
            if (up[k][a] != up[k][b]) {
                a = up[k][a];
                b = up[k][b];
            }
        }
        return up[0][a];
    }
}
class Solution {
    int mask(char c) {
        return 1 << (c - 'a');
    }
    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
        List<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }
        Lift lift = new Lift(n, g);
        int[] pos = new int[n], sz = new int[n], par = new int[n];
        int[] order = new int[n], stack = new int[n];
        Arrays.fill(par, -1);
        int top = 0, timer = 0;
        stack[top++] = 0;
        par[0] = 0;
        while (top > 0) {
            int u = stack[--top];
            pos[u] = timer;
            order[timer++] = u;
            for (int v : g[u]) {
                if (v == par[u]) continue;
                par[v] = u;
                stack[top++] = v;
            }
        }
        Arrays.fill(sz, 1);
        for (int i = n - 1; i > 0; i--)
            sz[par[order[i]]] += sz[order[i]];
        char[] val = s.toCharArray();
        int[] rootMask = new int[n];
        for (int u : order) {
            rootMask[pos[u]] = mask(val[u]);
            if (u != 0)
                rootMask[pos[u]] ^= rootMask[pos[par[u]]];
        }
        LazyPropagationSegmentTree seg = new LazyPropagationSegmentTree(rootMask);
        List<Boolean> ans = new ArrayList<>();
        for (String q : queries) {
            String[] p = q.split("\\s+");
            int u = Integer.parseInt(p[1]);
            if (p[0].equals("update")) {
                char c = p[2].charAt(0);
                int delta = mask(val[u]) ^ mask(c);
                seg.updateRange(pos[u], pos[u] + sz[u] - 1, delta);
                val[u] = c;
            } else {
                int v = Integer.parseInt(p[2]);
                int w = lift.lca(u, v);
                int res = seg.queryRange(pos[u], pos[u])
                        ^ seg.queryRange(pos[v], pos[v])
                        ^ mask(val[w]);
                ans.add(Integer.bitCount(res) <= 1);
            }
        }
        return ans;
    }
}