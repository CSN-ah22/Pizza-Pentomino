package pentomino.logic;

/**
 * �α��� ó���� ���� ����Ͻ� ����<br />
 * 
 * @author y-komori
 */
public class LoginLogic {
    /**
     * �α��� ���θ� üũ�Ѵ�.<br />
     * 
     * @param user ���̵�
     * @param password �н�����
     * @return �α��� OK�� ���,<code>true</code>
     */
    public boolean loginCheck(final String user, final String password) {
        // �н����尡��webtext���̸� �α����� �㰡�Ѵ�
        if ("webtext".equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
