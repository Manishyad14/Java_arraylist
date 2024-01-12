import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;

public class array_list {


    static void reverse_list(ArrayList<Integer>list){
        int i = 0 ; j = list.size()-1;

        //now we will use the int temp = a ;
        // a = b ;
        //b = temp


        while(i<j){
          Integer temp = Integer.valueOf(list.get(i));//from the ith positio n i am getting the value of the array list
         // Integer.valueOf(l1.get(i)) = Integer.valueOf(l1.get(j);
            // In array list we can use some array list built in functions-->>
            list.set(i , list.get(j));
            list.set(j , temp);
          //  Integer.valueOf(l1.get(j)) = temp;


            i--;
            j++;
        }










    }






    public static void main(String[] args) {

        //creation of the arraylist--------------Basic syntax for the creation of the arraylist
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> l2 = new ArrayList<>();

        //for adding the element in the arraylist---
        //we have to use .add()
        l1.add(5);
        l1.add(9);

        //____________________________________________________
        //getting the element for the ith index using .get() function we pass index in the .get(index) function
        System.out.println(l1.get(1));


        //___________________________________________________
        //Printing the arraylist using for loop
        for(int i = 0 ; i < l1.size();i++){
            System.out.println(l1.get(i));
        }

        //_-----------------____--------------------------------
        //we can directlyy print the aaray list by using simple syntax
        System.out.println(l1);

        //________________________________________________________
        // for adding the element at a particular index we have to .add(index,value or element) in the arralist
        l1.add(1,58);
        l1.add(2,78);
        l1.add(3,18);
        l1.add(4,8);



        //modifying element at a particular index  we can do it by using .set(index , element) function
        l1.set(1,10);


          //-----------------------------------------------------
          //removing an element at index i---
        //here we use .remove() function----we mention here index inside the remove function .remove(index)
        l1.remove(1);

        //--------------------------------------------------------
        //now what if we have to remove the element from the arraylist by the element
        //here we use
        l1.remove(Integer.valueOf(10));

        //----------------------------------------------------------
        //checking if the element is present in the arraylist or not  ---here we use .contains() function--
        boolean ans = l1.contains(Integer.valueOf(10));
        System.out.println(ans);

        //---------------------------------------------------------
        //If we dont specify the data type  of the arraylist we can do ----
        ArrayList l = new ArrayList();
        //so we can add whatever we want in this array list of whatever data type---
        l.add("manish");//here i have added string
        l.add(9);//here i have added a number



        //_________________________________________________________________________________>>>_______
        //In java we have collections name class in that we can directly call the reverse method to reverse the lsit
        Collection.reverse(l1);//this will return the arraylist in the reverse oreder--->>

        //________________________________________________________________________________________






    }
}
