import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {

        int[] test = new int[]{3, 22, 1, 3, 23, 2};
        BubbleSort1(test);

        ArrayList<Integer> AL = new ArrayList<Integer>();

        for(int ii = 0; ii < test.length; ii++){
            AL.add(test[ii]);
        }

        Iterator<Integer> iterator = AL.iterator();
        while(iterator.hasNext()){
            Integer element = iterator.next();

            System.out.println("STILL HAVE IT BOI: "  + element);

        }



    }

        public static void BubbleSort1(int[] array){

            int[] a1 = array;

            int i = 0;
            int j = 0;
            int temp;
            int temp2;

            for (i = 0; i < a1.length - 1; i++) {
                System.out.println(i + "-This is the first for loop: " + a1[i]);
                for (j = 0; j < a1.length - i - 1; j++) {
                    System.out.println("i." + i + " j." + j + "-Outter for loop: " + a1[j]);
                    if (a1[j] > a1[j + 1]) {
                        temp = a1[j];
                        temp2 = a1[j + 1];
                        a1[j] = temp2;
                        a1[j + 1] = temp;

                    }


                }


            }
            for (i = 0; i < a1.length; i++) {
                System.out.println(a1[i]);

            }
        }
    }

