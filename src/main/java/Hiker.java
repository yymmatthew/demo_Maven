/**
 * Created by YYM-M on 5/29/16.
 */
public class Hiker {
    public static String FizzAndBuzz(int data) {

        if(data%3==0 && data%5==0){
            return "...FizzBuzz...";
        }
        if(data%3==0){
            return "...Fizz...";
        }
        if (data%5==0){
            return "...Buzz...";
        }

        while(data>=3){
            if ((data%10)==3){
                return "...Fizz...";
            }
            if (data%10==5){
                return "...Buzz...";
            }
            data/=10;

        }



//        if ()
        return "";
    }
}
