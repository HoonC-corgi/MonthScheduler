package MonthScheduler;

import java.util.Scanner;

public class MonthSchedule {
    private int nDays;  // 일 수
    private Day [] days;
    private Scanner scanner;

    MonthSchedule(int nDays) {  // 생성자
        this.nDays = nDays;
        this.days = new Day[nDays];     // nDays 만큼 배열이 생김
        for(int i=0; i<nDays; i++) {
            days[i] = new Day();    // 객체 생성
        }
        scanner = new Scanner(System.in);
    }

    private void input() {
        System.out.print("날짜(1~" + nDays + "30)?");
        int day = scanner.nextInt();
        System.out.print("할 일(빈 칸 없이 입력)?");
        String inputwork = scanner.next();
        day--;  // 배열 인덱스 0부터
        if(day<0 || day >= nDays) {
            System.out.println("날짜가 잘못되었습니다.");
            return;
        }
        days[day].setWork(inputwork);
    }

    private void view() {
        System.out.print("날짜(1~30)?");
        int day = scanner.nextInt();
        if(day<0 || day >= nDays) {
            System.out.println("날짜가 잘못 되었습니다.");
            return;
        }
        System.out.print((day+1)+"의 할 일은 ");
        days[day].show();
    }

    private void finish() {
        scanner.close();
        System.out.println("종료합니다.");
    }

    public void run() {
        System.out.println("이번달 스케줄 관리 프로그램.");
        while(true) {
            System.out.print("할 일(입력: 1, 보기: 2, 끝내기: 3) >> ");
            int input = scanner.nextInt();

            switch(input) {
                case 1:
                    input();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    finish();
                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");
                    break;
            }
        }
    }
}
