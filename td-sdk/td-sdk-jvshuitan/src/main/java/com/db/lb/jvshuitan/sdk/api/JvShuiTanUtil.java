package com.db.lb.jvshuitan.sdk.api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public  class JvShuiTanUtil {

    private static final String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    private static ObjectMapper jsonMapper = new ObjectMapper();

    /**
     * ts
     * */
    public static int getStamp(Date d) {
		return (int)(d.getTime()/1000);
	}

	/**
     * hex 加密
     * */
    private static String byteArrayToHexString(byte[] b) {
        StringBuilder resultSb = new StringBuilder();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(doByteToHexString(b[i]));
        }

        return resultSb.toString();
    }

    /**
     * byteToHesString 加密
     * */
    private static String doByteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    /**
     * md5加密
     * */
    public static String doMD5(String origin, String charsetname) {
        String resultString = null;
        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charsetname == null || "".equals(charsetname)) {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
            } else {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetname)));
            }
        } catch (Exception exception) {
            resultString = null;
        }
        return resultString;
    }


    /**
     * post请求
     * */
	public static String doPost(String url, String content) throws IOException {
        URL postUrl = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();

        connection.setDoOutput(true);
        // Read from the connection. Default is true.
        connection.setDoInput(true);
        connection.setRequestMethod("POST");

        connection.setUseCaches(false);

        connection.setInstanceFollowRedirects(true);

        connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
        connection.connect();

        DataOutputStream out = new DataOutputStream(connection.getOutputStream());
        out.write(content.getBytes("utf-8"));
        out.flush();
        out.close();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
        String line;
        String result="";
        while ((line = reader.readLine()) != null){
        	result+=line;
        }

        reader.close();
        connection.disconnect();
       return result;
	}

	public static String serialize(Object obj) throws JsonProcessingException {
	     return jsonMapper.writeValueAsString(obj);
	}


	public static <T> T deSerialize(String sData, Class<T> obj) throws JsonMappingException, IOException {
	     return  jsonMapper.readValue(sData,obj);
	}

    public static <T> T deSerialize(String sData, TypeReference<T> obj) throws JsonMappingException, IOException {
         return  jsonMapper.readValue(sData,obj);
    }
}
