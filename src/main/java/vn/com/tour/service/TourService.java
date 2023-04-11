package vn.com.tour.service;

import org.springframework.stereotype.Service;
import vn.com.tour.model.Booking;
import vn.com.tour.model.Customer;
import vn.com.tour.model.Tour;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class TourService {
    Map<Integer, Customer> customerMap;
    Map<Integer, Tour> tourMap;
    Map<Integer, Booking> bookingMap;

    public TourService() {
        init();
    }

    public void init() {
        customerMap = new HashMap<Integer, Customer>();
        tourMap = new HashMap<Integer, Tour>();
        bookingMap = new HashMap<Integer, Booking>();


        customerMap.put(1, new Customer(1, "kiet", "vinh long", "ngthekiet93@gmail.com", "0382858782"));
        customerMap.put(2, new Customer(2, "long", "dak lak", "long@gmail.com", "0123456789"));
        customerMap.put(3, new Customer(3, "hong", "dong thap", "hong123@gmail.com", "01122334455"));
        customerMap.put(4, new Customer(4, "tuyet", "sai gon", "mtuyet@gmail.com", "0987654321"));

        tourMap.put(1, new Tour(
                1,
                "PHÚ QUỐC (Khuyến mãi mùa hè)",
                "Ngày 01: TPHCM - Phú Quốc - Nhà tù Phú Quốc - Làng chài Hàm Ninh - Grand World (Ăn Sáng/Trưa/Chiều)\n" +
                        "Ngày 02: Câu cá Nam Đảo - Chùa Hộ Quốc - Sunset Sanato Beach (Ăn Sáng/Trưa/Tối)\n" +
                        "Ngày 03: Vườn sim - Cửa hàng đặc sản - Bảo tàng Ngọc Trai - TPHCM (Ăn Sáng/Trưa)",
                "3 ngày 2 đêm",
                "thuyền",
                "Hằng ngày",
                1595000));
        tourMap.put(2, new Tour(
                2,
                "NHA TRANG",
                "Ngày 01(Thứ Bảy): PHỐ BIỂN NHA TRANG. Tham quan suối Hoa Lan. Khám phá mê cung trận đồ. \n Ngày 2(Chủ nhật):NHA TRANG - SÀI GÒN(tàu lửa). Tham quan tháp bà Ponagar",
                "2 ngày 2 đêm",
                "xe đò",
                "Tối thứ 6 và CN",
                1540000));
        tourMap.put(3, new Tour(
                3,
                "CÔN ĐẢO",
                "Đêm 01: TPHCM - Sóc Trăng (Nghỉ đêm trên xe)\n" +
                        "Ngày 01: Cảng Trần Đề - Sóc Trăng - Côn Đảo - Nam Đảo (Ăn Sáng/Trưa/Chiều)\n" +
                        "Ngày 02: Di tích Côn Đảo - Tắm biển - Nghĩa trang Hàng Dương (Ăn Sáng/Trưa/Chiều)",
                "3 ngày 2 đêm",
                "thuyền",
                "Hằng ngày",
                1345000));
        tourMap.put(4, new Tour(
                4,
                "PHAN THIẾT - MŨI NÉ",
                "Ngày 01: TPHCM - Tháp chàm Poshanu - Bảo tàng ngọc trai Long Beach Pearl - Chương trình Teambuilding sôi động (Ăn Sáng/Trưa/Chiều)\n" +
                        "Ngày 02: Tắm biển/Hồ bơi thỏa thích - KDL Bàu Trắng - Lâu đài rượu vang - Mua sắm đặc sản (Ăn Sáng/Trưa)",
                "2 ngày 1 đêm",
                "thuyền",
                "Thứ 7 mỗi tuần",
                1250000));
        tourMap.put(5, new Tour(
                5,
                "ĐÀ LẠT - ĐỒI MỘNG MƠ",
                "Ngày 1: Đà lạt view - đồi chè Cầu Đất - vườn hoa Cẩm Tú cầu \n Ngày 2: Dinh III - Thiền Viện Trúc Lâm - buffet rau - thác Datanla",
                "4 ngày 3 đêm",
                "xe lửa",
                "Thứ 7 mỗi tuần",
                1320000));
        tourMap.put(6, new Tour(
                6,
                "BUÔN MA THUỘT - GIA LAI - KOMTUM",
                "Ngày 1: Thăm vườn caffe - bắt gà rừng \n" +
                        "Ngày 2: Tham quan kiến trúc nhà sàn",
                "4 ngày 3 đêm",
                "thuyền",
                "Định kỳ",
                1790000));
    }

    public Collection getTours() {
        return tourMap.values();
    }

    public Tour getTour(int id) {
        return tourMap.get(id);
    }

    public boolean saveCustomer(Customer customer) {
        try {
            customerMap.put(getSizeCustomer() + 1, customer);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int getSizeBooking() {
        return bookingMap.size();
    }

    public boolean saveBooking(Booking booking) {
        try {
            bookingMap.put(getSizeBooking() + 1, booking);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public int getSizeCustomer() {
        return customerMap.size();
    }
}
