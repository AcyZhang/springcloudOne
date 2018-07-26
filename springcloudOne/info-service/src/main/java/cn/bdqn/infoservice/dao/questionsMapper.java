package cn.bdqn.infoservice.dao;

import cn.bdqn.pojo.Questions;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface questionsMapper {
    /**
     * 查询全部问题
     * @return
     */
    List<Questions>  getQuAll();
}
