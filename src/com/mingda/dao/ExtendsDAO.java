package com.mingda.dao;

import java.util.HashMap;
import java.util.List;

public interface ExtendsDAO {
	/**
	 * ��ѯ������
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List<HashMap> queryAll(HashMap param);

	/**
	 * ��ѯһҳ����
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public List<HashMap> queryRow(HashMap param);

	/**
	 * ��ѯ�ܼ�¼��
	 * 
	 * @return
	 */

	@SuppressWarnings("rawtypes")
	public int queryCnt(HashMap param);

	/**
	 * ִ�и������
	 * 
	 * @param param
	 */
	@SuppressWarnings("rawtypes")
	public void updateAll(HashMap param) throws RuntimeException;

	@SuppressWarnings("rawtypes")
	public void insertAll(HashMap param) throws RuntimeException;
	
	public int querySeq();
}
