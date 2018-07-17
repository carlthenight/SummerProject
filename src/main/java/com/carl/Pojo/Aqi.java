package com.carl.Pojo;

public class Aqi {
    private String id;
    private String aqi;
    private String aqi_level;
    private String aqi_name;
    private String pm10;
    private String pm2;
    private String no2;
    private String so2;
    private String co;

    @Override
    public String toString() {
        return "Aqi{" +
                "id='" + id + '\'' +
                ", aqi='" + aqi + '\'' +
                ", aqi_level='" + aqi_level + '\'' +
                ", aqi_name='" + aqi_name + '\'' +
                ", pm10='" + pm10 + '\'' +
                ", pm2='" + pm2 + '\'' +
                ", no2='" + no2 + '\'' +
                ", so2='" + so2 + '\'' +
                ", co='" + co + '\'' +
                '}';
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getAqi_level() {
        return aqi_level;
    }

    public void setAqi_level(String aqi_levle) {
        this.aqi_level = aqi_levle;
    }

    public String getAqi_name() {
        return aqi_name;
    }

    public void setAqi_name(String aqi_name) {
        this.aqi_name = aqi_name;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getPm2() {
        return pm2;
    }

    public void setPm2(String pm2) {
        this.pm2 = pm2;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
