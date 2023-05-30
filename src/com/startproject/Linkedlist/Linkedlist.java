package com.startproject.Linkedlist;

class Linkedlist {
	private Node first=null;
	private int count;
	
	public String toString() {
		String s="[";
		if(first==null) {
			s+="]"+" = Empty List";
			return s;
		}
		Node curr=first;
		for(int i=1;i<=size();i++) {
			s+=curr.element;
			if(i<size()) s+=",";
			curr=curr.nextNodeAdd;
		}
		s+="]"+" = List with "+size()+" Elements";
		return s;
	}
	
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null);
			count++;
			return;
		}
		Node last=first;
		while(last.nextNodeAdd!=null) {
			last=last.nextNodeAdd;
		}
		last.nextNodeAdd=new Node(e,null);
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public Object get(int index) {
		if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.nextNodeAdd;
		}
		return curr.element;
	}
	
	public void add(int index,Object e) {
		if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.nextNodeAdd;
		}
		curr.nextNodeAdd=new Node(e, curr.nextNodeAdd);
		count++;
	}
	
	public void remove(int index) {
		if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.nextNodeAdd;
		}
		curr.nextNodeAdd=curr.nextNodeAdd.nextNodeAdd;
		count--;
	}
	
	public void clear() {
		first=null;
		count=0;
	}
	
	public void reverse() {
		Node prev=null;
		Node next=null;
		Node curr=first;
		while(curr!=null) {
			next=curr.nextNodeAdd;
			curr.nextNodeAdd=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
	
	
	
	
	
	
}
