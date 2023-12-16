package com.example.webkaendterm;

import com.example.webkaendterm.dto.ResponseDTO;
import com.example.webkaendterm.entity.User;
import com.example.webkaendterm.repositories.UserRepository;
import com.example.webkaendterm.serviceimplementation.UserServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class UserServiceImplTests {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserServiceImplementation userService;
    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
        user.setFirstName("user");
        user.setSurName("Decagon");
        user.setEmailAddress("user@gmail.com");
        user.setGender("Male");
        user.setPassword("1234");
    }

    @Test
    void shouldAddUserTest() {
        //mock userRepository
        when(userRepository.save(any(User.class))).thenReturn(user);
        //call the method to be tested
        userService.addUser(user);
//            userService.logInUser(user);
        //Assertions
        verify(userRepository, times(1)).save(any(User.class));
    }

    @Test
    void shouldLogInUserTest() {
        //mock userRepository
//
        when(userRepository.getUserByEmailAddressAndPassword(anyString(), anyString())).thenReturn(Optional.of(user));
        //then call the method to be tested
        ResponseDTO foundUser = userService.logInUser(user);
        //assertions
        assertNotNull(foundUser);
        assertEquals("user@gmail.com", foundUser.getData().getEmailAddress());
        verify(userRepository, times(1)).getUserByEmailAddressAndPassword(anyString(), anyString());
    }
}