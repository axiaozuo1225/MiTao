package com.qf.mapper;

import com.qf.entity.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AddressMapper {

    @Select("select * from tb_user inner join tb_address on tb_user.user_id = tb_address.adr_user_id where tb_user.user_id = #{userId}")
    List<Address> selectAddress(String userId);

    int insertAddress(Address address);
}
