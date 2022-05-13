package jpabook.jpashop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass   //  테이블 생성은 하지않고, 속성 상속
public class BaseEntity {

    private String createdBy;
    private LocalDateTime createDate;
    private  String lastModifiedBy;
    private LocalDateTime lastModifiedDate;


    public BaseEntity() {
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}