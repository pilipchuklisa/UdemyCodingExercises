package section11.exercise47;

public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
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
        while (true) {
            int comparison = item.compareTo(listItem);
            if (comparison < 0) {
                if (item.next() != null) {
                    item = item.next();
                } else {
                    item.setNext(listItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (item.previous() != null) {
                    item = item.previous();
                } else {
                    item.setPrevious(listItem);
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean removeItem(ListItem listItem) {
        if (root == null || listItem == null) {
            return false;
        }

        ListItem item = root;
        ListItem parent = null;

        while (item != null) {
            int comparison = item.compareTo(listItem);
            if (comparison < 0) {
                parent = item;
                item = item.next();
            } else if (comparison > 0) {
                parent = item;
                item = item.previous();
            } else {
                performRemoval(item, parent);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null && item.previous() == null) {
            if (parent == null) {
                root = null;
            } else if (parent.next() == item) {
                parent.setNext(null);
            } else if (parent.previous() == item) {
                parent.setPrevious(null);
            }
        } else if (item.next() != null && item.previous() == null) {
            if (parent == null) {
                root = item.next();
            } else if (parent.next() == item) {
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            }
            item.next().setPrevious(parent);
        } else if (item.previous() != null && item.next() == null) {
            if (parent == null) {
                root = item.previous();
            } else if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            }
            item.previous().setNext(parent);
        } else {
            ListItem leftmostParent = item;
            ListItem leftmost = item.next();

            while (leftmost.previous() != null) {
                leftmostParent = leftmost;
                leftmost = leftmost.previous();
            }

            item.setValue(leftmost.getValue());
            if (leftmostParent == item) {
                item.setNext(leftmost.next());
            } else {
                leftmostParent.setPrevious(leftmost.next());
            }
            if (leftmost.next() != null) {
                leftmost.next().setPrevious(leftmostParent);
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}

