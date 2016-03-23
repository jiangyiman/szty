﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaobusiness31.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaobusiness31_Dao;
import com.szty.aihao.core.aihaobusiness31_core;
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
*@AIHAOBUSINESS31数据接口
*@作者：宋春林 
*/
public class aihaobusiness31_impl implements aihaobusiness31_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaobusiness31_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOBUSINESS31实体
* @return 新插入记录的编号
*/
public int insert_aihaobusiness31(aihaobusiness31_Dao _AIHAOBUSINESS31Model)  throws Exception{
         String sqlStr = "{call AIHAOBUSINESS31_PRO.InsertAIHAOBUSINESS31(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOBUSINESS31Model.getSname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getFbigclass());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getBigclass());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getTag());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getProvince());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getCity());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getArea());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getAddress());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS31Model.getLatitude());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS31Model.getLongitude());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getArea_code());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getTelephone());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getPhone());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS31Model.getId());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getProvincecode());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getCitycode());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS31Model.getGroupid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOBUSINESS31
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaobusiness31(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOBUSINESS31_PRO.InsertAIHAOBUSINESS31(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[17];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_para[7]);
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DOUBLE,_para[8]);
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DOUBLE,_para[9]);
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_para[10]);
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_para[11]);
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_para[12]);
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_para[13]);
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_para[14]);
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_para[15]);
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_para[16]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param AIHAOBUSINESS31实体
* @return 影响的行数
*/
public int update_aihaobusiness31(aihaobusiness31_Dao _AIHAOBUSINESS31Model)  throws Exception{
        String sqlStr = "{call AIHAOBUSINESS31_PRO.UpdateAIHAOBUSINESS31(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getSname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getFbigclass());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getBigclass());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getTag());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getProvince());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getCity());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getArea());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getAddress());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS31Model.getLatitude());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS31Model.getLongitude());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getArea_code());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getTelephone());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getPhone());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS31Model.getId());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getProvincecode());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS31Model.getCitycode());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS31Model.getGroupid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOBUSINESS31中的一条记录
* @param AIHAOBUSINESS31实体
* @return 新插入记录的编号
*/
public int delete_aihaobusiness31(int Sname)  throws Exception{
        String sqlStr = "{call AIHAOBUSINESS31_PRO.DeleteAIHAOBUSINESS31(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Sname);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaobusiness31 数据实体
* @param Sname">Sname
* @return<aihaobusiness31 数据实体
* @throws Exception 
*/
public aihaobusiness31_Dao get_aihaobusiness31Dao(int Sname) throws Exception{
         String sqlStr = "{ call AIHAOBUSINESS31_PRO.GetAIHAOBUSINESS31Entity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Sname);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaobusiness31_Dao _obj = new aihaobusiness31_Dao();
            _obj.setSname(arr.getString("SNAME"));
            _obj.setFbigclass(arr.getString("FBIGCLASS"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setArea_code(arr.getString("AREA_CODE"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setId(arr.getInt("ID"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
			return _obj;
		}
		return null;

}

/**
* 根据AIHAOBUSINESS31返回的查询DataRow创建一个AIHAOBUSINESS31Entity对象
* @param AIHAOBUSINESS31 row
* @returnAIHAOBUSINESS31List对象
* @throws Exception 
*/
public List<aihaobusiness31_Dao> get_aihaobusiness31_All() throws Exception{
        List<aihaobusiness31_Dao> _list = new ArrayList<aihaobusiness31_Dao>();
		String sqlStr = "{ call AIHAOBUSINESS31_PRO.GetAIHAOBUSINESS31(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaobusiness31_Dao _obj = new aihaobusiness31_Dao();
            _obj.setSname(arr.getString("SNAME"));
            _obj.setFbigclass(arr.getString("FBIGCLASS"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setArea_code(arr.getString("AREA_CODE"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setId(arr.getInt("ID"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据AIHAOBUSINESS31返回的查询DataRow创建一个AIHAOBUSINESS31Entity对象
* @param AIHAOBUSINESS31 row
* @returnAIHAOBUSINESS31List对象
* @throws Exception 
*/
public List< aihaobusiness31_Dao> get_aihaobusiness31_All(String strWhere) throws Exception{
         List<aihaobusiness31_Dao> _list = new ArrayList<aihaobusiness31_Dao>();
		 String sqlStr = "{ call AIHAOBUSINESS31_PRO.GetAIHAOBUSINESS31Where(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaobusiness31_Dao _obj = new aihaobusiness31_Dao();
            _obj.setSname(arr.getString("SNAME"));
            _obj.setFbigclass(arr.getString("FBIGCLASS"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setArea_code(arr.getString("AREA_CODE"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setId(arr.getInt("ID"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据AIHAOBUSINESS31返回 分页数据
* @param AIHAOBUSINESS31 row
* @returnAIHAOBUSINESS31List对象
* @throws Exception 
*/
public List<aihaobusiness31_Dao> get_aihaobusiness31_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaobusiness31_Dao> _list = new ArrayList<aihaobusiness31_Dao>();
		String sqlStr = "{ call AIHAOBUSINESS31_PRO.GetAIHAOBUSINESS31Page(?,?,?,?,?,?)}";
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
				aihaobusiness31_Dao _obj = new aihaobusiness31_Dao();
            _obj.setSname(arr.getString("SNAME"));
            _obj.setFbigclass(arr.getString("FBIGCLASS"));
            _obj.setBigclass(arr.getString("BIGCLASS"));
            _obj.setTag(arr.getString("TAG"));
            _obj.setProvince(arr.getString("PROVINCE"));
            _obj.setCity(arr.getString("CITY"));
            _obj.setArea(arr.getString("AREA"));
            _obj.setAddress(arr.getString("ADDRESS"));
            _obj.setArea_code(arr.getString("AREA_CODE"));
            _obj.setTelephone(arr.getString("TELEPHONE"));
            _obj.setPhone(arr.getString("PHONE"));
            _obj.setId(arr.getInt("ID"));
            _obj.setProvincecode(arr.getString("PROVINCECODE"));
            _obj.setCitycode(arr.getString("CITYCODE"));
            _obj.setGroupid(arr.getInt("GROUPID"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据AIHAOBUSINESS31返回的查询DataRow创建一个AIHAOBUSINESS31Entity对象
* @param AIHAOBUSINESS31 row
* @returnAIHAOBUSINESS31Dictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaobusiness31_Dao> get_aihaobusiness31_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaobusiness31strWhere") == null) {
			Dictionary<Integer, aihaobusiness31_Dao> _dic = new Hashtable<Integer, aihaobusiness31_Dao>();
			List<aihaobusiness31_Dao> _list = new ArrayList<aihaobusiness31_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getSname()), _list.get(i));
			}
			classFactory.cachePut("dicaihaobusiness31", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaobusiness31_Dao> _dic = (Dictionary<Integer, aihaobusiness31_Dao>) classFactory
					.cacheGet("dicaihaobusiness31strWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOBUSINESS31字段加一
* @param FieldName
* @param sid
*/
public int create_aihaobusiness31_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOBUSINESS31_PRO.UpdateFieldAIHAOBUSINESS31(?,?)}";
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
* 更新AIHAOBUSINESS31Int型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaobusiness31_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOBUSINESS31_PRO.UpdateFieldAIHAOBUSINESS31V(?,?,?)}";
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
* 更新AIHAOBUSINESS31IString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaobusiness31_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOBUSINESS31_PRO.UpdateFieldAIHAOBUSINESS31U(?,?,?)}";
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
