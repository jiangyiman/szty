﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataHuangye.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.huangye_Dao;
import com.szty.aihao.core.huangye_core;
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
*@HUANGYE数据接口
*@作者：宋春林 
*/
public class huangye_impl implements huangye_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(huangye_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param HUANGYE实体
* @return 新插入记录的编号
*/
public int insert_huangye(huangye_Dao _HUANGYEModel)  throws Exception{
         String sqlStr = "{call HUANGYE_PRO.InsertHUANGYE(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_HUANGYEModel.getMerid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMeraddress());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMerphone());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMerbaiduaddress());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMerbaidulatitude());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMerbaidulongitude());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_HUANGYEModel.getMercdate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_HUANGYEModel.getMerudate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getFenlei());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param HUANGYE
* @Object 
* @return 新插入记录的编号
*/
public int insert_huangye(Object[] _para)  throws Exception{
      String sqlStr = "{call HUANGYE_PRO.InsertHUANGYE(?,?,?,?,?,?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[10];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_para[4]);
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_para[5]);
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_para[6]);
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_para[7]));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_para[8]));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_para[9]);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param HUANGYE实体
* @return 影响的行数
*/
public int update_huangye(huangye_Dao _HUANGYEModel)  throws Exception{
        String sqlStr = "{call HUANGYE_PRO.UpdateHUANGYE(?,?,?,?,?,?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[10];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_HUANGYEModel.getMerid());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMername());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMeraddress());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMerphone());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMerbaiduaddress());
        op[5]= new OracleParameter(6, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMerbaidulatitude());
        op[6]= new OracleParameter(7, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getMerbaidulongitude());
        op[7]= new OracleParameter(8, "IN", java.sql.Types.DATE, dateformat.format(_HUANGYEModel.getMercdate()));
        op[8]= new OracleParameter(9, "IN", java.sql.Types.DATE, dateformat.format(_HUANGYEModel.getMerudate()));
        op[9]= new OracleParameter(10, "IN", java.sql.Types.NVARCHAR,_HUANGYEModel.getFenlei());
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表HUANGYE中的一条记录
* @param HUANGYE实体
* @return 新插入记录的编号
*/
public int delete_huangye(int Merid)  throws Exception{
        String sqlStr = "{call HUANGYE_PRO.DeleteHUANGYE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Merid);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 huangye 数据实体
* @param Merid">Merid
* @return<huangye 数据实体
* @throws Exception 
*/
public huangye_Dao get_huangyeDao(int Merid) throws Exception{
         String sqlStr = "{ call HUANGYE_PRO.GetHUANGYEEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Merid);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			huangye_Dao _obj = new huangye_Dao();
            _obj.setMerid(arr.getInt("MERID"));
            _obj.setMername(arr.getString("MERNAME"));
            _obj.setMeraddress(arr.getString("MERADDRESS"));
            _obj.setMerphone(arr.getString("MERPHONE"));
            _obj.setMerbaiduaddress(arr.getString("MERBAIDUADDRESS"));
            _obj.setMerbaidulatitude(arr.getString("MERBAIDULATITUDE"));
            _obj.setMerbaidulongitude(arr.getString("MERBAIDULONGITUDE"));
             try{_obj.setMercdate(dateformat.parse(arr.getString("MERCDATE")));}catch(Exception ce){_obj.setMercdate((new Date()));}
             try{_obj.setMerudate(dateformat.parse(arr.getString("MERUDATE")));}catch(Exception ce){_obj.setMerudate((new Date()));}
            _obj.setFenlei(arr.getString("FENLEI"));
			return _obj;
		}
		return null;

}

/**
* 根据HUANGYE返回的查询DataRow创建一个HUANGYEEntity对象
* @param HUANGYE row
* @returnHUANGYEList对象
* @throws Exception 
*/
public List<huangye_Dao> get_huangye_All() throws Exception{
        List<huangye_Dao> _list = new ArrayList<huangye_Dao>();
		String sqlStr = "{ call HUANGYE_PRO.GetHUANGYE(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			huangye_Dao _obj = new huangye_Dao();
            _obj.setMerid(arr.getInt("MERID"));
            _obj.setMername(arr.getString("MERNAME"));
            _obj.setMeraddress(arr.getString("MERADDRESS"));
            _obj.setMerphone(arr.getString("MERPHONE"));
            _obj.setMerbaiduaddress(arr.getString("MERBAIDUADDRESS"));
            _obj.setMerbaidulatitude(arr.getString("MERBAIDULATITUDE"));
            _obj.setMerbaidulongitude(arr.getString("MERBAIDULONGITUDE"));
            try{_obj.setMercdate(dateformat.parse(arr.getString("MERCDATE")));}catch(Exception ce){_obj.setMercdate((new Date()));}
            try{_obj.setMerudate(dateformat.parse(arr.getString("MERUDATE")));}catch(Exception ce){_obj.setMerudate((new Date()));}
            _obj.setFenlei(arr.getString("FENLEI"));
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据HUANGYE返回的查询DataRow创建一个HUANGYEEntity对象
* @param HUANGYE row
* @returnHUANGYEList对象
* @throws Exception 
*/
public List< huangye_Dao> get_huangye_All(String strWhere) throws Exception{
         List<huangye_Dao> _list = new ArrayList<huangye_Dao>();
		 String sqlStr = "{ call HUANGYE_PRO.GetHUANGYEWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				huangye_Dao _obj = new huangye_Dao();
            _obj.setMerid(arr.getInt("MERID"));
            _obj.setMername(arr.getString("MERNAME"));
            _obj.setMeraddress(arr.getString("MERADDRESS"));
            _obj.setMerphone(arr.getString("MERPHONE"));
            _obj.setMerbaiduaddress(arr.getString("MERBAIDUADDRESS"));
            _obj.setMerbaidulatitude(arr.getString("MERBAIDULATITUDE"));
            _obj.setMerbaidulongitude(arr.getString("MERBAIDULONGITUDE"));
           try{_obj.setMercdate(dateformat.parse(arr.getString("MERCDATE")));}catch(Exception ce){_obj.setMercdate((new Date()));}
           try{_obj.setMerudate(dateformat.parse(arr.getString("MERUDATE")));}catch(Exception ce){_obj.setMerudate((new Date()));}
            _obj.setFenlei(arr.getString("FENLEI"));
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据HUANGYE返回 分页数据
* @param HUANGYE row
* @returnHUANGYEList对象
* @throws Exception 
*/
public List<huangye_Dao> get_huangye_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<huangye_Dao> _list = new ArrayList<huangye_Dao>();
		String sqlStr = "{ call HUANGYE_PRO.GetHUANGYEPage(?,?,?,?,?,?)}";
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
				huangye_Dao _obj = new huangye_Dao();
            _obj.setMerid(arr.getInt("MERID"));
            _obj.setMername(arr.getString("MERNAME"));
            _obj.setMeraddress(arr.getString("MERADDRESS"));
            _obj.setMerphone(arr.getString("MERPHONE"));
            _obj.setMerbaiduaddress(arr.getString("MERBAIDUADDRESS"));
            _obj.setMerbaidulatitude(arr.getString("MERBAIDULATITUDE"));
            _obj.setMerbaidulongitude(arr.getString("MERBAIDULONGITUDE"));
            try{_obj.setMercdate(dateformat.parse(arr.getString("MERCDATE")));}catch(Exception ce){_obj.setMercdate((new Date()));}
            try{_obj.setMerudate(dateformat.parse(arr.getString("MERUDATE")));}catch(Exception ce){_obj.setMerudate((new Date()));}
            _obj.setFenlei(arr.getString("FENLEI"));
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据HUANGYE返回的查询DataRow创建一个HUANGYEEntity对象
* @param HUANGYE row
* @returnHUANGYEDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, huangye_Dao> get_huangye_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dichuangyestrWhere") == null) {
			Dictionary<Integer, huangye_Dao> _dic = new Hashtable<Integer, huangye_Dao>();
			List<huangye_Dao> _list = new ArrayList<huangye_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getMerid()), _list.get(i));
			}
			classFactory.cachePut("dichuangye", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, huangye_Dao> _dic = (Dictionary<Integer, huangye_Dao>) classFactory
					.cacheGet("dichuangyestrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新HUANGYE字段加一
* @param FieldName
* @param sid
*/
public int create_huangye_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call HUANGYE_PRO.UpdateFieldHUANGYE(?,?)}";
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
* 更新HUANGYEInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_huangye_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call HUANGYE_PRO.UpdateFieldHUANGYEV(?,?,?)}";
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
* 更新HUANGYEIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_huangye_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call HUANGYE_PRO.UpdateFieldHUANGYEU(?,?,?)}";
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
