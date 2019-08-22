package com.lqx.javabean;

/**
 * @program: ssm
 * @description:
 * @author: Li Qixuan
 * @create: 2019-08-22 10:20
 */
public class Goods {
    private int gds_id;
    private String gds_no;
    private String gds_name;
    private Double gds_price;

    public int getGds_id() {
        return gds_id;
    }

    public void setGds_id(int gds_id) {
        this.gds_id = gds_id;
    }

    public String getGds_no() {
        return gds_no;
    }

    public void setGds_no(String gds_no) {
        this.gds_no = gds_no;
    }

    public String getGds_name() {
        return gds_name;
    }

    public void setGds_name(String gds_name) {
        this.gds_name = gds_name;
    }

    public Double getGds_price() {
        return gds_price;
    }

    public void setGds_price(Double gds_price) {
        this.gds_price = gds_price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gds_id=" + gds_id +
                ", gds_no='" + gds_no + '\'' +
                ", gds_name='" + gds_name + '\'' +
                ", gds_price=" + gds_price +
                '}';
    }

    public Goods() {
    }

}
