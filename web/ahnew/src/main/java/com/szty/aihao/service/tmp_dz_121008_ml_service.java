﻿/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataTmp_dz_121008_ml.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/10/15
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.tmp_dz_121008_ml_Dao;
import com.szty.aihao.core.tmp_dz_121008_ml_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@TMP_DZ_121008_ML逻辑层接口
    *@作者：宋春林 
    */

	public class tmp_dz_121008_ml_service
	{
        public  tmp_dz_121008_ml_core _dal=classFactory.gettmp_dz_121008_ml();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_121008_ML实体
         * @return 新插入记录的编号
         */
		public int insert_tmp_dz_121008_ml (tmp_dz_121008_ml_Dao _TMP_DZ_121008_MLModel )  throws Exception{
         return _dal.insert_tmp_dz_121008_ml( _TMP_DZ_121008_MLModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_121008_MLprrameter
         * @return 新插入记录的编号
         */
         public int insert_tmp_dz_121008_ml(Object[] _para)  throws Exception{
        return _dal.insert_tmp_dz_121008_ml( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param TMP_DZ_121008_ML实体
         * @return 影响的行数
         */
		public int update_tmp_dz_121008_ml(tmp_dz_121008_ml_Dao _TMP_DZ_121008_MLModel)  throws Exception{
        return _dal.update_tmp_dz_121008_ml( _TMP_DZ_121008_MLModel);
		}
	
		

         /**
         *  删除数据表TMP_DZ_121008_ML中的一条记录
         * @param TMP_DZ_121008_ML实体
         * @return 新插入记录的编号
         */
		public int delete_tmp_dz_121008_ml(int P1)  throws Exception{
        return _dal.delete_tmp_dz_121008_ml( P1);
		}

		

       
          /**
         * 得到 tmp_dz_121008_ml 数据实体
         * @param P1">P1
         * @return<tmp_dz_121008_ml 数据实体
        * @throws Exception 
         */
		public tmp_dz_121008_ml_Dao get_tmp_dz_121008_mlDao(int P1) throws Exception{
        return _dal.get_tmp_dz_121008_mlDao( P1);
		}
		
		    /**
         * 根据TMP_DZ_121008_ML返回的查询DataRow创建一个TMP_DZ_121008_MLEntity对象
         * @param TMP_DZ_121008_ML row
         * @returnTMP_DZ_121008_MLList对象
        * @throws Exception 
         */
		public List<tmp_dz_121008_ml_Dao> get_tmp_dz_121008_ml_All() throws Exception{
            return _dal.get_tmp_dz_121008_ml_All();
            }
		    /**
         * 根据TMP_DZ_121008_ML返回的查询DataRow创建一个TMP_DZ_121008_MLEntity对象
         * @param TMP_DZ_121008_ML row
         * @returnTMP_DZ_121008_MLList对象
        * @throws Exception 
         */
		public List<tmp_dz_121008_ml_Dao> get_tmp_dz_121008_ml_All(String strWhere) throws Exception{
            return _dal.get_tmp_dz_121008_ml_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<tmp_dz_121008_ml_Dao> get_tmp_dz_121008_ml_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_tmp_dz_121008_ml_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据TMP_DZ_121008_ML返回的查询DataRow创建一个TMP_DZ_121008_MLEntity对象
         * @param TMP_DZ_121008_ML row
         * @returnTMP_DZ_121008_MLDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, tmp_dz_121008_ml_Dao> get_tmp_dz_121008_ml_Dictionary(String strWhere) throws Exception{
            return _dal.get_tmp_dz_121008_ml_Dictionary(strWhere);
            }
		 /**
         * 更新TMP_DZ_121008_ML字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_tmp_dz_121008_ml_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_tmp_dz_121008_ml_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新TMP_DZ_121008_MLInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_tmp_dz_121008_ml_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_tmp_dz_121008_ml_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新TMP_DZ_121008_MLIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createtmp_dz_121008_ml_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_tmp_dz_121008_ml_UpdateString( FieldName, Value, sid);
            }
        
        
    }
