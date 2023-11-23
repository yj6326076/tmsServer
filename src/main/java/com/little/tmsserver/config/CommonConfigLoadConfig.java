package com.little.tmsserver.config;

import com.little.tmsserver.entity.SkillOverrideEntity;
import com.little.tmsserver.repository.SkillOverrideRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.inject.Inject;
import java.util.List;

/**
 * 通用配置加载类
 * @author yj632
 * @since 2023-08-19
 */
@Configuration
@Slf4j
public class CommonConfigLoadConfig {

    @Inject
    private SkillOverrideRepository skillOverrideRepository;

    public CommonConfigLoadConfig() {
        log.info("com.little.tmsserver.config.CommonConfigLoadConfig.CommonConfigLoadConfig ===>>> start load allSkillOverride");
        List<SkillOverrideEntity> allSkillOverride = skillOverrideRepository.findAll();
    }
}
