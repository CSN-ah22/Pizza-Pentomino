package pentomino.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pentomino.form.LoginForm;

/**
 * �α��� ó���� ���� �׼��Դϴ�.<br />
 * 
 * @author y-komori
 */
public class LoginPageAction {

    /* (non-Javadoc)
     * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    public String ActionForward(
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        // ������ �Ķ���͸� ������
        LoginForm loginForm = new LoginForm();
        String user = loginForm.getUser();
        String password = loginForm.getPassword();

        // ���̵�� �н����尡 �´��� üũ
        /* �α��� ���� ������ �ּ� ����
        LoginLogic loginLogic = new LoginLogic();
        String result;
        if (loginLogic.loginCheck(user, password)) {
            HttpSession session = request.getSession();
            UserInfo userInfoBean = new UserInfo();
            userInfoBean.setUserName(user);
            session.setAttribute(Constants.USER_INFO_SESSION_KEY, userInfoBean);
            result = "success";
        } else {
            result = "fail";
        }
         */
        return "" ;
    }
}
