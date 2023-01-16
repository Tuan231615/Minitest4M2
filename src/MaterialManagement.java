import java.time.LocalDate;

public abstract class MaterialManagement {
    Material crispyFlour1 = new CrispyFlour("1", "bot ngot", LocalDate.now(), 120, 12);
    Material crispyFlour2 = new CrispyFlour("2", "Chien xu", LocalDate.now(), 130, 5);
    Material crispyFlour3 = new CrispyFlour("3", "Chien gion", LocalDate.now(), 140, 8);
    Material crispyFlour4 = new CrispyFlour("4", "Chien xu gion", LocalDate.now(), 150, 6);
    Material crispyFlour5 = new CrispyFlour("5", "Chien xu xu", LocalDate.now(), 160, 4);
    Material meat1 = new Meat("6", "thit lown", LocalDate.now(), 100, 2);
    Material meat2 = new Meat("7", "thit bo", LocalDate.now(), 250, 4);
    Material meat3 = new Meat("8", "thit cho", LocalDate.now(), 70, 3);
    Material meat4 = new Meat("9", "thit ga", LocalDate.now(), 150, 5);
    Material meat5 = new Meat("10", "thit heo", LocalDate.now(), 120, 7);
    }
