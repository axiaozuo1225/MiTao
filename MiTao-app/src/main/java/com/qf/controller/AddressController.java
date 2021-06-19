package com.qf.controller;


import com.qf.entity.Address;
import com.qf.service.com.qf.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("html/address")
public class AddressController {

    @Autowired
    private IAddressService addressService;

    @RequestMapping("showAddress")
    @ResponseBody
    public List<Address> showAddress(@RequestBody String userId){
//        System.out.println(userId);
        return addressService.showAddress(userId);
    }

    @RequestMapping("addAddress")
    @ResponseBody
    public int addAddress (@RequestBody Address address){
//        System.out.println(address);
        return addressService.addAddress(address);
    }
}
