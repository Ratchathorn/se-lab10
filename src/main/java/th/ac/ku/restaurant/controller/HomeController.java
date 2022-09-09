package th.ac.ku.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/") // คืนค่าเป็น String เสมอ
    public String getHomePage (Model model) {
//        model.addAttribute(ตัวแปร,ค่า);
        // เป็นการส่งตัวแปรไปยัง html
        // ต้องคืนค่าเป็นชื่อไฟล์ html template โดยในเมธอดนี้ คืนค่าเป็น home.html
        model.addAttribute("greeting","Sawaddee");
        model.addAttribute("farewell","Bye bye");

        return "home"; // return "home.html"
    }
}
