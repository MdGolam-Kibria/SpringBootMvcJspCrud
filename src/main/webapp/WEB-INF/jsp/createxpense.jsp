<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <title>Spring Boot JSP example</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div style="display: block;margin-left: auto;margin-right: auto;width: 50%!important;;overflow: hidden">
    <form:form method="post" action="/sendForCreateExpense">
        <div>
            <div>
                <p>Item Name</p>
                <input name="itemName" type="text" placeholder="Enter Name">
            </div>
            <div>
                <p>Price</p>
                <input name="price" type="number" placeholder="Enter Price">
            </div>
            <div>
                <p>Reason</p>
                <input name="reason" type="text" placeholder="Enter Reason">
            </div>
            <div>
                <p>Description</p>
                <input name="description" type="text" placeholder="Enter Description">
            </div>
            <div style="margin-top: 10px">
                <button type="submit" class="btn btn-primary">Create</button>
            </div>
        </div>
    </form:form>
</div>
</body>
</html>