import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Di on 18.05.2017.
 */
public class Poker {
    public static void main(String[] args) {
        System.out.println("I did boolean functions!!!");
    }




    //Работает
    private static String maxCard(String[] args) {
        Pattern pat=Pattern.compile("-?\\d+");

        int maxValue=2;
        int numberInMassive=0;
        for (int i=0;i<args.length;i++){
            Matcher matcher = pat.matcher(args[i]);
            matcher.find();
            String t = matcher.group();
            int t2=Integer.parseInt(t);
            if (t2>maxValue){
                maxValue=t2;
                numberInMassive=i;
            }
        }
        return args[numberInMassive];
    }







//Работает
    private static boolean isSet(String[] args) {
        for (int i = 2; i < 14; i++) {
            int cnt = 0;
            for (int j = 0; j < args.length; j++) {
                if (args[j].indexOf(Integer.toString(i))!=-1) {
                    cnt += 1;
                }
                if (cnt==3){
                    return true;
                }
            }

        }
        return false;
    }

//Работает
    private static boolean isPair(String[] args) {
        for (int i = 2; i < 14; i++) {
            int cnt = 0;
            for (int j = 0; j < args.length; j++) {
                if (args[j].indexOf(Integer.toString(i))!=-1) {
                    cnt += 1;
                }
                if (cnt==2){
                    return true;
                }
            }

        }
        return false;
    }


//Работает
    private static boolean isKare(String[] args) {
        for (int i = 2; i < 14; i++) {
            int cnt = 0;
            for (int j = 0; j < args.length; j++) {
                if (args[j].indexOf(Integer.toString(i))!=-1) {
                    cnt += 1;
                }
                if (cnt==4){
                    return true;
                }
            }

        }
        return false;
    }



//Работает

    private static boolean isTwoPair(String[] args) {
        int amountOfPair=0;
        for (int i = 2; i < 14; i++) {
            int cnt = 0;

            for (int j = 0; j < args.length ; j++)  {
                if (args[j].indexOf(Integer.toString(i))!=-1) {
                    cnt += 1;
                }
            }
            if (cnt>=2){
                amountOfPair+=1;
            }
            if (amountOfPair==2){
                return true;
            }
        }
        return false;
    }


//Работает
    private static boolean isStrit(String[] args) {
        Pattern pat=Pattern.compile("-?\\d+");
        int minValue;
        int[] massNumbers=new int[5];
        for (int i=0;i<args.length;i++){
            Matcher matcher = pat.matcher(args[i]);
            matcher.find();
            String t = matcher.group();
            int t2=Integer.parseInt(t);
            massNumbers[i]=t2;
            }
        Arrays.sort(massNumbers);
        minValue=massNumbers[0];
        for (int i=0;i<massNumbers.length;i++){
            massNumbers[i]-=minValue;
        }
        if (Arrays.equals(new int[]{0, 1, 2, 3, 4},massNumbers)){
            return true;
        }
        return false;
    }


//Работает
    private static boolean isFullHouse(String[] args) {
        for (int i = 2; i < 14; i++) {
            int cnt = 0;
            for (int j = 0; j < args.length; j++) {
                if (args[j].indexOf(Integer.toString(i))!=-1) {
                    cnt += 1;
                }
                if (cnt==3){

                    for (int v=2; v< 14;v++){
                        int cntForPair=0;
                        for (int t=0;t<args.length;t++){
                            if (args[t].indexOf(Integer.toString(v))!=-1 && v!=i){
                                cntForPair+=1;
                            }
                        }
                        if (cntForPair==2){
                            return true;
                        }
                    }

                }
            }

        }
        return false;
    }

//Работает
    private static boolean isFlash(String[] args) {
        Pattern pat=Pattern.compile("[A-Z]+");
        String[] massMast=new String[5];
        for (int i=0;i<args.length;i++){
            Matcher matcher = pat.matcher(args[i]);
            matcher.find();
            String t = matcher.group();
            massMast[i]=t;
        }
        String tmp=massMast[0];
        if (Arrays.equals(new String[]{tmp, tmp, tmp, tmp, tmp},massMast)){
            return true;
        }
        return false;
    }

//Работает
    private static boolean isStritFlash(String[] args) {
        if (isFlash(args)==true && isStrit(args)==true){
            return true;
        } else {
            return false;
        }
    }



//Работает
    private static boolean isFlashRoyal(String[] args) {
        if (isStrit(args)==true && isFlash(args)==true && maxCard(args).indexOf("14")!=-1){
            return true;
        }else{
            return false;
        }
    }




}
