package com.xin.spring.annotation.chapter37.service;

import com.xin.spring.annotation.chapter37.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author XYF
 * @date 2025-12-26 11:18
 */

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateProductStockCountById(Integer stockCount, Long id) {
        productDao.updateProductStockCountById(stockCount, id);
    }

}
