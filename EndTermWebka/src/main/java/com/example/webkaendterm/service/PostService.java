package com.example.webkaendterm.service;

import com.example.webkaendterm.entity.Post;
import com.example.webkaendterm.entity.User;
import com.example.webkaendterm.mapper.LikePosts;
import java.util.List;

public interface PostService {
    void addPost(User user, Post post);

    List<LikePosts> getAllPost(User user);

    void updatePost(Post post);

    void deletePost(Post post);

    Post getPostById(Long id);
}
