package com.pluralsight;

public class CellPhone {

    // data
    private int serialNumber = 1000000 - 9999999;
    private  String model ="iphoneX";
    private  String carrier = "AT&T";
    private  String phoneNumber = "";
    private  String owner = "erick";

    // Parameterless constructor
    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public int getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(){
        this.serialNumber = serialNumber;
    }

    public String getModel(){
        return model;
    }
    public void setModel(){
        this.model = model;
    }

   public String getCarrier(){
        return carrier;
   }
    public void  setCarrier(){
        this.carrier = carrier;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(){
        this.phoneNumber = phoneNumber;
    }

    public String getOwner(){
        return owner;
    }
    public void  setOwner(){
        this.owner = owner;
    }
}
