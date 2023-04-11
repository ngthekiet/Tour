<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        .btn {
            text-decoration: none;
            border: solid 1px darkgrey;
            background-color: darkgrey;
            color: black;
            border-radius: 5px;
            margin-right: 25px;
        }

        .btn:hover {
            cursor: pointer;
            background-color: azure;
        }
    </style>
</head>
<body>
<div style="margin:0 auto; width: 500px">
    <div style="display: flex; justify-content: center">
        Đặt tour:<span style="font-weight: bold">${booking.tour.title}</span> ${booking.tour.days}
    </div>
    <div style="display: flex; justify-content: center">
        <form:form action="/bookingTour/${booking.tour.id}" method="post" modelAttribute="booking">
            <h3>Thông tin khách hàng</h3>
            <div>
                <form:hidden path="customer.id"></form:hidden>
            </div>
            <div>
                <form:label path="customer.name">Họ tên: (*)</form:label>
                <form:input path="customer.name"/>
                    <%--            <form:errors path="customer.name" cssClass="error"/>--%>
            </div>
            <div>
                <form:label path="customer.address">Địa chỉ:</form:label>
                <form:input path="customer.address"/>
                    <%--            <form:errors path="customer.address" cssClass="error"/>--%>
            </div>
            <div>
                <form:label path="customer.email">E-mail:(*)</form:label>
                <form:input path="customer.email"/>
                    <%--            <form:errors path="customer.email" cssClass="error"/>--%>
            </div>

            <div>
                <form:label path="customer.phone">Điện thoại:</form:label>
                <form:input path="customer.phone"/>
                    <%--            <form:errors path="customer.phone" cssClass="error"/>--%>
            </div>
            <h3>Thông tin chuyến đi</h3>
            <div>
                <form:label path="departuteDate">Ngày khởi hành: (*)</form:label>
                <form:input path="departuteDate"/>
                <form:label path="departuteDate">yyyy-mm-dd</form:label>
                    <%--            <form:errors path="departuteDate" cssClass="error"/>--%>
            </div>
            <div>
                <form:label path="noAdults">Số người lớn: (*)</form:label>
                <form:input path="noAdults"/>
                    <%--            <form:errors path="noAdults" cssClass="error"/>--%>
            </div>
            <div>
                <form:label path="noChildren">Số trẻ em:</form:label>
                <form:input path="noChildren"/>
                    <%--            <form:errors path="noChildren" cssClass="error"/>--%>
            </div>
            <div style="text-align: center">
            <span>
                <form:button>Gửi</form:button>
            </span>
                <a class="btn" href="/listTours">Hủy</a>
            </div>
        </form:form>
    </div>
    <div style="color: red; margin-top: 20px">
        ${error}
    </div>
</div>
</body>
</html>
