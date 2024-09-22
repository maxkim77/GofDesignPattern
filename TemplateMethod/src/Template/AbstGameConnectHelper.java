package Template;

public abstract class AbstGameConnectHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    public String requestConnection(String encodedInfo) {
        // 보안작업 - > 암호화된 문자열을 복호
        String decodedInfo = doSecurity(encodedInfo);

        // 반환된 것을 가지고 아이디, 암호를 할당한다.
        String id = "aaa"; // 실제로 decodedInfo를 분해해서 id와 password를 추출하는 과정 필요
        String password = "bbb";

        // 아이디와 암호 확인
        if (!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }

        String userName = "userName"; // 실제로는 decodedInfo나 다른 방식으로 얻어야 할 값
        int i = authorization(userName);

        switch (i) {
            case -1:
                throw new Error("셧다운 상태입니다.");
            case 0:
                System.out.println("무료회원입니다.");
                break;
            case 1:
                System.out.println("유료회원입니다.");
                break;
            case 2:
                System.out.println("게임마스터입니다.");
                break;
            case 3:
                throw new Error("접속 권한이 없습니다.");
            default:
                break;
        }

        // 마지막 접속 단계 처리
        return connection(decodedInfo);
    }
}
