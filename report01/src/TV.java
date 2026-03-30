public class TV {
    String brand;   //회사
    int year;       //연도
    int size;       //크기
    String type;    // 종휴

    TV(String brand, int year,int size,String type) {
        this.brand = brand;
        this.year = year;
        this.size = size;
        this.type = type;
    }

    void show(){
        System.out.println("우리집 TV는" + "에서 만든"
            +year +"년형" +size +"인치" +type + "입니다.");
    }
}
