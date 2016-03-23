﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataAihaocontact.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.aihaocontact_Dao;
import com.szty.aihao.core.aihaocontact_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@AIHAOCONTACT逻辑层接口
    *@作者：宋春林 
    */

	public class aihaocontact_service
	{
        public  aihaocontact_core _dal=classFactory.getaihaocontact();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param AIHAOCONTACT实体
         * @return 新插入记录的编号
         */
		public int insert_aihaocontact (aihaocontact_Dao _AIHAOCONTACTModel )  throws Exception{
         return _dal.insert_aihaocontact( _AIHAOCONTACTModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param AIHAOCONTACTprrameter
         * @return 新插入记录的编号
         */
         public int insert_aihaocontact(Object[] _para)  throws Exception{
        return _dal.insert_aihaocontact( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param AIHAOCONTACT实体
         * @return 影响的行数
         */
		public int update_aihaocontact(aihaocontact_Dao _AIHAOCONTACTModel)  throws Exception{
        return _dal.update_aihaocontact( _AIHAOCONTACTModel);
		}
	
		

         /**
         *  删除数据表AIHAOCONTACT中的一条记录
         * @param AIHAOCONTACT实体
         * @return 新插入记录的编号
         */
		public int delete_aihaocontact(int Id)  throws Exception{
        return _dal.delete_aihaocontact( Id);
		}

		

       
          /**
         * 得到 aihaocontact 数据实体
         * @param Id">Id
         * @return<aihaocontact 数据实体
        * @throws Exception 
         */
		public aihaocontact_Dao get_aihaocontactDao(int Id) throws Exception{
        return _dal.get_aihaocontactDao( Id);
		}
		
		    /**
         * 根据AIHAOCONTACT返回的查询DataRow创建一个AIHAOCONTACTEntity对象
         * @param AIHAOCONTACT row
         * @returnAIHAOCONTACTList对象
        * @throws Exception 
         */
		public List<aihaocontact_Dao> get_aihaocontact_All() throws Exception{
            return _dal.get_aihaocontact_All();
            }
		    /**
         * 根据AIHAOCONTACT返回的查询DataRow创建一个AIHAOCONTACTEntity对象
         * @param AIHAOCONTACT row
         * @returnAIHAOCONTACTList对象
        * @throws Exception 
         */
		public List<aihaocontact_Dao> get_aihaocontact_All(String strWhere) throws Exception{
            return _dal.get_aihaocontact_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<aihaocontact_Dao> get_aihaocontact_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_aihaocontact_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据AIHAOCONTACT返回的查询DataRow创建一个AIHAOCONTACTEntity对象
         * @param AIHAOCONTACT row
         * @returnAIHAOCONTACTDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, aihaocontact_Dao> get_aihaocontact_Dictionary(String strWhere) throws Exception{
            return _dal.get_aihaocontact_Dictionary(strWhere);
            }
		 /**
         * 更新AIHAOCONTACT字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_aihaocontact_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_aihaocontact_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新AIHAOCONTACTInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_aihaocontact_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_aihaocontact_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新AIHAOCONTACTIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createaihaocontact_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_aihaocontact_UpdateString( FieldName, Value, sid);
            }
        
        
    }
