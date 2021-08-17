package pentomino.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pentomino.logic.JdbcProductLogic;
import pentomino.logic.ProductLogic;
import pentomino.model.ProductItem;

public class ItemListShowAction {

	public List ActionForward (HttpServletRequest request, HttpServletResponse response) {
		ProductLogic productLogic = new JdbcProductLogic();
		//dao 에서 return 값으로 setting 된 ProductItem이 통째로 넘어옴
		List<ProductItem> productList = productLogic.getProductList();
		
		//리턴값을 HTML으로 넘겨주는 구문
		return productList;
		
	}
}
