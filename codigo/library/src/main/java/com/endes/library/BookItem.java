package com.endes.library;

import java.util.List;

public class BookItem extends Book {
	
	private String barcode;
	private String tag;

	public BookItem(String isbn, String title, List<Author> authors, String summary, String publisher, String date,
			Integer numberOfPages, String language) {
		super(isbn, title, authors, summary, publisher, date, numberOfPages, language);
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	

}
