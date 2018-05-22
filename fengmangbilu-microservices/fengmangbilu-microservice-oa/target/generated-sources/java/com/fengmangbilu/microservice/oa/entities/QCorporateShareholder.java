package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCorporateShareholder is a Querydsl query type for CorporateShareholder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCorporateShareholder extends EntityPathBase<CorporateShareholder> {

    private static final long serialVersionUID = 1371847048L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCorporateShareholder corporateShareholder = new QCorporateShareholder("corporateShareholder");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath currency = createString("currency");

    public final QEnterpriseInfo enterpriseInfo;

    public final StringPath entName = createString("entName");

    public final StringPath entStatus = createString("entStatus");

    public final StringPath entType = createString("entType");

    public final StringPath fundedRatio = createString("fundedRatio");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath regCap = createString("regCap");

    public final StringPath regCapCur = createString("regCapCur");

    public final StringPath regNo = createString("regNo");

    public final StringPath ryName = createString("ryName");

    public final StringPath subConam = createString("subConam");

    public QCorporateShareholder(String variable) {
        this(CorporateShareholder.class, forVariable(variable), INITS);
    }

    public QCorporateShareholder(Path<? extends CorporateShareholder> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCorporateShareholder(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCorporateShareholder(PathMetadata metadata, PathInits inits) {
        this(CorporateShareholder.class, metadata, inits);
    }

    public QCorporateShareholder(Class<? extends CorporateShareholder> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enterpriseInfo = inits.isInitialized("enterpriseInfo") ? new QEnterpriseInfo(forProperty("enterpriseInfo")) : null;
    }

}

