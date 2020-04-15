package com.perfect.mapper;

import com.perfect.entity.PiCiGr;
import com.perfect.entity.PiCiGrExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PiCiGrMapper {
    int deleteByExample(PiCiGrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PiCiGr record);

    int insertSelective(PiCiGr record);

    List<PiCiGr> selectByExample(PiCiGrExample example);

    PiCiGr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PiCiGr record, @Param("example") PiCiGrExample example);

    int updateByExample(@Param("record") PiCiGr record, @Param("example") PiCiGrExample example);

    int updateByPrimaryKeySelective(PiCiGr record);

    int updateByPrimaryKey(PiCiGr record);
}