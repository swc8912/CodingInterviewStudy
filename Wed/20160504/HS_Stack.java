import java.io.*

public class HS_Stack {
	public static int MAX = 100;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new inputStreamReader(System.in));
		Object[] st = new Object[MAX];
		int index = 0;
		String input = br.readLine();
		StringTokenizer token = new StringTokenizer(input);
		for(int i=0; i<Integer.parseInt(input); i++) {
			input = br.readLine();
			token = new StringTokenizer(input);
			String op = token.nextToken();
			int value = 0;
			if(token.hasNextToken()) {
				value = Integer.parseInt(token.nextToken());
			}
			if(op.equals("push")) {
				st[index++] = value;
			} else if(op.equals("pop")) {
				index--;
			} else if(op.equals("view")) {
				for(int j=0; j<=index; j++) {
					System.out.println(st[j] + " ");
				}
			}
		}
	}
}