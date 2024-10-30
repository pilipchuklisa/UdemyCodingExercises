package section11.exercise47;

public abstract class ListItem {

    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem listItem);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem listItem);

    abstract int compareTo(ListItem listItem);
}