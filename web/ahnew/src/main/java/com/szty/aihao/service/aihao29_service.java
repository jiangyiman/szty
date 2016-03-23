﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihao29.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihao29_Dao;
import com.szty.aihao.core.aihao29_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAO29逻辑层接口
    *@作者：宋春林 
    */

	public class aihao29_service
	{
        public  aihao29_core _dal=classFactory.getaihao29();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAO29实体
         * @return 新插入记录的编号
         */
		public int insert_aihao29 (aihao29_Dao _AIHAO29Model )  throws Exception{
         return _dal.insert_aihao29( _AIHAO29Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAO29prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihao29(Object[] _para)  throws Exception{
        return _dal.insert_aihao29( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAO29实体
         * @return 影响的行数
         */
		public int update_aihao29(aihao29_Dao _AIHAO29Model)  throws Exception{
        return _dal.update_aihao29( _AIHAO29Model);
		}
	
		

         /**
         *  删除数据表AIHAO29中的一条记录
         * @param AIHAO29实体
         * @return 新插入记录的编号
         */
		public int delete_aihao29(int Id)  throws Exception{
        return _dal.delete_aihao29( Id);
		}

		

       
          /**
         * 得到 aihao29 数据实体
         * @param Id">Id
         * @return<aihao29 数据实体
        * @throws Exception 
         */
		public aihao29_Dao get_aihao29Dao(int Id) throws Exception{
        return _dal.get_aihao29Dao( Id);
		}
		
		    /**
         * 根据AIHAO29返回的查询DataRow创建一个AIHAO29Entity对象
         * @param AIHAO29 row
         * @returnAIHAO29List对象
        * @throws Exception 
         */
		public List<aihao29_Dao> get_aihao29_All() throws Exception{
            return _dal.get_aihao29_All();
            }
		    /**
         * 根据AIHAO29返回的查询DataRow创建一个AIHAO29Entity对象
         * @param AIHAO29 row
         * @returnAIHAO29List对象
        * @throws Exception 
         */
		public List<aihao29_Dao> get_aihao29_All(String strWhere) throws Exception{
            return _dal.get_aihao29_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihao29_Dao> get_aihao29_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihao29_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAO29返回的查询DataRow创建一个AIHAO29Entity对象
         * @param AIHAO29 row
         * @returnAIHAO29Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihao29_Dao> get_aihao29_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihao29_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAO29字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihao29_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihao29_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAO29Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihao29_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihao29_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAO29IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihao29_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihao29_UpdateString( FieldName, Value, sid);
            }
        
        
    }
