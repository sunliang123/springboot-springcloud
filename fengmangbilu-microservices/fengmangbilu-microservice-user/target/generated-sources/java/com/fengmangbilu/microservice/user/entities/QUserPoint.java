package com.fengmangbilu.microservice.user.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserPoint is a Querydsl query type for UserPoint
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserPoint extends EntityPathBase<UserPoint> {

    private static final long serialVersionUID = 1263732362L;

    public static final QUserPoint userPoint = new QUserPoint("userPoint");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> frozenPoints = createNumber("frozenPoints", Long.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> points = createNumber("points", Long.class);

    public final NumberPath<Long> totalExpend = createNumber("totalExpend", Long.class);

    public final NumberPath<Long> totalPoints = createNumber("totalPoints", Long.class);

    public final StringPath userId = createString("userId");

    public QUserPoint(String variable) {
        super(UserPoint.class, forVariable(variable));
    }

    public QUserPoint(Path<? extends UserPoint> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserPoint(PathMetadata metadata) {
        super(UserPoint.class, metadata);
    }

}

