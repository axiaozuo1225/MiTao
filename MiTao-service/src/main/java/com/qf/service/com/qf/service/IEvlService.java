package com.qf.service.com.qf.service;

import com.qf.entity.EvlDetail;
import com.qf.entity.EvlType;

import java.util.List;

public interface IEvlService {

    List<EvlType> showEvlType(String goodsId);

    List<EvlDetail> showDetail(String[] infoDetailId);
}
