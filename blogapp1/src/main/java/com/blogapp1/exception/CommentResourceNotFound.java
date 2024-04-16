package com.blogapp1.exception;

public class CommentResourceNotFound extends RuntimeException{

    public CommentResourceNotFound(String SMS){
        super(SMS);
    }
}
