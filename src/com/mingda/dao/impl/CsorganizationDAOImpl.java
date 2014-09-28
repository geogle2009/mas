package com.mingda.dao.impl;

import com.mingda.dao.CsorganizationDAO;
import com.mingda.model.Csorganization;
import com.mingda.model.CsorganizationExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class CsorganizationDAOImpl extends SqlMapClientDaoSupport implements CsorganizationDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSORGANIZATION
     *
     * @ibatorgenerated Tue Oct 12 12:43:16 CST 2010
     */
    public CsorganizationDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSORGANIZATION
     *
     * @ibatorgenerated Tue Oct 12 12:43:16 CST 2010
     */
    public int countByExample(CsorganizationExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("CSORGANIZATION.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSORGANIZATION
     *
     * @ibatorgenerated Tue Oct 12 12:43:16 CST 2010
     */
    public int deleteByExample(CsorganizationExample example) {
        int rows = getSqlMapClientTemplate().delete("CSORGANIZATION.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSORGANIZATION
     *
     * @ibatorgenerated Tue Oct 12 12:43:16 CST 2010
     */
    public void insert(Csorganization record) {
        getSqlMapClientTemplate().insert("CSORGANIZATION.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSORGANIZATION
     *
     * @ibatorgenerated Tue Oct 12 12:43:16 CST 2010
     */
    public void insertSelective(Csorganization record) {
        getSqlMapClientTemplate().insert("CSORGANIZATION.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSORGANIZATION
     *
     * @ibatorgenerated Tue Oct 12 12:43:16 CST 2010
     */
    @SuppressWarnings("unchecked")
    public List<Csorganization> selectByExample(CsorganizationExample example) {
        List<Csorganization> list = getSqlMapClientTemplate().queryForList("CSORGANIZATION.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSORGANIZATION
     *
     * @ibatorgenerated Tue Oct 12 12:43:16 CST 2010
     */
    public int updateByExampleSelective(Csorganization record, CsorganizationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("CSORGANIZATION.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.CSORGANIZATION
     *
     * @ibatorgenerated Tue Oct 12 12:43:16 CST 2010
     */
    public int updateByExample(Csorganization record, CsorganizationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("CSORGANIZATION.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table MEDICAL.CSORGANIZATION
     *
     * @ibatorgenerated Tue Oct 12 12:43:16 CST 2010
     */
    private static class UpdateByExampleParms extends CsorganizationExample {
        private Object record;

        public UpdateByExampleParms(Object record, CsorganizationExample example) {
            super(example);
            this.record = record;
        }

        @SuppressWarnings("unused")
		public Object getRecord() {
            return record;
        }
    }
}