package week1.UnionFind;

/**
 * 该类用于进行动态链接
 * 
 * @author Administrator
 *
 */
public class UF {
	private int[] nodes;
	private int length;

	// 构造函数
	public UF(int n) {
		// 初始化数组，每个节点有不同的id
		nodes = new int[n];
		length = n;
		for (int i = 0; i < n; i++) {
			nodes[i] = i;
		}
	}

	// 链接p,q
	public void union(int p, int q) {
		int pnodes = nodes[p];
		int qnodes = nodes[q];
		// 将所有nodes[]=nodes[q]的节点变成nodes[p]
		for (int i = 0; i < length; i++) {
			if (nodes[i] == qnodes) {
				nodes[i] = pnodes;
			}
		}
	}

	// 查看p,q是否已链接
	public boolean connected(int p, int q) {
		if (nodes[p] == nodes[q])
			return true;
		return false;
	}

	// 查看p属于哪个集合
	public int find(int p) {
		return nodes[p];
	}

	// 查看集合数目
	public int count() {
		return 0;
	}
	
	//查看所有节点集合
	public void print(){
		for(int i = 0; i<length; i++){
			System.out.print(nodes[i]);
		}
	}
}
