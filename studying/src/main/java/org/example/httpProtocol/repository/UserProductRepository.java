package org.example.httpProtocol.repository;

import com.leadtechsoft.common.jtc.repository.JtcRepositoryImpl;
import com.leadtechsoft.common.jtc.repository.exception.JtcRepositoryException;
import org.example.httpProtocol.entity.ProductEntity;

public class UserProductRepository extends JtcRepositoryImpl<ProductEntity> {
    public void delete(Long id) {
        super.delete("WHERE id=?", id);
    }

    public int update(ProductEntity object) {
        return super.update(object, "WHERE id=?", object.getId());
    }

    public ProductEntity fetchOne(Long id) throws JtcRepositoryException {
        return super.fetchOne("WHERE id=?", id);
    }
}
