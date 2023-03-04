package org.example.httpProtocol.entity;

import com.leadtechsoft.common.jtc.repository.JtcRepository;
import com.leadtechsoft.common.jtc.repository.annotations.*;
import com.leadtechsoft.common.jtc.repository.entity.BaseEntity;

import java.util.List;
import java.util.Objects;

@Table(name = "app_user")
public class UserEntity extends BaseEntity {
    @TableField(name = "id")
    @Id(idGeneration = GenerationType.AUTO)
    private Long id;
    @TableField(name = "name")
    private String name;
    @TableField(name = "email")
    private String email;
    @TableField(name = "phone_number")
    private String phoneNumber;

    public List<ProductEntity> getUserProducts() {
        return userProducts;
    }

    @LinkedCollection(entityType = ProductEntity.class)
    List<ProductEntity> userProducts;

    public UserEntity(Long id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void addLink(BaseEntity entity) {
        super.addLink(entity);
    }

    @Override
    public void removeLink(BaseEntity entity) {
        super.removeLink(entity);
    }

    @Override
    public boolean isLinksEmpty() {
        return super.isLinksEmpty();
    }

    @Override
    public boolean isLinksEmptyByType(Class<?> type) {
        return super.isLinksEmptyByType(type);
    }

    @Override
    public <E extends BaseEntity, T extends JtcRepository<E>> void initializeLinks(T repository) {
        super.initializeLinks(repository);
    }

    public UserEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity user)) return false;

        if (!Objects.equals(id, user.id)) return false;
        if (!Objects.equals(name, user.name)) return false;
        if (!Objects.equals(email, user.email)) return false;
        return Objects.equals(phoneNumber, user.phoneNumber);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
}
