public class Main {

    public static void main(String[] args) {
        Startscherm a = new Startscherm();
        FAQ b = new FAQ("1) Hoe moet ik spelers toevoegen in een sheet?");
        FAQ c = new FAQ("2) Hoe weet ik hoeveel spelers ik moet toevoegen in een team?");
        FAQ d = new FAQ("3) Als ik optie 2 kies, dan krijg ik een melding dat the thuis- en uitteam leeg zijn!");
        FAQ e = new FAQ("4) Mijn vraag zit er niet tussen.");

        b.addQuestion(b);
        c.addQuestion(c);
        d.addQuestion(d);
        e.addQuestion(e);

        a.Menu();
    }
}
