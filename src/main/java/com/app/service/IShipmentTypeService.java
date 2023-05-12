package com.app.service;

import java.util.List;

import com.app.entity.ShipmentType;

public interface IShipmentTypeService {

	Integer saveShipmentType(ShipmentType st);

	void updateShipmentType(ShipmentType st);

	void deleteShipmentType(Integer id);

	ShipmentType getOneShipmentType(Integer id);

	List<ShipmentType> getAllShipmentType();

	boolean isShipmentTypeTypeExist(Integer id);

}
