package com.db.lb.jvshuitan.sdk.model;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 *
 * json 序列化自定义配置
 * */
public class CustomDateSerializer extends JsonSerializer<Date>{

	@Override
	public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider provider) throws IOException, JsonProcessingException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String dateString = dateFormat.format(date);
	    jsonGenerator.writeString(dateString);
	}

}
