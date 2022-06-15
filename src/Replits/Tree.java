package Replits;

public class Tree {
    public static void main(String[] args) {

        int year = 0;
        int growth = 0;
        int treesize = 0;

        for (int i = 0; i <3 ; i++) {
            year++;
            growth=1;
            treesize= treesize+growth;
            System.out.println("year "+year+" - growth "+growth+" cm");
            System.out.println("tree size: "+treesize+" cm");


            }
        for (int i = 3; i <10 ; i++) {
            year++;
            growth=2;
            treesize= treesize+growth;
            System.out.println("year "+year+" - growth "+growth+" cm");
            System.out.println("tree size: "+treesize+" cm");
        }



        }




    }

