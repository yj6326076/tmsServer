package com.little.tmsserver.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Data
@Entity
@Table(name = "tms_account_t")
@EntityListeners(AuditingEntityListener.class)
public class AccountEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String password;
    private String safeCode;
    private String salt;
    private String secondPassword;
    private String salt2;
    private Boolean loggedIn;
    private Date lastLogIn;
    private Date birthday;
    private Boolean banned;
    @Column(columnDefinition = "text")
    private String banReason;
    private Integer gm;
    @Column(columnDefinition = "tinytext")
    private String email;
    @Column(columnDefinition = "tinytext")
    private String macs;
    @Column(columnDefinition = "tinytext")
    private String macList;
    private Date tempBan;
}
