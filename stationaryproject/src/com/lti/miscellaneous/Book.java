package com.lti.miscellaneous;

public class Book {
private int bookId;
private String bookName;
private String bookAuthor;
private int yearOfPublish;

//const

Book()
{
	System.out.println("Default Constructor created....");
	//ctr++;
 }


//setters
 
  public void setbookName(String s1) {
	  this.bookName = s1;
}
 
 public void setBookId(int id1) {
	  this.bookId = id1;
}
 public void setbookAuthor(String s2) {
	  this.bookAuthor = s2;
}
 public void setyearOfPublish(int id1) {
	  this.yearOfPublish = id1;
}

//getters

public int getId() {
	  return this.bookId;
}

public String getBookName() {
	  return this.bookName;
}

public String getBookAuthor() {
	  return this.bookAuthor;
}

public int get() {
	  return this.bookId;
}

public int getyearOfPublish() {
	  return this.yearOfPublish;
}


}

