package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;

import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarDao carDao;

    @GetMapping()
    public String getCars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        model.addAttribute("car", carDao.getCars(count.orElse(0)));
        return "cars";
    }

}
