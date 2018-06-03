package dataProgect;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class HelloWorld {

    private static final Logger log = Logger.getLogger(HelloWorld.class);

    private static int getDateHours () {
        log.info("============== > metod: getDateHours ==> time");
        return new Date().getHours();
    }

    public static String getLocation(){
        if (Locale.getDefault().getDisplayLanguage().equals("русский")) {
            log.info("============== > metod: getLocation ==> русский");
            return "русский";
        } else if (Locale.getDefault().getDisplayLanguage().equals("українська")) {
            log.info("============== > metod: getLocation ==> українська");
            return "українська";
        } else if (Locale.getDefault().getDisplayLanguage().equals("English")) {
            log.info("============== > metod: getLocation ==> English");
            return "English";
        }
        log.error("============== > metod: getLocation ==> not found location !!!!!!");
        return "not found";
    }

    public static ArrayList<String> locationText(String s){
        ArrayList<String> licalList = new ArrayList<String>(4);
        if (s.equalsIgnoreCase("English")){
            licalList.add("Good morning, World!");
            licalList.add("Good day, World!");
            licalList.add("Good evening, World!");
            licalList.add("Good night, World!");
            log.info("============== > metod: locationText ==> English");
        }
        if (s.equalsIgnoreCase("русский")){
            licalList.add("Доброе утро, Мир!");
            licalList.add("Добрый день, Мир!");
            licalList.add("Добрый вечер, Мир!");
            licalList.add("Доброй ночи, Мир!");
            log.info("============== > metod: locationText ==> русский");
        }
        if (s.equalsIgnoreCase("українська")){
            licalList.add("Доброго ранку, Світ!");
            licalList.add("Добрий день, Світ!");
            licalList.add("Добрий вечір, Світ!");
            licalList.add("Доброї ночі, Світ!");
            log.info("============== > metod: locationText ==> українська");
        }
        if (licalList.size() == 0){
            log.error("============== > metod: locationText ==> null List");
        }
        return licalList;
    }

    public static String sayHello(int  hours, ArrayList<String> licalList){

        if (hours >= 6 && hours < 9) {
            log.info("============== > metod: sayHello ==> 06:00 - 09:00");
            return (licalList.get(0)); //06:00 - 09:00
        }

        if (hours >= 9 && hours < 19) {
            log.info("============== > metod: sayHello ==> 09:00 - 19:00");
            return (licalList.get(1)); //09:00 - 19:00
        }

        if (hours >= 19 && hours < 23) {
            log.info("============== > metod: sayHello ==> 19:00 - 23:00");
            return (licalList.get(2)); //19:00 - 23:00
        }

        if (hours >= 23 && hours < 6) {
            log.info("============== > metod: sayHello ==> 23:00 - 06:00");
            return (licalList.get(3)); //23:00 - 06:00
        }
        log.error("============== > metod: sayHello ==> null !!!!!!!!");
        return null;
    }


    public static void main(String args[]) {

        String location = getLocation();

        ArrayList<String> locatonText = locationText(location);

        int hours = getDateHours();

        System.out.println(sayHello(hours, locatonText));


    }
}
