<!DOCTYPE html>
<html>
<head>
    <title>Task 4</title>
</head>
<body>
<h1>Users</h1><hr>
<h4>Users data</h4>

<form action="/user/modify/${user.id}" method="post">
    Name: <input type="text" name="name" value="${user.name!''}"/><br><br>
    Surname: <input type="text" name="surname" value="${user.surname!''}"/><br><br>
    <input type="submit" value="modify the user"/><br><br>
</form>

<form action="/user/delete/${user.id}" method="post">
    <input type="submit" value="delete the user"/><br><br>
</form>
</body>
</html>

