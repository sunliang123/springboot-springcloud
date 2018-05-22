package com.fengmangbilu.microservice.user.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserPointDetail is a Querydsl query type for UserPointDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserPointDetail extends EntityPathBase<UserPointDetail> {

    private static final long serialVersionUID = -1537115269L;

    public static final QUserPointDetail userPointDetail = new QUserPointDetail("userPointDetail");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath acquireReason = createString("acquireReason");

    public final EnumPath<com.fengmangbilu.microservice.user.enums.BizType> bizType = createEnum("bizType", com.fengmangbilu.microservice.user.enums.BizType.class);

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> points = createNumber("points", Long.class);

    public final EnumPath<com.fengmangbilu.microservice.user.enums.PointSource> source = createEnum("source", com.fengmangbilu.microservice.user.enums.PointSource.class);

    public final StringPath userId = createString("userId");

    public QUserPointDetail(String variable) {
        super(UserPointDetail.class, forVariable(variable));
    }

    public QUserPointDetail(Path<? extends UserPointDetail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserPointDetail(PathMetadata metadata) {
        super(UserPointDetail.class, metadata);
    }

}

