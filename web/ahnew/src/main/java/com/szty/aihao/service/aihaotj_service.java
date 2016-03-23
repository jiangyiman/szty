﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaotj.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaotj_Dao;
import com.szty.aihao.core.aihaotj_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOTJ逻辑层接口
    *@作者：宋春林 
    */

	public class aihaotj_service
	{
        public  aihaotj_core _dal=classFactory.getaihaotj();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOTJ实体
         * @return 新插入记录的编号
         */
		public int insert_aihaotj (aihaotj_Dao _AIHAOTJModel )  throws Exception{
         return _dal.insert_aihaotj( _AIHAOTJModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOTJprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaotj(Object[] _para)  throws Exception{
        return _dal.insert_aihaotj( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOTJ实体
         * @return 影响的行数
         */
		public int update_aihaotj(aihaotj_Dao _AIHAOTJModel)  throws Exception{
        return _dal.update_aihaotj( _AIHAOTJModel);
		}
	
		

         /**
         *  删除数据表AIHAOTJ中的一条记录
         * @param AIHAOTJ实体
         * @return 新插入记录的编号
         */
		public int delete_aihaotj(int Logid)  throws Exception{
        return _dal.delete_aihaotj( Logid);
		}

		

       
          /**
         * 得到 aihaotj 数据实体
         * @param Logid">Logid
         * @return<aihaotj 数据实体
        * @throws Exception 
         */
		public aihaotj_Dao get_aihaotjDao(int Logid) throws Exception{
        return _dal.get_aihaotjDao( Logid);
		}
		
		    /**
         * 根据AIHAOTJ返回的查询DataRow创建一个AIHAOTJEntity对象
         * @param AIHAOTJ row
         * @returnAIHAOTJList对象
        * @throws Exception 
         */
		public List<aihaotj_Dao> get_aihaotj_All() throws Exception{
            return _dal.get_aihaotj_All();
            }
		    /**
         * 根据AIHAOTJ返回的查询DataRow创建一个AIHAOTJEntity对象
         * @param AIHAOTJ row
         * @returnAIHAOTJList对象
        * @throws Exception 
         */
		public List<aihaotj_Dao> get_aihaotj_All(String strWhere) throws Exception{
            return _dal.get_aihaotj_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaotj_Dao> get_aihaotj_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaotj_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOTJ返回的查询DataRow创建一个AIHAOTJEntity对象
         * @param AIHAOTJ row
         * @returnAIHAOTJDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaotj_Dao> get_aihaotj_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaotj_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOTJ字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaotj_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaotj_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOTJInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaotj_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaotj_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOTJIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaotj_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaotj_UpdateString( FieldName, Value, sid);
            }
        
        
    }
