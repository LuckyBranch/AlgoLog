import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        int N = sc.nextInt(); // 명령어의 수 N
        sc.nextLine(); // 버퍼 비우기
        
        for (int i = 0; i < N; i++) {
            String command = sc.nextLine(); // 명령어 입력
            
            if (command.startsWith("push")) {
                int X = Integer.parseInt(command.split(" ")[1]);
                stack.push(X);
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            } else if (command.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
