package com.startpackage.ArrayList;

public class Arraylist {
	private Object[] a=new Object[5];
	private int pos=0;
	
	public String toString() {
		String s="[";
		if(size()==0) return s+="] = Empty Arraylist";
		s+=a[0];
		for(int i=1;i<size();i++) {
			s+=","+a[i];
		}
		s+="]"+" = Arraylist with "+size()+" Elements";
		return s;
	}
	
	public void add(Object e) {
		if(pos>=a.length) increase();
		a[pos++]=e;
	}
	private void increase(){
		Object[] b=new Object[a.length+3];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		a=b;
	}
	
	public int length() {
		return a.length;
	}
	
	public int size() {
		return pos;
	}
	
	public Object get(int index) {
		if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
		return a[index];
	}
	
	public void add(int index,Object e) {
		if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
		if(a.length<=size()) increase();
		for(int i=size()-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		a[index]=e;
		pos++;
	}
	
	public void remove(int index) {
		if(index<=-1 || index>=size()) throw new IndexOutOfBoundsException();
		for(int i=index+1;i<size();i++) {
			a[i-1]=a[i];
		}
		pos--;
		a[pos]=null;
	}
	
	public void clear() {
		Object[] a=new Object[5];
		pos=0;
	}
}
