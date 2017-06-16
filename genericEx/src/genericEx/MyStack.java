package genericEx;

import java.util.LinkedList;

interface Stack<T>{
	T pop();
	boolean push(T ob);
}

public class MyStack<T> implements Stack<T>{ 
	int tos;
	LinkedList<T> list;
	
	public MyStack(){
		tos = 0;
		list = new LinkedList<T>();
	}
	
	public boolean push(T ob){
		list.add(ob);
		tos++;
		return true;
	}
	
	public T pop(){
		if(tos == 0){
			return null;
		}
		tos--;
		return list.get(tos);
	}
	public static void main(String[] args){
		MyStack<Integer> stk = new MyStack<Integer>();
		stk.push(111);
		stk.push(123);
		System.out.println(stk.pop());
	}
}


