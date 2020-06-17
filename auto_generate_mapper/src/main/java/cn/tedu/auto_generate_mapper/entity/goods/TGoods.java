package cn.tedu.auto_generate_mapper.entity.goods;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "t_goods")
public class TGoods {
    /**
     * 商品id
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 分类id
     */
    @Column(name = "category_id")
    private Long categoryId;

    /**
     * 商品系列
     */
    @Column(name = "item_type")
    private String itemType;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品卖点
     */
    @Column(name = "sell_point")
    private String sellPoint;

    /**
     * 商品单价
     */
    private Long price;

    /**
     * 库存数量
     */
    private Integer num;

    /**
     * 条形码
     */
    private String barcode;

    /**
     * 图片路径
     */
    private String image;

    /**
     * 商品状态  1：上架   2：下架   3：删除
     */
    private Integer status;

    /**
     * 显示优先级
     */
    private Integer priority;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 最后修改时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;

    /**
     * 创建人
     */
    @Column(name = "created_user")
    private String createdUser;

    /**
     * 最后修改人
     */
    @Column(name = "modified_user")
    private String modifiedUser;
}