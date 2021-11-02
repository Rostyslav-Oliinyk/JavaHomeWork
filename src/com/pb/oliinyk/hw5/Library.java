package com.pb.oliinyk.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        Book book1 = new Book();
        book1.setBookAuthor("Иванов И. И.");
        book1.setBookTitle("Приключения");
        book1.setYearOfPublishing("2000");

        Book book2 = new Book();
        book2.setBookAuthor("Сидоров А. В.");
        book2.setBookTitle("Словарь");
        book2.setYearOfPublishing("1980");

        Book book3 = new Book();
        book3.setBookAuthor("Гусев К. В.");
        book3.setBookTitle("Энциклопедия");
        book3.setYearOfPublishing("2010");

        reader1.setFullName("Петров В. В.");
        reader2.setFullName("Ильин М. Т.");
        reader3.setFullName("Антонов Г. В.");

        reader2.takeBook(3);
        reader1.returnBook(2);

        reader1.returnBook("Энциклопедия");
        reader3.takeBook("Cловарь","Энциклопедия");

        reader2.takeBook(book1,book2,book3);
        reader1.returnBook(book1,book2);

        System.out.println("Зарегистринованные пользователи библиотеки:");
        System.out.println(reader1.getFullName() + ", "+reader2.getFullName() + ", " + reader1.getFullName() +" .");

        System.out.println("Библиотека содержит следующие книги:");
        System.out.println( book1.getBookTitle()+" (" + book1.getBookAuthor() + book1.getYearOfPublishing()+" г.), " +
                book2.getBookTitle()+" (" + book2.getBookAuthor() + book2.getYearOfPublishing()+" г.), " +
                book3.getBookTitle()+" (" + book3.getBookAuthor() + book3.getYearOfPublishing()+" г.). " );
    }


}