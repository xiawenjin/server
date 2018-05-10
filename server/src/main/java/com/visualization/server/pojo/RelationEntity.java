package com.visualization.server.pojo;

import java.io.Serializable;

public class RelationEntity implements Serializable {
    private Integer id;

    private String outPoint;

    private String outPointType;

    private String outCustomerName;

    private String outBirth;

    private String outCarrierName;

    private String outArea;

    private String outCity;

    private Integer outDegree;

    private String inPoint;

    private String inPointType;

    private String inCustomerName;

    private String inBirth;

    private String inCarrierName;

    private String inArea;

    private String inCity;

    private Integer inDegree;

    private String busiType;

    private Integer lengthImportance;

    private Integer widthImportance;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutPoint() {
        return outPoint;
    }

    public void setOutPoint(String outPoint) {
        this.outPoint = outPoint == null ? null : outPoint.trim();
    }

    public String getOutPointType() {
        return outPointType;
    }

    public void setOutPointType(String outPointType) {
        this.outPointType = outPointType == null ? null : outPointType.trim();
    }

    public String getOutCustomerName() {
        return outCustomerName;
    }

    public void setOutCustomerName(String outCustomerName) {
        this.outCustomerName = outCustomerName == null ? null : outCustomerName.trim();
    }

    public String getOutBirth() {
        return outBirth;
    }

    public void setOutBirth(String outBirth) {
        this.outBirth = outBirth == null ? null : outBirth.trim();
    }

    public String getOutCarrierName() {
        return outCarrierName;
    }

    public void setOutCarrierName(String outCarrierName) {
        this.outCarrierName = outCarrierName == null ? null : outCarrierName.trim();
    }

    public String getOutArea() {
        return outArea;
    }

    public void setOutArea(String outArea) {
        this.outArea = outArea == null ? null : outArea.trim();
    }

    public String getOutCity() {
        return outCity;
    }

    public void setOutCity(String outCity) {
        this.outCity = outCity == null ? null : outCity.trim();
    }

    public Integer getOutDegree() {
        return outDegree;
    }

    public void setOutDegree(Integer outDegree) {
        this.outDegree = outDegree;
    }

    public String getInPoint() {
        return inPoint;
    }

    public void setInPoint(String inPoint) {
        this.inPoint = inPoint == null ? null : inPoint.trim();
    }

    public String getInPointType() {
        return inPointType;
    }

    public void setInPointType(String inPointType) {
        this.inPointType = inPointType == null ? null : inPointType.trim();
    }

    public String getInCustomerName() {
        return inCustomerName;
    }

    public void setInCustomerName(String inCustomerName) {
        this.inCustomerName = inCustomerName == null ? null : inCustomerName.trim();
    }

    public String getInBirth() {
        return inBirth;
    }

    public void setInBirth(String inBirth) {
        this.inBirth = inBirth == null ? null : inBirth.trim();
    }

    public String getInCarrierName() {
        return inCarrierName;
    }

    public void setInCarrierName(String inCarrierName) {
        this.inCarrierName = inCarrierName == null ? null : inCarrierName.trim();
    }

    public String getInArea() {
        return inArea;
    }

    public void setInArea(String inArea) {
        this.inArea = inArea == null ? null : inArea.trim();
    }

    public String getInCity() {
        return inCity;
    }

    public void setInCity(String inCity) {
        this.inCity = inCity == null ? null : inCity.trim();
    }

    public Integer getInDegree() {
        return inDegree;
    }

    public void setInDegree(Integer inDegree) {
        this.inDegree = inDegree;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    public Integer getLengthImportance() {
        return lengthImportance;
    }

    public void setLengthImportance(Integer lengthImportance) {
        this.lengthImportance = lengthImportance;
    }

    public Integer getWidthImportance() {
        return widthImportance;
    }

    public void setWidthImportance(Integer widthImportance) {
        this.widthImportance = widthImportance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", outPoint=").append(outPoint);
        sb.append(", outPointType=").append(outPointType);
        sb.append(", outCustomerName=").append(outCustomerName);
        sb.append(", outBirth=").append(outBirth);
        sb.append(", outCarrierName=").append(outCarrierName);
        sb.append(", outArea=").append(outArea);
        sb.append(", outCity=").append(outCity);
        sb.append(", outDegree=").append(outDegree);
        sb.append(", inPoint=").append(inPoint);
        sb.append(", inPointType=").append(inPointType);
        sb.append(", inCustomerName=").append(inCustomerName);
        sb.append(", inBirth=").append(inBirth);
        sb.append(", inCarrierName=").append(inCarrierName);
        sb.append(", inArea=").append(inArea);
        sb.append(", inCity=").append(inCity);
        sb.append(", inDegree=").append(inDegree);
        sb.append(", busiType=").append(busiType);
        sb.append(", lengthImportance=").append(lengthImportance);
        sb.append(", widthImportance=").append(widthImportance);
        sb.append("]");
        return sb.toString();
    }
}