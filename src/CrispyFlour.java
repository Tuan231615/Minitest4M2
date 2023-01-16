import java.time.LocalDate;

public class CrispyFlour extends Material{
    private double quantity;

    @Override
    public double getAmount() {
        return this.quantity * this.cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity){
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

}
