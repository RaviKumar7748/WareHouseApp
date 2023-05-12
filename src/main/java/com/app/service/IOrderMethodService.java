package com.app.service;

import java.util.List;

import com.app.entity.OrderMethod;

public interface IOrderMethodService {
	
	Integer saveOrderMethod(OrderMethod st);

	void updateOrderMethod(OrderMethod st);

	void deleteOrderMethod(Integer id);

	OrderMethod getOneOrderMethod(Integer id);

	List<OrderMethod> getAllOrderMethod();

	boolean isOrderMethodTypeExist(Integer id);


}
