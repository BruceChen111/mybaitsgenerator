package net.wanho.mapper;

import java.util.List;
import net.wanho.pojo.TbMsOrder;
import net.wanho.pojo.TbMsOrderExample;
import org.apache.ibatis.annotations.Param;

public interface TbMsOrderMapper {
    int countByExample(TbMsOrderExample example);

    int deleteByExample(TbMsOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbMsOrder record);

    int insertSelective(TbMsOrder record);

    List<TbMsOrder> selectByExample(TbMsOrderExample example);

    TbMsOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbMsOrder record, @Param("example") TbMsOrderExample example);

    int updateByExample(@Param("record") TbMsOrder record, @Param("example") TbMsOrderExample example);

    int updateByPrimaryKeySelective(TbMsOrder record);

    int updateByPrimaryKey(TbMsOrder record);
}