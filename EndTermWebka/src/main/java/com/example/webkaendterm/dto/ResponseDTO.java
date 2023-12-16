package com.example.webkaendterm.dto;

import com.example.webkaendterm.entity.User;
import lombok.Data;

@Data
public class ResponseDTO {
    private String message;
    private User data;
    private boolean status;


}
