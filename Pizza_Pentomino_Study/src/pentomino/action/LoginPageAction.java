package pentomino.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import pentomino.form.LoginForm;
import pentomino.logic.LoginLogic;
import pentomino.model.UserInfo;

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

    	String id = request.getParameter("user");
    	String pwd = request.getParameter("password");
    	LoginForm loginForm = new LoginForm();
    	loginForm.setUser(id);
    	loginForm.setPassword(pwd);
        // 폼에서 파라미터를 꺼낸다
        
        String user = loginForm.getUser();
        String password = loginForm.getPassword();
        
        System.out.println("LoginPageAction의 user: "+user);
        System.out.println("LoginPageAction의 password: "+password);
        // 아이디와 패스워드가 맞는지 체크
       
        LoginLogic loginLogic = new LoginLogic();
        String result;
        if (loginLogic.loginCheck(user, password)) {
            HttpSession session = request.getSession();
            UserInfo userInfoBean = new UserInfo();
            userInfoBean.setUserName(user);
            session.setAttribute("USER_INFO_SESSION_KEY", userInfoBean);
            result = "success";
        } else {
            result = "fail";
        }
        
        return result ;
    }
}
