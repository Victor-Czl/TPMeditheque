package main.java.mediatheque;

public class PrintOnlyBooksVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Livre : " + book);
    }

    @Override
    public void visit(CD cd) {
        // Aucune actions car livre seulement
    }
}