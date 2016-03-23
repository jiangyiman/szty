﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSztydepartment.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.sztydepartment_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SZTYDEPARTMENT数据接口
    *@作者：宋春林 
    */

	public interface sztydepartment_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param SZTYDEPARTMENT实体
         * @return 新插入记录的编号
         */
		public int insert_sztydepartment(sztydepartment_Dao _SZTYDEPARTMENTModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param SZTYDEPARTMENTprrameter
         * @return 新插入记录的编号
         */
         public int insert_sztydepartment(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param SZTYDEPARTMENT实体
         * @return 影响的行数
         */
		public int update_sztydepartment(sztydepartment_Dao _SZTYDEPARTMENTModel) throws Exception;
		

         /**
         *  删除数据表SZTYDEPARTMENT中的一条记录
         * @param SZTYDEPARTMENT实体
         * @return 新插入记录的编号
         */
		public int delete_sztydepartment(int _did) throws Exception;
		
          /**
         * 得到 sztydepartment 数据实体
         * @param Did">Did
         * @return<sztydepartment 数据实体
        * @throws Exception 
         */
		public sztydepartment_Dao get_sztydepartmentDao(int _did) throws Exception;
		
		
		    /**
         * 根据SZTYDEPARTMENT返回的查询DataRow创建一个SZTYDEPARTMENTEntity对象
         * @param SZTYDEPARTMENT row
         * @returnSZTYDEPARTMENTList对象
        * @throws Exception 
         */
		public List< sztydepartment_Dao> get_sztydepartment_All() throws Exception;
		    /**
         * 根据SZTYDEPARTMENT返回的查询DataRow创建一个SZTYDEPARTMENTEntity对象
         * @param SZTYDEPARTMENT row
         * @returnSZTYDEPARTMENTList对象
        * @throws Exception 
         */
		public List<sztydepartment_Dao> get_sztydepartment_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sztydepartment_Dao> get_sztydepartment_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据SZTYDEPARTMENT返回的查询DataRow创建一个SZTYDEPARTMENTEntity对象
         * @param SZTYDEPARTMENT row
         * @returnSZTYDEPARTMENTDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, sztydepartment_Dao> get_sztydepartment_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新SZTYDEPARTMENT字段加一
         * @param FieldName
         * @param sid
         */
	public int create_sztydepartment_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新SZTYDEPARTMENTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_sztydepartment_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新SZTYDEPARTMENTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_sztydepartment_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
