package demo.dubbo.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author SkyWalker
 * @date 2019/10/8.
 */
public interface DemoService {
    /**
     *
     * @param invokerId 调用方id
     * @return 返回service服务基本信息描述
     */
    String simpleService(String invokerId);

    /**
     * 简单JSONObject入参调用
     * @param jsonObject
     * @return 返回简单JSONObject
     */
    JSONObject simpleRpcService(JSONObject jsonObject);
}
