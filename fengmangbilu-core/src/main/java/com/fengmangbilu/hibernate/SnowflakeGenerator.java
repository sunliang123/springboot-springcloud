package com.fengmangbilu.hibernate;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.fengmangbilu.util.IdWorker;

public class SnowflakeGenerator implements IdentifierGenerator {

	public static final String TYPE = "com.fengmangbilu.hibernate.SnowflakeGenerator";

	private static final IdWorker idWorker = new IdWorker();

	@Override
	public Serializable generate(SessionImplementor sessionImplementor, Object o) throws HibernateException {
		return String.valueOf(idWorker.nextId());
	}
}
