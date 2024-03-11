package mediatheque;

import java.util.LinkedList;
import java.util.List;

import main.java.mediatheque.PrintOnlyBooksVisitor;
import main.java.mediatheque.PrintOnlyCDsVisitor;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}
	
    public void printOnlyBooks() {
        Visitor visitor = new PrintOnlyBooksVisitor();
        for (Item item : items) {
            item.accept(visitor);
        }
    }

    public void printOnlyCDs() {
        Visitor visitor = new PrintOnlyCDsVisitor();
        for (Item item : items) {
            item.accept(visitor);
        }
    }

}
