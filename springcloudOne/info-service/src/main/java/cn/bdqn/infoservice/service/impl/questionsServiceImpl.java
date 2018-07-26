package cn.bdqn.infoservice.service.impl;

import cn.bdqn.infoservice.dao.questionsMapper;
import cn.bdqn.infoservice.service.questionsService;
import cn.bdqn.pojo.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("questionsService")
public class questionsServiceImpl implements questionsService {
    @Autowired
    private questionsMapper questionsMapper;

    @Override
    public List<Questions> getQuAll() {
        return questionsMapper.getQuAll();
    }
}
