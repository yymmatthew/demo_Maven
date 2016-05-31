/**
 * Created by YYM-M on 5/29/16.
 */
public class Tennis {
    public static String score(int score_PlayA, int score_PlayB) {
        String [] scores={"Love","Fifteen","Thirty","Fourty"};
        if (score_PlayA==score_PlayB){
            if(score_PlayA >=3){
                return "Deuce";
            }
            return scores[score_PlayA]+" All";
        }
        if (score_PlayA <=3 && score_PlayB<=3){
            return scores[score_PlayA]+" "+scores[score_PlayB];
        }
        if((score_PlayA >3 && score_PlayA-score_PlayB>=2)||(score_PlayB>3 && score_PlayB-score_PlayA>=2)){
            if (score_PlayA>score_PlayB)
                return "A win";
            else
                return "B win";
        }
        if((score_PlayA >3 && score_PlayA-score_PlayB==1 )|| (score_PlayB>3 && score_PlayB-score_PlayA==1)){
           if(score_PlayA>score_PlayB)
                return "A Advantage";
           else
                return "B Advantage";
        }

        return "";
    }
}
