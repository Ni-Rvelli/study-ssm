package com.nr.mybatis.mapper;

import com.nr.mybatis.pojo.FormGroup;
import com.nr.mybatis.pojo.FormGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FormGroupMapper {
    long countByExample(FormGroupExample example);

    int deleteByExample(FormGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FormGroup record);

    int insertSelective(FormGroup record);

    List<FormGroup> selectByExample(FormGroupExample example);

    FormGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FormGroup record, @Param("example") FormGroupExample example);

    int updateByExample(@Param("record") FormGroup record, @Param("example") FormGroupExample example);

    int updateByPrimaryKeySelective(FormGroup record);

    int updateByPrimaryKey(FormGroup record);
}