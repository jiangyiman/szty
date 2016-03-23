﻿/*
*@===================================================================
*@项目说明
*@作者：宋春林 
*@版本信息:@Copy Right 2011-2015
*@文件： dataScltest.java
*@项目名称：JAVA项目管理 
*@创建时间：2015/10/15
*@===================================================================
*/

package com.szty.aihao.impl;

import com.szty.aihao.dao.scltest_Dao;
import com.szty.aihao.core.scltest_core;
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
*@SCLTEST数据接口
*@作者：宋春林 
*/
public class scltest_impl implements scltest_core
{
    	private static final Logger logger = LoggerFactory
			.getLogger(scltest_impl.class);
	private static final long serialVersionUID = 1L;
	private DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

/**
* 向数据库中插入一条新记录。
* @param SCLTEST实体
* @return 新插入记录的编号
*/
public int insert_scltest(scltest_Dao _SCLTESTModel)  throws Exception{
         String sqlStr = "{call SCLTEST_PRO.InsertSCLTEST(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
         op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_SCLTESTModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SCLTESTModel.getTest1());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SCLTESTModel.getTest2());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SCLTESTModel.getTest3());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_SCLTESTModel.getAdddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;

}

/**
* 向数据库中插入一条新记录。
* @param SCLTEST
* @Object 
* @return 新插入记录的编号
*/
public int insert_scltest(Object[] _para)  throws Exception{
      String sqlStr = "{call SCLTEST_PRO.InsertSCLTEST(?,?,?,?,?)}";
	  OracleParameter[] op = new OracleParameter[5];
       op[0] = new OracleParameter(1, "OUT", java.sql.Types.NUMERIC,_para[0]);
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_para[1]);
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_para[2]);
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_para[3]);
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_para[4]));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
* 向数据库中更新一条新记录。
* @param SCLTEST实体
* @return 影响的行数
*/
public int update_scltest(scltest_Dao _SCLTESTModel)  throws Exception{
        String sqlStr = "{call SCLTEST_PRO.UpdateSCLTEST(?,?,?,?,?)}";
		 OracleParameter[] op = new OracleParameter[5];
        op[0]= new OracleParameter(1, "IN", java.sql.Types.NUMERIC,_SCLTESTModel.getId());
        op[1]= new OracleParameter(2, "IN", java.sql.Types.NVARCHAR,_SCLTESTModel.getTest1());
        op[2]= new OracleParameter(3, "IN", java.sql.Types.NVARCHAR,_SCLTESTModel.getTest2());
        op[3]= new OracleParameter(4, "IN", java.sql.Types.NVARCHAR,_SCLTESTModel.getTest3());
        op[4]= new OracleParameter(5, "IN", java.sql.Types.DATE, dateformat.format(_SCLTESTModel.getAdddate()));
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}

/**
*  删除数据表SCLTEST中的一条记录
* @param SCLTEST实体
* @return 新插入记录的编号
*/
public int delete_scltest(int Id)  throws Exception{
        String sqlStr = "{call SCLTEST_PRO.DeleteSCLTEST(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "IN", java.sql.Types.NUMERIC, Id);
		boolean result = OracleHelper.executeProcedure(sqlStr.toString(), op);
		if (result)
			return 0;
		else
			return -1;
}




/**
* 得到 scltest 数据实体
* @param Id">Id
* @return<scltest 数据实体
* @throws Exception 
*/
public scltest_Dao get_scltestDao(int Id) throws Exception{
         String sqlStr = "{ call SCLTEST_PRO.GetSCLTESTEntity(?,?)}";
		OracleParameter[] op = new OracleParameter[2];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		op[1] = new OracleParameter(2, "IN", java.sql.Types.NUMERIC, Id);
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			scltest_Dao _obj = new scltest_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setTest1(arr.getString("TEST1"));
            _obj.setTest2(arr.getString("TEST2"));
            _obj.setTest3(arr.getString("TEST3"));
             try{_obj.setAdddate(dateformat.parse(arr.getString("ADDDATE")));}catch(Exception ce){_obj.setAdddate((new Date()));}
			return _obj;
		}
		return null;

}

