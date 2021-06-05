package com.example.learning.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;
    private String fullName;
    private String role;
    private String [] authorities;
    private boolean isVoted;

    public User(String username, String password, String fullName, String role, String[] authorities, boolean isVoted) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.role = role;
        this.authorities = authorities;
        this.isVoted = isVoted;
    }
}
