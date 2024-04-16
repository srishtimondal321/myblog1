package com.blogapp1.payload;


import lombok.Data;

@Data
public class SignUp {

    private String username;
    private String name;
    private String email;
    private String password;
}
