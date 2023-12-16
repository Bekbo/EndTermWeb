package com.example.webkaendterm.service;

import com.example.webkaendterm.entity.Comment;
import com.example.webkaendterm.entity.Post;

import java.util.List;

public interface CommentService {
    void updateComment(Comment editedComment);


    Comment getCommentById(Long id);

    void saveComment(Comment comment);

    List<Comment> findCommentByPost(Post post);

    void deleteComment(Long commentId);

    void deleteAllCommentsInPost(Post post);
}
