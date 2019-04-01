package cn.zkb.controller;

import cn.zkb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id){
        System.out.println("aaaaaaaaaaaa  :"+id);
        return restTemplate.getForObject("http://provider-demo/user/getUser/"+id,User.class);

    }
}
