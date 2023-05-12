package com.app.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.ShipmentType;
@Repository
public interface ShipmentTypeRepository  extends JpaRepository<ShipmentType, Integer>{

}
