package com.qf.mapper;

import com.qf.entity.EvlDetail;
import com.qf.entity.EvlType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EvlMapper {

    List<EvlType> selectEvlType(@Param("goodsId") String goodsId);

    List<EvlDetail> selectEvlDetail(@Param("goodsId") String goodsId,@Param("infoDetailIds") String[] infoDetailIds);

}
