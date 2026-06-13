public class FootballMatchReports {    
    public static String onField(int shirtNum) {
       String val;
        switch (shirtNum) {
            case 1:
                val = "goalie";
                break;
            case 2:
                val = "left back";
                break;

            case 3:
            case 4:
                val = "center back";
                break;
            case 5:
                val = "right back";
                break;
             case 6:
            case 7:
            case 8:
                val = "midfielder";
                break;
            case 9:
                val = "left wing";
                 break;
            case 10:
                val = "striker";
                break;
            case 11:
                val = "right wing";
                break;
            default:
                val = "invalid";
        }

        return val;
    }
}
