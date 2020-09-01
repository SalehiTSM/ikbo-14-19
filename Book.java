package ru.mirea.lab1;

public class Book {
    public static class book{
        private int sheets_num;
        private String author;
        private String genre;
        private String book_name;
        book(int sheets_num, String author, String genre, String book_name)
        {
            this.sheets_num=sheets_num;
            this.author=author;
            this.genre=genre;
            this.book_name=book_name;
        }
        public void ToString()
        {
            System.out.println(sheets_num);
            System.out.println(author);
            System.out.println(genre);
            System.out.println(book_name);
        }
    }
    public static void main(String[]args)
    {
        book book;
        book = new book(318,"Steven King","Roman", "Cujo");
        book.ToString();
    }
}
