package com.example.webkaendterm.service;

import com.example.webkaendterm.entity.Post;
import com.example.webkaendterm.entity.User;


public interface LikeService {
    boolean likePost(User user, Long postId, String action);
    void deleteAllLikesInPost(Post post);

}
