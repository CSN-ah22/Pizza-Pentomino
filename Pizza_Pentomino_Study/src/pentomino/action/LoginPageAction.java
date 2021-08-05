package pentomino.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pentomino.form.LoginForm;

/**
 * 로그인 처리를 위한 액션입니다.<br />
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

        // 폼에서 파라미터를 꺼낸다
        LoginForm loginForm = new LoginForm();
        String user = loginForm.getUser();
        String password = loginForm.getPassword();

        // 아이디와 패스워드가 맞는지 체크
        /* 로그인 로직 구현후 주석 해제
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
