package com.qf.service.com.qf.service.impl;

import com.qf.entity.Address;
import com.qf.mapper.AddressMapper;
import com.qf.service.com.qf.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> showAddress(String userId) {
        return addressMapper.selectAddress(userId);
    }

    @Override
    public int addAddress(Address address) {
        addressMapper.insertAddress(address);
        //拿到新的addressid
        return address.getAdrId();
    }
}
