package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    //외부에서 인스턴스를 조회할 수 있는 유일한 방법, 항상 같은 인스턴스를 반환한다
    public static SingletonService getInstance() {
        return instance;
    }

    //생성자를 private으로 선언하여 외부에서 객체 생성할 수 없게 만들기
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
