﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataMvnforumwallpaper.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.core;

import com.szty.aihao.dao.mvnforumwallpaper_Dao;
import java.io.Serializable;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@MVNFORUMWALLPAPER数据接口
    *@作者：宋春林 
    */

	public interface mvnforumwallpaper_core extends Serializable 
	{
     
         /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMWALLPAPER实体
         * @return 新插入记录的编号
         */
		public int insert_mvnforumwallpaper(mvnforumwallpaper_Dao _MVNFORUMWALLPAPERModel) throws Exception;
		
        
        /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMWALLPAPERprrameter
         * @return 新插入记录的编号
         */
         public int insert_mvnforumwallpaper(Object[] _para) throws Exception;
        
	
		
		 /**
         * 向数据库中插入一条新记录。
         * @param MVNFORUMWALLPAPER实体
         * @return 影响的行数
         */
		public int update_mvnforumwallpaper(mvnforumwallpaper_Dao _MVNFORUMWALLPAPERModel) throws Exception;
		

         /**
         *  删除数据表MVNFORUMWALLPAPER中的一条记录
         * @param MVNFORUMWALLPAPER实体
         * @return 新插入记录的编号
         */
		public int delete_mvnforumwallpaper(int _wallpaperid) throws Exception;
		
          /**
         * 得到 mvnforumwallpaper 数据实体
         * @param Wallpaperid">Wallpaperid
         * @return<mvnforumwallpaper 数据实体
        * @throws Exception 
         */
		public mvnforumwallpaper_Dao get_mvnforumwallpaperDao(int _wallpaperid) throws Exception;
		
		
		    /**
         * 根据MVNFORUMWALLPAPER返回的查询DataRow创建一个MVNFORUMWALLPAPEREntity对象
         * @param MVNFORUMWALLPAPER row
         * @returnMVNFORUMWALLPAPERList对象
        * @throws Exception 
         */
		public List< mvnforumwallpaper_Dao> get_mvnforumwallpaper_All() throws Exception;
		    /**
         * 根据MVNFORUMWALLPAPER返回的查询DataRow创建一个MVNFORUMWALLPAPEREntity对象
         * @param MVNFORUMWALLPAPER row
         * @returnMVNFORUMWALLPAPERList对象
        * @throws Exception 
         */
		public List<mvnforumwallpaper_Dao> get_mvnforumwallpaper_All(String strWhere) throws Exception;
			/**
	 * 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<mvnforumwallpaper_Dao> get_mvnforumwallpaper_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception ;
           /**
         * 根据MVNFORUMWALLPAPER返回的查询DataRow创建一个MVNFORUMWALLPAPEREntity对象
         * @param MVNFORUMWALLPAPER row
         * @returnMVNFORUMWALLPAPERDictionary对象
        * @throws Exception 
         */
    public Dictionary<Integer, mvnforumwallpaper_Dao> get_mvnforumwallpaper_Dictionary(String strWhere) throws Exception;
		 /**
         * 更新MVNFORUMWALLPAPER字段加一
         * @param FieldName
         * @param sid
         */
	public int create_mvnforumwallpaper_UpdateIncreate(String FieldName,int sid) throws Exception;
         /**
         * 更新MVNFORUMWALLPAPERInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	public int create_mvnforumwallpaper_UpdateInteger(String FieldName,int Num,int sid) throws Exception;
          /**
         * 更新MVNFORUMWALLPAPERIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	public int create_mvnforumwallpaper_UpdateString(String FieldName,String Value,int sid) throws Exception;
        
        
    }
