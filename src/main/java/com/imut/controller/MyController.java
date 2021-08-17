package com.imut.controller;

import com.imut.pojo.Stu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author DJS
 * @create 2021-08-15  21:06
 */
@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public void dosome(HttpServletRequest request, HttpServletResponse response,String name){
        System.out.println("name = "+name);
        try {
            PrintWriter pw = response.getWriter();
            //pw.write("是的，还需要努力");
            //{"name":"zs","age":29}
            String s = "{\"name\":\"zs\",\"age\":29}";
            pw.write(s);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    @RequestMapping(value = "/some2.do")
    public void dosome2(HttpServletRequest request, HttpServletResponse response,String name){
        System.out.println("name = "+name);
        try {
            PrintWriter pw = response.getWriter();
            Stu s = new Stu("zss",12);
            pw.println(s);

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    //存放json数组
    @RequestMapping(value = "/some3.do")
    public void dosome3( HttpServletResponse response){

        //设置输出内容是json，编码是utf-8
        response.setContentType("application/json;charset=utf-8");

        System.out.println("执行json数组");
        try {
            PrintWriter pw = response.getWriter();
            Stu s1 = new Stu("张三",12);
            Stu s2 = new Stu("李四",22);

            //{"s1":{"name":"?","age":?},"s2":{"name":"?","age":?}}
            String s = "{\"s1\":{\"name\":\""+
                    s1.getName()+"\",\"age\":"+
                    s1.getAge()+"},\"s2\":{\"name\":\""+s2.getName()+
                    "\",\"age\":"+s2.getAge()+"}}";


            pw.println(s);

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
