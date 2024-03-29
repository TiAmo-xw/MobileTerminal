package com.xngs.pojo;

import java.io.Serializable;

public class Dept implements Serializable {
    private Short deptno;

    private String dname;

    private String loc;

    private static final long serialVersionUID = 1L;

    public Short getDeptno() {
        return deptno;
    }

    public void setDeptno(Short deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
    }
}