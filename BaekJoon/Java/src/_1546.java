import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class _1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int num = 0;
        int M = 0;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());
            sum += num;
            M = Math.max(M, num);
        }

        bw.write(String.valueOf(sum * 100.0 / N / M));
        bw.flush();
        bw.close();
    }
}
