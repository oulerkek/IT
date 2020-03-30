package sample;
import java.io.DataInputStream;
class MyStack
{
    int Top=-1;
    public static int MAX=2;
    int Item[]=new int[MAX];

    void Push(int X)

    {
        if(Top==MAX-1)
            System.out.println("Stack is full !");
        else{
            Top++;
            Item[Top]=X;

        }
    }
    int Pop()
    {
        if(Top==-1)
            return -1;
        else{
            return (Item[Top--]);

        }
    }
    void Display()
    {
        if(Top==-1)
            System.out.println("Stsck is Empty");
        else{

            for (int i=0;i<=Top;i++)
                System.out.print("\t"+Item[i]);
        }
        System.out.println("");
    }
}

class Stack
{
    public static void main (String[] args) {

        MyStack obj =new MyStack();
        int opt=1;
        int Num;

        while(opt !=4)
        {
            System.out.println("========MENU==========");
            System.out.println(" |1----->Push()   |");
            System.out.println(" |2----->Pop()    |");
            System.out.println(" |3----->Display()|");
            System.out.println(" |4----->Exit()   |");
            System.out.println("======================");
            System.out.println("Enter the option    :");
            try{
                DataInputStream in = new DataInputStream(System.in);
                opt=Integer.parseInt(in.readLine());
                switch(opt)
                {
                    case 1:
                        System.out.println("Enter the no        :");
                        Num=Integer.parseInt(in.readLine());
                        obj.Push(Num);
                        break;
                    case 2:
                        Num=obj.Pop();
                        if(Num==-1)
                            System.out.println("Stack is Empty !")  ;
                        else
                            System.out.println("The poped item is :"+Num);

                        break;
                    case 3:
                        obj.Display();
                        break;
                    case 4:
                        break;
                    default :
                        System.out.println("In valued Input !");
                }
            }
            catch(Exception e){}
        }

    }
}