package com.pluralsight;

public class SalesContract extends Contract {
    private String sTaxAmount;
    private String recordingFee;
    private String ProcessingFee;
    private boolean Financing;
    public SalesContract(String date, String customerName, String customerEmail, String vehicleSold, String sTaxAmount, String recordingFee, String processingFee, boolean financing,double totalPrice, double monthlyPayment ){
        super(date,customerName,customerEmail,vehicleSold,totalPrice,monthlyPayment);
        this.sTaxAmount = ("5%");
        this.recordingFee = ("$100");
        this.ProcessingFee= processingFee;
        this.Financing = financing;


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
