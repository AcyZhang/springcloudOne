package cn.bdqn.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.Objects;

public class Questions {
    private int id;
    private String title;
    private String detilDesc;
    private int answerCount;
    @JSONField(format ="yyyy-MM-dd hh:mm:ss" )
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date lastModified;

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDetilDesc() {
        return detilDesc;
    }

    public void setDetilDesc(String detilDesc) {
        this.detilDesc = detilDesc;
    }


    public int getAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Questions questions = (Questions) o;
        return id == questions.id &&
                answerCount == questions.answerCount &&
                Objects.equals(title, questions.title) &&
                Objects.equals(detilDesc, questions.detilDesc) &&
                Objects.equals(lastModified, questions.lastModified);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, detilDesc, answerCount, lastModified);
    }
}
