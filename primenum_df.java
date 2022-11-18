import java.io.*;
import java.util.*;

public class primenum_df {
    public static int prime_num(int number){
        
        return 0;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        int P = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 2; i < P; i++){
            if(P % i == 0){
                answer = prime_num(i);
            }
        }
    }
}
