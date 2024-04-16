package com.blogapp1.controller;

import com.blogapp1.payload.CommentDto;
import com.blogapp1.payload.PostWithCommentDto;
import com.blogapp1.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
@AllArgsConstructor
public class CommentController {
    private CommentService commentService;

    //http://localhost:8080/api/comments/1
    @PostMapping("/{postId}")
    public ResponseEntity<CommentDto> createComment(
            @RequestBody CommentDto commentDto,
            @PathVariable long postId){

        CommentDto dto = commentService.createComment(commentDto, postId);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);

    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<String> deleteComment(@PathVariable long postId){
        commentService.deleteComment(postId);
        return new ResponseEntity<>("Comment is deleted!!", HttpStatus.OK);
    }


    @GetMapping("/{postId}")
    public ResponseEntity<PostWithCommentDto> getAllCommentsByPostId(@PathVariable long postId){
        PostWithCommentDto allCommentsByPostId = commentService.getAllCommentsByPostId(postId);
        return new ResponseEntity<>(allCommentsByPostId, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<CommentDto> getCommentById(@PathVariable long postId){
        CommentDto commentDto = commentService.getCommentById(postId);
        return new ResponseEntity<>(commentDto, HttpStatus.OK);
    }
}
