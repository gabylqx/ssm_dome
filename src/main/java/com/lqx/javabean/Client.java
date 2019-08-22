package com.lqx.javabean;

/**
 * @program: ssm
 * @description: 客户表
 * @author: Li Qixuan
 * @create: 2019-08-22 10:59
 */
public class Client {
    private Integer cltId;
    private String cltNo;
    private String cltName;
    private String cltAddr;
    private String cltTel;
    private String cltEmail;

    public Integer getCltId() {
        return cltId;
    }

    public void setCltId(Integer cltId) {
        this.cltId = cltId;
    }

    public String getCltName() {
        return cltName;
    }

    public void setCltName(String cltName) {
        this.cltName = cltName;
    }

    public String getCltAddr() {
        return cltAddr;
    }

    public void setCltAddr(String cltAddr) {
        this.cltAddr = cltAddr;
    }

    public String getCltTel() {
        return cltTel;
    }

    public void setCltTel(String cltTel) {
        this.cltTel = cltTel;
    }

    public String getCltEmail() {
        return cltEmail;
    }

    public void setCltEmail(String cltEmail) {
        this.cltEmail = cltEmail;
    }

    public String getCltNo() {
        return cltNo;
    }

    public void setCltNo(String cltNo) {
        this.cltNo = cltNo;
    }

    @Override
    public String toString() {
        return "Client{" +
                "cltId=" + cltId +
                ", cltNo='" + cltNo + '\'' +
                ", cltName='" + cltName + '\'' +
                ", cltAddr='" + cltAddr + '\'' +
                ", cltTel='" + cltTel + '\'' +
                ", cltEmail='" + cltEmail + '\'' +
                '}';
    }

    public Client() {

    }
}
