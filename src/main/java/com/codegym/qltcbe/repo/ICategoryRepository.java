package com.codegym.qltcbe.repo;

import com.codegym.qltcbe.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface ICategoryRepository extends JpaRepository<Category,Long> {
    @Modifying
    @Query(value = "select * from category where status = :num and user_id = :id", nativeQuery = true)
    Iterable<Category> findAllByStatus(@PathVariable int num, @PathVariable Long id);

    @Modifying
    @Query(value = "select * from category where user_id = :id", nativeQuery = true)
    Iterable<Category> findAllByUserId(@PathVariable Long id);

}
