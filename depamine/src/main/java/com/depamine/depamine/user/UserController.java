package com.depamine.depamine.user;

import com.depamine.depamine.user.dto.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@Controller
public class UserController {
    private final UserService userService;


    @Operation(summary = "create user", description = "회원가입")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
    })

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody UserDTO userDTO) {
        String status = userService.create(userDTO);
        return ResponseEntity.status(HttpStatus.OK).body(status);
    }
    @Operation(summary = "read user", description = "회원 조회")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
    })
    @GetMapping("/read/{userId}")
    public ResponseEntity<UserDTO> read(@PathVariable Long userId) {
        UserDTO userDTO = userService.read(userId);
        return ResponseEntity.status(HttpStatus.OK).body(userDTO);
    }
    @Operation(summary = "update user", description = "회원 정보 수정")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST"),
    })


    @RequestMapping("/doTest")//카카오 로그인 실험단계
        public String doTest(){

        return "login.html" ;
    }






}
