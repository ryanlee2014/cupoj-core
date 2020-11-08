package com.cupacm.oj.dao;

import com.cupacm.oj.dao.VjudgeSolution;
import com.cupacm.oj.dao.VjudgeSolutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VjudgeSolutionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    long countByExample(VjudgeSolutionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int deleteByExample(VjudgeSolutionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int deleteByPrimaryKey(Integer solutionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insert(VjudgeSolution record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int insertSelective(VjudgeSolution record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<VjudgeSolution> selectByExampleWithBLOBsWithRowbounds(VjudgeSolutionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<VjudgeSolution> selectByExampleWithBLOBs(VjudgeSolutionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<VjudgeSolution> selectByExampleWithRowbounds(VjudgeSolutionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    List<VjudgeSolution> selectByExample(VjudgeSolutionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    VjudgeSolution selectByPrimaryKey(Integer solutionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") VjudgeSolution record, @Param("example") VjudgeSolutionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") VjudgeSolution record, @Param("example") VjudgeSolutionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByExample(@Param("record") VjudgeSolution record, @Param("example") VjudgeSolutionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKeySelective(VjudgeSolution record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(VjudgeSolution record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vjudge_solution
     *
     * @mbg.generated Sun Nov 08 15:06:46 CST 2020
     */
    int updateByPrimaryKey(VjudgeSolution record);
}