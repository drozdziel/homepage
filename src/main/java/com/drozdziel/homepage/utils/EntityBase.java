package com.drozdziel.homepage.utils;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Piotr Droździel on 8/8/15.
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public class EntityBase implements Serializable {

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_date")
    private Date modifiedDate;
}
