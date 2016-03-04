<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="../base/c_head.jsp"></jsp:include>
<script type="text/javascript" src="admjs/sysuser.js"></script>
<title>会员管理</title>
</head>
<body>
	<table table id="tt" class="easyui-datagrid" url="usersList"
		toolbar="#tb" title="Load Data" iconCls="icon-save" rownumbers="true"
		pagination="true" fit="true"  fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<th data-options="field:'userName'">姓名</th>
				<th data-options="field:'userCode'">编码</th>
				<th data-options="field:'userEmail',align:'right'">邮箱</th>
				<th data-options="field:'userTel',align:'right'">电话</th>
			</tr>
		</thead>
	</table>
	<div id="tb" style="padding: 5px; height: auto">
		<div style="margin-bottom: 5px">
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新增</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">编辑</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
		</div>
		<!-- <div>
			Date From: <input class="easyui-datebox" style="width: 80px">
			To: <input class="easyui-datebox" style="width: 80px">
			Language: <select class="easyui-combobox" panelHeight="auto"
				style="width: 100px">
				<option value="java">Java</option>
				<option value="c">C</option>
				<option value="basic">Basic</option>
				<option value="perl">Perl</option>
				<option value="python">Python</option>
			</select> <a href="#" class="easyui-linkbutton" iconCls="icon-search">Search</a>
		</div> -->
	</div>
     <!-- 新增和修改 -->
	<div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
                closed="true" buttons="#dlg-buttons">
            <div class="ftitle">User Information</div>
            <form id="fm" method="post" novalidate>
                <div class="fitem">
                    <label>姓名:</label>
                    <input name="userName" class="easyui-textbox" required="true">
                </div>
                <div class="fitem">
                    <label>编码:</label>
                    <input name="userCode" class="easyui-textbox" required="true">
                </div>
                <div class="fitem">
                    <label>性别:</label>
                    <select name="userSex" class="easyui-combobox" panelHeight="auto" style="width: 100px">
						<option value="1">男</option>
						<option value="2">女</option>
				    </select>
                </div>
                <div class="fitem">
                    <label>邮箱:</label>
                    <input name="userEmail" class="easyui-textbox" validType="email">
                </div>
                <div class="fitem">
                    <label>电话:</label>
                    <input name="userTel" class="easyui-textbox" >
                </div>
            </form>
        </div>
        <div id="dlg-buttons">
            <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveUser()" style="width:90px">Save</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">Cancel</a>
        </div>
</body>