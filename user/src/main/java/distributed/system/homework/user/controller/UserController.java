package distributed.system.homework.user.controller;


import distributed.system.homework.user.entity.User;
import distributed.system.homework.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }

    @GetMapping("/{userId}")
    public String findUserById(@PathVariable Long userId){
        return userService.findUserById(userId).toString();
    }
}
