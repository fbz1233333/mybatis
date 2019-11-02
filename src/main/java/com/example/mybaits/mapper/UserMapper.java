package com.example.mybaits.mapper;
import com.example.mybaits.mapper.FindNameAndPasswordByIdAndNameAndPasswordResult;
import org.apache.ibatis.annotations.Param;
import com.example.mybaits.mapper.FindIdAndNameByIdResult;

import com.example.mybaits.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    FindIdAndNameByIdResult findIdAndNameById(@Param("id")String id);

    FindNameAndPasswordByIdAndNameAndPasswordResult findNameAndPasswordByIdAndNameAndPassword(@Param("id")String id,@Param("name")String name,@Param("password")String password);


    FindAccessAndInfoAndNameByIdAndAccessResult findAccessAndInfoAndNameByIdAndAccess(@Param("id")String id,@Param("access")String access);



}
