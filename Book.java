package com.aiub.lab4;

public class Book {
			private String bookname;
			private String bookauthor;
			private String bookid;
			private String booktype;
			private  int bookcopy;
			static int bookcounter;
			public Book(String bookname, String bookauthor, String bookid, String booktype, int bookcopy) {
				super();
				this.bookname = bookname;
				this.bookauthor = bookauthor;
				this.bookid = bookid;
				this.booktype = booktype;
				this.bookcopy = bookcopy;
			}
			public Book() {
				super();
			}
		public void showinfo()
		{
			System.out.println("The book name is :"+bookname);
			System.out.println("The book book author is :"+bookauthor);
			System.out.println("The book ID is :"+bookid);
			System.out.println("The book Type is :"+booktype);
			System.out.println("Total Books = :"+bookcopy);
			
		}

}
