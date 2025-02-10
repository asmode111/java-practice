package DataStructuresAndAlgorithms.DynamicArrayStructure;

public class DynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[this.capacity];
    }

    public DynamicArray(int capacity) {
        this.array = new Object[capacity];
        this.capacity = capacity;
    }

    public void add(Object data) {
        if (this.size >= this.capacity) {
            System.out.println("here");
            this.grow();
        }

        this.array[this.size] = data;
        this.size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            this.grow();
        }

        for(int i = size; i > index; i--) {
            this.array[i] = this.array[i - 1];
        }
        this.array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) {
                    this.array[i + j] = this.array[i + j + 1];
                }
                this.array[this.size - 1] = null;
                this.size--;
                if (this.size<= (int)(this.capacity/3)) {
                    this.shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == data) {
                return i;
            }
        }

        return -1;
    }

    private void grow() {
        int newCapacity = (this.capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }

        this.capacity = newCapacity;
        this.array = newArray;
    }

    private void shrink() {
        int newCapacity = (this.capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }

        this.capacity = newCapacity;
        this.array = newArray;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public String toString() {

        String string = "";
        for (int i = 0; i < this.capacity; i++) {
            string += this.array[i] + ", ";
        }

        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }

        return string;
    }
}
