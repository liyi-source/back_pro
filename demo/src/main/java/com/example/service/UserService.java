package com.example.service;

import com.example.entity.Account;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public Map<String,String> login(String userId,String password){
        //查询是否存在该账号密码
        int count = userMapper.queryAccount(userId,password);
        Map<String,String> map=new HashMap<String,String>();
        if(count==1){
            map.put("rtnCode","1");
            map.put("rtnMsg","登陆成功。");
        }else{
            map.put("rtnCode","0");
            map.put("rtnMsg","账号或者密码错误。");
        }
        return map;
    }
    public List<Map<String,String>> queryMenus(){
        //查询是否存在该账号密码
        List<Map<String,String>> list = userMapper.queryMenus();
        Map<String,String> map=new HashMap<String,String>();
        return list;
    }
}
