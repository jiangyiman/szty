﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataCitys.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.citys_Dao;
import com.szty.aihao.core.citys_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@CITYS逻辑层接口
    *@作者：宋春林 
    */

	public class citys_service
	{
        public  citys_core _dal=classFactory.getcitys();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param CITYS实体
         * @return 新插入记录的编号
         */
		public int insert_citys (citys_Dao _CITYSModel )  throws Exception{
         return _dal.insert_citys( _CITYSModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param CITYSprrameter
         * @return 新插入记录的编号
         */
         public int insert_citys(Object[] _para)  throws Exception{
        return _dal.insert_citys( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param CITYS实体
         * @return 影响的行数
         */
		public int update_citys(citys_Dao _CITYSModel)  throws Exception{
        return _dal.update_citys( _CITYSModel);
		}
	
		

         /**
         *  删除数据表CITYS中的一条记录
         * @param CITYS实体
         * @return 新插入记录的编号
         */
		public int delete_citys(int Id)  throws Exception{
        return _dal.delete_citys( Id);
		}

		

       
          /**
         * 得到 citys 数据实体
         * @param Id">Id
         * @return<citys 数据实体
        * @throws Exception 
         */
		public citys_Dao get_citysDao(int Id) throws Exception{
        return _dal.get_citysDao( Id);
		}
		
		    /**
         * 根据CITYS返回的查询DataRow创建一个CITYSEntity对象
         * @param CITYS row
         * @returnCITYSList对象
        * @throws Exception 
         */
		public List<citys_Dao> get_citys_All() throws Exception{
            return _dal.get_citys_All();
            }
		    /**
         * 根据CITYS返回的查询DataRow创建一个CITYSEntity对象
         * @param CITYS row
         * @returnCITYSList对象
        * @throws Exception 
         */
		public List<citys_Dao> get_citys_All(String strWhere) throws Exception{
            return _dal.get_citys_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<citys_Dao> get_citys_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_citys_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据CITYS返回的查询DataRow创建一个CITYSEntity对象
         * @param CITYS row
         * @returnCITYSDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, citys_Dao> get_citys_Dictionary(String strWhere) throws Exception{
            return _dal.get_citys_Dictionary(strWhere);
            }
		 /**
         * 更新CITYS字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_citys_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_citys_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新CITYSInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_citys_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_citys_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新CITYSIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createcitys_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_citys_UpdateString( FieldName, Value, sid);
            }
        
        
    }
