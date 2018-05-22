package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnterpriseInfo is a Querydsl query type for EnterpriseInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnterpriseInfo extends EntityPathBase<EnterpriseInfo> {

    private static final long serialVersionUID = -1503549935L;

    public static final QEnterpriseInfo enterpriseInfo = new QEnterpriseInfo("enterpriseInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final SetPath<CorporateCaseInfo, QCorporateCaseInfo> caseInfos = this.<CorporateCaseInfo, QCorporateCaseInfo>createSet("caseInfos", CorporateCaseInfo.class, QCorporateCaseInfo.class, PathInits.DIRECT2);

    public final SetPath<CorporateManager, QCorporateManager> corporateManagers = this.<CorporateManager, QCorporateManager>createSet("corporateManagers", CorporateManager.class, QCorporateManager.class, PathInits.DIRECT2);

    public final SetPath<Corporate, QCorporate> corporates = this.<Corporate, QCorporate>createSet("corporates", Corporate.class, QCorporate.class, PathInits.DIRECT2);

    public final SetPath<CorporateShareholder, QCorporateShareholder> corporateShareholders = this.<CorporateShareholder, QCorporateShareholder>createSet("corporateShareholders", CorporateShareholder.class, QCorporateShareholder.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath idCard = createString("idCard");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public QEnterpriseInfo(String variable) {
        super(EnterpriseInfo.class, forVariable(variable));
    }

    public QEnterpriseInfo(Path<? extends EnterpriseInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEnterpriseInfo(PathMetadata metadata) {
        super(EnterpriseInfo.class, metadata);
    }

}

