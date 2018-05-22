package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRiskAlsInfo is a Querydsl query type for RiskAlsInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRiskAlsInfo extends EntityPathBase<RiskAlsInfo> {

    private static final long serialVersionUID = 773991813L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRiskAlsInfo riskAlsInfo = new QRiskAlsInfo("riskAlsInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath ajlx = createString("ajlx");

    public final StringPath ajzh = createString("ajzh");

    public final StringPath ay = createString("ay");

    public final StringPath bt = createString("bt");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath dsrxm = createString("dsrxm");

    public final StringPath fymc = createString("fymc");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath pjjg = createString("pjjg");

    public final QRiskInfo riskInfo;

    public final StringPath sjrq = createString("sjrq");

    public final StringPath slcx = createString("slcx");

    public final StringPath sr = createString("sr");

    public final StringPath xb = createString("xb");

    public final StringPath zjhm = createString("zjhm");

    public QRiskAlsInfo(String variable) {
        this(RiskAlsInfo.class, forVariable(variable), INITS);
    }

    public QRiskAlsInfo(Path<? extends RiskAlsInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRiskAlsInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRiskAlsInfo(PathMetadata metadata, PathInits inits) {
        this(RiskAlsInfo.class, metadata, inits);
    }

    public QRiskAlsInfo(Class<? extends RiskAlsInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.riskInfo = inits.isInitialized("riskInfo") ? new QRiskInfo(forProperty("riskInfo")) : null;
    }

}

