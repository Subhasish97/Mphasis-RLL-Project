package com.cinemaGhar.service;

import java.util.List;

import com.cinemaGhar.dao.entity.PaymentInfo;

//*************************************************************************
//********************PAYMENT-INFO SERVICE INTERFACE******************************
//*************************************************************************
public interface PaymentInfoService {
	
	public Boolean insert(PaymentInfo payment);
	public List<PaymentInfo> getAllpaymentInfo();
	public List<PaymentInfo> getAllpaymentInfoById(Long id);



}
