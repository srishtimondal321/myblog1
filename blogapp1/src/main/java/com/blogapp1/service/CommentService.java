package com.blogapp1.service;

import com.blogapp1.payload.CommentDto;
import com.blogapp1.payload.PostWithCommentDto;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto, long postId);

    void deleteComment(long postId);

    public PostWithCommentDto getAllCommentsByPostId(long id);

    public CommentDto getCommentById(long postId);
}

