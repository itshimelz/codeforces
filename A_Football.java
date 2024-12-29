import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class FastInput {
    private BufferedReader br;
    private StringTokenizer st;

    public FastInput() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    public String nextLine() throws IOException {
        if (st == null || !st.hasMoreTokens()) {
            return br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken());
            if (st.hasMoreTokens()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

class FastOutput {
    private PrintWriter pw;

    public FastOutput() {
        pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    }

    public void print(String s) {
        pw.print(s);
    }

    public void println(String s) {
        pw.println(s);
    }

    public void flush() {
        pw.flush();
    }
}

public class A_Football {
    public static void main(String[] args) throws IOException {
        FastInput in = new FastInput();
        FastOutput out = new FastOutput();

        // Reading a full line of input
        String x = in.nextLine();
        
        // Printing the full line of input
        out.println(x);
        out.flush();
    }
}
