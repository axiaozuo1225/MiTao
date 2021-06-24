package com.qf.util;

import com.qf.entity.ResultVO;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

public class SMSUtils {

    public static final String url = "http://gw.api.taobao.com/router/rest";
    public static final String appkey = "23473071";
    public static final String secret = "951efdcc9540d2c0c1646ed6d74892e6";


    public static ResultVO sendSMS(String phone, String msg) throws Exception {
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        req.setExtend("123456");
        req.setSmsType("normal");
        req.setSmsFreeSignName("问道学院");

        req.setSmsParamString("{\"code\":\"" + msg + "\"}");
        req.setRecNum(phone);
        req.setSmsTemplateCode("SMS_209190607");
        AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
//        System.out.println(rsp.getBody());
        return ResultVO.success();
    }
}
