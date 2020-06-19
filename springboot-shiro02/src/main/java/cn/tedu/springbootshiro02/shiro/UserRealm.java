package cn.tedu.springbootshiro02.shiro;

import cn.tedu.springbootshiro02.entity.User;
import cn.tedu.springbootshiro02.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;

    /**
     * 执行授权逻辑
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");
        //给当前登录用户 资源授权，授权字符串要跟filterMap.put("/add", "perms[add]");中[]字符串一致
        SimpleAuthorizationInfo sai = new SimpleAuthorizationInfo();

//      获取到当前登录用户 subject
        Subject subject = SecurityUtils.getSubject();
//这个principal就是下面登录认证逻辑中return new SimpleAuthenticationInfo(user,user.getPassword(),"");第一个参数user
        User user = (User) subject.getPrincipal();
//      根据用户名查询数据库
        User dbUser = userService.findByName(user.getName());
//      根据数据库查询到的权限信息，赋予该用户权限
        sai.addStringPermission(dbUser.getPerms());
        return sai;
    }
    /**
     * 执行认证(登录)逻辑
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证(登录)逻辑");

        //编写shiro判断逻辑，判断用户名和密码
        //1.判断用户名
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        User user = userService.findByName(token.getUsername());
        //判断用户输入的用户名跟数据库的用户名是否一致
        if(user==null){
            //用户名不存在
            return null;//shiro底层会抛出UnKnowAccountException
        }

        //2.判断密码
        return new SimpleAuthenticationInfo(user,user.getPassword(),"");
    }
}
