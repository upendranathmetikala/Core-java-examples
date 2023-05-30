package com.startproject.BinarySearchTree;

public class Demo {

	public static void main(String[] args) {
		BinarySearchTree b=new BinarySearchTree();
		b.add(50);
		b.add(75);
		b.add(25);
		b.add(10);
		b.add(60);
		b.add(40);
		b.add(100);
		b.levelOreder();
		b.preorderTraverse();
		b.postorderTraverse();
		b.inorderTraverse();
	}

}
