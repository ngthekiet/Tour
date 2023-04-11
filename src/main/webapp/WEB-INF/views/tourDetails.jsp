<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        .b {
            font-weight: bold;
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
<div style="width: 800px; margin: 0 auto">
    <div style="font-weight: bold; font-size: 30px">
        ${tour.title}
    </div>
    <div>
        <span class="b">Số ngày: </span>${tour.days}.<span class="b">Phương tiện: </span>${tour.transportation}.<span
            class="b">Lịch khởi hành: </span>${tour.departureSchedule}
    </div>
    <h2 style="font-weight: bold; font-size: 25px; margin-top: 50px">Chương trình chi tiết:</h2>
    <div style="margin-top: 20px">
        ${tour.description}
    </div>
    <div style="display: flex; margin-top: 30px">
        <div style="width: 50%; text-align: left">
            <a class="btn" href="/viewBookingTour/${tour.id}">Đặt Tour</a>
        </div>
        <div style="width: 50%; text-align: right; font-weight: bold">
            <a style="color: blue" href="/listTours">CHƯƠNG TRÌNH TOUR</a>
        </div>
    </div>
</div>
</body>
</html>