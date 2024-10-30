package section11.exercise47;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        rightLink = listItem;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        leftLink = listItem;
        return leftLink;
    }

    @Override
    int compareTo(ListItem listItem) {

        if (this.value instanceof Comparable comparable1 && listItem.value instanceof Comparable comparable2) {
            return comparable1.compareTo(comparable2);
        }

        return 0;
    }
}
