package com.yasser;

public class Printer {
    private int tonerLevel,pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = Math.max(tonerLevel, 0);
        this.duplex = duplex;

        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount<0||(tonerAmount+tonerLevel)>100) return -1;
        this.tonerLevel+=tonerAmount;
        return this.tonerLevel;
    }
    public int printPages(int pagesToPrint){

        pagesToPrint = (duplex) ? (Math.round((float) pagesToPrint/2)) : pagesToPrint;
        this.pagesPrinted+=pagesToPrint;
       return pagesToPrint;
    }
    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
