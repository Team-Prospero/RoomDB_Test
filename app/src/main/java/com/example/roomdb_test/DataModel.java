package com.example.roomdb_test;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Date;

@Entity(tableName = "farm_info")
public class DataModel {
    /**
     * id = primaryKEY
     * autoGenerate -> 자동으로 증가
     * */
    @PrimaryKey
    private String farmNumber;

    private String farmName;
    private String equipmentNo;
    private String sectionNo;
    private int Temperature;
    private String emergencyCall;
    private Date periodicMessage;
    private int tempMax;
    private int tempMin;
    private int SensorType;
    private boolean OnOff;
    private int waterMax;
    private int waterMin;


    public DataModel(String farmNumber) {
        this.farmNumber = farmNumber;
    }

    public String getFarmNumber() {
        return farmNumber;
    }

    public void setFarmNumber(String farmNumber) {
        this.farmNumber = farmNumber;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getEquipmentNo() {
        return equipmentNo;
    }

    public void setEquipmentNo(String equipmentNo) {
        this.equipmentNo = equipmentNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    public int getTemperature() {
        return Temperature;
    }

    public void setTemperature(int temperature) {
        Temperature = temperature;
    }

    public String getEmergencyCall() {
        return emergencyCall;
    }

    public void setEmergencyCall(String emargencyCall) {
        this.emergencyCall = emargencyCall;
    }

    public Date getPeriodicMessage() {
        return periodicMessage;
    }

    public void setPeriodicMessage(Date periodicMessage) {
        this.periodicMessage = periodicMessage;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getSensorType() {
        return SensorType;
    }

    public void setSensorType(int sensorType) {
        SensorType = sensorType;
    }

    public boolean isOnOff() {
        return OnOff;
    }

    public void setOnOff(boolean onOff) {
        OnOff = onOff;
    }

    public int getWaterMax() {
        return waterMax;
    }

    public void setWaterMax(int waterMax) {
        this.waterMax = waterMax;
    }

    public int getWaterMin() {
        return waterMin;
    }

    public void setWaterMin(int waterMin) {
        this.waterMin = waterMin;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "farmNumber='" + farmNumber + '\'' +
                ", farmName='" + farmName + '\'' +
                ", equipmentNo='" + equipmentNo + '\'' +
                ", sectionNo='" + sectionNo + '\'' +
                ", Temperature=" + Temperature +
                ", emergencyCall='" + emergencyCall + '\'' +
                ", periodicMessage=" + periodicMessage +
                ", tempMax=" + tempMax +
                ", tempMin=" + tempMin +
                ", SensorType=" + SensorType +
                ", OnOff=" + OnOff +
                ", waterMax=" + waterMax +
                ", waterMin=" + waterMin +
                '}';
    }
}