import java.util.Scanner;
import java.util.Arrays;
public class Day04_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] diem4=new int[]{8,9,10,7,9};
        //Thao tác cơ bản
        System.out.print("Độ dài của mảng: ");
        System.out.println(diem4.length);
        System.out.print("Giá trị tại vị trí A[0]: ");
        System.out.println(diem4[0]);
        //In mảng 1 chiều cơ bản
        System.out.println("Mảng 1 chiều for: ");
        for(int i=0;i<diem4.length;i++){
            System.out.print(diem4[i] + " \t");
        }
        System.out.println("\nMảng 1 chiều for each: ");
        //In mảng 1 chiều bằng vòng lặp for each
        for(int i:diem4){
            System.out.print(i+" \t");
        }
        //In mảng 1 chiều bằng cú pháp
        System.out.println("\nMảng 1 chiều cú pháp: ");
        System.out.println(Arrays.toString(diem4));
        //Copy toàn bộ mảng
        int[] copy1=Arrays.copyOf(diem4, diem4.length);
        System.out.println("Bản copy đầy đủ "+Arrays.toString(copy1));
        //Copy 1 phần
        int[] copy2=Arrays.copyOfRange(diem4,0,3);
        System.out.println("Bản copy từ 1->3 "+Arrays.toString(copy2));
        //Sắp xếp tăng dần
        Arrays.sort(diem4);
        System.out.println("Mảng tăng dần: "+Arrays.toString(diem4));
        //Sắp xếp giảm dần
        for(int i=0;i<(diem4.length-1);i++) {
            for (int j = i+1; j < diem4.length; j++) {
                int temp = diem4[i];
                if (diem4[j] > diem4[i]) {
                    diem4[i] = diem4[j];
                    diem4[j] = temp;
                }
            }
        }
        System.out.println("Mảng giảm dần cách 1: "+Arrays.toString(diem4));
        Arrays.sort(diem4);
        int[] diem4giam=new int[diem4.length];
        for(int i=0;i<diem4.length;i++)
        {
            diem4giam[i]= diem4[(diem4.length-1-i)];
        }
        System.out.println("Mảng giảm dần cách 2: "+Arrays.toString(diem4giam));
        //Tìm kiếm 1 giá trị tương ứng trong mảng
        Arrays.sort(diem4);
        int value=9;
        int index=Arrays.binarySearch(diem4,value);
        if(index>=0)
        {
            System.out.println("Tìm thấy giá trị "+value+" tại vị trí "+index);
        }
        else
        {
            System.out.println("Ko tìm thấy gía trị "+value+" trong mảng");
        }
        //Tìm kiếm tất cả vị trí có giá trị cần tìm
        for(int i=0;i<diem4.length;i++)
        {
            if(diem4[i]==value)
                System.out.println("Tìm thấy giá trị "+value+" tại vị trí "+i);
        }
        //Gán giá trị cho mảng
        int[]arr=new int[10];
        System.out.println("Mảng arr: "+Arrays.toString(arr));
        Arrays.fill(arr,15);
        System.out.println("Mảng sau khi gán: "+Arrays.toString(arr));
        //Gán vị trí
        arr[3]=100;
        System.out.println("Mảng sau khi gán: "+Arrays.toString(arr));
        //So sánh 2 mảng
        int[]arr1={1,2,3};
        int[]arr2={1,2,3};
        int[]arr3={1,2,4};
        System.out.println("arr1 và arr2 có giống nhau ko? "+Arrays.equals(arr1,arr2));
        System.out.println("arr1 và arr3 có giống nhau ko? "+Arrays.equals(arr1,arr3));
    }
}
