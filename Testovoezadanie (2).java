import java.util.Scanner;

public class Testovoezadanie {
    public static int calc(String input) throws Exception {
        String[] parts = input.split(" ");
        if(parts.length != 3) throw  new Exception("Invalid input");
        //
        int first = Integer.parseInt(parts[0]);
        int second = Integer.parseInt(parts[2]);

        if (first < 1 || first >  10){
            throw new Exception("Wrong first number");
        }
        if (second < 1 || second >  10){
            throw new Exception("Wrong second number");
        }

        return getAnswer(first, second, parts[1]);
    }

    private static int getAnswer(int first, int second, String operation) throws Exception {
        int answer = 0;

        switch (operation) {
            case "+" -> {
                answer = first + second;
            }
            case "-" -> {
                answer = first - second;
            }
            case "*" -> {
                answer = first * second;
            }
            case "/" -> {
                answer = first / second;
            }
            default -> {
                throw new Exception("Invalid operation");
            }
        }
        return answer;
    }


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));

    }

}
