package algorithm;

public class RadixSort
{
    public static void sort(int[] number, int d) //d表示最大的数有多少位
    {
        int k = 0;
        int n = 1;
        int m = 1; //控制键值排序依据在哪一位
        int [][] temp = new int[10][number.length]; //数组的第一维表示可能的余数0-9
        int [] order = new int[10]; //数组orderp[i]用来表示该位是i的数的个数
        while(m <= d)
        {
        	//分发
            for(int i = 0; i < number.length; i++)
            { 
                int lsd = ((number[i] / n) % 10);
                temp[lsd][order[lsd]] = number[i];
                order[lsd]++;
            }
            //回收
            for(int i = 0; i < 10; i++)
            {
                if(order[i] != 0)
                    for(int j = 0; j < order[i]; j++)
                    {
                        number[k] = temp[i][j];
                        k++;
                    }
                order[i] = 0;
            }
            n *= 10;
            k = 0;
            m++;
        }
    }
    public static void main(String[] args)
    {
        int [] data =
        {
        		73, 22, 93, 43, 55, 14, 28, 65, 39, 81, 33, 100
		};
        RadixSort.sort(data, 3);
        for(int i = 0; i < data.length; i++)
        {
            System.out.print(data[i] + "");
        }
    }
    //折半查找
    public static int binarySearch(Integer[] srcArray, int des) {
        int low = 0;
        int high = srcArray.length - 1;
     
        while ((low <= high) && (low <= srcArray.length - 1)
                && (high <= srcArray.length - 1)) {
            int middle = low + ((high - low) >> 1);
            if (des == srcArray[middle]) {
                return middle;
            } else if (des < srcArray[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
