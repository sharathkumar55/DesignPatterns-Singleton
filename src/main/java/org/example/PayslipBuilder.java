package org.example;

public class PayslipBuilder {
    private int basic;
    private int hra;
    private int da;

    private int medicalAllowance;

    private int specialAllowance;

    public PayslipBuilder setBasic(int basic) {
        this.basic = basic;
        return this;
    }

    public PayslipBuilder setHra(int hra) {
        this.hra = hra;
        return this;
    }

    public PayslipBuilder setDa(int da) {
        this.da = da;
        return this;
    }


    public void setMedicalAllowance(int medicalAllowance) {
        this.medicalAllowance = medicalAllowance;
    }

    public void setSpecialAllowance(int specialAllowance) {
        this.specialAllowance = specialAllowance;
    }

    public PaySlip build(){
        return new PaySlip(basic,hra,da,specialAllowance,medicalAllowance);
    }
}
