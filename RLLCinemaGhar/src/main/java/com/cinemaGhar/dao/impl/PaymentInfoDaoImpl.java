package com.cinemaGhar.dao.impl;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar.dao.api.PaymentInfoDao;
import com.cinemaGhar.dao.entity.PaymentInfo;


//*****************************************************************************
//****************PAYMENT-INFO DAO IMPLEMENTATION CLASS************************
//*****************************************************************************
@Repository
@EnableTransactionManagement
public class PaymentInfoDaoImpl implements PaymentInfoDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	//CREATING SESSION FACTORY
	//------------------------
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	
	}

	//METHOD FOR CREATING AND INSERTING TO PAYMENTS-INFO TABLE
	//--------------------------------------------------------
	@Override
	public boolean insert(PaymentInfo payment) 
	{
		getSession().saveOrUpdate(payment);
		System.out.println("admin " + payment.getTime()+" stored in the DB !!!");
		return true;
	}

	//METHOD FOR RETRIVING ALL PAYMENTS-INFO ROWS FROM PAYMENTS-INFO TABLE
	//--------------------------------------------------------------------
	@Override
	public List<PaymentInfo> getAllPaymentInfo()
	{
		Query query =getSession().createQuery("select p from PaymentInfo p ");
		List<PaymentInfo> paymentList=query.list();
		return paymentList;
	}

	//METHOD FOR RETRIVING A PAYMENTS-INFO ROW BY PAYMENTS-ID FROM PAYMENTS-INFO TABLE
	//--------------------------------------------------------------------------------
	@Override
	public List<PaymentInfo> getPaymentById(Long paymentId)
	{
		Query query = getSession().createQuery("From PaymentInfo p where id:=id");
		query.setParameter("id",paymentId);
		List<PaymentInfo> paymentList=query.list();
		return paymentList;
	}
	
}
