package Day22_Java_Methods;

public class ReplitMeyhod13_minCostClimbingStairs {

    public static int minCostClimbingStairs(int[] arr){
        int costTotal=0;
        int minCost= 0;
        for (int i=0; i<arr.length-3;i++)
        {
            if(arr[i]+arr[i+1] < arr[i]+arr[i+2]) minCost=arr[i]+arr[i+1];
            if(minCost>arr[i+1]+arr[i+2]) minCost = arr[i+1]+arr[i+2];
            if(minCost > arr[i+1]+arr[i+3])    minCost = arr[i+1]+arr[i+3];

            costTotal+=minCost;
        }
        return costTotal;
    }

    public static int minCostClimbingStairsAT(int[] cost){

        int sum = 0;

        if (cost.length < 3)
            return Math.min(cost[0],cost[1]);
        else if (cost.length < 4)
            return Math.min(cost[0]+cost[2], cost[1]);
        else{
            sum = Math.min(cost[0], cost[1]);
            for (int i=1; i<cost.length-2; i++)
                if (cost[i+1] < cost[i+2]) {
                    sum += cost[i+1];
                }else{
                    sum += cost[i+2];
                    i++;
                }
        }
        return sum;

    }

    public static void main(String[] args) {
        /*
        minCostClimbingStairs adinda method olustur...
        Parametresi    int array'dir.
        Return tipi  int olmalıdır.

        Bir merdivende, i'inci adımda bazı negatif olmayan maliyet, cost[i] atanır (0 indeksli).
        Maliyeti ödediğinizde, bir veya iki adım tırmanabilirsiniz.
        Zeminin tepesine ulaşmak için minimum maliyeti bulmanız gerekir ve dizin 0 ile adımdan veya dizin 1 ile adımdan başlayabilirsiniz.
        Örnek 1:
        Girdi: cost = [10, 15, 20]
        Çıktı: 15
        Açıklama:  En ucuz  cost [1] 'de başlar, bu maliyeti öde ve en üste git.

        Örnek  2:
        Girdi: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
        Çıktı: 6
        Açıklama:  En ucuz  cost[0] 'da başlar ve 1 numaralı adımda  cost[3]' ü atlar.

        Not:
        maliyetin [2, 1000] aralığında bir uzunluğu olacaktır.
        Her maliyet [i], [0, 999] aralığında bir tamsayı olacaktır.
        */

        int[] arrNum = {1,2,3,4,5,6,7,8,9};
        //int[] arrNum = {10,15,20};

        System.out.println(minCostClimbingStairs(arrNum));
        System.out.println(minCostClimbingStairsAT(arrNum));

    }
}
