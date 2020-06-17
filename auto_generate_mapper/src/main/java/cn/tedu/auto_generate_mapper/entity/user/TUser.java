package cn.tedu.auto_generate_mapper.entity.user;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "t_user")
public class TUser {
    /**
     * 用户id
     */
    @Id
    private Integer uid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别，0-女，1-男
     */
    private Integer gender;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 是否标记为删除，0-未删除，1-已删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 创建人
     */
    @Column(name = "created_user")
    private String createdUser;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 最后修改人
     */
    @Column(name = "modefied_user")
    private String modefiedUser;

    /**
     * 最后修改时间
     */
    @Column(name = "modefied_time")
    private Date modefiedTime;
}