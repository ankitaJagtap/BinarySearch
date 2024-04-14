/**
 * ArrangingCoins
 */
public class ArrangingCoins {

    public static int arrangeCoins(int n) {
        int count = 0;
        int i = 1;
        while(n > 0){
            if(i<=n){
                count++;
                n = n - i;
                i++;
            }else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
}