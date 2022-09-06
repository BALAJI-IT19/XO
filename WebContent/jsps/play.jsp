<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Playing Board</title>
<link rel="icon" href="/images/XO-title.jpg">
<style>
table, th, td {
	border: 1px solid black;
}

button {
	width: 50px;
	height: 50px
}
</style>
</head>
<body>
	Player 1 : ${details.player1}
	<br> Player 2 : ${details.player2}
	<br> Current player : ${details.cp}
	<br>

	<form action="checkAvail.html">
		<table>
			<tr>
				<td>
					<button name="cbox" value="box1">${details.box1}</button>
				</td>
				<td>
					<button name="cbox" value="box2">${details.box2}</button>
				</td>
				<td>
					<button name="cbox" value="box3">${details.box3}</button>
				</td>
			</tr>
			<tr>
				<td>
					<button name="cbox" value="box4">${details.box4}</button>
				</td>
				<td>
					<button name="cbox" value="box5">${details.box5}</button>
				</td>
				<td>
					<button name="cbox" value="box6">${details.box6}</button>
				</td>
			</tr>
			<tr>
				<td>
					<button name="cbox" value="box7">${details.box7}</button>
				</td>
				<td>
					<button name="cbox" value="box8">${details.box8}</button>
				</td>
				<td>
					<button name="cbox" value="box9">${details.box9}</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>