import java.util.*;

    public class Solution {


        public static int age;
        public static String[] names;
        public static int num;
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            num = scan.nextInt();
            String[] names;

            for(int i =0; i<num; i++){
                String firstName = scan.nextLine();
                String lastName = scan.nextLine();

                String date = scan.nextLine();
                int day = scan.nextInt();
                String dot = scan.nextLine();

                int year = scan.nextInt();
                String yesNO = scan.nextLine();
                
                System.out.print(firstName);

                Solution.sortName(lastName);            

                System.out.print()
            }
            
            
            scan.close();
            
            System.out.println(names);




        }

        public static void sortName(String name) {
            for(int i =0; i<num; i++){
                names[i]=name;
            }
        }

        public static print() {
            String temp;
            for (int i = 0; i < num; i++) {
                for (int j = i + 1; j < num; j++) {
                    if (names[i].compareTo(names[j]) > 0) {// to compare one string with other strings
                        // swapping
                        temp = names[i];
                        names[i] = names[j];
                        names[j] = temp;
                    }
                }
            }


            return ;
        }
    }



