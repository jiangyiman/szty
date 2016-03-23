﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumgameadapter.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumgameadapter_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMGAMEADAPTER数据接口
    *@作者：宋春林 
    */

	public interface mvnforumgameadapter_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGAMEADAPTER实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumgameadapter(mvnforumgameadapter_Dao _MVNFORUMGAMEADAPTERModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGAMEADAPTERprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumgameadapter(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMGAMEADAPTER实体
         * @return 影响的行数
         */
		public int update_mvnforumgameadapter(mvnforumgameadapter_Dao _MVNFORUMGAMEADAPTERModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMGAMEADAPTER中的一条记录
         * @param MVNFORUMGAMEADAPTER实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumgameadapter(int _adapterid) throws Exception;
		
          /**
         * 得到 mvnforumgameadapter 数据实体
         * @param Adapterid">Adapterid
         * @return<mvnforumgameadapter 数据实体
        * @throws Exception 
         */
		public mvnforumgameadapter_Dao get_mvnforumgameadapterDao(int _adapterid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMGAMEADAPTER返回的查询DataRow创建一个MVNFORUMGAMEADAPTEREntity对象
         * @param MVNFORUMGAMEADAPTER row
         * @returnMVNFORUMGAMEADAPTERList对象
        * @throws Exception 
         */
		public List< mvnforumgameadapter_Dao> get_mvnforumgameadapter_All() throws Exception;
		    /**
         * 根据MVNFORUMGAMEADAPTER返回的查询DataRow创建一个MVNFORUMGAMEADAPTEREntity对象
         * @param MVNFORUMGAMEADAPTER row
         * @returnMVNFORUMGAMEADAPTERList对象
        * @throws Exception 
         */
		public List<mvnforumgameadapter_Dao> get_mvnforumgameadapter_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumgameadapter_Dao> get_mvnforumgameadapter_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMGAMEADAPTER返回的查询DataRow创建一个MVNFORUMGAMEADAPTEREntity对象
         * @param MVNFORUMGAMEADAPTER row
         * @returnMVNFORUMGAMEADAPTERDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumgameadapter_Dao> get_mvnforumgameadapter_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMGAMEADAPTER字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumgameadapter_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMGAMEADAPTERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumgameadapter_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMGAMEADAPTERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumgameadapter_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
