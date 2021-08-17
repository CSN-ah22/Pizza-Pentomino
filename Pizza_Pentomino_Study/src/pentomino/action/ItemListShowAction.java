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
		//dao ���� return ������ setting �� ProductItem�� ��°�� �Ѿ��
		List<ProductItem> productList = productLogic.getProductList();
		
		//���ϰ��� HTML���� �Ѱ��ִ� ����
		return productList;
		
	}
}
