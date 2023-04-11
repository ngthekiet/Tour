<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        td {
            border: 1px solid black;
        }

        table {
            margin: 0 auto;
            border-collapse: collapse;
            text-align: center;
        }

        .btn {
            text-decoration: none;
            border: solid 1px darkgrey;
            background-color: darkgrey;
            color: black;
            border-radius: 5px;
        }

        .btn:hover {
            cursor: pointer;
            background-color: azure;
        }
    </style>
</head>
<body>
<h1 style="text-align: center; font-size: 50px">CÁC CHƯƠNG TRÌNH DU LỊCH</h1>
<table style="width: 1200px">
    <thead>
    <tr style="font-weight: bold; font-size: 25px; background-color: cadetblue">
        <td>
            Chương trình
        </td>
        <td>
            Lịch khởi hành
        </td>
        <td>
            Giá
        </td>
        <td>
            Đặt
        </td>
    </tr>
    </thead>
    <tbody>
    <c:if test="${not empty tours}">
        <c:forEach var="tour" items="${tours}">
            <tr>
                <td>
                    <a style="font-weight: bold; color: blue" href="/tourDetails/${tour.id}">${tour.title}</a>
                    <br>
                        ${tour.days}
                </td>
                <td>
                        ${tour.departureSchedule}
                </td>
                <td style="font-weight: bold">
                        ${tour.price}
                </td>
                <td>
                    <a class="btn" href="/viewBookingTour/${tour.id}">Đặt tour</a>
                </td>
            </tr>
        </c:forEach>
    </c:if>
    </tbody>
    <tfoot>

    </tfoot>
</table>
</body>
</html>
