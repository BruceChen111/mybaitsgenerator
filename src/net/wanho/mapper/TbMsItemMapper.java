package net.wanho.mapper;

import java.util.List;
import net.wanho.pojo.TbMsItem;
import net.wanho.pojo.TbMsItemExample;
import org.apache.ibatis.annotations.Param;

public interface TbMsItemMapper {
    int countByExample(TbMsItemExample example);

    int deleteByExample(TbMsItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbMsItem record);

    int insertSelective(TbMsItem record);

    List<TbMsItem> selectByExample(TbMsItemExample example);

    TbMsItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbMsItem record, @Param("example") TbMsItemExample example);

    int updateByExample(@Param("record") TbMsItem record, @Param("example") TbMsItemExample example);

    int updateByPrimaryKeySelective(TbMsItem record);

    int updateByPrimaryKey(TbMsItem record);
}