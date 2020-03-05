package com.mastercard.poc.dao;

import com.mastercard.poc.entity.TestEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends CrudRepository<TestEntity, Long> {
    /*@Query(value = "select * from mcdbuser.mctesttbl  where rownum<=12", nativeQuery = true)
    List<TestEntity> findLimitedRecords();*/

    List<TestEntity> findAll();

    @Query(value = "select * from mcdbuser.mctesttbl  where rownum >= :start and rownum <= :end", nativeQuery = true)
    List<TestEntity> findRecordsInRange(@Param("start") int start, @Param("end") int end);
}
