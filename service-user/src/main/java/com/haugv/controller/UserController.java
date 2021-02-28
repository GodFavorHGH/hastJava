package com.haugv.controller;

import cn.hutool.json.JSONObject;
import com.haugv.common.Result;
import com.haugv.constant.ResultCode;
import com.haugv.entity.User;
import com.haugv.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 98285
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
    public Result doLogin(@RequestBody JSONObject jsonParam){
        User user = userService.doLogin((String)jsonParam.get("name"), (String)jsonParam.get("password"));
        if (user == null) {
            return Result.failure(440, "用户不存在");
        }
        Result result = Result.successWithoutData();
        result.setData(user);
        return result;
    }


    @PostMapping(value = "/create")
    public Result createUser(User user){
        int count = userService.createUser(user);
        return count == 1 ? Result.successWithoutData() : Result.failure(440, "用户新增失败");
    }

    @GetMapping(value = "/get")
    public Result getUser(@RequestParam("id") int id){
        User user = userService.getUser(id);
        if (user == null) {
            return Result.failure(454, "查询用户不存在");
        }
        Result result = Result.successWithoutData();
        result.setData(user);
        return result;
    }
}
