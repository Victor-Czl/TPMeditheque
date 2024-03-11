package main.java.mediatheque;

public class PrintOnlyCDsVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        // Aucune action car CDs seulement
    }

    @Override
    public void visit(CD cd) {
        System.out.println("CD : " + cd);
    }
}