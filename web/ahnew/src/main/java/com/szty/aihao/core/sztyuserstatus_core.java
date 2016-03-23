﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztyuserstatus.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.sztyuserstatus_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYUSERSTATUS数据接口
    *@作者：宋春林 
    */

	public interface sztyuserstatus_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERSTATUS实体
         * @return 新插入记录的编号
         */
		public int insert_sztyuserstatus(sztyuserstatus_Dao _SZTYUSERSTATUSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERSTATUSprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztyuserstatus(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYUSERSTATUS实体
         * @return 影响的行数
         */
		public int update_sztyuserstatus(sztyuserstatus_Dao _SZTYUSERSTATUSModel) throws Exception;
		

         /**
         *  删除数据表SZTYUSERSTATUS中的一条记录
         * @param SZTYUSERSTATUS实体
         * @return 新插入记录的编号
         */
		public int delete_sztyuserstatus(int _mobile) throws Exception;
		
          /**
         * 得到 sztyuserstatus 数据实体
         * @param Mobile">Mobile
         * @return<sztyuserstatus 数据实体
        * @throws Exception 
         */
		public sztyuserstatus_Dao get_sztyuserstatusDao(int _mobile) throws Exception;
		
		
		    /**
         * 根据SZTYUSERSTATUS返回的查询DataRow创建一个SZTYUSERSTATUSEntity对象
         * @param SZTYUSERSTATUS row
         * @returnSZTYUSERSTATUSList对象
        * @throws Exception 
         */
		public List< sztyuserstatus_Dao> get_sztyuserstatus_All() throws Exception;
		    /**
         * 根据SZTYUSERSTATUS返回的查询DataRow创建一个SZTYUSERSTATUSEntity对象
         * @param SZTYUSERSTATUS row
         * @returnSZTYUSERSTATUSList对象
        * @throws Exception 
         */
		public List<sztyuserstatus_Dao> get_sztyuserstatus_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztyuserstatus_Dao> get_sztyuserstatus_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据SZTYUSERSTATUS返回的查询DataRow创建一个SZTYUSERSTATUSEntity对象
         * @param SZTYUSERSTATUS row
         * @returnSZTYUSERSTATUSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, sztyuserstatus_Dao> get_sztyuserstatus_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新SZTYUSERSTATUS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_sztyuserstatus_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新SZTYUSERSTATUSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_sztyuserstatus_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新SZTYUSERSTATUSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_sztyuserstatus_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
