package week1.UnionFind;

public class QuickUnionUF {
	private int[] nodes;
	private int length;

	// 构造函数
	public QuickUnionUF(int n) {
		// 初始化数组，每个节点id为父节点id
		nodes = new int[n];
		length = n;
		for (int i = 0; i < n; i++) {
			nodes[i] = i;
		}
	}

	// 链接p,q
	public void union(int p, int q) {
		//将p的根元素链接到q的根元素上
		nodes[root(p)] = root(q); 
	}

	//找节点的根元素
	public int root(int p){
		//根元素的nodes_id与自身相同
		while(nodes[p] != p){
			p = nodes[p];
		}
		return p;
	}
	
	
	// 查看p,q是否已链接
	public boolean connected(int p, int q) {
		return root(p)==root(q);
	}

	// 查看p属于哪颗树
	public int find(int p) {
		return root(p);
	}

	// 查看集合数目
	public int count() {
		int i = 0;
		for(int j = 0; j<nodes.length; j++)
		{
			if(nodes[j] == j) i++;
		}
		return i;
	}

	// 查看所有节点集合
	public void print() {
		for (int i = 0; i < length; i++) {
			System.out.print(nodes[i]);
		}
	}
}
