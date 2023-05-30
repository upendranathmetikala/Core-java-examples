package com.startproject.Hashing;

public class Set<T> {
	private Node[] a=new Node[10];
	private int count;
	
	public boolean add(T k) {
		int index=k.hashCode()%10;
		index=Math.abs(index);
		if(a[index]==null) {
			a[index]=new Node(k,null); 
			count++;
			return true;
		}
		Node prev=null;
		Node curr=a[index];
		while(curr!=null) {
			if(k.equals(curr.key)) return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(k,null);
		count++;
		return true;
	}
	
	void display() {
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				System.out.println(curr.key);
				curr=curr.next;
			}
		}
	}
	
	public int size() {
		return count++;
	}
}
