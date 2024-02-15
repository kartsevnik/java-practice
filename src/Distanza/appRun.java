package Distanza;

//Сравнить с расстоянием по прямой на сайте
//http://www.distanzekm.com/distanza-milano-e-firenze

public class appRun {

    public static void main(String[] args) {
        double milanLat = Math.toRadians(45.4773);
        double milanLon = Math.toRadians(9.1815);
        double nyLat = Math.toRadians(40.7143528);
        double nyLon = Math.toRadians(-74.0059731);
        double distMilanNYLong = nyLon-milanLon;
        double R = 6371000;
        double d = Math.acos(Math.sin(milanLat) * Math.sin(nyLat) +
                Math.cos(milanLat) * Math.cos(nyLat) *
                        Math.cos(distMilanNYLong) ) * R;
        double distKm = d /1000;
        System.out.print(distKm);
    }

}
