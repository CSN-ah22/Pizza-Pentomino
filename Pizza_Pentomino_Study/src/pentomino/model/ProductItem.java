package pentomino.model;

import java.io.Serializable;

public class ProductItem implements Serializable {
	private static final long serialVersionUID = 2665335486985784409L;
	// 상품ID
    private String itemId;

    // 상품명
    private String itemName;

    // 상품 가격
    private int price;
    

	//기본 생성자
    public ProductItem() {
    }
    
    //일반 생성자
    public ProductItem(String itemId, String itemName, int price) {
        setItemId(itemId);
        setItemName(itemName);
        setPrice(price);
    }
    
    public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
