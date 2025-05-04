package com.mobsters.dto;

public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String role;

    public UserDto(Long id, String name, String email, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Getters and Setters
}
