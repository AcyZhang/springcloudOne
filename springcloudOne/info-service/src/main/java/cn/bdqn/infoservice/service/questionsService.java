package cn.bdqn.infoservice.service;

import cn.bdqn.pojo.Questions;

import java.util.List;

public interface questionsService {
    /**
     * 查询全部问题
     * @return
     */
    List<Questions> getQuAll();
}
