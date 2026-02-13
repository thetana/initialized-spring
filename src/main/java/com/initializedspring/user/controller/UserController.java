package com.initializedspring.user.controller;

import com.initializedspring.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService; // 새로운 서비스
}
