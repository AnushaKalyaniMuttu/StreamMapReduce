package com.order;

public class StreamMapReduceExample {

	private static int noOfNoteBooks() {
		
		return StudentDatabase.getAllStudents().stream()
		.map(Student::getNotebooks).reduce(0, (a,b)->a+b);
	}
	public static void main (String[] args) {
		System.out.println(noOfNoteBooks());
	}
}
