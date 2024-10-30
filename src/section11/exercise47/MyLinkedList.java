package section11.exercise47;

public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem listItem) {
        if (root == null) {
            root = listItem;
            return true;
        }

        ListItem item = root;
        while (item != null) {
            int comparison = item.compareTo(listItem);
            if (comparison < 0) {
                if (item.next() != null) {
                    item = item.next();
                } else {
                    item.setNext(listItem);
                    listItem.setPrevious(item);
                    return true;
                }
            } else if (comparison > 0) {
                if (item.previous() != null) {
                    item.previous().setNext(listItem);
                    listItem.setPrevious(item.previous());
                } else {
                    root = listItem;
                }
                listItem.setNext(item);
                item.setPrevious(listItem);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        if (root == null || listItem == null) {
            return false; // Handle case when root is null or listItem is null
        }

        ListItem item = root;
        while (item != null) {
            if (item.getValue() != null && item.getValue().equals(listItem.getValue())) {

                if (item == root) { // Removing the root item
                    root = item.next();
                }

                if (item.previous() != null) {
                    item.previous().setNext(item.next());
                }
                if (item.next() != null) {
                    item.next().setPrevious(item.previous());
                }
                return true;
            } else if (item.compareTo(listItem) < 0) {
                item = item.next();
            } else {
                return false;
            }
        }
        return false;
    }


    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            ListItem item = root;
            while (item != null) {
                System.out.println(item.getValue());
                item = item.next();
            }
        }
    }
}
