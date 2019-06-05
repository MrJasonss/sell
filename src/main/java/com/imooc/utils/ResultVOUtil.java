package com.imooc.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.imooc.VO.ResultVO;

/**

 * @Description:    对返回对象的封装

 * @Author:         MrJason

 * @CreateDate:     2019/4/10 11:31 AM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/10 11:31 AM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */

public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }


    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
