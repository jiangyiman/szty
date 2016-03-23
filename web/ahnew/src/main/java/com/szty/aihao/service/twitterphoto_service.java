﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTwitterphoto.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.twitterphoto_Dao;
import com.szty.aihao.core.twitterphoto_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TWITTERPHOTO逻辑层接口
    *@作者：宋春林 
    */

	public class twitterphoto_service
	{
        public  twitterphoto_core _dal=classFactory.gettwitterphoto();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TWITTERPHOTO实体
         * @return 新插入记录的编号
         */
		public int insert_twitterphoto (twitterphoto_Dao _TWITTERPHOTOModel )  throws Exception{
         return _dal.insert_twitterphoto( _TWITTERPHOTOModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TWITTERPHOTOprrameter
         * @return 新插入记录的编号
         */
         public int insert_twitterphoto(Object[] _para)  throws Exception{
        return _dal.insert_twitterphoto( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TWITTERPHOTO实体
         * @return 影响的行数
         */
		public int update_twitterphoto(twitterphoto_Dao _TWITTERPHOTOModel)  throws Exception{
        return _dal.update_twitterphoto( _TWITTERPHOTOModel);
		}
	
		

         /**
         *  删除数据表TWITTERPHOTO中的一条记录
         * @param TWITTERPHOTO实体
         * @return 新插入记录的编号
         */
		public int delete_twitterphoto(int Photoid)  throws Exception{
        return _dal.delete_twitterphoto( Photoid);
		}

		

       
          /**
         * 得到 twitterphoto 数据实体
         * @param Photoid">Photoid
         * @return<twitterphoto 数据实体
        * @throws Exception 
         */
		public twitterphoto_Dao get_twitterphotoDao(int Photoid) throws Exception{
        return _dal.get_twitterphotoDao( Photoid);
		}
		
		    /**
         * 根据TWITTERPHOTO返回的查询DataRow创建一个TWITTERPHOTOEntity对象
         * @param TWITTERPHOTO row
         * @returnTWITTERPHOTOList对象
        * @throws Exception 
         */
		public List<twitterphoto_Dao> get_twitterphoto_All() throws Exception{
            return _dal.get_twitterphoto_All();
            }
		    /**
         * 根据TWITTERPHOTO返回的查询DataRow创建一个TWITTERPHOTOEntity对象
         * @param TWITTERPHOTO row
         * @returnTWITTERPHOTOList对象
        * @throws Exception 
         */
		public List<twitterphoto_Dao> get_twitterphoto_All(String strWhere) throws Exception{
            return _dal.get_twitterphoto_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<twitterphoto_Dao> get_twitterphoto_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_twitterphoto_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TWITTERPHOTO返回的查询DataRow创建一个TWITTERPHOTOEntity对象
         * @param TWITTERPHOTO row
         * @returnTWITTERPHOTODictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, twitterphoto_Dao> get_twitterphoto_Dictionary(String strWhere) throws Exception{
            return _dal.get_twitterphoto_Dictionary(strWhere);
            }
		 /**
         * 更新TWITTERPHOTO字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_twitterphoto_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_twitterphoto_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TWITTERPHOTOInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_twitterphoto_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_twitterphoto_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TWITTERPHOTOIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtwitterphoto_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_twitterphoto_UpdateString( FieldName, Value, sid);
            }
        
        
    }
