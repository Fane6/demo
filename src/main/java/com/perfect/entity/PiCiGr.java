package com.perfect.entity;

import java.util.Date;

import lombok.Data;

@Data
public class PiCiGr {
    private Long id;

    private String syscode;

    private String sjbbh;

    private String sjblx;

    private Integer scsjl;

    private Date scrq;

    private String remark;

    private String success;

    private String wbjjgbm;

    private String tbdw;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSyscode() {
        return syscode;
    }

    public void setSyscode(String syscode) {
        this.syscode = syscode == null ? null : syscode.trim();
    }

    public String getSjbbh() {
        return sjbbh;
    }

    public void setSjbbh(String sjbbh) {
        this.sjbbh = sjbbh == null ? null : sjbbh.trim();
    }

    public String getSjblx() {
        return sjblx;
    }

    public void setSjblx(String sjblx) {
        this.sjblx = sjblx == null ? null : sjblx.trim();
    }

    public Integer getScsjl() {
        return scsjl;
    }

    public void setScsjl(Integer scsjl) {
        this.scsjl = scsjl;
    }

    public Date getScrq() {
        return scrq;
    }

    public void setScrq(Date scrq) {
        this.scrq = scrq;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success == null ? null : success.trim();
    }

    public String getWbjjgbm() {
        return wbjjgbm;
    }

    public void setWbjjgbm(String wbjjgbm) {
        this.wbjjgbm = wbjjgbm == null ? null : wbjjgbm.trim();
    }

    public String getTbdw() {
        return tbdw;
    }

    public void setTbdw(String tbdw) {
        this.tbdw = tbdw == null ? null : tbdw.trim();
    }
}