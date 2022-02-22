package codeWar;

//Your task in order to complete this Kata is to write a function which formats a duration, given as a number of seconds, in a human-friendly way.
//
//The function must accept a non-negative integer. If it is zero, it just returns "now". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.
public class TimeFormatter {
    public static String formatDuration(int seconds){
        String finalString = "";
        int numberOfSeconds = seconds % 60;
        int convertToMinutes = seconds / 60;
        int numberOMinutes =  convertToMinutes % 60;
        int  convertToHours =  convertToMinutes / 60;
        int numberOfHours =  convertToHours % 24;
        int  convertToDays = convertToHours / 24;
        int numberOfDays = convertToDays % 365;
        int numberOfYears = convertToDays / 365;






        if (seconds == 0){
            finalString = "now";
        }
        else if (seconds < 60){
            if (numberOfSeconds < 2){
                finalString = String.format("%d second",numberOfSeconds);
            }
            else if (numberOfSeconds > 1 && numberOfSeconds < 60){
                finalString = String.format("%d seconds",numberOfSeconds);
            }

        }
        else if (seconds == 120){
            finalString = String.format("%d minutes",numberOMinutes);
        }
        else if (seconds > 60 && seconds < 3600){
            if (numberOMinutes < 2){
                finalString = String.format("%d minute and %d seconds",numberOMinutes,numberOfSeconds);
            }
            else if (numberOMinutes > 1){
                finalString = String.format("%d minutes and %d seconds",numberOMinutes,numberOfSeconds);
            }

        }
        else if (seconds == 3600){
            finalString = String.format("%d hour",numberOfHours);
        }
        else if (seconds > 3600 && seconds < 86400){
            if (numberOfHours == 1 && numberOMinutes ==1 && numberOfSeconds ==1){
                finalString = String.format("%d hour, %d minute and %d second",numberOfHours,numberOMinutes,numberOfSeconds);
            }

            else if (numberOfHours == 1 && numberOMinutes > 1 && numberOfSeconds >1){
                finalString = String.format("%d hour, %d minutes and %d seconds",numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfHours == 1 && numberOMinutes == 1 && numberOfSeconds >1){
                finalString = String.format("%d hour, %d minute and %d seconds",numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfHours > 1 && numberOMinutes == 1 && numberOfSeconds == 1){
                finalString = String.format("%d hours, %d minute and %d second",numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfHours > 1 && numberOMinutes > 1 && numberOfSeconds >1){
                finalString = String.format("%d hours, %d minutes and %d seconds",numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfHours == 1 && numberOMinutes == 1 ){
                finalString = String.format("%d hour and %d minute ",numberOfHours,numberOMinutes);
            }
            else if (numberOfHours == 1 && numberOMinutes > 1 ){
                finalString = String.format("%d hour and %d minutes ",numberOfHours,numberOMinutes);
            }
            else if (numberOfHours > 1 && numberOMinutes > 1 ){
                finalString = String.format("%d hours and %d minutes ",numberOfHours,numberOMinutes);
            }
            else if (numberOfHours == 1 && numberOfSeconds == 1){
                finalString = String.format("%d hour and %d second",numberOfHours,numberOfSeconds);
            }
            else if (numberOfHours == 1 && numberOfSeconds > 1){
                finalString = String.format("%d hour and %d seconds",numberOfHours,numberOfSeconds);
            }
            else if (numberOfHours > 1 && numberOfSeconds == 1){
                finalString = String.format("%d hours and %d second",numberOfHours,numberOfSeconds);
            }

        }
        else if (seconds == 86400){
            finalString = String.format("%d day",numberOfDays);
        }
        else if (seconds > 86400 && seconds < 31536000){
            if (numberOfDays == 1 && numberOfHours ==1 && numberOMinutes ==1 && numberOfSeconds ==1){
                finalString = String.format("%d day, %d hour, %d minute and %d second",numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfDays == 1 && numberOfHours > 1 && numberOMinutes > 1 && numberOfSeconds > 1){
                finalString = String.format("%d day, %d hours, %d minutes and %d seconds",numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfDays > 1 && numberOfHours == 1 && numberOMinutes == 1 && numberOfSeconds == 1){
                finalString = String.format("%d days, %d hour, %d minute and %d second",numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfDays > 1 && numberOfHours == 1 && numberOMinutes > 1 && numberOfSeconds > 1){
                finalString = String.format("%d days, %d hour, %d minutes and %d seconds",numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfDays > 1 && numberOfHours > 1 && numberOMinutes == 1 && numberOfSeconds > 1){
                finalString = String.format("%d days, %d hours, %d minute and %d seconds",numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfDays > 1 && numberOfHours > 1 && numberOMinutes > 1 && numberOfSeconds > 1){
                finalString = String.format("%d days, %d hours, %d minutes and %d seconds",numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfDays > 1 && numberOfHours > 1 && numberOMinutes > 1 && numberOfSeconds == 1){
                finalString = String.format("%d days, %d hours, %d minutes and %d second",numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfDays > 1 && numberOMinutes > 1 && numberOfSeconds == 1){
                finalString = String.format("%d days, %d minutes and %d second",numberOfDays,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfDays > 1 && numberOMinutes > 1 && numberOfSeconds >1){
                finalString = String.format("%d days, %d minutes and %d seconds",numberOfDays,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfDays > 1 && numberOMinutes > 1 && numberOfSeconds > 1){
                finalString = String.format("%d days, %d minutes and %d seconds",numberOfDays,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfDays > 1 && numberOfHours > 1 && numberOfSeconds > 1){
                finalString = String.format("%d days, %d hours and %d seconds",numberOfDays,numberOfHours,numberOfSeconds);
            }
            else if (numberOfDays == 1 && numberOfHours == 1 && numberOMinutes == 1 ){
                finalString = String.format("%d day, %d hour and %d minute",numberOfDays,numberOfHours,numberOMinutes);
            }
            else if (numberOfDays == 1 && numberOfHours == 1 && numberOMinutes > 1 ){
                finalString = String.format("%d day, %d hour and %d minutes",numberOfDays,numberOfHours,numberOMinutes);
            }
            else if (numberOfDays == 1 && numberOfHours > 1 && numberOMinutes == 1 ){
                finalString = String.format("%d day, %d hours and %d minute",numberOfDays,numberOfHours,numberOMinutes);
            }
            else if (numberOfDays > 1 && numberOfHours > 1 && numberOMinutes > 1 ){
                finalString = String.format("%d days, %d hours and %d minutes",numberOfDays,numberOfHours,numberOMinutes);
            }
            else if (numberOfDays > 1 && numberOfHours == 1 && numberOMinutes > 1 ){
                finalString = String.format("%d days, %d hour and %d minutes",numberOfDays,numberOfHours,numberOMinutes);
            }
            else if (numberOfDays > 1 && numberOfSeconds > 1 ){
                finalString = String.format("%d days and %d seconds",numberOfDays,numberOfSeconds);
            }
        }

        else if (seconds == 31536000){
            finalString = String.format("%d year",numberOfYears);
        }
        else if (seconds > 31536000){
            if (numberOfYears ==1 && numberOfDays == 1 && numberOfHours ==1 && numberOMinutes ==1 && numberOfSeconds ==1){
                finalString = String.format("%d year ,%d day, %d hour, %d minute and %d second",numberOfYears,numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfYears ==1 && numberOfDays > 1 && numberOfHours > 1 && numberOMinutes > 1 && numberOfSeconds > 1){
                finalString = String.format("%d year, %d days, %d hours, %d minutes and %d seconds",numberOfYears,numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfYears > 1 && numberOfDays == 1 && numberOfHours == 1 && numberOMinutes == 1 && numberOfSeconds == 1){
                finalString = String.format("%d years, %d day, %d hour, %d minute and %d second",numberOfYears,numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfYears > 1 && numberOfDays > 1 && numberOfHours > 1 && numberOMinutes > 1 && numberOfSeconds > 1){
                finalString = String.format("%d years, %d days, %d hours, %d minutes and %d seconds",numberOfYears,numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfYears > 1 && numberOfDays > 1 && numberOfHours > 1 && numberOMinutes > 1 && numberOfSeconds == 1){
                finalString = String.format("%d years, %d days, %d hours, %d minutes and %d second",numberOfYears,numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfYears > 1 && numberOfDays > 1 && numberOfHours == 1 && numberOMinutes > 1 && numberOfSeconds == 1){
                finalString = String.format("%d years, %d days, %d hour, %d minutes and %d second",numberOfYears,numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfYears > 1 && numberOfDays > 1 && numberOfHours == 1 && numberOMinutes > 1 && numberOfSeconds > 1){
                finalString = String.format("%d years, %d days, %d hour, %d minutes and %d seconds",numberOfYears,numberOfDays,numberOfHours,numberOMinutes,numberOfSeconds);
            }
            else if (numberOfYears > 1 && numberOfDays > 1 && numberOfHours > 1 && numberOMinutes > 1){
                finalString = String.format("%d years, %d days, %d hours and %d minutes",numberOfYears,numberOfDays,numberOfHours,numberOMinutes);
            }
        }



        return finalString;
    }
}
