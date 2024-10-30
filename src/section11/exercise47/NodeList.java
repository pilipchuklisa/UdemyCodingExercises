package section11.exercise47;

public interface NodeList {

    ListItem getRoot();

    boolean addItem(ListItem listItem);

    boolean removeItem(ListItem listItem);

    void traverse(ListItem root);
}
