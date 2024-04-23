package com.endes.library;

public class Librarian implements Search, Manage {
	
	private String name;
	private String address;
	private String position;
	
	public Librarian(String name, String address, String position) {
	
		this.name = name;
		this.address = address;
		this.position = position;
	}

	@Override
	public void createBookItem(BookItem bookItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBookItem(BookItem bookItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBookItem(String ISBN) {
		// TODO Auto-generated method stub

	}

	@Override
	public BookItem getBookItem(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookItem searchByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookItem searchByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

}
