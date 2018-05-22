package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCorporateManager is a Querydsl query type for CorporateManager
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCorporateManager extends EntityPathBase<CorporateManager> {

    private static final long serialVersionUID = 1694397802L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCorporateManager corporateManager = new QCorporateManager("corporateManager");

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

    public final StringPath position = createString("position");

    public final StringPath regCap = createString("regCap");

    public final StringPath regCapCur = createString("regCapCur");

    public final StringPath regNo = createString("regNo");

    public final StringPath ryName = createString("ryName");

    public QCorporateManager(String variable) {
        this(CorporateManager.class, forVariable(variable), INITS);
    }

    public QCorporateManager(Path<? extends CorporateManager> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCorporateManager(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCorporateManager(PathMetadata metadata, PathInits inits) {
        this(CorporateManager.class, metadata, inits);
    }

    public QCorporateManager(Class<? extends CorporateManager> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enterpriseInfo = inits.isInitialized("enterpriseInfo") ? new QEnterpriseInfo(forProperty("enterpriseInfo")) : null;
    }

}

