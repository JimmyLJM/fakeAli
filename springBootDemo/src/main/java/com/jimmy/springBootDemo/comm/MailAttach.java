package com.jimmy.springBootDemo.comm;

import java.io.File;

/**
 * author : jimmyLJM on 2017-09-13
 * 邮件附件
 */
public class MailAttach {

    private String cid;
    private File file;
    private String fileName;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public MailAttach() {

    }

    public MailAttach(File file, String fileName) {
        super();
        this.file = file;
        this.fileName = fileName;
    }

}
