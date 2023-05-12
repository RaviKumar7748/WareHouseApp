package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.ShipmentType;
import com.app.repositoty.ShipmentTypeRepository;
import com.app.service.IShipmentTypeService;
@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {

	@Autowired
	private ShipmentTypeRepository repo;

	@Override
	public Integer saveShipmentType(ShipmentType st) {
		ShipmentType save = repo.save(st);

		return save.getShipmentId();
	}

	@Override
	public void updateShipmentType(ShipmentType st) {
		repo.save(st);

	}

	@Override
	public void deleteShipmentType(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public ShipmentType getOneShipmentType(Integer id) {
		Optional<ShipmentType> findById = repo.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<ShipmentType> getAllShipmentType() {
		return repo.findAll();
	}

	@Override
	public boolean isShipmentTypeTypeExist(Integer id) {
		return repo.existsById(id);
	}

}
