﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness12.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness12_Dao;
import com.szty.aihao.core.aihaobusiness12_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS12逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness12_service
	{
        public  aihaobusiness12_core _dal=classFactory.getaihaobusiness12();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS12实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness12 (aihaobusiness12_Dao _AIHAOBUSINESS12Model )  throws Exception{
         return _dal.insert_aihaobusiness12( _AIHAOBUSINESS12Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS12prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness12(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness12( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS12实体
         * @return 影响的行数
         */
		public int update_aihaobusiness12(aihaobusiness12_Dao _AIHAOBUSINESS12Model)  throws Exception{
        return _dal.update_aihaobusiness12( _AIHAOBUSINESS12Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS12中的一条记录
         * @param AIHAOBUSINESS12实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness12(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness12( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness12 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness12 数据实体
        * @throws Exception 
         */
		public aihaobusiness12_Dao get_aihaobusiness12Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness12Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS12返回的查询DataRow创建一个AIHAOBUSINESS12Entity对象
         * @param AIHAOBUSINESS12 row
         * @returnAIHAOBUSINESS12List对象
        * @throws Exception 
         */
		public List<aihaobusiness12_Dao> get_aihaobusiness12_All() throws Exception{
            return _dal.get_aihaobusiness12_All();
            }
		    /**
         * 根据AIHAOBUSINESS12返回的查询DataRow创建一个AIHAOBUSINESS12Entity对象
         * @param AIHAOBUSINESS12 row
         * @returnAIHAOBUSINESS12List对象
        * @throws Exception 
         */
		public List<aihaobusiness12_Dao> get_aihaobusiness12_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness12_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness12_Dao> get_aihaobusiness12_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness12_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS12返回的查询DataRow创建一个AIHAOBUSINESS12Entity对象
         * @param AIHAOBUSINESS12 row
         * @returnAIHAOBUSINESS12Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness12_Dao> get_aihaobusiness12_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness12_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS12字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness12_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness12_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS12Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness12_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness12_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS12IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness12_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness12_UpdateString( FieldName, Value, sid);
            }
        
        
    }
