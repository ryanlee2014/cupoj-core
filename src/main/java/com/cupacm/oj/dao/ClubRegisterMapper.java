package com.cupacm.oj.dao;

import com.cupacm.oj.dao.ClubRegister;
import com.cupacm.oj.dao.ClubRegisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClubRegisterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table club_register
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    long countByExample(ClubRegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table club_register
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int deleteByExample(ClubRegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table club_register
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insert(ClubRegister record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table club_register
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int insertSelective(ClubRegister record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table club_register
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<ClubRegister> selectByExampleWithRowbounds(ClubRegisterExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table club_register
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    List<ClubRegister> selectByExample(ClubRegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table club_register
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") ClubRegister record, @Param("example") ClubRegisterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table club_register
     *
     * @mbg.generated Sun Nov 08 15:44:09 CST 2020
     */
    int updateByExample(@Param("record") ClubRegister record, @Param("example") ClubRegisterExample example);
}