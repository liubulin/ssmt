package com.zking.ssm.controller;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import com.zking.ssm.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/**
 * @authorLIUYINZI
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2020-11-30 11:30
 */
@Controller
@RequestMapping("/book")
public class HelloController {
    @Autowired
    private IBookService iBookService;

    private com.zking.ssm.model.File file;
    @Autowired
    private IFileService iFileService;
    //Book book=new Book();
    @ModelAttribute
    public void init(Model model){
//        book.setBookName("a");
//        List a = iBookService.queryAll(book);
//        System.out.println(a);
//        model.addAttribute("a",a);

        Book book = iBookService.selectByPrimaryKey(9L);
        System.out.println("hh"+book);
        model.addAttribute("book",book);

        com.zking.ssm.model.File a = iFileService.selectByPrimaryKey("1");
        System.out.println("mingzi"+a.getRealName());
        model.addAttribute("fileName",a.getRealName());
    }
@RequestMapping("/hello")
    public String hello(@RequestParam("username") String name, HttpServletRequest request){
    System.out.println("name");
    request.setAttribute("username",name);
        return "Login";
    }
    @RequestMapping("/getFile")
    public String getFile(MultipartFile fileup,HttpServletRequest request,
                          Model model) throws Exception{

        String fileName = fileup.getOriginalFilename();
        String path= request.getServletContext().getRealPath("/static/images");
        System.out.println("fileName"+fileName+":  :"+path);
//        String path="D:\\IDEAworkspace\\ssmt\\src\\main\\webapp\\static\\images"+fileName;
        file =new com.zking.ssm.model.File();
        file.setUrl(path);
        file.setRealName(fileName);
        file.setContentType("jpg");
        file.setFileId("7");
        file.setUpdateDatetime(null);
        iFileService.insert(file);

        File targetFile = new File(path,fileName);
        fileup.transferTo(targetFile);
        //model.addAttribute("fileName",fileName);
        System.out.println(fileName);
        return "Top";
    }

    @RequestMapping("/toUp")
    public String toUp(){
        return "Login";
    }

@RequestMapping("/login")
    public String login(){
        System.out.println(311);
    return "Top";
    }

    @RequestMapping("{language}")
    public String change(@PathVariable String language, HttpSession session,HttpServletRequest request){
        if("zh".equals(language)){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        }else if("en".equals(language)){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        }
        else{
            throw  new RuntimeException("不支持的语言["+language+"]");
        }
        return "Login";
    }

//    @RequestMapping("/getTp")
//    public String a(){
//
//    }
}
