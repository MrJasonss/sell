package com.imooc.utils.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**

 * @Description:    工具类Date转换为Long   创建时间和更新时间要用

 * @Author:         MrJason

 * @CreateDate:     2019/4/14 3:16 PM

 * @UpdateUser:     Mrjason

 * @UpdateDate:     2019/4/14 3:16 PM

 * @UpdateRemark:   修改内容

 * @Version:        1.0

 */
public class Date2LongSerializer extends JsonSerializer<Date> {
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {

        jsonGenerator.writeNumber(date.getTime()/1000);
    }
}
