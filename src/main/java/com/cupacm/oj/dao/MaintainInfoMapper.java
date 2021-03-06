package com.cupacm.oj.dao;

import com.cupacm.oj.dao.MaintainInfo;
import com.cupacm.oj.dao.MaintainInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MaintainInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintain_info
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    long countByExample(MaintainInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintain_info
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByExample(MaintainInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintain_info
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insert(MaintainInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintain_info
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insertSelective(MaintainInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintain_info
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<MaintainInfo> selectByExampleWithBLOBsWithRowbounds(MaintainInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintain_info
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<MaintainInfo> selectByExampleWithBLOBs(MaintainInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintain_info
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<MaintainInfo> selectByExampleWithRowbounds(MaintainInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintain_info
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<MaintainInfo> selectByExample(MaintainInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintain_info
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") MaintainInfo record, @Param("example") MaintainInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintain_info
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") MaintainInfo record, @Param("example") MaintainInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table maintain_info
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExample(@Param("record") MaintainInfo record, @Param("example") MaintainInfoExample example);
}