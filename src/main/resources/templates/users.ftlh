<!DOCTYPE html>
<html>
<head>
    <title>Task 4</title>
</head>
<body>
<h1>Users</h1><hr>
<h4>Users list</h4>
<#list users as user>
<div>
    <p>${user.name} ${user.surname} <a href="/user/${user.id}">Редактировать</a></p>
</div>
</#list>
</hr>
<h3>Add user</h3>
<form action="/user/create" method="post">
    Name: <input type="text" name="name"/><br><br>
    Surname: <input type="text" name="surname"/><br><br>
    <input type="submit" value="add the user"/>
</form>
</body>
</html>
