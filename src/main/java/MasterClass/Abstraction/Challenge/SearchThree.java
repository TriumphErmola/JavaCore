package MasterClass.Abstraction.Challenge;

public class SearchThree implements NodeList {

    private ListItem root = null;

    public SearchThree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            //список был пуст, поэтому этот элемент становится главой списка
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greater, move right if possible. NewItem больше, сдвиньте вправо, если это возможно.
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there  is no next, so insert at end of list. Cледующего нет, поэтому вставьте в конец списка
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //newItem is less, insert before. NewItem меньше,вставьте перед текущим
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node with a previous is the root.Узел с предыдущим является корнем
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                //равны
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comporison = currentItem.compareTo(item);
            if (comporison == 0) {
                //нашли элемент для удаления
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comporison < 0) {
                currentItem = currentItem.next();
            } else { //comparison > 0
                // мы находимся в элементе больше, чем тот, который нужно удалить
                // поэтому элемент не находится в списке
                return false;
            }
        }
        //мы достигли конца списка
        // не найдя элемент для удаления
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        //рекурсивный метов

        if (root != null) {
            System.out.println(root.getValue());
            traverse(root.next());
        }

    }
}
