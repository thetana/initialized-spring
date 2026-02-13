package com.initializedspring.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Table
@RequiredArgsConstructor
@Entity
public class User {



    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//ㄴㅇㅁㄴㅁㅇ
    private String nickname; // 닉네임
    private String password;
    private String email;
    private String phone;
    private String address;


    public User(String nickname, String password, String email, String phone, String address) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    public User(String nickname, String password, String email, String phone, String address) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    public static User from(Request request){
        return new User(
                request.id,
                request.nickname,
                request.password,
                request.email,
                request.phone,
                request.address,
        );
    }



    private Long longId;

















    private String textText = "아";
}
