package com.qf.service.com.qf.service;

import com.qf.entity.Address;

import java.util.List;

public interface IAddressService {

    List<Address> showAddress(String userId);

    int addAddress(Address address);
}
