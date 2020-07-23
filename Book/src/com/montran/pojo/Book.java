package com.montran.pojo;

public class Book {

	private int bookId;
	private String nameOfBook;
	private double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String nameOfBook, double price) {
		super();
		this.bookId = bookId;
		this.nameOfBook = nameOfBook;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", nameOfBook=" + nameOfBook + ", price=" + price + "]";
	}
	
}
