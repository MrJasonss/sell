package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {


    @Autowired
    private OrderMasterRepository repository;


    private final String OPENID = "110110";


    @Test
    public void findByBuyerOpenId() {
        PageRequest request = new PageRequest(0,2);
        Page<OrderMaster> result =   repository.findByBuyerOpenid(OPENID,request);
        System.out.println(result.getTotalElements());
        Assert.assertNotEquals(0,result.getTotalElements());
    }



    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("12345");
        orderMaster.setBuyerName("二师兄");
        orderMaster.setBuyerPhone("153456789123");
        orderMaster.setBuyerAddress("幕课网");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(3.5));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);

    }


}