package cn.bdqn.insertservice.service.impl;

import cn.bdqn.insertservice.dao.questionsInsertMapper;
import cn.bdqn.insertservice.service.questionsInsertService;
import cn.bdqn.pojo.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("questionsService")
public class questionsServiceImpl implements questionsInsertService {
    @Autowired
    private questionsInsertMapper questionsInsertMapper;
    @Override
    public int add(Questions questions) {
        return questionsInsertMapper.add(questions);
    }
}
