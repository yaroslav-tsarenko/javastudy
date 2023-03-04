package org.example.httpProtocol.repository;

import com.leadtechsoft.common.jtc.repository.JtcRepositoryImpl;
import com.leadtechsoft.common.jtc.repository.exception.JtcRepositoryException;
import org.example.httpProtocol.entity.UserEntity;

public class UserRepository extends JtcRepositoryImpl<UserEntity> {
    public void delete(Long id) {
        super.delete("WHERE id=?", id);
    }

    public int update(UserEntity object) {
        return super.update(object, "WHERE id=?", object.getId());
    }

    public UserEntity fetchOne(Long id) throws JtcRepositoryException {
        return super.fetchOne("WHERE id=?", id);
    }
}
