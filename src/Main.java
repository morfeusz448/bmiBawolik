import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        float wzrostBawolik, wagaNumberBawolik, bmiBawolik;

        System.out.println("Podaj wzrost");
        BufferedReader nrbawolik1 = new BufferedReader(new InputStreamReader(System.in));
        wzrostBawolik = Float.parseFloat(nrbawolik1.readLine());
        System.out.println("Podaj wagę");
        BufferedReader nrbawolik2 = new BufferedReader(new InputStreamReader(System.in));
        wagaNumberBawolik = Float.parseFloat(nrbawolik2.readLine());
        bmiBawolik = wagaNumberBawolik / (float) Math.pow(wzrostBawolik , 2);

        System.out.println(bmiBawolik);






    }
}
