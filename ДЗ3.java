class sample {
    public static void main(String[] args) {
        Box myBox = new Box();

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        Stack myStack = new Stack();
        int i = 0;
        while (i < 15) {
            myStack.push(myBox);
            i++;
        }
        myStack.print();
    }
}

class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Объем равен " + width * height * depth);
    }

    void color() {
        System.out.println("Цвет коробки - черный");
    }
}

class Stack {
    Box[] myStack = new Box[10];
    int tos = -1;

    public void print() {
        for (int i = 0; i < tos + 1; i++) {
            myStack[i].color();
            myStack[i].volume();

        }
    }

    public void push(Box elem) {
        if (tos == myStack.length - 1)
            System.out.println("Стек заполнен");
        else
            myStack[++tos] = elem;
    }
}