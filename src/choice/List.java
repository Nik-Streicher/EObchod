package choice;

import goods.*;

import java.util.ArrayList;

class List {

    //books
    private ArrayList<Book> books = new ArrayList<>();

    //electronics
    private ArrayList<Electronics> electronics = new ArrayList<>();

    //drug
    private ArrayList<Drug> drug = new ArrayList<>();

    ArrayList<Book> getBooks() {
        return books;
    }

    ArrayList<Electronics> getElectronics() {
        return electronics;
    }

    ArrayList<Drug> getDrug() {
        return drug;
    }

    List(){

        //adding 3 default books
        books.add(new Book(280, "Metro 2033", "Dmitrij Gluchovskij"));
        books.add(new Book(303, "Watchmen", "Alan Moore"));
        books.add(new Book(160, "The Old Man and the Sea", "Ernest Hemingway"));

        //adding 3 default electronics
        electronics.add(new Electronics(15990, "58\" Philips 58PUS7304", "Philips"));
        electronics.add(new Electronics(48900, "55\" Samsung QE55Q90", "Samsung"));
        electronics.add(new Electronics(8990, "49\" LG 49UM7100PLB", "LG"));


        //adding default drugs
        drug.add(new Drug(259, "FINISH 4v1 promo pack", "Finish"));
        drug.add(new Drug(339, "PERSIL Color BOX 6,5 kg", "Persil"));
        drug.add(new Drug(189, "VANISH Oxi Action 4 l", "Vanish"));
    }
}
