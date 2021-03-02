package com.cinemaGhar.dao.api;

import java.util.List;

import com.cinemaGhar.dao.entity.PaymentInfo;

public interface PaymentInfoDao
{
	public boolean insert(PaymentInfo payment);
	public List<PaymentInfo> getAllPaymentInfo();
	public List<PaymentInfo> getPaymentById(String paymentId);
	
}
