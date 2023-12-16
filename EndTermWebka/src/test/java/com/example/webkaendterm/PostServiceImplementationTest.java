package com.example.webkaendterm;


import com.example.webkaendterm.entity.Post;
import com.example.webkaendterm.entity.User;
import com.example.webkaendterm.repositories.CommentRepository;
import com.example.webkaendterm.repositories.LikeRepository;
import com.example.webkaendterm.repositories.PostRepository;
import com.example.webkaendterm.serviceimplementation.PostServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PostServiceImplementationTest {


    @Mock
    private PostRepository postRepository;
    private LikeRepository likeRepository;
    private CommentRepository commentRepository;
    private User user;

    @InjectMocks
    private PostServiceImplementation postService;
    private Post post;
    @BeforeEach
    void setUp() {
        post = new Post();
        post.setTitle("Hello");
        post.setBody("Hello");
    }

    @Test
    void shouldAddPostTest() {
        //mock userRepository
        when(postRepository.save(any(Post.class))).thenReturn(post);
        //call the method to be tested
        postService.addPost(user, post);
        //Assertions
        verify(postRepository, times(1)).save(post);




    }
}
