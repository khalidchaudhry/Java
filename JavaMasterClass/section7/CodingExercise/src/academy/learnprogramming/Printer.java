package academy.learnprogramming;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        this.tonerLevel = tonerLevel>-1 && tonerLevel<=100?tonerLevel:-1;
        this.duplex = duplex;
        this.pagesPrinted=0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel+tonerAmount<=100){
                this.tonerLevel+=tonerAmount;
                return this.tonerLevel;
            }
            else {
                return -1;
            }
        }
        else{
            return -1;
        }
    }
    public int printPages(int pages){
        int pagesToPrint=pages;
        pagesToPrint= this.duplex? pagesToPrint / 2+ pagesToPrint%2 :pagesToPrint;

        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}
