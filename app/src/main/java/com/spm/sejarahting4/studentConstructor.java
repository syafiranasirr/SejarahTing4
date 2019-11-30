package com.spm.sejarahting4;

public class studentConstructor {

    String studId, studEmail, studName, classId;

    public studentConstructor() {
    }

    public studentConstructor(String studId, String studEmail, String studName,String classId ) {
        this.studId = studId;
        this.studEmail = studEmail;
        this.studName = studName;
        this.classId=classId;
    }

    public String getStudId() {
        return studId;
    }

    public void setStudId(String studId) {
        this.studId = studId;
    }

    public String getStudEmail() {
        return studEmail;
    }

    public void setStudEmail(String studEmail) {
        this.studEmail = studEmail;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getClassId() {

        return classId;
    }

    public void setClassId (String classId) {
        this.studName = classId;
    }
}


