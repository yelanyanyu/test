import java.util.Scanner;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        reverse(str, start, end);
//        char[] strings = str.toCharArray();
//        for (int i = start; i <= (end+start/2); i++) {
//            if(strings[i]<strings[start+end-i+1]){
//                char temp=strings[i];
//                strings[i]= strings[start+end-i+1];
//                strings[start+end-i+1]=temp;
//            }
//        }
//        System.out.println(strings);
    }

    public static void reverse(String s, int start, int end) {
        char[] chars = s.toCharArray();
//        int len = end - start + 1;
        int i = start;
        int j = end;
//        for (int i = start; i <=(start+end)/2 ; i++) {
//            char temp =chars[i];
//            chars[i]=chars[len+i-1];
//            chars[len +i-1]=temp;
//        }

        while (i <= j) {
            char temp = chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
        System.out.println(chars);
    }
}
