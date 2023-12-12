package com.infoway.repository;

import com.infoway.entity.Furniture;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FurnitureRepository extends JpaRepository<Furniture , Integer> {

    @Query("SELECT f FROM Furniture f WHERE f.status IS NULL AND f.user.userId = :userId")
    List<Furniture> findUnapprovedFurnitureByUserId(@Param("userId") Integer userId);


}
