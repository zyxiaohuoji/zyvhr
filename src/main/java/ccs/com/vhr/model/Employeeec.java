package ccs.com.vhr.model;

import java.util.Date;

public class Employeeec {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeeec.id
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeeec.eid
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private Integer eid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeeec.ecDate
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private Date ecdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeeec.ecReason
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private String ecreason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeeec.ecPoint
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private Integer ecpoint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeeec.ecType
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private Integer ectype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeeec.remark
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeeec.id
     *
     * @return the value of employeeec.id
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeeec.id
     *
     * @param id the value for employeeec.id
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeeec.eid
     *
     * @return the value of employeeec.eid
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeeec.eid
     *
     * @param eid the value for employeeec.eid
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeeec.ecDate
     *
     * @return the value of employeeec.ecDate
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public Date getEcdate() {
        return ecdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeeec.ecDate
     *
     * @param ecdate the value for employeeec.ecDate
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setEcdate(Date ecdate) {
        this.ecdate = ecdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeeec.ecReason
     *
     * @return the value of employeeec.ecReason
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public String getEcreason() {
        return ecreason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeeec.ecReason
     *
     * @param ecreason the value for employeeec.ecReason
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setEcreason(String ecreason) {
        this.ecreason = ecreason == null ? null : ecreason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeeec.ecPoint
     *
     * @return the value of employeeec.ecPoint
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public Integer getEcpoint() {
        return ecpoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeeec.ecPoint
     *
     * @param ecpoint the value for employeeec.ecPoint
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setEcpoint(Integer ecpoint) {
        this.ecpoint = ecpoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeeec.ecType
     *
     * @return the value of employeeec.ecType
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public Integer getEctype() {
        return ectype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeeec.ecType
     *
     * @param ectype the value for employeeec.ecType
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setEctype(Integer ectype) {
        this.ectype = ectype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeeec.remark
     *
     * @return the value of employeeec.remark
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeeec.remark
     *
     * @param remark the value for employeeec.remark
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}