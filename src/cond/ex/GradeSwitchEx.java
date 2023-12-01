package cond.ex;

public class GradeSwitchEx {

    public static void main(String[] args) {
        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("탁월");
                break;
            case "B":
                System.out.println("좋음");
                break;
            case "C":
                System.out.println("준수");
                break;
            case "D":
                System.out.println("향상");
                break;
            case "F":
                System.out.println("불합격");
                break;
            default:
                System.out.println("잘못됨");
        }
    }
}
