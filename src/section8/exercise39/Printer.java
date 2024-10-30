package section8.exercise39;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel <= -1 || tonerLevel > 100) {
            tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if ((tonerAmount <= 0 || tonerAmount > 100) || tonerAmount + tonerLevel > 100) {
            return -1;
        }
        tonerLevel += tonerAmount;

        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (int) Math.ceil((double) pages / 2);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
