﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao13.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao13_Dao;
import com.szty.aihao.core.aihao13_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO13逻辑层接口
    *@作者：宋春林 
    */

	public class aihao13_service
	{
        public  aihao13_core _dal=classFactory.getaihao13();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO13实体
         * @return 新插入记录的编号
         */
		public int insert_aihao13 (aihao13_Dao _AIHAO13Model )  throws Exception{
         return _dal.insert_aihao13( _AIHAO13Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO13prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao13(Object[] _para)  throws Exception{
        return _dal.insert_aihao13( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO13实体
         * @return 影响的行数
         */
		public int update_aihao13(aihao13_Dao _AIHAO13Model)  throws Exception{
        return _dal.update_aihao13( _AIHAO13Model);
		}
	
		

         /**
         *  删除数据表AIHAO13中的一条记录
         * @param AIHAO13实体
         * @return 新插入记录的编号
         */
		public int delete_aihao13(int Id)  throws Exception{
        return _dal.delete_aihao13( Id);
		}

		

       
          /**
         * 得到 aihao13 数据实体
         * @param Id">Id
         * @return<aihao13 数据实体
        * @throws Exception 
         */
		public aihao13_Dao get_aihao13Dao(int Id) throws Exception{
        return _dal.get_aihao13Dao( Id);
		}
		
		    /**
         * 根据AIHAO13返回的查询DataRow创建一个AIHAO13Entity对象
         * @param AIHAO13 row
         * @returnAIHAO13List对象
        * @throws Exception 
         */
		public List<aihao13_Dao> get_aihao13_All() throws Exception{
            return _dal.get_aihao13_All();
            }
		    /**
         * 根据AIHAO13返回的查询DataRow创建一个AIHAO13Entity对象
         * @param AIHAO13 row
         * @returnAIHAO13List对象
        * @throws Exception 
         */
		public List<aihao13_Dao> get_aihao13_All(String strWhere) throws Exception{
            return _dal.get_aihao13_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao13_Dao> get_aihao13_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao13_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO13返回的查询DataRow创建一个AIHAO13Entity对象
         * @param AIHAO13 row
         * @returnAIHAO13Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao13_Dao> get_aihao13_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao13_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO13字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao13_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao13_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO13Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao13_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao13_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO13IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao13_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao13_UpdateString( FieldName, Value, sid);
            }
        
        
    }
