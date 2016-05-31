import java.util.ArrayList;
import java.util.List;

/**
 * Created by YYM-M on 5/29/16.
 */
public class primateNumber {
    public static List clc(int data) {
        List result=new ArrayList();
        for(int codiations=2;codiations<data;codiations++){
            while(data % codiations ==0 && data > codiations) {
                result.add(codiations);
                data/= codiations;
            }
        }
        result.add(data);
        return result;
    }
}
