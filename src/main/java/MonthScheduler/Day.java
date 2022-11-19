package MonthScheduler;

public class Day {
    private String work;    // 할 일

    public void setWork(String work) {  // 할 일 설정
        this.work = work;
    }
    public String getWork() {
        return work;
    }

    public void show() {
        if(work == null)    // 할 일이 없으면
            System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}
