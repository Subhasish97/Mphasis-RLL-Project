package com.cinemaGhar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar.dao.api.PaymentInfoDao;
import com.cinemaGhar.dao.entity.PaymentInfo;

//*************************************************************************
//********************PAYMENT-INFO SERVICE IMPLENTATION CLASS******************************
//*************************************************************************
@Service
@Transactional
public class PaymentInfoServiceImpl implements PaymentInfoService {
	
	@Autowired
	private PaymentInfoDao paymentInfoDao;

	@Override
	public Boolean insert(PaymentInfo payment) {
		return paymentInfoDao.insert(payment);
	}

	@Override
	public List<PaymentInfo> getAllpaymentInfo() {
		return paymentInfoDao.getAllPaymentInfo();
	}

	@Override
	public List<PaymentInfo> getAllpaymentInfoById(Long id) {
		return paymentInfoDao.getPaymentById(id);
	}

}
