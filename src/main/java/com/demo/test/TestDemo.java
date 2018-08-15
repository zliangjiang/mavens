package com.demo.test;

public class TestDemo {
	/**
	 * 静态全局计数器  当其值为k 输出arr[index]
	 */
	private static int count=0;
	
	/**
	 * 中序遍历二叉查找树的数组  
	 * 数组中每个索引为index的 元素 其前驱节点存储在 2*index+1或不存在
	 * 其后继节点存储在 2*index+1或不存在
	 * 函数返回-1时表示没有找到第k小的值 
	 * @param arr
	 * @param index
	 * @param length
	 * @param k
	 * @return
	 */
	public static int  midVisitor(int arr[], int index, int length, int k) {
		if(index<length && arr[index] != -1) {
			int ret = midVisitor(arr, 2*index+1, length, k);
			if( ret != -1)
				return ret;
			count++;
			if(count == k)
				return arr[index];
			ret = midVisitor(arr, 2*index+2, length, k);
			if(ret != -1)
				return ret;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int root[] = {3,1,4,-1,2};
		int ret = TestDemo.midVisitor(root, 0, 5, 1);
		//int root[] = {5,3,6,2,4,-1,-1,1};
		//int ret = TestDemo.midVisitor(root, 0, 8, 3);
		System.out.println(ret);
	}

}
