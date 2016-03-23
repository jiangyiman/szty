/*
 *@===================================================================
 *@项目说明
 *@作者：宋春林 
 *@版本信息:@Copy Right 2011-2015
 *@文件： iDataSc_category.java
 *@项目名称：JAVA项目管理
 *@创建时间：2015/11/3
 *@===================================================================
 */

package com.szty.aihao.service;

import com.szty.aihao.dao.sc_category_Dao;
import com.szty.aihao.core.sc_category_core;
import com.szty.aihao.factory.classFactory;
import java.util.Dictionary;
import java.util.List;


    /**
    *@文件说明
    *@SC_CATEGORY逻辑层接口
    *@作者：宋春林 
    */

	public class sc_category_service
	{
        public  sc_category_core _dal=classFactory.getsc_category();
	
     
         /**
         * 向数据库中插入一条新记录。
         * @param SC_CATEGORY实体
         * @return 新插入记录的编号
         */
		public int insert_sc_category (sc_category_Dao _SC_CATEGORYModel )  throws Exception{
         return _dal.insert_sc_category( _SC_CATEGORYModel);
		}
        
        /**
         * 向数据库中插入一条新记录。
         * @param SC_CATEGORYprrameter
         * @return 新插入记录的编号
         */
         public int insert_sc_category(Object[] _para)  throws Exception{
        return _dal.insert_sc_category( _para);
        }
	
		 /**
         * 向数据库中插入一条新记录。
         * @param SC_CATEGORY实体
         * @return 影响的行数
         */
		public int update_sc_category(sc_category_Dao _SC_CATEGORYModel)  throws Exception{
        return _dal.update_sc_category( _SC_CATEGORYModel);
		}
	
		

         /**
         *  删除数据表SC_CATEGORY中的一条记录
         * @param SC_CATEGORY实体
         * @return 新插入记录的编号
         */
		public int delete_sc_category(int Id)  throws Exception{
        return _dal.delete_sc_category( Id);
		}

		

       
          /**
         * 得到 sc_category 数据实体
         * @param Id">Id
         * @return<sc_category 数据实体
        * @throws Exception 
         */
		public sc_category_Dao get_sc_categoryDao(int Id) throws Exception{
        return _dal.get_sc_categoryDao( Id);
		}
		public int get_sc_categoryCount(String sWhere) throws Exception{
        return _dal.get_sc_categoryCount( sWhere);
		}
		    /**
         * 根据SC_CATEGORY返回的查询DataRow创建一个SC_CATEGORYEntity对象
         * @param SC_CATEGORY row
         * @returnSC_CATEGORYList对象
        * @throws Exception 
         */
		public List<sc_category_Dao> get_sc_category_All() throws Exception{
            return _dal.get_sc_category_All();
            }
		    /**
         * 根据SC_CATEGORY返回的查询DataRow创建一个SC_CATEGORYEntity对象
         * @param SC_CATEGORY row
         * @returnSC_CATEGORYList对象
        * @throws Exception 
         */
		public List<sc_category_Dao> get_sc_category_All(String strWhere) throws Exception{
            return _dal.get_sc_category_All(strWhere);
            } 
     /* 根据SCLTEST返回 分页数据
	 * 
	 * @param SCLTEST
	 *            row
	 * @returnSCLTESTList对象
	 * @throws Exception
	 */
	public List<sc_category_Dao> get_sc_category_Page(int pageSize, int pageIndex,String strWhere) throws Exception 
            {
                return _dal.get_sc_category_Page(pageSize,pageIndex,strWhere);
            }
           /**
         * 根据SC_CATEGORY返回的查询DataRow创建一个SC_CATEGORYEntity对象
         * @param SC_CATEGORY row
         * @returnSC_CATEGORYDictionary对象
        * @throws Exception 
         */
        public Dictionary<Integer, sc_category_Dao> get_sc_category_Dictionary(String strWhere) throws Exception{
            return _dal.get_sc_category_Dictionary(strWhere);
            }
		 /**
         * 更新SC_CATEGORY字段加一
         * @param FieldName
         * @param sid
         */
	    public int create_sc_category_UpdateIncreate(String FieldName,int sid)  throws Exception{
            return _dal.create_sc_category_UpdateIncreate( FieldName, sid);
            }
         /**
         * 更新SC_CATEGORYInt型字段
         * @param FieldName
         * @param Num
         * @param sid
         */
	    public int create_sc_category_UpdateInteger(String FieldName,int Num,int sid)  throws Exception{
            return _dal.create_sc_category_UpdateInteger( FieldName, Num, sid);
            }
          /**
         * 更新SC_CATEGORYIString型字段
         * @param FieldName
         * @param Value
         * @param sid
         */
	    public int createsc_category_UpdateString(String FieldName,String Value,int sid)  throws Exception{
            
            return _dal.create_sc_category_UpdateString( FieldName, Value, sid);
            }
        
        
    }
