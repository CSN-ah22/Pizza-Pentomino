package pentomino.model;

import java.io.Serializable;

public class ProductItem implements Serializable {
	private static final long serialVersionUID = 2665335486985784409L;
	// ��ǰID
    private String itemId;

    // ��ǰ��
    private String itemName;

    // ��ǰ ����
    private int price;
    

	//�⺻ ������
    public ProductItem() {
    }
    
    //�Ϲ� ������
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
