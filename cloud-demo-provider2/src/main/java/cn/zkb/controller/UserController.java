package cn.zkb.controller;


import cn.zkb.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping(value = "getUser/{id}")
    public User getUser(@PathVariable Long id){
        User user=new User();
        user.setId(id);
        user.setName("李四");
        user.setAge(15);
        return user;
    }

    @GetMapping(value = "/getName")
    public String getName(){
        return "李四";
    }
}
