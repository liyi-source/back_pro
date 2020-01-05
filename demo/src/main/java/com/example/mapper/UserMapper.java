package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    public int queryAccount(String userId,String password);
    public List<Map<String,String>> queryMenus();

}
