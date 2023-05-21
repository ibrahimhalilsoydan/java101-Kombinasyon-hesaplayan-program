import java.util.Scanner;
public class FaktoriyelAl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, rFaktoriyel=1, nFaktoriyel =1, c, n_rFactoriyel=1;

        System.out.print("(N)Birinci Sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("(R)ikinci Sayıyı giriniz: ");
        r = input.nextInt();


        for (int i=1 ;i<=n;i++) {

            nFaktoriyel *=i;

        }
        System.out.println("Birinci sayı(N) : " + n + "!" + " = " + nFaktoriyel);

        for (int i=1 ;i<=r;i++){

            rFaktoriyel *= i;
        }

        System.out.println("ikinci sayı(R) : " + r + "!" + " = " + rFaktoriyel);


        for (int i=1;i<=(n-r);i++){

            n_rFactoriyel *= i;
        }
        System.out.println("Birinci sayı - ikinci sayı (N-R)! :" + (n-r) + "!" + "=" + n_rFactoriyel);

        System.out.print("C(n,r) = n!/(r!(n-r)!) kombinasyonu sonucu :"  );
        c =nFaktoriyel/(rFaktoriyel*n_rFactoriyel);

        System.out.print(c);
    }

}