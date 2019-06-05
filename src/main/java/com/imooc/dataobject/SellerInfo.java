package com.imooc.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**

 * @Description:    卖家实体类

 * @Author:         MrJason

 * @CreateDate:     2019/6/3 9:01 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/6/3 9:01 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */


@Data
@Entity
public class SellerInfo {
    @Id
    private String id;

    private String username;

    private String password;

    private String openid;

}
