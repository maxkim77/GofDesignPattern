package Template;

public class Main {

    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();
        String result = helper.requestConnection("아이디 암호 등 접속 정보");
        System.out.println(result);
    }
}