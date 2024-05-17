package com.pluralsight;

public class LeaseContract extends Contract {
    private double eEndingValue;
    private double leaseFee;
    public LeaseContract(String date, String customerName, String customerEmail, String vehiclePrice, double leaseFee, double monthlyPayment,double eEndingValue, double totalPrice ){
        super(date,customerName,customerEmail,vehiclePrice,totalPrice,monthlyPayment);
        this.eEndingValue = eEndingValue;
        this.leaseFee = leaseFee;
    }
    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
