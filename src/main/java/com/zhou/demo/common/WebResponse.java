package com.zhou.demo.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Auther: zhouzhen@chinadaas.com
 * @description:
 * @Date: 10:58 2017/6/30
 */
public abstract class WebResponse {
    private static final Logger logger = LoggerFactory.getLogger(WebResponse.class);

    public final WebResult sendRequest( Object...obj){
        WebResult result = new WebResult();
        try{
            return  execute(result, obj);
        }catch (BussinessException bs){
            result.setCode(bs.getCode());
            result.setMessage(bs.getMessage());
        }catch (Exception e){
            result.setCode(500);
            result.setMessage("服务器内部异常");
            logger.error("执行请求报错",e);
        }
        return result;
    };

    protected abstract WebResult execute(WebResult result, Object obj);
}

