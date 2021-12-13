package com.david.class132;

public class Generic<T> {
	T obj;  
	void addItem(T obj){
		this.obj = obj;
	}  
	T getItem(){
		return obj;
	}  
}
