package com.po;

/**
 * Created by root on 16-10-18.
 */
public class Tclass {
    private int id;
    private String begindate;
    private String enddate;
    private String comment;
    private Course courseByCourseid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tclass tclass = (Tclass) o;

        if (id != tclass.id) return false;
        if (begindate != null ? !begindate.equals(tclass.begindate) : tclass.begindate != null) return false;
        if (enddate != null ? !enddate.equals(tclass.enddate) : tclass.enddate != null) return false;
        if (comment != null ? !comment.equals(tclass.comment) : tclass.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (begindate != null ? begindate.hashCode() : 0);
        result = 31 * result + (enddate != null ? enddate.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }

    public Course getCourseByCourseid() {
        return courseByCourseid;
    }

    public void setCourseByCourseid(Course courseByCourseid) {
        this.courseByCourseid = courseByCourseid;
    }
}
