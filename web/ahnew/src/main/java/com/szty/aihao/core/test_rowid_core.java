﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTest_rowid.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.test_rowid_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TEST_ROWID数据接口
    *@作者：宋春林 
    */

	public interface test_rowid_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param TEST_ROWID实体
         * @return 新插入记录的编号
         */
		public int insert_test_rowid(test_rowid_Dao _TEST_ROWIDModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param TEST_ROWIDprrameter
         * @return 新插入记录的编号
         */
         public int insert_test_rowid(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param TEST_ROWID实体
         * @return 影响的行数
         */
		public int update_test_rowid(test_rowid_Dao _TEST_ROWIDModel) throws Exception;
		

         /**
         *  删除数据表TEST_ROWID中的一条记录
         * @param TEST_ROWID实体
         * @return 新插入记录的编号
         */
		public int delete_test_rowid(int _id) throws Exception;
		
          /**
         * 得到 test_rowid 数据实体
         * @param Id">Id
         * @return<test_rowid 数据实体
        * @throws Exception 
         */
		public test_rowid_Dao get_test_rowidDao(int _id) throws Exception;
		
		
		    /**
         * 根据TEST_ROWID返回的查询DataRow创建一个TEST_ROWIDEntity对象
         * @param TEST_ROWID row
         * @returnTEST_ROWIDList对象
        * @throws Exception 
         */
		public List< test_rowid_Dao> get_test_rowid_All() throws Exception;
		    /**
         * 根据TEST_ROWID返回的查询DataRow创建一个TEST_ROWIDEntity对象
         * @param TEST_ROWID row
         * @returnTEST_ROWIDList对象
        * @throws Exception 
         */
		public List<test_rowid_Dao> get_test_rowid_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<test_rowid_Dao> get_test_rowid_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据TEST_ROWID返回的查询DataRow创建一个TEST_ROWIDEntity对象
         * @param TEST_ROWID row
         * @returnTEST_ROWIDDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, test_rowid_Dao> get_test_rowid_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新TEST_ROWID字段加一
         * @param FieldName
         * @param sid
         */
	public int create_test_rowid_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新TEST_ROWIDInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_test_rowid_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新TEST_ROWIDIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_test_rowid_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
