package com.pb.oliinyk.hw5;

import java.util.Arrays;

public class Reader {

    private String fullName;
    private String libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String telephone;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(String libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void takeBook(int a) {
        System.out.println(fullName + " взял " + a + " книги");
    }

    public void takeBook(String... book) {
        System.out.println(fullName + " взял книги: " + Arrays.toString(book) + " .");
    }

    public void takeBook(Book... book) {
        String[] a = new String[book.length];
        {
            for (int i = 0; i < book.length; i++) {
                a[i] = book[i].getBookTitle()+" (" + book[i].getBookAuthor() + book[i].getYearOfPublishing()+" г.)";
            }
            System.out.println(fullName + " взял книги: " + Arrays.toString(a) + " .");
        }
    }
    public void returnBook(int a) {
        System.out.println(fullName + " вернул " + a + " книги");
    }

    public void returnBook(String... book) {
        System.out.println(fullName + " вернул книги: " + Arrays.toString(book) + " .");
    }

    public void returnBook(Book... book) {
        String[] a = new String[book.length];
        {
            for (int i = 0; i < book.length; i++) {
                a[i] = book[i].getBookTitle()+" (" + book[i].getBookAuthor() + book[i].getYearOfPublishing()+" г.)";
            }
            System.out.println(fullName + " вернул книги: " + Arrays.toString(a) + " .");
        }
    }
}








