﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataAihaobusiness21.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.aihaobusiness21_Dao;
import com.szty.aihao.core.aihaobusiness21_core;
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
*@AIHAOBUSINESS21数据接口
*@作者：宋春林 
*/
public class aihaobusiness21_impl implements aihaobusiness21_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(aihaobusiness21_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param AIHAOBUSINESS21实体
* @return 新插入记录的编号
*/
public int insert_aihaobusiness21(aihaobusiness21_Dao _AIHAOBUSINESS21Model)  throws Exception{
         String sqlStr = "{call AIHAOBUSINESS21_PRO.InsertAIHAOBUSINESS21(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_AIHAOBUSINESS21Model.getSname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getFbigclass());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getBigclass());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getTag());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getProvince());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getCity());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getArea());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getAddress());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS21Model.getLatitude());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS21Model.getLongitude());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getArea_code());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getTelephone());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getPhone());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS21Model.getId());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getProvincecode());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getCitycode());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS21Model.getGroupid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param AIHAOBUSINESS21
* @Object 
* @return 新插入记录的编号
*/
public int insert_aihaobusiness21(Object[] _para)  throws Exception{
      String sqlStr = "{call AIHAOBUSINESS21_PRO.InsertAIHAOBUSINESS21(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
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
* @param AIHAOBUSINESS21实体
* @return 影响的行数
*/
public int update_aihaobusiness21(aihaobusiness21_Dao _AIHAOBUSINESS21Model)  throws Exception{
        String sqlStr = "{call AIHAOBUSINESS21_PRO.UpdateAIHAOBUSINESS21(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[17];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getSname());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getFbigclass());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getBigclass());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getTag());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getProvince());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getCity());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getArea());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getAddress());
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS21Model.getLatitude());
        op[9]= new OracleParameter(10, "IN", java.sql.Types.DOUBLE,_AIHAOBUSINESS21Model.getLongitude());
        op[10]= new OracleParameter(11, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getArea_code());
        op[11]= new OracleParameter(12, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getTelephone());
        op[12]= new OracleParameter(13, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getPhone());
        op[13]= new OracleParameter(14, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS21Model.getId());
        op[14]= new OracleParameter(15, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getProvincecode());
        op[15]= new OracleParameter(16, "IN", java.sql.Types.NVARCHAR,_AIHAOBUSINESS21Model.getCitycode());
        op[16]= new OracleParameter(17, "IN", java.sql.Types.NUMERIC,_AIHAOBUSINESS21Model.getGroupid());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表AIHAOBUSINESS21中的一条记录
* @param AIHAOBUSINESS21实体
* @return 新插入记录的编号
*/
public int delete_aihaobusiness21(int Sname)  throws Exception{
        String sqlStr = "{call AIHAOBUSINESS21_PRO.DeleteAIHAOBUSINESS21(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Sname);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 aihaobusiness21 数据实体
* @param Sname">Sname
* @return<aihaobusiness21 数据实体
* @throws Exception 
*/
public aihaobusiness21_Dao get_aihaobusiness21Dao(int Sname) throws Exception{
         String sqlStr = "{ call AIHAOBUSINESS21_PRO.GetAIHAOBUSINESS21Entity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Sname);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaobusiness21_Dao _obj = new aihaobusiness21_Dao();
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
* 根据AIHAOBUSINESS21返回的查询DataRow创建一个AIHAOBUSINESS21Entity对象
* @param AIHAOBUSINESS21 row
* @returnAIHAOBUSINESS21List对象
* @throws Exception 
*/
public List<aihaobusiness21_Dao> get_aihaobusiness21_All() throws Exception{
        List<aihaobusiness21_Dao> _list = new ArrayList<aihaobusiness21_Dao>();
		String sqlStr = "{ call AIHAOBUSINESS21_PRO.GetAIHAOBUSINESS21(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			aihaobusiness21_Dao _obj = new aihaobusiness21_Dao();
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
* 根据AIHAOBUSINESS21返回的查询DataRow创建一个AIHAOBUSINESS21Entity对象
* @param AIHAOBUSINESS21 row
* @returnAIHAOBUSINESS21List对象
* @throws Exception 
*/
public List< aihaobusiness21_Dao> get_aihaobusiness21_All(String strWhere) throws Exception{
         List<aihaobusiness21_Dao> _list = new ArrayList<aihaobusiness21_Dao>();
		 String sqlStr = "{ call AIHAOBUSINESS21_PRO.GetAIHAOBUSINESS21Where(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				aihaobusiness21_Dao _obj = new aihaobusiness21_Dao();
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
* 根据AIHAOBUSINESS21返回 分页数据
* @param AIHAOBUSINESS21 row
* @returnAIHAOBUSINESS21List对象
* @throws Exception 
*/
public List<aihaobusiness21_Dao> get_aihaobusiness21_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<aihaobusiness21_Dao> _list = new ArrayList<aihaobusiness21_Dao>();
		String sqlStr = "{ call AIHAOBUSINESS21_PRO.GetAIHAOBUSINESS21Page(?,?,?,?,?,?)}";
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
				aihaobusiness21_Dao _obj = new aihaobusiness21_Dao();
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
* 根据AIHAOBUSINESS21返回的查询DataRow创建一个AIHAOBUSINESS21Entity对象
* @param AIHAOBUSINESS21 row
* @returnAIHAOBUSINESS21Dictionary对象
* @throws Exception 
*/
public Dictionary<Integer, aihaobusiness21_Dao> get_aihaobusiness21_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicaihaobusiness21strWhere") == null) {
			Dictionary<Integer, aihaobusiness21_Dao> _dic = new Hashtable<Integer, aihaobusiness21_Dao>();
			List<aihaobusiness21_Dao> _list = new ArrayList<aihaobusiness21_Dao>();
			for (int i = 0; i < _list.size(); i++) {
				_dic.put(Integer.parseInt(_list.get(i).getSname()), _list.get(i));
			}
			classFactory.cachePut("dicaihaobusiness21", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, aihaobusiness21_Dao> _dic = (Dictionary<Integer, aihaobusiness21_Dao>) classFactory
					.cacheGet("dicaihaobusiness21strWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新AIHAOBUSINESS21字段加一
* @param FieldName
* @param sid
*/
public int create_aihaobusiness21_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call AIHAOBUSINESS21_PRO.UpdateFieldAIHAOBUSINESS21(?,?)}";
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
* 更新AIHAOBUSINESS21Int型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_aihaobusiness21_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call AIHAOBUSINESS21_PRO.UpdateFieldAIHAOBUSINESS21V(?,?,?)}";
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
* 更新AIHAOBUSINESS21IString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_aihaobusiness21_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call AIHAOBUSINESS21_PRO.UpdateFieldAIHAOBUSINESS21U(?,?,?)}";
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
