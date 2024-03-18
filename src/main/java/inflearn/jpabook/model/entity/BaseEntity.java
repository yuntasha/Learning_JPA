package inflearn.jpabook.model.entity;

import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    private Date createDate; // 등록일
    private Date lastModifiedDate; // 수정일
}
