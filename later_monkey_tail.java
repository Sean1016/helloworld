import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class later_monkey_tail {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int big_num = 0, small_num = 0;
        if(num1 > num2){
            big_num = num1;
            small_num = num2;
        }else{
            big_num = num2;
            small_num = num1;
        }

        int n = 0;
        while(small_num < big_num){
            small_num += 4;
            n++;
        }
    }
}
