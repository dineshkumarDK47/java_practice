// ---------------> time <--------------

// import java.util.*;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;
// import java.util.Date;
// public class virtusa8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          String time1str = sc.nextLine();
//          String time2str = sc.nextLine();
        
//          try {
//             SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
//             Date time1 = format.parse(time1str);
//             Date time2 = format.parse(time2str);
//             long diff = (time2.getTime() - time1.getTime())/1000;
//             System.out.println(diff);
//          } catch (ParseException e) {
//             // TODO: handle exception
//             System.out.println("invalid time format");
//          }
         

//         }  
// }


// ----> date <--------------------------------

/**
 * virtusa8
 */
import java.util.*;
import java.util.Date;

import org.junit.internal.requests.ClassRequest;

import java.text.SimpleDateFormat;

import java.text.ParseException;
public class virtusa8 {

    public static void main(String[] args) {
        String datestr = "04-03-2002";
        boolean check = checkdate(datestr);
        if (check==true) {
            System.out.println("valid date");
        }else{
            System.out.println("not valid");
        }
    }

    static boolean checkdate(String datestr){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
        format.setLenient(false);
        try {
            Date date = format.parse(datestr);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH)+1;
            int day = cal.get(Calendar.DAY_OF_MONTH);
            if (year<1|| month<1 || month>12 || day<1) {
                return false;
            }
            int daysinmonth = cal.get(Calendar.DAY_OF_MONTH);
            if (day>daysinmonth) {
                return false;
            }
            return true;
        } catch (ParseException e) {
            // TODO: handle exception
            return false;
        }
    }

}