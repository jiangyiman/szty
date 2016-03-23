﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaoiptmp17.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaoiptmp17_Dao;
import com.szty.aihao.core.aihaoiptmp17_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOIPTMP17逻辑层接口
    *@作者：宋春林 
    */

	public class aihaoiptmp17_service
	{
        public  aihaoiptmp17_core _dal=classFactory.getaihaoiptmp17();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP17实体
         * @return 新插入记录的编号
         */
		public int insert_aihaoiptmp17 (aihaoiptmp17_Dao _AIHAOIPTMP17Model )  throws Exception{
         return _dal.insert_aihaoiptmp17( _AIHAOIPTMP17Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP17prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaoiptmp17(Object[] _para)  throws Exception{
        return _dal.insert_aihaoiptmp17( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOIPTMP17实体
         * @return 影响的行数
         */
		public int update_aihaoiptmp17(aihaoiptmp17_Dao _AIHAOIPTMP17Model)  throws Exception{
        return _dal.update_aihaoiptmp17( _AIHAOIPTMP17Model);
		}
	
		

         /**
         *  删除数据表AIHAOIPTMP17中的一条记录
         * @param AIHAOIPTMP17实体
         * @return 新插入记录的编号
         */
		public int delete_aihaoiptmp17(int Id)  throws Exception{
        return _dal.delete_aihaoiptmp17( Id);
		}

		

       
          /**
         * 得到 aihaoiptmp17 数据实体
         * @param Id">Id
         * @return<aihaoiptmp17 数据实体
        * @throws Exception 
         */
		public aihaoiptmp17_Dao get_aihaoiptmp17Dao(int Id) throws Exception{
        return _dal.get_aihaoiptmp17Dao( Id);
		}
		
		    /**
         * 根据AIHAOIPTMP17返回的查询DataRow创建一个AIHAOIPTMP17Entity对象
         * @param AIHAOIPTMP17 row
         * @returnAIHAOIPTMP17List对象
        * @throws Exception 
         */
		public List<aihaoiptmp17_Dao> get_aihaoiptmp17_All() throws Exception{
            return _dal.get_aihaoiptmp17_All();
            }
		    /**
         * 根据AIHAOIPTMP17返回的查询DataRow创建一个AIHAOIPTMP17Entity对象
         * @param AIHAOIPTMP17 row
         * @returnAIHAOIPTMP17List对象
        * @throws Exception 
         */
		public List<aihaoiptmp17_Dao> get_aihaoiptmp17_All(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp17_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaoiptmp17_Dao> get_aihaoiptmp17_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaoiptmp17_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOIPTMP17返回的查询DataRow创建一个AIHAOIPTMP17Entity对象
         * @param AIHAOIPTMP17 row
         * @returnAIHAOIPTMP17Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaoiptmp17_Dao> get_aihaoiptmp17_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaoiptmp17_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOIPTMP17字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaoiptmp17_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaoiptmp17_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOIPTMP17Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaoiptmp17_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaoiptmp17_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOIPTMP17IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaoiptmp17_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaoiptmp17_UpdateString( FieldName, Value, sid);
            }
        
        
    }
