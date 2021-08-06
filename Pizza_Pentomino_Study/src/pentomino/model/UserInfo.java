package pentomino.model;

import java.io.Serializable;

/**
 * �α��� ���� ������� ������ ���� �� �����ϱ� ���� Ŭ����<br />
 * 
 * @author y-komori
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -995968529508654626L;

    // ����� ���̵�
    private String userName;

    /**
     * ����� ���̵� ����Ѵ�. <br />
     * 
     * @return ����� ���̵�
     */
    public String getUserName() {
        return userName;
    }

    /**
     * ����� ���̵� �����Ѵ�.<br />
     * 
     * @param userName ����� ���̵�
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
