package com.mingda.dao;

import com.mingda.model.TempApprove;
import com.mingda.model.TempApproveExample;
import java.util.List;

public interface TempApproveDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    int countByExample(TempApproveExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    int deleteByExample(TempApproveExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    int deleteByPrimaryKey(Long approveId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    Long insert(TempApprove record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    Long insertSelective(TempApprove record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    List<TempApprove> selectByExample(TempApproveExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    TempApprove selectByPrimaryKey(Long approveId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    int updateByExampleSelective(TempApprove record, TempApproveExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    int updateByExample(TempApprove record, TempApproveExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    int updateByPrimaryKeySelective(TempApprove record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    int updateByPrimaryKey(TempApprove record);
}