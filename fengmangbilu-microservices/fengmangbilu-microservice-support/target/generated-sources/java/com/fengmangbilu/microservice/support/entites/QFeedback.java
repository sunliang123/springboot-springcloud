package com.fengmangbilu.microservice.support.entites;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFeedback is a Querydsl query type for Feedback
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeedback extends EntityPathBase<Feedback> {

    private static final long serialVersionUID = -1810294561L;

    public static final QFeedback feedback = new QFeedback("feedback");

    public final com.fengmangbilu.domain.QBaseEntity _super = new com.fengmangbilu.domain.QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath id = createString("id");

    public final StringPath imgUrls = createString("imgUrls");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public QFeedback(String variable) {
        super(Feedback.class, forVariable(variable));
    }

    public QFeedback(Path<? extends Feedback> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFeedback(PathMetadata metadata) {
        super(Feedback.class, metadata);
    }

}

