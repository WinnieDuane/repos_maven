package com.ruby.pojo;

public class Emp
{
    private int eid;
    private String ename;
    private int a;

    public Emp(){

    }

    public Emp(int eid, String ename, int a) {
        this.eid = eid;
        this.ename = ename;
        this.a = a;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", a=" + a +
                '}';
    }
}
