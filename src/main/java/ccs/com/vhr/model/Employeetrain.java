package ccs.com.vhr.model;

import java.util.Date;

public class Employeetrain {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeetrain.id
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeetrain.eid
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private Integer eid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeetrain.trainDate
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private Date traindate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeetrain.trainContent
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private String traincontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeetrain.remark
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeetrain.id
     *
     * @return the value of employeetrain.id
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeetrain.id
     *
     * @param id the value for employeetrain.id
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeetrain.eid
     *
     * @return the value of employeetrain.eid
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeetrain.eid
     *
     * @param eid the value for employeetrain.eid
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeetrain.trainDate
     *
     * @return the value of employeetrain.trainDate
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public Date getTraindate() {
        return traindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeetrain.trainDate
     *
     * @param traindate the value for employeetrain.trainDate
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setTraindate(Date traindate) {
        this.traindate = traindate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeetrain.trainContent
     *
     * @return the value of employeetrain.trainContent
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public String getTraincontent() {
        return traincontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeetrain.trainContent
     *
     * @param traincontent the value for employeetrain.trainContent
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setTraincontent(String traincontent) {
        this.traincontent = traincontent == null ? null : traincontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeetrain.remark
     *
     * @return the value of employeetrain.remark
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeetrain.remark
     *
     * @param remark the value for employeetrain.remark
     *
     * @mbggenerated Thu Nov 05 10:03:24 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}