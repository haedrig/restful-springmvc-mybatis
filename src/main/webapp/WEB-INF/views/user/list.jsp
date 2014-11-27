<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
<title>用户列表</title>
</head>
<body>
	<table>
		<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>AGE</td>
			<td>ADDRESS</td>
			<td colspan="3">OPERATION</td>
		</tr>
		<c:forEach var="user" items="${userlist}">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.age}</td>
				<td>${user.address}</td>
				<td><a href="<c:url value="/user/${user.id}"/>">show</a></td>
				<td><a href="/1">edit</a></td>
				<td><a href="javascript:del(${user.id})">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
<script>
	function del(user_id) {
		confirm_ = confirm('This action will delete current order! Are you sure?');
        if(confirm_){
            $.ajax({
                type:"POST",
                url:'user/'+user_id,
                data:"_method=DELETE",
                success:function(msg){
                   
                }
            });
        }
	}
</script>
</html>