package chat.auth;

public interface AuthService {
    void start();
    void stop();

    String getNickByLoginPass(String login, String password);

    boolean isExist(String nickname, String login, String password);
}
