package com.mingda.dao.impl;

import com.mingda.dao.TempApproveDAO;
import com.mingda.model.TempApprove;
import com.mingda.model.TempApproveExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TempApproveDAOImpl extends SqlMapClientDaoSupport implements TempApproveDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    public TempApproveDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    public int countByExample(TempApproveExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("TEMP_APPROVE.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    public int deleteByExample(TempApproveExample example) {
        int rows = getSqlMapClientTemplate().delete("TEMP_APPROVE.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    public int deleteByPrimaryKey(Long approveId) {
        TempApprove key = new TempApprove();
        key.setApproveId(approveId);
        int rows = getSqlMapClientTemplate().delete("TEMP_APPROVE.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    public Long insert(TempApprove record) {
        Object newKey = getSqlMapClientTemplate().insert("TEMP_APPROVE.ibatorgenerated_insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    public Long insertSelective(TempApprove record) {
        Object newKey = getSqlMapClientTemplate().insert("TEMP_APPROVE.ibatorgenerated_insertSelective", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    @SuppressWarnings("unchecked")
    public List<TempApprove> selectByExample(TempApproveExample example) {
        List<TempApprove> list = getSqlMapClientTemplate().queryForList("TEMP_APPROVE.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    public TempApprove selectByPrimaryKey(Long approveId) {
        TempApprove key = new TempApprove();
        key.setApproveId(approveId);
        TempApprove record = (TempApprove) getSqlMapClientTemplate().queryForObject("TEMP_APPROVE.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    public int updateByExampleSelective(TempApprove record, TempApproveExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("TEMP_APPROVE.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    public int updateByExample(TempApprove record, TempApproveExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("TEMP_APPROVE.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    public int updateByPrimaryKeySelective(TempApprove record) {
        int rows = getSqlMapClientTemplate().update("TEMP_APPROVE.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    public int updateByPrimaryKey(TempApprove record) {
        int rows = getSqlMapClientTemplate().update("TEMP_APPROVE.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table MEDICAL.TEMP_APPROVE
     *
     * @ibatorgenerated Tue Aug 19 10:09:46 CST 2014
     */
    private static class UpdateByExampleParms extends TempApproveExample {
        private Object record;

        public UpdateByExampleParms(Object record, TempApproveExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}