package pentomino.form;

import java.io.Serializable;

/**
 * �α��� ȭ���� ������ ���� �� �����ϱ� ���� �׼� �� ��<br />
 * 
 * @author y-komori
 */
public class LoginForm implements Serializable {
    private static final long serialVersionUID = -946009213656428494L;

    private String user;

    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}