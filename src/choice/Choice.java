package choice;

import goods.Book;
import goods.Drug;
import goods.Electronics;

import java.util.ArrayList;
import java.util.Scanner;

public class Choice {

    private Scanner in = new Scanner(System.in);
    private List list = new List();

    public void choose() {
        System.out.println("1) Elektro\n2) Drogerie\n3) Knihy");
        switch (in.nextInt()) {
            case 1:
                chooseElectronic(list.getElectronics());
                break;
            case 2:
                chooseDrug(list.getDrug());
                break;
            case 3:
                chooseBook(list.getBooks());
                break;
            default:
                System.out.println("Zadejte jiné čísloS");
        }

    }


    private void chooseBook(ArrayList<Book> books) {
        for (int x = 0; books.size() > x; x++) {
            System.out.println((x + 1) + ") " + books.get(x).getName());
        }
        int position = in.nextInt() - 1;
        System.out.printf("Cena : %d Kč\nNázev : %s\nAutor : %s", books.get(position).getPrice(), books.get(position).getName(), books.get(position).getAuthor());
    }

    private void chooseElectronic(ArrayList<Electronics> electronics) {
        for (int x = 0; electronics.size() > x; x++) {
            System.out.println((x + 1) + ") " + electronics.get(x).getName());
        }
        int position = in.nextInt() - 1;
        System.out.printf("Cena : %d Kč\nNázev : %s\nZnačka : %s", electronics.get(position).getPrice(), electronics.get(position).getName(), electronics.get(position).getMark());
    }

    private void chooseDrug(ArrayList<Drug> drugs) {
        for (int x = 0; drugs.size() > x; x++) {
            System.out.println((x + 1) + ") " + drugs.get(x).getName());
        }
        int position = in.nextInt() - 1;
        System.out.printf("Cena : %d Kč\nNázev : %s\nVýrobce : %s", drugs.get(position).getPrice(), drugs.get(position).getName(), drugs.get(position).getManufacturer());
    }
}
