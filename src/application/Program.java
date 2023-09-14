package application;

import model.entities.Seller;
import model_dao.DaoFactory;
import model_dao.SellerDao;

public class Program {
    public static void  main(String[] args){
       
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        
    }
}
