# Pizza-Pentomino
- <프로가 되기 위한 웹기술 인문> 이란 책에서 나오는 간단한 피자 사이트를 실습합니다
- 원래는 Struts 프레임워크 를 사용해 완성 하는것이지만, 요새 사용되는 경우가 적다고 하여 jsp와 java.class 로만 만들어 봤습니다
---
- 로그인 구성은 이렇습니다
- LoginPageAction.java - 로그인 처리를 위해 유효성 검사후 세션으로 바인딩 합니다
- LoginForm.java - 로그인 화면의 정보를 보관 및 유지하기 위한 액션 폼 빈입니다
- LoginLogic.java - 로그인 유효성 검사를 위한 비즈니스 로직입니다 비밀번호가 webtext인지 확인합니다
- UserInfo.java - 로그인 중인 사용자의 정보를 보존 및 유지하기 위한 클래스입니다 세션으로 바인딩되는 객체입니다
---
- DB는 로그인이 아닌 상품 목록 저장및불러오기에만 사용됩니다
