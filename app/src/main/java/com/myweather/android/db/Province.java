package com.myweather.android.db;

import java.io.Serializable;

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPronvinceName() {
        return provinceName;
    }
    public void setPronvinceName( String provinceName) {
        this. provinceName =  provinceName;
    }
    public int getPronvinceCode() {
        return provinceCode;
    }
    public void setPronvinceCode(int provinceCode) {
        this. provinceCode =  provinceCode;
    }

}
