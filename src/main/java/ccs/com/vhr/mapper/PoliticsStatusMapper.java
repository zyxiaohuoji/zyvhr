package ccs.com.vhr.mapper;

import ccs.com.vhr.model.PoliticsStatus;

import java.util.List;

public interface PoliticsStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table politicsstatus
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table politicsstatus
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int insert(PoliticsStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table politicsstatus
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int insertSelective(PoliticsStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table politicsstatus
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    PoliticsStatus selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table politicsstatus
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int updateByPrimaryKeySelective(PoliticsStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table politicsstatus
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    int updateByPrimaryKey(PoliticsStatus record);

    List<PoliticsStatus> getAllPoliticsStatus();
}