﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataErrcorrecttable.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.errcorrecttable_Dao;
import com.szty.aihao.core.errcorrecttable_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@ERRCORRECTTABLE逻辑层接口
    *@作者：宋春林 
    */

	public class errcorrecttable_service
	{
        public  errcorrecttable_core _dal=classFactory.geterrcorrecttable();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param ERRCORRECTTABLE实体
         * @return 新插入记录的编号
         */
		public int insert_errcorrecttable (errcorrecttable_Dao _ERRCORRECTTABLEModel )  throws Exception{
         return _dal.insert_errcorrecttable( _ERRCORRECTTABLEModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param ERRCORRECTTABLEprrameter
         * @return 新插入记录的编号
         */
         public int insert_errcorrecttable(Object[] _para)  throws Exception{
        return _dal.insert_errcorrecttable( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param ERRCORRECTTABLE实体
         * @return 影响的行数
         */
		public int update_errcorrecttable(errcorrecttable_Dao _ERRCORRECTTABLEModel)  throws Exception{
        return _dal.update_errcorrecttable( _ERRCORRECTTABLEModel);
		}
	
		

         /**
         *  删除数据表ERRCORRECTTABLE中的一条记录
         * @param ERRCORRECTTABLE实体
         * @return 新插入记录的编号
         */
		public int delete_errcorrecttable(int Errorid)  throws Exception{
        return _dal.delete_errcorrecttable( Errorid);
		}

		

       
          /**
         * 得到 errcorrecttable 数据实体
         * @param Errorid">Errorid
         * @return<errcorrecttable 数据实体
        * @throws Exception 
         */
		public errcorrecttable_Dao get_errcorrecttableDao(int Errorid) throws Exception{
        return _dal.get_errcorrecttableDao( Errorid);
		}
		
		    /**
         * 根据ERRCORRECTTABLE返回的查询DataRow创建一个ERRCORRECTTABLEEntity对象
         * @param ERRCORRECTTABLE row
         * @returnERRCORRECTTABLEList对象
        * @throws Exception 
         */
		public List<errcorrecttable_Dao> get_errcorrecttable_All() throws Exception{
            return _dal.get_errcorrecttable_All();
            }
		    /**
         * 根据ERRCORRECTTABLE返回的查询DataRow创建一个ERRCORRECTTABLEEntity对象
         * @param ERRCORRECTTABLE row
         * @returnERRCORRECTTABLEList对象
        * @throws Exception 
         */
		public List<errcorrecttable_Dao> get_errcorrecttable_All(String strWhere) throws Exception{
            return _dal.get_errcorrecttable_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<errcorrecttable_Dao> get_errcorrecttable_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_errcorrecttable_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据ERRCORRECTTABLE返回的查询DataRow创建一个ERRCORRECTTABLEEntity对象
         * @param ERRCORRECTTABLE row
         * @returnERRCORRECTTABLEDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, errcorrecttable_Dao> get_errcorrecttable_Dictionary(String strWhere) throws Exception{
            return _dal.get_errcorrecttable_Dictionary(strWhere);
            }
		 /**
         * 更新ERRCORRECTTABLE字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_errcorrecttable_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_errcorrecttable_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新ERRCORRECTTABLEInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_errcorrecttable_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_errcorrecttable_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新ERRCORRECTTABLEIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createerrcorrecttable_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_errcorrecttable_UpdateString( FieldName, Value, sid);
            }
        
        
    }
