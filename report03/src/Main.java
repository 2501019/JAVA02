//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Date birth = new Date(2003, 5, 10);   // 본인 생일
        Date today = new Date(2025, 2, 29);   // 잘못된 날짜

        System.out.println("생년월일: " + birth);
        System.out.println("오늘 날짜: " + today);
    }
}