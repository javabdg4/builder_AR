package com.sda.builder;


public class App 
{
    public static void main( String[] args ){

        User user = User.UserBuilder.anUser()
                .age(21)
                .email("john@john.com")
                .build();

        System.out.println(user.getEmail());
    }
}
