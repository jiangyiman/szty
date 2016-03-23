﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoaaa.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihaoaaa_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOAAA数据接口
    *@作者：宋春林 
    */

	public interface aihaoaaa_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOAAA实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoaaa(aihaoaaa_Dao _AIHAOAAAModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOAAAprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoaaa(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOAAA实体
         * @return 影响的行数
         */
		public int update_aihaoaaa(aihaoaaa_Dao _AIHAOAAAModel) throws Exception;
		

         /**
         *  删除数据表AIHAOAAA中的一条记录
         * @param AIHAOAAA实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoaaa(int _id) throws Exception;
		
          /**
         * 得到 aihaoaaa 数据实体
         * @param Id">Id
         * @return<aihaoaaa 数据实体
        * @throws Exception 
         */
		public aihaoaaa_Dao get_aihaoaaaDao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAOAAA返回的查询DataRow创建一个AIHAOAAAEntity对象
         * @param AIHAOAAA row
         * @returnAIHAOAAAList对象
        * @throws Exception 
         */
		public List< aihaoaaa_Dao> get_aihaoaaa_All() throws Exception;
		    /**
         * 根据AIHAOAAA返回的查询DataRow创建一个AIHAOAAAEntity对象
         * @param AIHAOAAA row
         * @returnAIHAOAAAList对象
        * @throws Exception 
         */
		public List<aihaoaaa_Dao> get_aihaoaaa_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoaaa_Dao> get_aihaoaaa_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAOAAA返回的查询DataRow创建一个AIHAOAAAEntity对象
         * @param AIHAOAAA row
         * @returnAIHAOAAADictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihaoaaa_Dao> get_aihaoaaa_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAOAAA字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihaoaaa_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAOAAAInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihaoaaa_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAOAAAIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihaoaaa_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
