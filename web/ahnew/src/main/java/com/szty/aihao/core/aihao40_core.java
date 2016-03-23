﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao40.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao40_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO40数据接口
    *@作者：宋春林 
    */

	public interface aihao40_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO40实体
         * @return 新插入记录的编号
         */
		public int insert_aihao40(aihao40_Dao _AIHAO40Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO40prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao40(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO40实体
         * @return 影响的行数
         */
		public int update_aihao40(aihao40_Dao _AIHAO40Model) throws Exception;
		

         /**
         *  删除数据表AIHAO40中的一条记录
         * @param AIHAO40实体
         * @return 新插入记录的编号
         */
		public int delete_aihao40(int _id) throws Exception;
		
          /**
         * 得到 aihao40 数据实体
         * @param Id">Id
         * @return<aihao40 数据实体
        * @throws Exception 
         */
		public aihao40_Dao get_aihao40Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO40返回的查询DataRow创建一个AIHAO40Entity对象
         * @param AIHAO40 row
         * @returnAIHAO40List对象
        * @throws Exception 
         */
		public List< aihao40_Dao> get_aihao40_All() throws Exception;
		    /**
         * 根据AIHAO40返回的查询DataRow创建一个AIHAO40Entity对象
         * @param AIHAO40 row
         * @returnAIHAO40List对象
        * @throws Exception 
         */
		public List<aihao40_Dao> get_aihao40_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao40_Dao> get_aihao40_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO40返回的查询DataRow创建一个AIHAO40Entity对象
         * @param AIHAO40 row
         * @returnAIHAO40Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao40_Dao> get_aihao40_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO40字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao40_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO40Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao40_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO40IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao40_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
