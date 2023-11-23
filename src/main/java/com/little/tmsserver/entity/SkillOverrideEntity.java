package com.little.tmsserver.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * 技能数值修改entity
 * @author yj632
 */
@Data
@Entity
@Table(name = "tms_skill_override_t")
@EntityListeners(AuditingEntityListener.class)
public class SkillOverrideEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 技能id
     */
    private Integer skillId;

    private String key;

    private String value;
}
