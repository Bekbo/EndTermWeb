package com.example.webkaendterm;

import com.example.webkaendterm.entity.Comment;
import com.example.webkaendterm.entity.User;
import com.example.webkaendterm.repositories.CommentRepository;
import com.example.webkaendterm.repositories.PostRepository;
import com.example.webkaendterm.serviceimplementation.CommentServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class CommentServiceImplementationTest {

    @Mock
    private CommentRepository commentRepository;
    private PostRepository postRepository;
    private User user;

    @InjectMocks
    private CommentServiceImplementation postService;
    private Comment comment;
    @BeforeEach
    void setUp() {
        comment = new Comment();
      comment.setCommentBody("Hello");

    }

    @Test
    void shouldAddCommentTest() {
//        //mock userRepository
//        when(postRepository.save(any(Comment.class))).thenReturn(post);
//        //call the method to be tested
//        postService.addPost(user, post);
//        //Assertions
//        verify(postRepository, times(1)).save(post);

}
}