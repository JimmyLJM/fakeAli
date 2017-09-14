package com.jimmy.springBootDemo.comm;

/**
 * author : jimmyLJM on 2017-09-13
 * 表示邮件类，你需要设置：账户名和密码、收件人、抄送(可选)、暗送(可选)、主题、内容，以及附件(可选)
 *
 * 在创建了Mail对象之后
 * 可以调用它的setSubject()、setContent()，设置主题和正文
 * 也可以调用setFrom()和　addToAddress()，设置发件人，和添加收件人。
 * 也可以调用addAttch()添加附件
 * 创建AttachBean：new AttachBean(new File("..."), "fileName");
 */
public class Mail {

    private String from;                                      // 发件人
    private StringBuilder toAddress = new StringBuilder();    // 收件人
    private StringBuilder ccAddress = new StringBuilder();    // 抄送
    private StringBuilder bccAddress = new StringBuilder();   // 暗送
    private String subject;                                   //主题
    private String content;                                   //正文
    // 附件列表
//    private List<AttachBean> attachList = new ArrayList<AttachBean>();

    public Mail() {}

    public Mail(String from, String to) {
        this(from, to, null, null);
    }

    public Mail(String from, String to, String subject, String content) {
        this.from = from;
        this.toAddress.append(to);
        this.subject = subject;
        this.content = content;
    }



    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public StringBuilder getToAddress() {
        return toAddress;
    }

    public void setToAddress(StringBuilder toAddress) {
        this.toAddress = toAddress;
    }

    public StringBuilder getCcAddress() {
        return ccAddress;
    }

    public void setCcAddress(StringBuilder ccAddress) {
        this.ccAddress = ccAddress;
    }

    public StringBuilder getBccAddress() {
        return bccAddress;
    }

    public void setBccAddress(StringBuilder bccAddress) {
        this.bccAddress = bccAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
