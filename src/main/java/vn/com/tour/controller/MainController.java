package vn.com.tour.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vn.com.tour.model.Booking;
import vn.com.tour.model.Customer;
import vn.com.tour.model.Tour;
import vn.com.tour.service.TourService;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private TourService tourService;

    @RequestMapping(value = "/listTours")
    public ModelAndView getTours() {
        ModelAndView mav = new ModelAndView("listTours");
        mav.addObject("tours", tourService.getTours());
        return mav;
    }

    @RequestMapping(value = "/tourDetails/{id}")
    public ModelAndView tourDetail(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView("tourDetails");
        mav.addObject("tour", tourService.getTour(id));
        return mav;
    }

    @RequestMapping(value = "/viewBookingTour/{id}")
    public String viewBooking(@PathVariable("id") int id, Model model) {
        Tour tour = tourService.getTour(id);
        Customer customer = new Customer();
        customer.setId(tourService.getSizeCustomer() + 1);
        Booking booking = new Booking();
        booking.setId(1);
        booking.setCustomer(customer);
        booking.setTour(tour);
        model.addAttribute(booking);
        return "bookingTour";
    }

    @RequestMapping(value = "/bookingTour/{id}", method = RequestMethod.POST)
    public String submitBookingTour(@PathVariable("id") String id, @Valid @ModelAttribute("booking") Booking booking, BindingResult bindingResult, Model model) {
        Integer pid = Integer.parseInt(id);
        Tour tour = tourService.getTour(pid);
        if (bindingResult.hasErrors()) {
            model.addAttribute("error", "Không được để trống trường có đánh dấu * và phải đúng định dạng");
            booking.setTour(tour);
            model.addAttribute("booking",booking);
            return "bookingTour";
        }
        Booking newBooking = new Booking();
        newBooking.setId(tourService.getSizeBooking() + 1);
        newBooking.setCustomer(booking.getCustomer());
        newBooking.setDepartuteDate(booking.getDepartuteDate());
        newBooking.setNoAdults(booking.getNoAdults());
        newBooking.setNoChildren(booking.getNoChildren());
        newBooking.setTour(tour);
        if (!(tourService.saveCustomer(booking.getCustomer()) && tourService.saveBooking(newBooking))) {
            model.addAttribute("error", "Không thể đặt tour");
            return "bookingTour";
        }
        model.addAttribute("booking", newBooking);
        return "confirm";
    }

}
