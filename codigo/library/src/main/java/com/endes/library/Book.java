package com.endes.library;

import java.util.List;

/**
 * Vemos y hemos creado que esto es una clase abstracta. 
 */
public abstract class Book {
    private String isbn;
    private String title;
    private List<Author> authors;
    private String summary;
    private String publisher;
    private String date;
    private Integer numberOfPages;
    private String language;
    
	
	public Book(String isbn, String title, List<Author> authors, String summary, String publisher, String date,
			Integer numberOfPages, String language) {
		
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
		this.summary = summary;
		this.publisher = publisher;
		this.date = date;
		this.numberOfPages = numberOfPages;
		this.language = language;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

}
