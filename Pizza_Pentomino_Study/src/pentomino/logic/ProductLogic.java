package pentomino.logic;

import java.util.List;

import pentomino.model.ProductItem;
public interface ProductLogic {
	 /**
     * 상품 정보 목록을 돌려준다.<br />
     * 
     * @return 상품 정보 목록
     */
    public List<ProductItem> getProductList();
}