/**
* 根据SCLTEST返回的查询DataRow创建一个SCLTESTEntity对象
* @param SCLTEST row
* @returnSCLTESTList对象
* @throws Exception 
*/
public List<scltest_Dao> get_scltest_All() throws Exception{
        List<scltest_Dao> _list = new ArrayList<scltest_Dao>();
		String sqlStr = "{ call SCLTEST_PRO.GetSCLTEST(?)}";
		OracleParameter[] op = new OracleParameter[1];
		op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
			scltest_Dao _obj = new scltest_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setTest1(arr.getString("TEST1"));
            _obj.setTest2(arr.getString("TEST2"));
            _obj.setTest3(arr.getString("TEST3"));
            try{_obj.setAdddate(dateformat.parse(arr.getString("ADDDATE")));}catch(Exception ce){_obj.setAdddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}
/**
* 根据SCLTEST返回的查询DataRow创建一个SCLTESTEntity对象
* @param SCLTEST row
* @returnSCLTESTList对象
* @throws Exception 
*/
public List< scltest_Dao> get_scltest_All(String strWhere) throws Exception{
         List<scltest_Dao> _list = new ArrayList<scltest_Dao>();
		 String sqlStr = "{ call SCLTEST_PRO.GetSCLTESTWhere(?,?)}";
		 OracleParameter[] op = new OracleParameter[2];
		 op[0] = new OracleParameter(1, "OUT", OracleTypes.CURSOR, "");
		 op[1] = new OracleParameter(2, "IN", OracleTypes.VARCHAR, strWhere);
		 OracleCachedRowSet arr = OracleHelper.executeQuery(sqlStr, op);
		while (arr.next()) {
				scltest_Dao _obj = new scltest_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setTest1(arr.getString("TEST1"));
            _obj.setTest2(arr.getString("TEST2"));
            _obj.setTest3(arr.getString("TEST3"));
           try{_obj.setAdddate(dateformat.parse(arr.getString("ADDDATE")));}catch(Exception ce){_obj.setAdddate((new Date()));}
            _list.add(_obj);
		}
		return _list;
}

/**
* 根据SCLTEST返回 分页数据
* @param SCLTEST row
* @returnSCLTESTList对象
* @throws Exception 
*/
public List<scltest_Dao> get_scltest_Page(int pageSize, int pageIndex,
			String strWhere) throws Exception {
		List<scltest_Dao> _list = new ArrayList<scltest_Dao>();
		String sqlStr = "{ call SCLTEST_PRO.GetSCLTESTPage(?,?,?,?,?,?)}";
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
				scltest_Dao _obj = new scltest_Dao();
            _obj.setId(arr.getInt("ID"));
            _obj.setTest1(arr.getString("TEST1"));
            _obj.setTest2(arr.getString("TEST2"));
            _obj.setTest3(arr.getString("TEST3"));
            try{_obj.setAdddate(dateformat.parse(arr.getString("ADDDATE")));}catch(Exception ce){_obj.setAdddate((new Date()));}
			_list.add(_obj);
		}
		return _list;
	}
/**
* 根据SCLTEST返回的查询DataRow创建一个SCLTESTEntity对象
* @param SCLTEST row
* @returnSCLTESTDictionary对象
* @throws Exception 
*/
public Dictionary<Integer, scltest_Dao> get_scltest_Dictionary(String strWhere) throws Exception{
            if (classFactory.cacheGet("dicsclteststrWhere") == null) {
			Dictionary<Integer, scltest_Dao> _dic = new Hashtable<Integer, scltest_Dao>();
			List<scltest_Dao> _list = new ArrayList<scltest_Dao>();
			for (int i = 0; i < _list.size(); i++) {
                _dic.put((_list.get(i).getId()), _list.get(i));
			}
			classFactory.cachePut("dicscltest", _dic);
			System.out.println("from db");
			return _dic;
		} else {
			@SuppressWarnings("unchecked")
			Dictionary<Integer, scltest_Dao> _dic = (Dictionary<Integer, scltest_Dao>) classFactory
					.cacheGet("dicsclteststrWhere");
			System.out.println("from cache");
			return _dic;
		}
}
/**
* 更新SCLTEST字段加一
* @param FieldName
* @param sid
*/
public int create_scltest_UpdateIncreate(String FieldName,int sid)  throws Exception{
	    String sqlStr = "{ call SCLTEST_PRO.UpdateFieldSCLTEST(?,?)}";
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
* 更新SCLTESTInt型字段
* @param FieldName
* @param Num
* @param sid
*/
public int create_scltest_UpdateInteger(String FieldName,int Num,int sid)  throws Exception
{
		String sqlStr = "{ call SCLTEST_PRO.UpdateFieldSCLTESTV(?,?,?)}";
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
* 更新SCLTESTIString型字段
* @param FieldName
* @param Value
* @param sid
*/
public int create_scltest_UpdateString(String FieldName,String Value,int sid)  throws Exception
{
        String sqlStr = "{ call SCLTEST_PRO.UpdateFieldSCLTESTU(?,?,?)}";
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
