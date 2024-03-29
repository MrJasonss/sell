package com.imooc.converter;

import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**

 * @Description:    转换器

 * @Author:         MrJason

 * @CreateDate:     2019/4/11 11:18 AM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/11 11:18 AM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public class OrderMaster2OrderDTOConverter {
    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
       return   orderMasterList.stream().map(e ->
                 convert(e)
                ).collect(Collectors.toList());
    }
}
