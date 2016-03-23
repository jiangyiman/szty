﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao_number_group.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.aihao_number_group_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO_NUMBER_GROUP数据接口
    *@作者：宋春林 
    */

	public interface aihao_number_group_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_NUMBER_GROUP实体
         * @return 新插入记录的编号
         */
		public int insert_aihao_number_group(aihao_number_group_Dao _AIHAO_NUMBER_GROUPModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_NUMBER_GROUPprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao_number_group(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO_NUMBER_GROUP实体
         * @return 影响的行数
         */
		public int update_aihao_number_group(aihao_number_group_Dao _AIHAO_NUMBER_GROUPModel) throws Exception;
		

         /**
         *  删除数据表AIHAO_NUMBER_GROUP中的一条记录
         * @param AIHAO_NUMBER_GROUP实体
         * @return 新插入记录的编号
         */
		public int delete_aihao_number_group(int _id) throws Exception;
		
          /**
         * 得到 aihao_number_group 数据实体
         * @param Id">Id
         * @return<aihao_number_group 数据实体
        * @throws Exception 
         */
		public aihao_number_group_Dao get_aihao_number_groupDao(int _id) throws Exception;
		
		
		    /**
         * 根据AIHAO_NUMBER_GROUP返回的查询DataRow创建一个AIHAO_NUMBER_GROUPEntity对象
         * @param AIHAO_NUMBER_GROUP row
         * @returnAIHAO_NUMBER_GROUPList对象
        * @throws Exception 
         */
		public List< aihao_number_group_Dao> get_aihao_number_group_All() throws Exception;
		    /**
         * 根据AIHAO_NUMBER_GROUP返回的查询DataRow创建一个AIHAO_NUMBER_GROUPEntity对象
         * @param AIHAO_NUMBER_GROUP row
         * @returnAIHAO_NUMBER_GROUPList对象
        * @throws Exception 
         */
		public List<aihao_number_group_Dao> get_aihao_number_group_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao_number_group_Dao> get_aihao_number_group_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据AIHAO_NUMBER_GROUP返回的查询DataRow创建一个AIHAO_NUMBER_GROUPEntity对象
         * @param AIHAO_NUMBER_GROUP row
         * @returnAIHAO_NUMBER_GROUPDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, aihao_number_group_Dao> get_aihao_number_group_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新AIHAO_NUMBER_GROUP字段加一
         * @param FieldName
         * @param sid
         */
	public int create_aihao_number_group_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新AIHAO_NUMBER_GROUPInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_aihao_number_group_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新AIHAO_NUMBER_GROUPIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_aihao_number_group_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
