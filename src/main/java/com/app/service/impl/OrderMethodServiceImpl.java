package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entity.OrderMethod;
import com.app.repositoty.OrderMethodRepository;
import com.app.service.IOrderMethodService;
@Service
public class OrderMethodServiceImpl
implements IOrderMethodService
{
	@Autowired
	private OrderMethodRepository repo;

	@Override
	@Transactional
	public Integer saveOrderMethod(OrderMethod om) {
		return repo.save(om).getId();
	}

	@Override
	@Transactional
	public void updateOrderMethod(OrderMethod om) {
		repo.save(om);
	 	
	}

	@Override
	@Transactional
	public void deleteOrderMethod(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	@Transactional
	public OrderMethod getOneOrderMethod(Integer id) {
		Optional<OrderMethod> findById = repo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	@Transactional
	public List<OrderMethod> getAllOrderMethod() {
		return repo.findAll();
	}

	@Override
	@Transactional
	public boolean isOrderMethodTypeExist(Integer id) {
		return repo.existsById(id);
	}

}
