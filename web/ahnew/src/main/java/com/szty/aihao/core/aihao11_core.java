﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao11.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao11_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO11数据接口
    *@作者：宋春林 
    */

	public interface aihao11_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO11实体
         * @return 新插入记录的编号
         */
		public int insert_aihao11(aihao11_Dao _AIHAO11Model) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO11prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao11(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO11实体
         * @return 影响的行数
         */
		public int update_aihao11(aihao11_Dao _AIHAO11Model) throws Exception;
		

         /**
         *  删除数据表AIHAO11中的一条记录
         * @param AIHAO11实体
         * @return 新插入记录的编号
         */
		public int delete_aihao11(int _id) throws Exception;
		
          /**
         * 得到 aihao11 数据实体
         * @param Id">Id
         * @return<aihao11 数据实体
        * @throws Exception 
         */
		public aihao11_Dao get_aihao11Dao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO11返回的查询DataRow创建一个AIHAO11Entity对象
         * @param AIHAO11 row
         * @returnAIHAO11List对象
        * @throws Exception 
         */
		public List< aihao11_Dao> get_aihao11_All() throws Exception;
		    /**
         * 根据AIHAO11返回的查询DataRow创建一个AIHAO11Entity对象
         * @param AIHAO11 row
         * @returnAIHAO11List对象
        * @throws Exception 
         */
		public List<aihao11_Dao> get_aihao11_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao11_Dao> get_aihao11_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO11返回的查询DataRow创建一个AIHAO11Entity对象
         * @param AIHAO11 row
         * @returnAIHAO11Dictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao11_Dao> get_aihao11_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO11字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao11_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO11Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao11_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO11IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao11_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
