package org.example.httpProtocol.entity;

import com.leadtechsoft.common.jtc.repository.JtcRepository;
import com.leadtechsoft.common.jtc.repository.annotations.GenerationType;
import com.leadtechsoft.common.jtc.repository.annotations.Id;
import com.leadtechsoft.common.jtc.repository.annotations.Table;
import com.leadtechsoft.common.jtc.repository.annotations.TableField;
import com.leadtechsoft.common.jtc.repository.entity.BaseEntity;

import java.util.Objects;

@Table(name = "app_product")
public class ProductEntity extends BaseEntity {

    @TableField(name = "id")
    @Id(idGeneration = GenerationType.AUTO)
    private Long id;

    @TableField(name = "name")
    private String name;

    @TableField(name = "seller")
    private String seller;

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

    public ProductEntity(String name, String seller, Long id) {
        this.name = name;
        this.seller = seller;
        this.id = id;
    }

    public ProductEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity product = (ProductEntity) o;
        return Objects.equals(name, product.name) && Objects.equals(seller, product.seller) && Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, seller, id);
    }
}
