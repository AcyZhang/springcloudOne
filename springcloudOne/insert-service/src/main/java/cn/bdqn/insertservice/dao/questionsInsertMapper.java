package cn.bdqn.insertservice.dao;

import cn.bdqn.pojo.Questions;
import org.springframework.stereotype.Repository;

@Repository
public interface questionsInsertMapper {
    /**
     * 新增
     * @param questions
     * @return
     */
    int add(Questions questions);
}
