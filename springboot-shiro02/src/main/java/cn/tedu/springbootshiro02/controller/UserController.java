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
     * 根据不同的url跳转到templates目录下对应的html页面，
     * 并将model添加的数据带过去，可以在html页面中使用th:text="${name}"属性接收
     */
    @RequestMapping("/index")
    public String index(Model model){
        //把数据存入model，供html页面使用
        model.addAttribute("name", "首页");
        return "index";
    }
    @RequestMapping("/toLogin")
    public String toLogin(Model model){
        return "login";
    }
    @RequestMapping("/unAuth")
    public String unAuth(Model model){
        return "unAuth";
    }
    @RequestMapping("/add")
    public String add(Model model){
        return "/user/add";
    }
    @RequestMapping("/update")
    public String update(Model model){
        return "/user/update";
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
            subject.login(token);//将token传给UserRealm类作为doGetAuthenticationInfo方法的参数进行登录验证
            //登录成功
            return "redirect:/index";//重定向到controller请求/index地址
        } catch (UnknownAccountException e) {//登录失败:用户名不存在
            model.addAttribute("msg", "用户名不存在");
            return "login";
        }catch (IncorrectCredentialsException e) {//登录失败:密码错误
            model.addAttribute("msg", "密码错误");
            return "login";
        }
    }

}
