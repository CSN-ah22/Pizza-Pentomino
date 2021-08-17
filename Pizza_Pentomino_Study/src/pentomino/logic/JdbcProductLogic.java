package pentomino.logic;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import pentomino.model.ProductItem;

public class JdbcProductLogic implements ProductLogic {

	public List<ProductItem> getProductList() {
		List<ProductItem> result = new ArrayList<ProductItem>();
		
		InitialContext ic;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        DataSource ds;
        
        try {
            // ������ �ҽ��� ���
            Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("jdbc/oracle");

            // Ŀ�ؼ��� ���
            conn = ds.getConnection();

            // SELECT ������ ����
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from PRODUCT_ITEM");

            // SELECT ����� ProductItem�� �ٽ� ä���
            while (rs.next()) {
                String itemId = rs.getString("ITEM_ID");
                String itemName = rs.getString("ITEM_NAME");
                Integer price = rs.getInt("PRICE");

                result.add(new ProductItem(itemId, itemName, price));
            }
        } catch (NamingException ex) {
            System.out.println("NamingException �߻�");
        } catch (SQLException ex) {
        	System.out.println("SQLException �߻�");
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    // Do nothing.
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    // Do nothing.
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    // Do nothing.
                }
            }
        }
        return result;
        
	}

}
