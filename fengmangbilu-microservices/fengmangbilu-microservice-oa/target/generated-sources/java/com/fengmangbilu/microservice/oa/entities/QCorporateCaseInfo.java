package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCorporateCaseInfo is a Querydsl query type for CorporateCaseInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCorporateCaseInfo extends EntityPathBase<CorporateCaseInfo> {

    private static final long serialVersionUID = 884444641L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCorporateCaseInfo corporateCaseInfo = new QCorporateCaseInfo("corporateCaseInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath cardNO = createString("cardNO");

    public final StringPath caseReason = createString("caseReason");

    public final StringPath caseResult = createString("caseResult");

    public final StringPath caseTime = createString("caseTime");

    public final StringPath caseType = createString("caseType");

    public final StringPath caseVal = createString("caseVal");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEnterpriseInfo enterpriseInfo;

    public final StringPath exeSort = createString("exeSort");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath illegFact = createString("illegFact");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final StringPath penAm = createString("penAm");

    public final StringPath penAuth = createString("penAuth");

    public final StringPath penBasis = createString("penBasis");

    public final StringPath penDecIssDate = createString("penDecIssDate");

    public final StringPath penDecNo = createString("penDecNo");

    public final StringPath penExeSt = createString("penExeSt");

    public final StringPath penResult = createString("penResult");

    public final StringPath penType = createString("penType");

    public QCorporateCaseInfo(String variable) {
        this(CorporateCaseInfo.class, forVariable(variable), INITS);
    }

    public QCorporateCaseInfo(Path<? extends CorporateCaseInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCorporateCaseInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCorporateCaseInfo(PathMetadata metadata, PathInits inits) {
        this(CorporateCaseInfo.class, metadata, inits);
    }

    public QCorporateCaseInfo(Class<? extends CorporateCaseInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enterpriseInfo = inits.isInitialized("enterpriseInfo") ? new QEnterpriseInfo(forProperty("enterpriseInfo")) : null;
    }

}

