package com.little.tmsserver.repository;

import com.little.tmsserver.entity.SkillOverrideEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface SkillOverrideRepository extends ListCrudRepository<SkillOverrideEntity, Long>, ListPagingAndSortingRepository<SkillOverrideEntity, Long> {
}
