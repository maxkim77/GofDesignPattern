package Template;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드 작업 수행");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인 과정");
        // 실제로는 id와 password를 확인하는 로직 필요
        return true; // 인증 성공 가정
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인 과정");
        // 실제로는 userName에 따라 권한을 확인하는 로직 필요
        return 0; // 무료회원 가정
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계 처리 완료");
        return "접속 성공: " + info;
    }

}
