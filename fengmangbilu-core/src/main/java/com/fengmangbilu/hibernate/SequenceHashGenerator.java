package com.fengmangbilu.hibernate;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.hashids.Hashids;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.internal.util.config.ConfigurationHelper;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

public class SequenceHashGenerator implements IdentifierGenerator, Configurable {

	public static final String TYPE = "com.fengmangbilu.hibernate.SequenceHashGenerator";

	private static final String SQL = "select nextval('%s')";

	public static final String SEQUENCE_PARAM = "sequence_name";

	public static final String ALPHABET_PARAM = "alphabet";

	public static final String DEFAULT_ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

	private Hashids hashids;

	private String sequenceName;

	private String alphabet;

	@Override
	public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
		sequenceName = determineSequenceName(params);
		alphabet = determineAlphabet(params);
		hashids = new Hashids(alphabet);
	}

	@Override
	public Serializable generate(SessionImplementor session, Object obj) {
		sequenceName = StringUtils.defaultIfBlank(sequenceName, obj.getClass().getSimpleName().toLowerCase());
		return hashids.encode((getNextSeq(session, sequenceName)));
	}

	public long getNextSeq(SessionImplementor session, String name) {
		Connection connection = session.connection();
		Long sequenceValue = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(String.format(SQL, name));
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				sequenceValue = resultSet.getLong(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sequenceValue;
	}

	protected String determineSequenceName(Properties params) {
		return ConfigurationHelper.getString(SEQUENCE_PARAM, params, null);
	}

	protected String determineAlphabet(Properties params) {
		return ConfigurationHelper.getString(ALPHABET_PARAM, params, DEFAULT_ALPHABET);
	}
}
