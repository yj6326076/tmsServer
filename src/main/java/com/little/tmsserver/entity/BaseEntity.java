package com.little.tmsserver.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data
public class BaseEntity {

    @CreatedDate
    private Date createDate;

    @LastModifiedDate
    private Date lastUpdateDate;
}
