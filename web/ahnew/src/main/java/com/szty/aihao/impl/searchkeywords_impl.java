﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataSearchkeywords.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.searchkeywords_Dao;
import com.szty.aihao.core.searchkeywords_core;
import com.szty.aihao.factory.*;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.rowset.OracleCachedRowSet;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
*@文件说明
*@SEARCHKEYWORDS数据接口
*@作者：宋春林 
*/
public class searchkeywords_impl implements searchkeywords_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(searchkeywords_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SEARCHKEYWORDS实体
* @return 新插入记录的编号
*/
public int insert_searchkeywords(searchkeywords_Dao _SEARCHKEYWORDSModel)  throws Exception{
         String sqlStr = "{call SEARCHKEYWORDS_PRO.InsertSEARCHKEYWORDS(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SEARCHKEYWORDSModel.getSearchkeyid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SEARCHKEYWORDSModel.getProcode());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_SEARCHKEYWORDSModel.getCitycode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SEARCHKEYWORDSModel.getCityname());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SEARCHKEYWORDSModel.getKeywords());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_SEARCHKEYWORDSModel.getKeyorder());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_SEARCHKEYWORDSModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SEARCHKEYWORDS
* @Object 
* @return 新插入记录的编号
*/
public int insert_searchkeywords(Object[] _para)  throws Exception{
      String sqlStr = "{call SEARCHKEYWORDS_PRO.InsertSEARCHKEYWORDS(?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[7];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_para[6]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SEARCHKEYWORDS实体
* @return 影响的行数
*/
public int update_searchkeywords(searchkeywords_Dao _SEARCHKEYWORDSModel)  throws Exception{
        String sqlStr = "{call SEARCHKEYWORDS_PRO.UpdateSEARCHKEYWORDS(?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[7];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_SEARCHKEYWORDSModel.getSearchkeyid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NUMERIC,_SEARCHKEYWORDSModel.getProcode());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NUMERIC,_SEARCHKEYWORDSModel.getCitycode());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SEARCHKEYWORDSModel.getCityname());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_SEARCHKEYWORDSModel.getKeywords());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NUMERIC,_SEARCHKEYWORDSModel.getKeyorder());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.DATE, dateformat.format(_SEARCHKEYWORDSModel.getCdate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SEARCHKEYWORDS中的一条记录
* @param SEARCHKEYWORDS实体
* @return 新插入记录的编号
*/
public int delete_searchkeywords(int Searchkeyid)  throws Exception{
        String sqlStr = "{call SEARCHKEYWORDS_PRO.DeleteSEARCHKEYWORDS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Searchkeyid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 searchkeywords 数据实体
* @param Searchkeyid">Searchkeyid
* @return<searchkeywords 数据实体
* @throws Exception 
*/
public searchkeywords_Dao get_searchkeywordsDao(int Searchkeyid) throws Exception{
         String sqlStr = "{ call SEARCHKEYWORDS_PRO.GetSEARCHKEYWORDSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Searchkeyid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			searchkeywords_Dao _obj = new searchkeywords_Dao();
            _obj.setSearchkeyid(arr.getInt("SEARCHKEYID"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setKeywords(arr.getString("KEYWORDS"));
            _obj.setKeyorder(arr.getInt("KEYORDER"));
             try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据SEARCHKEYWORDS返回的查询DataRow创建一个SEARCHKEYWORDSEntity对象
* @param SEARCHKEYWORDS row
* @returnSEARCHKEYWORDSList对象
* @throws Exception 
*/
public List<searchkeywords_Dao> get_searchkeywords_All() throws Exception{
        List<searchkeywords_Dao> _list = new ArrayList<searchkeywords_Dao>();
		String sqlStr = "{ call SEARCHKEYWORDS_PRO.GetSEARCHKEYWORDS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			searchkeywords_Dao _obj = new searchkeywords_Dao();
            _obj.setSearchkeyid(arr.getInt("SEARCHKEYID"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setKeywords(arr.getString("KEYWORDS"));
            _obj.setKeyorder(arr.getInt("KEYORDER"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SEARCHKEYWORDS返回的查询DataRow创建一个SEARCHKEYWORDSEntity对象
* @param SEARCHKEYWORDS row
* @returnSEARCHKEYWORDSList对象
* @throws Exception 
*/
public List< searchkeywords_Dao> get_searchkeywords_All(String strWhere) throws Exception{
         List<searchkeywords_Dao> _list = new ArrayList<searchkeywords_Dao>();
		 String sqlStr = "{ call SEARCHKEYWORDS_PRO.GetSEARCHKEYWORDSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				searchkeywords_Dao _obj = new searchkeywords_Dao();
            _obj.setSearchkeyid(arr.getInt("SEARCHKEYID"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setKeywords(arr.getString("KEYWORDS"));
            _obj.setKeyorder(arr.getInt("KEYORDER"));
           try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SEARCHKEYWORDS返回 分页数据
* @param SEARCHKEYWORDS row
* @returnSEARCHKEYWORDSList对象
* @throws Exception 
*/
public List<searchkeywords_Dao> get_searchkeywords_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<searchkeywords_Dao> _list = new ArrayList<searchkeywords_Dao>();
		String sqlStr = "{ call SEARCHKEYWORDS_PRO.GetSEARCHKEYWORDSPage(?,?,?,?,?,?)}";
		OracleParameter[] op = new OracleParameter[6];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "OUT", OracleTypes.NUMBER, "");
		op[2] = new OracleParameter(3, "OUT", OracleTypes.NUMBER, "");
		op[3] = new OracleParameter(4, "IN", OracleTypes.NUMBER, pageIndex);
		op[4] = new OracleParameter(5, "IN", OracleTypes.NUMBER, pageSize);
		op[5] = new OracleParameter(6, "IN", OracleTypes.VARCHAR, strWhere);
		OraclePageCache opc = OracleHelper.executeQueryPage(sqlStr, op);
		OracleCachedRowSet arr = opc.getOcrs();
		while (arr.next()) {
				searchkeywords_Dao _obj = new searchkeywords_Dao();
            _obj.setSearchkeyid(arr.getInt("SEARCHKEYID"));
            _obj.setProcode(arr.getInt("PROCODE"));
            _obj.setCitycode(arr.getInt("CITYCODE"));
            _obj.setCityname(arr.getString("CITYNAME"));
            _obj.setKeywords(arr.getString("KEYWORDS"));
            _obj.setKeyorder(arr.getInt("KEYORDER"));
            try{_obj.setCdate(dateformat.parse(arr.getString("CDATE")));}catch(Exception ce){_obj.setCdate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SEARCHKEYWORDS返回的查询DataRow创建一个SEARCHKEYWORDSEntity对象
* @param SEARCHKEYWORDS row
* @returnSEARCHKEYWORDSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, searchkeywords_Dao> get_searchkeywords_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsearchkeywordsstrWhere") == null) {
			Dictionary<Integer, searchkeywords_Dao> _dic = new Hashtable<Integer, searchkeywords_Dao>();
			List<searchkeywords_Dao> _list = new ArrayList<searchkeywords_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getSearchkeyid()), _list.get(i));
			}
			classFactory.cachePut("dicsearchkeywords", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, searchkeywords_Dao> _dic = (Dictionary<Integer, searchkeywords_Dao>) classFactory
					.cacheGet("dicsearchkeywordsstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SEARCHKEYWORDS字段加一
* @param FieldName
* @param sid
*/
public int create_searchkeywords_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SEARCHKEYWORDS_PRO.UpdateFieldSEARCHKEYWORDS(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "IN", OracleTypes.NUMBER, sid);
		op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, FieldName);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}
/**
* 更新SEARCHKEYWORDSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_searchkeywords_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SEARCHKEYWORDS_PRO.UpdateFieldSEARCHKEYWORDSV(?,?,?)}";
		OracleParameter[] op = new OracleParameter[3];
		op[0] = new OracleParameter(1, "IN", OracleTypes.NUMBER, sid);
		op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, FieldName);
		op[2] = new OracleParameter(3, "IN", OracleTypes.NUMBER, Num);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;


}
/**
* 更新SEARCHKEYWORDSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_searchkeywords_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SEARCHKEYWORDS_PRO.UpdateFieldSEARCHKEYWORDSU(?,?,?)}";
		OracleParameter[] op = new OracleParameter[3];
		op[0] = new OracleParameter(1, "IN", OracleTypes.NUMBER, sid);
		op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, FieldName);
		op[2] = new OracleParameter(3, "IN", OracleTypes.VARCHAR, Value);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}



}
