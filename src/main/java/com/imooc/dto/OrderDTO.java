package com.imooc.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.CodeEnum;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.utils.EnumUtil;
import com.imooc.utils.serializer.Date2LongSerializer;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**

 * @Description:    dto  数据传输使用

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 4:48 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 4:48 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0


 */

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    /** 订单id. */
    private String orderId;

    /** 买家名字. */
    private String buyerName;

    /** 买家手机号. */
    private String buyerPhone;

    /** 买家地址. */
    private String buyerAddress;

    /** 买家微信Openid. */
    private String buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态, 默认为0新下单. */
    private Integer orderStatus;

    /** 支付状态, 默认为0未支付. */
    private Integer payStatus ;


    @JsonSerialize(using = Date2LongSerializer.class)
    /** 创建时间. */
    private Date createTime;
    @JsonSerialize(using = Date2LongSerializer.class)
    /** 更新时间. */
    private Date updateTime;

    List<OrderDetail> orderDetailList = new ArrayList<>();
    /** 返回订单状态的枚举**/

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus,OrderStatusEnum.class);
    }

    /** 返回订单支付状态的枚举**/
    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        return EnumUtil.getByCode(payStatus,PayStatusEnum.class);
    }

}
