﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaobusiness16.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaobusiness16_Dao;
import com.szty.aihao.core.aihaobusiness16_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOBUSINESS16逻辑层接口
    *@作者：宋春林 
    */

	public class aihaobusiness16_service
	{
        public  aihaobusiness16_core _dal=classFactory.getaihaobusiness16();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS16实体
         * @return 新插入记录的编号
         */
		public int insert_aihaobusiness16 (aihaobusiness16_Dao _AIHAOBUSINESS16Model )  throws Exception{
         return _dal.insert_aihaobusiness16( _AIHAOBUSINESS16Model);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS16prrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaobusiness16(Object[] _para)  throws Exception{
        return _dal.insert_aihaobusiness16( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOBUSINESS16实体
         * @return 影响的行数
         */
		public int update_aihaobusiness16(aihaobusiness16_Dao _AIHAOBUSINESS16Model)  throws Exception{
        return _dal.update_aihaobusiness16( _AIHAOBUSINESS16Model);
		}
	
		

         /**
         *  删除数据表AIHAOBUSINESS16中的一条记录
         * @param AIHAOBUSINESS16实体
         * @return 新插入记录的编号
         */
		public int delete_aihaobusiness16(int Sname)  throws Exception{
        return _dal.delete_aihaobusiness16( Sname);
		}

		

       
          /**
         * 得到 aihaobusiness16 数据实体
         * @param Sname">Sname
         * @return<aihaobusiness16 数据实体
        * @throws Exception 
         */
		public aihaobusiness16_Dao get_aihaobusiness16Dao(int Sname) throws Exception{
        return _dal.get_aihaobusiness16Dao( Sname);
		}
		
		    /**
         * 根据AIHAOBUSINESS16返回的查询DataRow创建一个AIHAOBUSINESS16Entity对象
         * @param AIHAOBUSINESS16 row
         * @returnAIHAOBUSINESS16List对象
        * @throws Exception 
         */
		public List<aihaobusiness16_Dao> get_aihaobusiness16_All() throws Exception{
            return _dal.get_aihaobusiness16_All();
            }
		    /**
         * 根据AIHAOBUSINESS16返回的查询DataRow创建一个AIHAOBUSINESS16Entity对象
         * @param AIHAOBUSINESS16 row
         * @returnAIHAOBUSINESS16List对象
        * @throws Exception 
         */
		public List<aihaobusiness16_Dao> get_aihaobusiness16_All(String strWhere) throws Exception{
            return _dal.get_aihaobusiness16_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaobusiness16_Dao> get_aihaobusiness16_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaobusiness16_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOBUSINESS16返回的查询DataRow创建一个AIHAOBUSINESS16Entity对象
         * @param AIHAOBUSINESS16 row
         * @returnAIHAOBUSINESS16Dictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaobusiness16_Dao> get_aihaobusiness16_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaobusiness16_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOBUSINESS16字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaobusiness16_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaobusiness16_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOBUSINESS16Int型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaobusiness16_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaobusiness16_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOBUSINESS16IString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaobusiness16_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaobusiness16_UpdateString( FieldName, Value, sid);
            }
        
        
    }
