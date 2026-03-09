import java.util.ArrayList;

public class job {
    
    private ArrayList<jobSupplement> supplements = new ArrayList<>();
    private int hourlyWage = 0;

    public job(int wage) {
        hourlyWage = wage;
    }

    // public int calculateProfit(period ) {

    // }

    public ArrayList<jobSupplement> getSupplements() {
        return supplements;
    }

    public int getWage() {
        return hourlyWage;
    }
}
