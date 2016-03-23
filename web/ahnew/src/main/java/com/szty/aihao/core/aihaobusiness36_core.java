﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness36.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaobusiness36_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS36数据接口
    *@作者：宋春林 
    */

	public interface aihaobusiness36_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS36实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness36(aihaobusiness36_Dao _AIHAOBUSINESS36Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS36prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness36(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS36实体
         * @return 影响的行数
         */
		public int update_aihaobusiness36(aihaobusiness36_Dao _AIHAOBUSINESS36Model) throws Exception;
		

         /**
         *  删除数据表AIHAOBUSINESS36中的一条记录
         * @param AIHAOBUSINESS36实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness36(int _sname) throws Exception;
		
          /**
         * 得到 aihaobusiness36 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness36 数据实体
        * @throws Exception 
         */
		public aihaobusiness36_Dao get_aihaobusiness36Dao(int _sname) throws Exception;
		
		
		    /**
         * 根据AIHAOBUSINESS36返回的查询DataRow创建一个AIHAOBUSINESS36Entity对象
         * @param AIHAOBUSINESS36 row
         * @returnAIHAOBUSINESS36List对象
        * @throws Exception 
         */
		public List< aihaobusiness36_Dao> get_aihaobusiness36_All() throws Exception;
		    /**
         * 根据AIHAOBUSINESS36返回的查询DataRow创建一个AIHAOBUSINESS36Entity对象
         * @param AIHAOBUSINESS36 row
         * @returnAIHAOBUSINESS36List对象
        * @throws Exception 
         */
		public List<aihaobusiness36_Dao> get_aihaobusiness36_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness36_Dao> get_aihaobusiness36_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOBUSINESS36返回的查询DataRow创建一个AIHAOBUSINESS36Entity对象
         * @param AIHAOBUSINESS36 row
         * @returnAIHAOBUSINESS36Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaobusiness36_Dao> get_aihaobusiness36_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOBUSINESS36字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaobusiness36_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOBUSINESS36Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaobusiness36_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOBUSINESS36IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaobusiness36_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
