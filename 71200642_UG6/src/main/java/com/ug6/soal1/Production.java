package com.ug6.soal1;


import java.util.Iterator;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import java.time.temporal.ChronoUnit;

import java.time.format.FormatStyle;

import java.util.ArrayList;


public class Production {
    private int productionCapacity;
    private ArrayList<LocalDate> productionDate;
    private ArrayList<Long> productionDueDays;
    private double costCalculation = 0.0D;

    public Production(int productionCapacity, ArrayList<LocalDate> productionDate, ArrayList<Long> productionDueDays) {
        this.setProductionCapacity(productionCapacity);
        this.setProductionDate(productionDate);
        this.setProductionDueDays(productionDueDays);
    }

    public boolean cekPhonesSpecification(String androidCode) {
        int i = 0;
        boolean stat = false;

        for(Iterator x4 = Codes.ANDROIDCODES.iterator(); x4.hasNext(); ++i) {
            String androidLevel = (String)x4.next();
            stat = !androidCode.equalsIgnoreCase(androidLevel) || i >= 3;
        }

        return stat;
    }

    public boolean cekPhonesSpecification(String androidCode, int ramCapacity, int romCapacity) {
        int i = 0;
        boolean stat = false;
        System.out.println("Starting with status " + stat);

        for(Iterator x6 = Codes.ANDROIDCODES.iterator(); x6.hasNext(); ++i) {
            String androidLevel = (String)x6.next();
            if (i <= 4 && androidLevel.equalsIgnoreCase(androidCode)) {
                if (ramCapacity <= 8 && ramCapacity >= 1 && romCapacity <= 128 && romCapacity >= 32) {
                    stat = true;
                }
            } else if (i > 4 && i < Codes.ANDROIDCODES.size() - 1 && androidLevel.equalsIgnoreCase(androidCode) && ramCapacity <= 16 && ramCapacity >= 4 && romCapacity <= 256 && romCapacity >= 64) {
                stat = true;
            }
        }

        System.out.println("Finish checking with status " + stat);
        return stat;
    }

    public void conductProduction(Phones phone) {
        long productionDuration = (long)this.getProductionCapacity() * 3L;
        LocalDate today = LocalDate.now();
        this.getProductionDate().add(today);

        LocalDate productionDueDate = today.plusDays(productionDuration);
        long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);

        String todayFormat = today.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String productionDueDateFormat = productionDueDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        double cost = (double)(this.getProductionCapacity() * 1000) * (double)daysBetweenProduction;
        this.setCostCalculation(cost);
        System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
        System.out.println("With code: " + phone.getPhoneCode());
        System.out.println("Production Date: " + todayFormat);
        System.out.println("Production Due date: " + productionDueDateFormat);
        System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
        System.out.println("Calculation Production Cost: Rp " + this.getCostCalculation());
    }

    public void conductProduction(Phones phone, float productionRate) {
        if (productionRate >= 0.0F && productionRate <= 2.0F) {
            long productionDuration = (long)((float)((long)this.getProductionCapacity() * 3L) * productionRate);
            LocalDate today = LocalDate.now();
            this.getProductionDate().add(today);
            LocalDate productionDueDate = today.plusDays(productionDuration);
            long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
            double cost = (double)(this.getProductionCapacity() * 1000) * (double)daysBetweenProduction * 2.0D;
            this.setCostCalculation(cost);
            String bonusProductionDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            String bonusProductionDueDate = productionDueDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
            System.out.println("With code: " + phone.getPhoneCode());
            System.out.println("Production Date: " + bonusProductionDate);
            System.out.println("Production Due date: " + bonusProductionDueDate);
            System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
            System.out.println("Calculation Production Cost: Rp " + (long)this.getCostCalculation());
        } else {
            System.out.println("Please Input valid Production Rate");
        }

    }

    public int getProductionCapacity() {
        return this.productionCapacity;
    }

    public void setProductionCapacity(int productionCapacity) {
        this.productionCapacity = productionCapacity;
    }

    public ArrayList<LocalDate> getProductionDate() {
        return this.productionDate;
    }

    protected void setProductionDate(ArrayList<LocalDate> productionDate) {
        this.productionDate = productionDate;
    }

    public double getCostCalculation() {
        return this.costCalculation;
    }

    public void setCostCalculation(double costCalculation) {
        this.costCalculation = costCalculation;
    }

    public ArrayList<Long> getProductionDueDays() {
        return this.productionDueDays;
    }

    public void setProductionDueDays(ArrayList<Long> productionDueDays) {
        this.productionDueDays = productionDueDays;
    }
}