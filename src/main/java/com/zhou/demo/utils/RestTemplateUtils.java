package com.zhou.demo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 17:31 2017/7/5
 */
@Component
public class RestTemplateUtils {
    private static final Logger logger = LoggerFactory.getLogger(RestTemplateUtils.class);

    public RestTemplate restTemplate = new RestTemplate();

    public Object execPostUrl(String url, Object obj){
        try{
            Object b = restTemplate.postForObject("http://10.20.20.40:8801/newent/dotask", obj, Object.class);
            return b;
        }catch(Exception e){
            logger.error("调用datasource项目失败",e);
            return false;
        }
    }

}
