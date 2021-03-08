package com.cinemaGhar.dao.api;

import java.util.List;

import com.cinemaGhar.dao.entity.PaymentInfo;

//******************************************************************
//*******************PAYMENT-INFO DAO LAYER FOR CLIENT*********************
//******************************************************************
public interface PaymentInfoDao
{
	public boolean insert(PaymentInfo payment);
	public List<PaymentInfo> getAllPaymentInfo();
	public List<PaymentInfo> getPaymentById(Long paymentId);
	
}
