package ru.mirea.lab2;
import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n,String e, char g){
        name = n;
        email = e;
        gender = g;
    }
    public Author(String n, char g){
        name = n;
        gender = g;
    }
    public void setName(String n){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }

    public void GenderEmailName(){
        System.out.println("name: is " + name);
        System.out.println("Gender: is " +gender);
        System.out.println("email is: "+ email);
    }
}
