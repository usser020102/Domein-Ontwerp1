import java.util.ArrayList;
import java.util.Scanner;

public class FAQ {
    private int optie;
    private String q;
    public static ArrayList<FAQ> vraag =  new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public FAQ(String q){
        this.q = q;
    }
    public FAQ(){

    }

    public void printVraag() {
        for (int i = 0; i < vraag.size(); i++) {
            System.out.println(this.vraag.get(i).q);
        }
        System.out.print("Voer het getal in van uw vraag: ");
        optie = scanner.nextInt();
        if (optie == 1) {
            System.out.println();
            System.out.println("Om spelers toe te voegen, kiest u voor optie 1. U dient eerst de naam van het thuis team in te vullen.");
            System.out.println("Vervolgens vult u de aantal spelers in (zie vraaag 2 voor het aantal spelers). Hierna kunt u de spelers toevoegen aan het thuisteam.");
            System.out.println("Na het invullen van het thuisteam, volgt het uitteam waar u hetzelfde proces volgt");
            System.out.println();
        }

        if (optie == 2) {
            System.out.println();
            System.out.println("Om te weten hoeveel spelers u moet toevoegen, vraag aan de coach van het team. ");
            System.out.println();
        }

        if (optie == 3) {
            System.out.println();
            System.out.println("U moet eerst de spelers van het thuis- en uitteam toevoegen. U kunt dat doen door optie 1 te kiezen in het starscherm.");
            System.out.println();
        }

        if (optie == 4) {
            System.out.println();
            System.out.println("Als uw vraag er niet tussen zit, kunt u contact opnemen via:");
            System.out.println("Email: developers@scoresheet.nl");
            System.out.println();
        }
    }


    public void addQuestion(FAQ faq){
        this.vraag.add(faq);
    }
}
