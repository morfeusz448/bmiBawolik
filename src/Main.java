import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        float wzrostBawolik, wagaNumberBawolik, bmiBawolik;

        System.out.println("Podaj wzrost w cm");
        BufferedReader nrbawolik1 = new BufferedReader(new InputStreamReader(System.in));
        wzrostBawolik = Float.parseFloat(nrbawolik1.readLine());
        wzrostBawolik = wzrostBawolik / 100;
        System.out.println("Podaj wagę");
        BufferedReader nrbawolik2 = new BufferedReader(new InputStreamReader(System.in));
        wagaNumberBawolik = Float.parseFloat(nrbawolik2.readLine());
        bmiBawolik = wagaNumberBawolik / (float) Math.pow(wzrostBawolik, 2);

        if (bmiBawolik > 16)
        {
            System.out.println("<16 wychudzenie");
        } else if (16.00 >= bmiBawolik && bmiBawolik <= 16.99)
        {
            System.out.println("17.00 >= niedowaga <= 17.99");
        } else if (17.00 >= bmiBawolik && bmiBawolik <= 17.99)
        {
            System.out.println("");
    }

        System.out.println(bmiBawolik);






    }
}
