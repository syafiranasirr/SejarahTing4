package com.spm.sejarahting4;

public class Upload {

    private String fileName;
    private String fileUrl;

    public Upload() {
    }

    public Upload(String fileName, String fileUrl) {
        if(fileName.trim().equals(""))
        {
            fileName="No name";
        }
        this.fileName = fileName;
        this.fileUrl = fileUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName (String fileName) {
        this.fileName = fileName;
    }


    public String getFileUrl() { return fileUrl; }

    public void setfileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
