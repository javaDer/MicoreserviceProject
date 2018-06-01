package cn.wwtianmei.controllers;

import cn.wwtianmei.entity.UserInfo;
import cn.wwtianmei.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Yanghu
 * @since 2018-06-01
 */
@Controller
public class NeteaseUserController {
    @Autowired
    private IUserInfoService userInfoService;

    @ResponseBody
    @GetMapping("/user/{id}")
    public UserInfo test(@PathVariable("id") int id) {
        return userInfoService.selectById(id);
    }

}
