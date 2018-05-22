package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRiskSwsInfo is a Querydsl query type for RiskSwsInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRiskSwsInfo extends EntityPathBase<RiskSwsInfo> {

    private static final long serialVersionUID = -115890452L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRiskSwsInfo riskSwsInfo = new QRiskSwsInfo("riskSwsInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath bt = createString("bt");

    public final StringPath bzxr = createString("bzxr");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath frxm = createString("frxm");

    public final StringPath ggsj = createString("ggsj");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath jydd = createString("jydd");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QRiskInfo riskInfo;

    public final StringPath zjhm = createString("zjhm");

    public QRiskSwsInfo(String variable) {
        this(RiskSwsInfo.class, forVariable(variable), INITS);
    }

    public QRiskSwsInfo(Path<? extends RiskSwsInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRiskSwsInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRiskSwsInfo(PathMetadata metadata, PathInits inits) {
        this(RiskSwsInfo.class, metadata, inits);
    }

    public QRiskSwsInfo(Class<? extends RiskSwsInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.riskInfo = inits.isInitialized("riskInfo") ? new QRiskInfo(forProperty("riskInfo")) : null;
    }

}

