package com.qf.service.com.qf.service.impl;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.qf.entity.ResultVO;
import com.qf.service.com.qf.service.ISMSService;
import com.qf.util.SMSUtils;
import com.taobao.api.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

@Service
public class SMSServiceImpl implements ISMSService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public ResultVO sendSMS(String phone) {

        if (StrUtil.isEmpty(phone)) {
            return ResultVO.fail("手机号不能为空!");
        }

        if (!Pattern.matches("^1[3-9]\\d{9}$", phone)) {
            return ResultVO.fail("手机号不合法!");
        }

        String code = RandomUtil.randomNumbers(4);

        try {
            SMSUtils.sendSMS(phone, code);

            redisTemplate.boundValueOps("SMS:" + phone).set(code);
            redisTemplate.expire("SMS:" + phone, 5, TimeUnit.MINUTES);

            return ResultVO.success("发送成功!");

        } catch (Exception e) {
            e.printStackTrace();
            return ResultVO.fail("短信发送失败!");
        }
    }
}
