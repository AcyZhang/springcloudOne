package cn.bdqn.insertservice.controller;

import cn.bdqn.insertservice.service.questionsInsertService;
import cn.bdqn.pojo.Questions;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class questionsInsertController {
    @Autowired
    private questionsInsertService questionsInsertService;

    @RequestMapping("/add.do")
    @ResponseBody
    public String add(Questions questions,String callback){
        int result=questionsInsertService.add(questions);
        System.out.print(result);
        String msg="";
        if(result>0){
            msg="ok";
        }else{
            msg="no";
        }
        String json= JSON.toJSONString(msg);
        return callback+"("+json+")";
    }
}
