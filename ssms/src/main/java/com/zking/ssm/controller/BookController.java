package com.zking.ssm.controller;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-12-09 15:29
 */
@RestController
public class BookController {
    @Autowired
    private IBookService iBookService;

    @ModelAttribute
    public void init(Model model, HttpServletRequest request,Book book){
        System.out.println(1111);

//        System.out.println(bookName);
//        String name=request.getParameter("name");
//        System.out.println("hh"+name);
//        book.setBookName(name);
        List list =iBookService.queryBook(book);
        model.addAttribute("list",list);
    }
    @RequestMapping("/toUp")
    public String toUp(){
        return "BookList";
    }


    @RequestMapping("/tj")
    public String tj(){
        return "tj";
    }

    @RequestMapping("/tjBook")
    public String tjBook(Book book){
        iBookService.insert(book);
        return "BookList";
    }







}
