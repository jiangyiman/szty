﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataWebhaoclass.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.webhaoclass_Dao;
import com.szty.aihao.core.webhaoclass_core;
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
*@WEBHAOCLASS数据接口
*@作者：宋春林 
*/
public class webhaoclass_impl implements webhaoclass_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(webhaoclass_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param WEBHAOCLASS实体
* @return 新插入记录的编号
*/
public int insert_webhaoclass(webhaoclass_Dao _WEBHAOCLASSModel)  throws Exception{
         String sqlStr = "{call WEBHAOCLASS_PRO.InsertWEBHAOCLASS(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_WEBHAOCLASSModel.getCat());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_WEBHAOCLASSModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_WEBHAOCLASSModel.getUrl());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param WEBHAOCLASS
* @Object 
* @return 新插入记录的编号
*/
public int insert_webhaoclass(Object[] _para)  throws Exception{
      String sqlStr = "{call WEBHAOCLASS_PRO.InsertWEBHAOCLASS(?,?,?)}";
	  OracleParameter[] op = new OracleParameter[3];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param WEBHAOCLASS实体
* @return 影响的行数
*/
public int update_webhaoclass(webhaoclass_Dao _WEBHAOCLASSModel)  throws Exception{
        String sqlStr = "{call WEBHAOCLASS_PRO.UpdateWEBHAOCLASS(?,?,?)}";
		 OracleParameter[] op = new OracleParameter[3];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_WEBHAOCLASSModel.getCat());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_WEBHAOCLASSModel.getName());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_WEBHAOCLASSModel.getUrl());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表WEBHAOCLASS中的一条记录
* @param WEBHAOCLASS实体
* @return 新插入记录的编号
*/
public int delete_webhaoclass(int Cat)  throws Exception{
        String sqlStr = "{call WEBHAOCLASS_PRO.DeleteWEBHAOCLASS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Cat);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 webhaoclass 数据实体
* @param Cat">Cat
* @return<webhaoclass 数据实体
* @throws Exception 
*/
public webhaoclass_Dao get_webhaoclassDao(int Cat) throws Exception{
         String sqlStr = "{ call WEBHAOCLASS_PRO.GetWEBHAOCLASSEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Cat);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			webhaoclass_Dao _obj = new webhaoclass_Dao();
            _obj.setCat(arr.getString("CAT"));
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
			return _obj;
		}
		return null;

}

/**
* 根据WEBHAOCLASS返回的查询DataRow创建一个WEBHAOCLASSEntity对象
* @param WEBHAOCLASS row
* @returnWEBHAOCLASSList对象
* @throws Exception 
*/
public List<webhaoclass_Dao> get_webhaoclass_All() throws Exception{
        List<webhaoclass_Dao> _list = new ArrayList<webhaoclass_Dao>();
		String sqlStr = "{ call WEBHAOCLASS_PRO.GetWEBHAOCLASS(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			webhaoclass_Dao _obj = new webhaoclass_Dao();
            _obj.setCat(arr.getString("CAT"));
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据WEBHAOCLASS返回的查询DataRow创建一个WEBHAOCLASSEntity对象
* @param WEBHAOCLASS row
* @returnWEBHAOCLASSList对象
* @throws Exception 
*/
public List< webhaoclass_Dao> get_webhaoclass_All(String strWhere) throws Exception{
         List<webhaoclass_Dao> _list = new ArrayList<webhaoclass_Dao>();
		 String sqlStr = "{ call WEBHAOCLASS_PRO.GetWEBHAOCLASSWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				webhaoclass_Dao _obj = new webhaoclass_Dao();
            _obj.setCat(arr.getString("CAT"));
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据WEBHAOCLASS返回 分页数据
* @param WEBHAOCLASS row
* @returnWEBHAOCLASSList对象
* @throws Exception 
*/
public List<webhaoclass_Dao> get_webhaoclass_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<webhaoclass_Dao> _list = new ArrayList<webhaoclass_Dao>();
		String sqlStr = "{ call WEBHAOCLASS_PRO.GetWEBHAOCLASSPage(?,?,?,?,?,?)}";
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
				webhaoclass_Dao _obj = new webhaoclass_Dao();
            _obj.setCat(arr.getString("CAT"));
            _obj.setName(arr.getString("NAME"));
            _obj.setUrl(arr.getString("URL"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据WEBHAOCLASS返回的查询DataRow创建一个WEBHAOCLASSEntity对象
* @param WEBHAOCLASS row
* @returnWEBHAOCLASSDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, webhaoclass_Dao> get_webhaoclass_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicwebhaoclassstrWhere") == null) {
			Dictionary<Integer, webhaoclass_Dao> _dic = new Hashtable<Integer, webhaoclass_Dao>();
			List<webhaoclass_Dao> _list = new ArrayList<webhaoclass_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getCat()), _list.get(i));
			}
			classFactory.cachePut("dicwebhaoclass", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, webhaoclass_Dao> _dic = (Dictionary<Integer, webhaoclass_Dao>) classFactory
					.cacheGet("dicwebhaoclassstrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新WEBHAOCLASS字段加一
* @param FieldName
* @param sid
*/
public int create_webhaoclass_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call WEBHAOCLASS_PRO.UpdateFieldWEBHAOCLASS(?,?)}";
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
* 更新WEBHAOCLASSInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_webhaoclass_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call WEBHAOCLASS_PRO.UpdateFieldWEBHAOCLASSV(?,?,?)}";
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
* 更新WEBHAOCLASSIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_webhaoclass_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call WEBHAOCLASS_PRO.UpdateFieldWEBHAOCLASSU(?,?,?)}";
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
