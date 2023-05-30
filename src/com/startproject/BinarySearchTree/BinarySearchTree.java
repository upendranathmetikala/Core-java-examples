package com.startproject.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	private Node root=null;
	private int count=0;
	
	public void add(int k) {
		if(root==null) {
			root=new Node(k, null, null);
			count++;
			return;
		}
		Node prev=null;
		Node curr=root;
		while(curr!=null) {
			if(k<curr.key) {
				prev=curr;
				curr=curr.left;
			}
			else if(k>curr.key) {
				prev=curr;
				curr=curr.right;
			}
			else return;
		}
		if(k<prev.key) prev.left=new Node(k,null,null);
		else prev.right=new Node(k, null, null);
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public void levelOreder() {
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null) q.add(root);
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
		}
		System.out.println();
	}
	
	public void preorderTraverse() {
		preorder(root);
		System.out.println();
	}
	private void preorder(Node n) {
		if(n==null) return;
		System.out.print(n.key+" ");
		preorder(n.left);
		preorder(n.right);
	}
	
	public void postorderTraverse() {
		postorder(root);
		System.out.println();
	}
	private void postorder(Node n) {
		if(n==null) return;
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.key+" ");
	}
	
	public void inorderTraverse() {
		inorder(root);
		System.out.println();
	}
	private void inorder(Node n) {
		if(n==null) return;
		inorder(n.left);
		System.out.print(n.key+" ");
		inorder(n.right);
	}
}
