public class Fjord {

    public static void main(String [] args) {
        Vehicle takk = new Vehicle("Takk", "Sedan", 40, 9.5);
        Vehicle beklager = new Vehicle("Beklager", "Sedan", 45, 7.5);
        Vehicle vakker = new Vehicle("Vakker", "SUV", 60, 7.5);
        Vehicle stygg = new Vehicle("Stygg", "SUV", 50, 9.0);
        Vehicle vanskellig = new Vehicle("Vanskellig", "Truck", 60, 8.75);
        Vehicle lastebill = new Vehicle("Lastebill", "Truck", 70, 5.5);

        System.out.println("Takk:");
        System.out.println(takk.MPG());
        System.out.println(takk.govtStatement());

        System.out.println("Beklager:");
        System.out.println(beklager.MPG());
        System.out.println(beklager.govtStatement());

        System.out.println("Vakker:");
        System.out.println(vakker.MPG());
        System.out.println(vakker.govtStatement());

        System.out.println("Stygg:");
        System.out.println(stygg.MPG());
        System.out.println(stygg.govtStatement());

        System.out.println("Vanskellig:");
        System.out.println(vanskellig.MPG());
        System.out.println(vanskellig.govtStatement());

        System.out.println("Lastebill:");
        System.out.println(lastebill.MPG());
        System.out.println(lastebill.govtStatement());
        
    }
}