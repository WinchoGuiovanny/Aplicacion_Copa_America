package com.example.aplicacion_copa_america;

public class Copa_America{

    private String mId;
    private String mEquipoA;
    private String mEquipoB;
    private String mDate;
    private String puntosEquipoA;
    private String puntosEquipoB;
    private int banderaEquipoA;
    private int banderaEquipoB;

    public String getmId() {
        return mId;
    }
    public String getmEquipoA() {return mEquipoA; }
    public String getmEquipoB() {
        return mEquipoB;
    }
    public String getmDate() {
        return mDate;
    }
    public String getPuntosEquipoA() {
        return puntosEquipoA;
    }
    public String getPuntosEquipoB() {
        return puntosEquipoB;
    }
    public int getBanderaEquipoA() {
        return banderaEquipoA;
    }
    public int getBanderaEquipoB() {
        return banderaEquipoB;
    }

    public void setmId(String mId){this.mId = mId;}
    public void setmEquipoA(String mEquipoA){this.mEquipoA = mEquipoA;}
    public void setmEquipoB(String mEquipoB){this.mEquipoB = mEquipoB;}
    public void setmDate(String mDate){this.mDate = mDate;}
    public void setPuntosEquipoA(String puntosEquipoA){this.puntosEquipoA = puntosEquipoA;}
    public void setPuntosEquipoB(String puntosEquipoB){this.puntosEquipoB = puntosEquipoB;}
    public void setBanderaEquipoA(int banderaEquipoA){this.banderaEquipoA = banderaEquipoA;}
    public void setBanderaEquipoB(int banderaEquipoB){this.banderaEquipoB = banderaEquipoB;}

    public Copa_America(String mId, String mDate, String mEquipoA, String puntosEquipoA, String mEquipoB, String puntosEquipoB, int banderaEquipoA, int banderaEquipoB) {
        this.mId = mId;
        this.mEquipoA = mEquipoA;
        this.mEquipoB = mEquipoB;
        this.mDate = mDate;
        this.puntosEquipoA = puntosEquipoA;
        this.puntosEquipoB = puntosEquipoB;
        this.banderaEquipoA = banderaEquipoA;
        this.banderaEquipoB = banderaEquipoB;
    }
}
