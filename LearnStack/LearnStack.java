package Lesson12;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> que = new Stack<>();
		que.push("Scince");
		que.push("English");
		que.push("Vinglish");
		que.push("Hindhi");
		que.push("Max");
		System.out.println("Stack "+ que);
		System.out.println(que.peek());
		que.pop();
		for(String elemente : que) {
		System.out.println("This book name is " + elemente);
		}
		

	}

}
