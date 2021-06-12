package com.qf.service.com.qf.service.impl;

import com.qf.entity.EvlType;
import com.qf.mapper.EvlMapper;
import com.qf.service.com.qf.service.IEvlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvlService implements IEvlService {

    @Autowired
    private EvlMapper evlMapper;

    @Override
    public List<EvlType> showEvlType(String goodsId) {

//        System.out.println(goodsId);

        List<EvlType> evlTypes = evlMapper.selectEvlType(goodsId);

//        System.out.println(evlTypes);
        return evlTypes;

    }
}
