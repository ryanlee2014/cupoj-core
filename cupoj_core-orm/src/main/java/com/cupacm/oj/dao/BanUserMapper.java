package com.cupacm.oj.dao;

import com.cupacm.oj.dao.BanUser;
import com.cupacm.oj.dao.BanUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BanUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    long countByExample(BanUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int deleteByExample(BanUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insert(BanUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insertSelective(BanUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<BanUser> selectByExampleWithRowbounds(BanUserExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<BanUser> selectByExample(BanUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    BanUser selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") BanUser record, @Param("example") BanUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExample(@Param("record") BanUser record, @Param("example") BanUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKeySelective(BanUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ban_user
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKey(BanUser record);
}