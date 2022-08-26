import java.util.*;

    public class Solution {

        public static int[] age;
        public static String[] names;
        public static int num;
        public static String[] yn;
        public static String[] first;

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            num = scan.nextInt();

            first = new String[num +1];
            names = new String[num +1];
            age = new int[num +1];
            yn = new String[num +1];

            for(int i =0; i<num; i++){
                String firstName = scan.next();
                String lastName = scan.next();

                String month = scan.next();
                int day = scan.nextInt();

                int year = scan.nextInt();
                String yesNo = scan.next();
                
                int agee = 2015-year;
                if(!(month.contains("Jan")||!month.contains("Feb")||month.contains("Mar")||month.contains("Apr"))){
                    agee--;
                }
                
                first[i] = firstName;
                names[i]=lastName;
                if(yesNo.contains("yes")) {
                    age[i]= agee; 
                    yn [i] = "Included";   
                }
                else if(yesNo.contains("no")) {
                    age[i]= 00; 
                    yn [i] = "excluded";   
                }    
            }
            scan.close();
            System.out.println(Solution.sort());
        }

        public static String sort() {
            String temp;
            int newAge;
            String str;
            String ff;
            String output = "";
            for (int i = 0; i < num; i++) {
                for (int j = i + 1; j < num; j++) {
                    if (names[i].compareTo(names[j]) > 0) {// to compare one string with other strings
                        // swapping
                        temp = names[i];
                        names[i] = names[j];
                        names[j] = temp;

                        newAge = age[i];
                        age[i] = age[j];
                        age[j] = newAge;

                        str = yn[i];
                        yn[i] = yn[j];
                        yn[j] = str;

                        ff = first[i];
                        first[i] = first[j];
                        first[j] = ff;

                    }
                }
            }
            for(int o = 0; o<num; o++) {
                output += first[o]+ " "+ names[o] + " " + age[o] + " " +yn[o] + "\n";
            }
            return output;
        }
    }
