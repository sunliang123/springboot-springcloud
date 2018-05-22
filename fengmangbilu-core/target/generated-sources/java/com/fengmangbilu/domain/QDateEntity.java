package com.fengmangbilu.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDateEntity is a Querydsl query type for DateEntity
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QDateEntity extends EntityPathBase<DateEntity> {

    private static final long serialVersionUID = 1279099823L;

    public static final QDateEntity dateEntity = new QDateEntity("dateEntity");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastModifiedDate = createDateTime("lastModifiedDate", java.util.Date.class);

    public QDateEntity(String variable) {
        super(DateEntity.class, forVariable(variable));
    }

    public QDateEntity(Path<? extends DateEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDateEntity(PathMetadata metadata) {
        super(DateEntity.class, metadata);
    }

}

