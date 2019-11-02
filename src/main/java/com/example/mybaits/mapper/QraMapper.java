package com.example.mybaits.mapper;

import com.example.mybaits.entity.Qra;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QraMapper {
    int insert(Qra record);

    int insertSelective(Qra record);
}