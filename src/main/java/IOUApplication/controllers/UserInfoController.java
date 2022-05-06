package IOUApplication.controllers;

import IOUApplication.domain.UserInfoService;
import IOUApplication.models.UserInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {
    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @PostMapping("/signUp")
    public ResponseEntity<UserInfo> signUp(@RequestBody UserInfo newUserInfo) {
        UserInfo userInfo = userInfoService.signUp(newUserInfo);
        if (userInfo != null) {
            return new ResponseEntity<>(userInfo, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(@RequestBody UserInfo userInfo) {
        Boolean authed = userInfoService.login(userInfo);
        if (authed) {
            return new ResponseEntity<>(authed, HttpStatus.OK);
        }
        return new ResponseEntity<>(authed, HttpStatus.FORBIDDEN);
    }

    @PutMapping("/updateAccount")
    public ResponseEntity<Boolean> updateAccount(@RequestBody UserInfo additionalUserInfo) {
        Boolean userInfo = userInfoService.updateAccount(additionalUserInfo);

        if (userInfo) {
            return new ResponseEntity<>(userInfo, HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }
}
