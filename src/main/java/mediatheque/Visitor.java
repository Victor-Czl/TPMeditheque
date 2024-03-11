package mediatheque;

public interface Visitor {
    void visit(Book book);
    void visit(CD cd);
}