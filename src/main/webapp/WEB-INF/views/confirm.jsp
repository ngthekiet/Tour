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
            font-size: 15px;
        }
    </style>
</head>
<body>
<div style="width: 1000px; margin: 0 auto">
    <div>
        <h2>Thông tin khách hàng:</h2>
        <div><span class="b">ID KH: </span>${booking.customer.id}</div>
        <div><span class="b">Tên KH: </span>${booking.customer.name}</div>
        <div><span class="b">Địa chỉ: </span>${booking.customer.address}</div>
        <div><span class="b">Email: </span>${booking.customer.email}</div>
        <div><span class="b">Điện thoại: </span>${booking.customer.phone}</div>
        <h2>Thông tin tour:</h2>
        <div><span class="b">ID booking: </span>${booking.id}</div>
        <div><span class="b">ID tour: </span>${booking.tour.id}</div>
        <div><span class="b">Tên tour: </span>${booking.tour.title}</div>
        <div><span class="b">Số ngày: </span>${booking.tour.days}</div>
        <div><span class="b">Phương tiện: </span>${booking.tour.transportation}</div>
        <div><span class="b">Mô tả: </span>${booking.tour.description}</div>
        <div><span class="b">Lịch khởi hành: </span>${booking.tour.departureSchedule}</div>
        <div><span class="b">Số người lớn: </span>${booking.noAdults}</div>
        <div><span class="b">Số trẻ em: </span>${booking.noChildren}</div>
        <div><span class="b">Tổng giá: </span>${booking.tour.price}</div>
        <div><span class="b">Ngày khởi hành: </span>${booking.departuteDate}</div>
    </div>
    <div style="margin-top: 20px">
        <a style="color: blue" href="/listTours">CHƯƠNG TRÌNH TOUR</a>
    </div>
</div>
</body>
</html>
