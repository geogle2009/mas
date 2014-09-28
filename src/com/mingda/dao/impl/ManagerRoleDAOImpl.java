package com.mingda.dao.impl;

import com.mingda.dao.ManagerRoleDAO;
import com.mingda.model.ManagerRole;
import com.mingda.model.ManagerRoleExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ManagerRoleDAOImpl extends SqlMapClientDaoSupport implements ManagerRoleDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    public ManagerRoleDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    public int countByExample(ManagerRoleExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("MANAGER_ROLE.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    public int deleteByExample(ManagerRoleExample example) {
        int rows = getSqlMapClientTemplate().delete("MANAGER_ROLE.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    public int deleteByPrimaryKey(String roleId) {
        ManagerRole key = new ManagerRole();
        key.setRoleId(roleId);
        int rows = getSqlMapClientTemplate().delete("MANAGER_ROLE.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    public void insert(ManagerRole record) {
        getSqlMapClientTemplate().insert("MANAGER_ROLE.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    public void insertSelective(ManagerRole record) {
        getSqlMapClientTemplate().insert("MANAGER_ROLE.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    @SuppressWarnings("unchecked")
    public List<ManagerRole> selectByExample(ManagerRoleExample example) {
        List<ManagerRole> list = getSqlMapClientTemplate().queryForList("MANAGER_ROLE.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    public ManagerRole selectByPrimaryKey(String roleId) {
        ManagerRole key = new ManagerRole();
        key.setRoleId(roleId);
        ManagerRole record = (ManagerRole) getSqlMapClientTemplate().queryForObject("MANAGER_ROLE.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    public int updateByExampleSelective(ManagerRole record, ManagerRoleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("MANAGER_ROLE.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    public int updateByExample(ManagerRole record, ManagerRoleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("MANAGER_ROLE.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    public int updateByPrimaryKeySelective(ManagerRole record) {
        int rows = getSqlMapClientTemplate().update("MANAGER_ROLE.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    public int updateByPrimaryKey(ManagerRole record) {
        int rows = getSqlMapClientTemplate().update("MANAGER_ROLE.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table MEDICAL.MANAGER_ROLE
     *
     * @ibatorgenerated Mon Jan 10 15:32:19 CST 2011
     */
    private static class UpdateByExampleParms extends ManagerRoleExample {
        private Object record;

        public UpdateByExampleParms(Object record, ManagerRoleExample example) {
            super(example);
            this.record = record;
        }

        @SuppressWarnings("unused")
		public Object getRecord() {
            return record;
        }
    }
}