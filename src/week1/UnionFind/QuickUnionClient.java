package week1.UnionFind;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class QuickUnionClient {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream(new File("tinyUF.txt"));
		sc = new Scanner(in);
		int n = sc.nextInt();
		// 初始化动态链接
		QuickUnionUF uf = new QuickUnionUF(n);
		while (sc.hasNextLine()) {
			// 读取动态链接对
			int p = sc.nextInt();
			int q = sc.nextInt();
			// 若未链接则进行链接并输出
			if (!uf.connected(p, q)) {
				uf.union(p, q);
				System.out.println(p + " " + q);
			}
		}
		uf.print();
	}
}
