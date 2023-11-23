package com.little.tmsserver.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Entity
@Table(name = "tms_system_update_log_t")
@EntityListeners(AuditingEntityListener.class)
public class SystemUpdateLogEntity extends BaseEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String patchName;
}
