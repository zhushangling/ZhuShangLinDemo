package cn.tedu.springbootshiro02.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    /**
     * 测试thymeleaf
     */
    @RequestMapping("/index")
    public String index(Model model){
        //把数据存入model
        model.addAttribute("name", "首页");
        //跳转到src/main/resource/templates目录下的index.html
        return "index";
    }

    /**
     * 跳转到登录页面请求
     */
    @RequestMapping("/toLogin")
    public String toLogin(Model model){
        return "login";
    }

    /**
     * 登录逻辑处理
     */
    @RequestMapping("/login")
    public String login(String name,String password,Model model){
        /**
         * 使用Shiro编写认证操作
         */
        //1.获取Subject
        Subject subject = SecurityUtils.getSubject();
        //2.封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(name,password);
        //3.执行登录方法
        try {
            subject.login(token);
            //登录成功
            return "redirect:/index";//重定向到请求/index
        } catch (UnknownAccountException e) {//登录失败:用户名不存在
            model.addAttribute("msg", "用户名不存在");
            return "login";//转发跳转到src/main/resource/templates目录下的login.html
        }catch (IncorrectCredentialsException e) {//登录失败:密码错误
            model.addAttribute("msg", "密码错误");
            return "login";//转发跳转到src/main/resource/templates目录下的login.html
        }
    }

}
