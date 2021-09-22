<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <title>Spring Boot JSP example</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
          integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>

    <script>
        <%--For delete a expense--%>

        function deleteItem(itemId) {
            if (confirm("Do you want to delete this item ?")) {
                window.location.href = "/delete/" + itemId
            }
        }

        function createExpense() {
            window.location.href = "/createExpense"
        }
    </script>
</head>
<body>
<div style="display: block;margin-left: auto;margin-right: auto;width: 50%!important;;overflow: hidden">

    <div class="row">
        <div class="col-md-6">
            <h1 style="color: blue;text-align: center!important;">Expense list</h1>
        </div>
        <div class="col-md-6" style="margin-top: 10px;">
            <button onclick="createExpense()" class="btn-primary"
                    style="color: blue;text-align: center!important;color: white!important;">Create New Expense
            </button>
        </div>
    </div>


    <div style="text-align: center;width: 100%">
        <table class="table-bordered text-center" style="width: 100%">
            <tr>
                <th>Item Name</th>
                <th>Price</th>
                <th>Reason</th>
                <th>Description</th>
                <th>Action</th>
            </tr>
            <c:forEach var="expense" items="${expenseList}">
                <tr>
                    <td>${expense.itemName}</td>
                    <td>${expense.price}</td>
                    <td>${expense.reason}</td>
                    <td>${expense.description}</td>
                    <td><i onclick="deleteItem(${expense.id})" style="color: #b40e0e;cursor: pointer"
                           class="fas fa-trash-alt"></i>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>