package cn.tedu.springbootshiro02.shiro;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    /**
     * 创建ShiroFilterFactoryBean
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        /**
         * Shiro内置过滤器，可以实现权限相关的拦截器
         *    常用的过滤器：
         *       anon: 无需认证（登录）可以访问
         *       authc: 必须认证才可以访问
         *       user: 如果使用rememberMe的功能可以直接访问
         *       perms： 该资源必须得到资源权限才可以访问
         *       role: 该资源必须得到角色权限才可以访问
         */
        Map<String,String> filterMap = new LinkedHashMap<String,String>();

        /**设置是controller中的那些路径需要登录认证，哪些不需要登录认证*/
        filterMap.put("/index", "anon");//这个路径放行
        filterMap.put("/login", "anon");//这个路径放行
        filterMap.put("/*", "authc");//其他页面需要登录才能访问
        //设置需要登录认证才能访问的页面，但未登录直接访问时的重定向请求
        shiroFilterFactoryBean.setLoginUrl("/toLogin");//对应的controller中有这个 @RequestMapping("/toLogin")

        /**设置授权拦截，访问controller中的/add路径，需要用户添加的权限，访问/update路径，需要用户更新的权限；
        授权的具体逻辑在UserRealm类的doGetAuthorizationInfo方法中*/
        filterMap.put("/add", "perms[add]");//[]中的字符串要跟数据库中perms字段存的字符串保持一致
        filterMap.put("/update", "perms[update]");//[]中的字符串要跟数据库中perms字段存的字符串保持一致
        filterMap.put("/add", "authc");//授权的页面必须单独拎出来，设置需要登录验证，否则授权无效
        filterMap.put("/update", "authc");//授权的页面必须单独拎出来，设置需要登录验证，否则授权无效
        //设置未授权重定向请求
        shiroFilterFactoryBean.setUnauthorizedUrl("/unAuth");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return shiroFilterFactoryBean;
    }
    /**
     * 创建DefaultWebSecurityManager
     */
    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);
        return securityManager;
    }
    /**
     * 创建Realm
     */
    @Bean(name="userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }

    /**
     * 配置ShiroDialect，用户thymeleaf和shiro标签配合使用
     */
    @Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }

}
