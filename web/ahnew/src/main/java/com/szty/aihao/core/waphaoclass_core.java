﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataWaphaoclass.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.waphaoclass_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@WAPHAOCLASS数据接口
    *@作者：宋春林 
    */

	public interface waphaoclass_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param WAPHAOCLASS实体
         * @return 新插入记录的编号
         */
		public int insert_waphaoclass(waphaoclass_Dao _WAPHAOCLASSModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param WAPHAOCLASSprrameter
         * @return 新插入记录的编号
         */
         public int insert_waphaoclass(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param WAPHAOCLASS实体
         * @return 影响的行数
         */
		public int update_waphaoclass(waphaoclass_Dao _WAPHAOCLASSModel) throws Exception;
		

         /**
         *  删除数据表WAPHAOCLASS中的一条记录
         * @param WAPHAOCLASS实体
         * @return 新插入记录的编号
         */
		public int delete_waphaoclass(int _cat) throws Exception;
		
          /**
         * 得到 waphaoclass 数据实体
         * @param Cat">Cat
         * @return<waphaoclass 数据实体
        * @throws Exception 
         */
		public waphaoclass_Dao get_waphaoclassDao(int _cat) throws Exception;
		
		
		    /**
         * 根据WAPHAOCLASS返回的查询DataRow创建一个WAPHAOCLASSEntity对象
         * @param WAPHAOCLASS row
         * @returnWAPHAOCLASSList对象
        * @throws Exception 
         */
		public List< waphaoclass_Dao> get_waphaoclass_All() throws Exception;
		    /**
         * 根据WAPHAOCLASS返回的查询DataRow创建一个WAPHAOCLASSEntity对象
         * @param WAPHAOCLASS row
         * @returnWAPHAOCLASSList对象
        * @throws Exception 
         */
		public List<waphaoclass_Dao> get_waphaoclass_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<waphaoclass_Dao> get_waphaoclass_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据WAPHAOCLASS返回的查询DataRow创建一个WAPHAOCLASSEntity对象
         * @param WAPHAOCLASS row
         * @returnWAPHAOCLASSDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, waphaoclass_Dao> get_waphaoclass_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新WAPHAOCLASS字段加一
         * @param FieldName
         * @param sid
         */
	public int create_waphaoclass_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新WAPHAOCLASSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_waphaoclass_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新WAPHAOCLASSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_waphaoclass_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
