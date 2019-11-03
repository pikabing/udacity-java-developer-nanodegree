<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student List</title>
</head>
<body>
    <h3>Student Grade Table</h3>
       <table>
           <tr>
               <th>Student ID</th>
               <th>Student Name</th>
               <th>Grade</th>
           </tr>
           <#list list as student>
           <tr>
               <td>${student.id}</td>
               <td>${student.studentName}</td>
               <td>${student.grade}</td>
           <tr>
           </#list>
       </table>
</body>
</html>