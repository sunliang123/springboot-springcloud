package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCorporate is a Querydsl query type for Corporate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCorporate extends EntityPathBase<Corporate> {

    private static final long serialVersionUID = 836526275L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCorporate corporate = new QCorporate("corporate");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEnterpriseInfo enterpriseInfo;

    public final StringPath entName = createString("entName");

    public final StringPath entStatus = createString("entStatus");

    public final StringPath entType = createString("entType");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath regCap = createString("regCap");

    public final StringPath regCapCur = createString("regCapCur");

    public final StringPath regNo = createString("regNo");

    public final StringPath ryName = createString("ryName");

    public QCorporate(String variable) {
        this(Corporate.class, forVariable(variable), INITS);
    }

    public QCorporate(Path<? extends Corporate> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCorporate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCorporate(PathMetadata metadata, PathInits inits) {
        this(Corporate.class, metadata, inits);
    }

    public QCorporate(Class<? extends Corporate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enterpriseInfo = inits.isInitialized("enterpriseInfo") ? new QEnterpriseInfo(forProperty("enterpriseInfo")) : null;
    }

}

