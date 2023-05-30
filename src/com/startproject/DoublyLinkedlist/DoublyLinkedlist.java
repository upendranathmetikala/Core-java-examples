package com.startproject.DoublyLinkedlist;

public class DoublyLinkedlist {
	private Node first;
	private Node last=null;
	private int count=0;
	
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
			curr=curr.next;
		}
		s+="]"+" = List with "+size()+" Elements";
		return s;
	}
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e,null,last);
		last=last.next;
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public Object get(int index) {
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=1;i<=index;i++) {
			curr=curr.next;
		}
		return curr.element;
	}
	
	public void add(int index,Object e) {
		if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			first=new Node(e,first,null);
			first.next.prev=first;
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next,curr);
		curr.next.next.prev=curr.next;
		count++;
	}
	
	public void remove(int index) {
		if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
		if(index==0) {
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		if(index<size()-1) curr.next.prev=curr;
		else last=last.prev;
		count--;
	}
	
	public void clear() {
		first=null;
		last=null;
		count=0;
	}
	
	public void reverse() {
		first=last;
		Node curr=first;
		while(curr.prev!=null) {
			Node temp=curr.next;
			curr.next=curr.prev;
			curr.prev=temp;
			curr=curr.next;
		}
	}
	
	
	
	
	
	
	
}
