import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("_____HAVLAYAN KOPUS_____");
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2 ));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
        System.out.println("_____YAS TESPITI_____");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("_____OYUNCU KEDI_____");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("_____ALAN HESAPLAMA_____");
    }
    public static boolean shouldWakeUp (boolean isHav, int clock ) {
        if (clock <0 || clock>23) return false;
        if (!isHav) return false;
        return clock <8 || clock>=20;
    }
    public static boolean hasTeen (int age1, int age2, int age3){
        return age1 > 13 && age1 <= 19 || age2 > 13 && age2 <= 19 || age3 > 13 && age3 <= 19;
    }
    public static boolean isCatPlaying (boolean isSummer, int temperature) {
        if (!isSummer) return temperature >= 25 && temperature <= 35;
        else return temperature >= 25 && temperature <= 45;
    }
    public static


}