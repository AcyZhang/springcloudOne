package cn.bdqn.infoservice.controller;

import cn.bdqn.infoservice.service.impl.questionsServiceImpl;
import cn.bdqn.pojo.Questions;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class questionsController {
    @Autowired
    private questionsServiceImpl questionsService;

    /**
     * 查询全部问题
     * @return
     */
    @RequestMapping("/getAll.do")
    @ResponseBody
    @DateTimeFormat
    public String getAll(String callback){
        List<Questions> info=questionsService.getQuAll();
        String json= JSON.toJSONString(info);
        System.out.print(json);
        return callback+"("+json+")";
    }
}
