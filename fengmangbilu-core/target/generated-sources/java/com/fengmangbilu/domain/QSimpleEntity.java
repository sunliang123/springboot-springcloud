package com.fengmangbilu.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSimpleEntity is a Querydsl query type for SimpleEntity
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QSimpleEntity extends EntityPathBase<SimpleEntity> {

    private static final long serialVersionUID = -1515156685L;

    public static final QSimpleEntity simpleEntity = new QSimpleEntity("simpleEntity");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> lastModifiedDate = createDateTime("lastModifiedDate", java.util.Date.class);

    public QSimpleEntity(String variable) {
        super(SimpleEntity.class, forVariable(variable));
    }

    public QSimpleEntity(Path<? extends SimpleEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSimpleEntity(PathMetadata metadata) {
        super(SimpleEntity.class, metadata);
    }

}

