package cn.bdqn.pojo;


import java.sql.Timestamp;
import java.util.Objects;


public class Answers {
    private int id;
    private String ansCount;
    private Timestamp ansDate;
    private int qid;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAnsCount() {
        return ansCount;
    }

    public void setAnsCount(String ansCount) {
        this.ansCount = ansCount;
    }


    public Timestamp getAnsDate() {
        return ansDate;
    }

    public void setAnsDate(Timestamp ansDate) {
        this.ansDate = ansDate;
    }


    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answers answers = (Answers) o;
        return id == answers.id &&
                qid == answers.qid &&
                Objects.equals(ansCount, answers.ansCount) &&
                Objects.equals(ansDate, answers.ansDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ansCount, ansDate, qid);
    }
}
