package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRiskCqsInfo is a Querydsl query type for RiskCqsInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRiskCqsInfo extends EntityPathBase<RiskCqsInfo> {

    private static final long serialVersionUID = -1602822366L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRiskCqsInfo riskCqsInfo = new QRiskCqsInfo("riskCqsInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath bcqr = createString("bcqr");

    public final StringPath bt = createString("bt");

    public final StringPath cqje = createString("cqje");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath dbgdDz = createString("dbgdDz");

    public final StringPath dbgdSfzhm = createString("dbgdSfzhm");

    public final StringPath dbgdXb = createString("dbgdXb");

    public final StringPath dbgdXm = createString("dbgdXm");

    public final StringPath dbgdXxdz = createString("dbgdXxdz");

    public final StringPath dbgdZj = createString("dbgdZj");

    public final StringPath dbjbrDz = createString("dbjbrDz");

    public final StringPath dbjbrDzyj = createString("dbjbrDzyj");

    public final StringPath dbjbrSfzhm = createString("dbjbrSfzhm");

    public final StringPath dbjbrSjhm = createString("dbjbrSjhm");

    public final StringPath dbjbrXb = createString("dbjbrXb");

    public final StringPath dbjbrXm = createString("dbjbrXm");

    public final StringPath dbjbrXxdz = createString("dbjbrXxdz");

    public final StringPath dbjbrZj = createString("dbjbrZj");

    public final StringPath fbjs = createString("fbjs");

    public final StringPath fzrDz = createString("fzrDz");

    public final StringPath fzrDzyj = createString("fzrDzyj");

    public final StringPath fzrFbjs = createString("fzrFbjs");

    public final StringPath fzrSjhm = createString("fzrSjhm");

    public final StringPath fzrXm = createString("fzrXm");

    public final StringPath fzrXxdz = createString("fzrXxdz");

    public final StringPath fzrZj = createString("fzrZj");

    public final StringPath fzrZw = createString("fzrZw");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath qkgdDz = createString("qkgdDz");

    public final StringPath qkgdSfzhm = createString("qkgdSfzhm");

    public final StringPath qkgdXb = createString("qkgdXb");

    public final StringPath qkgdXm = createString("qkgdXm");

    public final StringPath qkgdXxdz = createString("qkgdXxdz");

    public final StringPath qkgdZj = createString("qkgdZj");

    public final StringPath qkjbrDz = createString("qkjbrDz");

    public final StringPath qkjbrDzyj = createString("qkjbrDzyj");

    public final StringPath qkjbrSfzhm = createString("qkjbrSfzhm");

    public final StringPath qkjbrSjhm = createString("qkjbrSjhm");

    public final StringPath qkjbrXb = createString("qkjbrXb");

    public final StringPath qkjbrXm = createString("qkjbrXm");

    public final StringPath qkjbrXxdz = createString("qkjbrXxdz");

    public final StringPath qkjbrZj = createString("qkjbrZj");

    public final QRiskInfo riskInfo;

    public final StringPath zt = createString("zt");

    public QRiskCqsInfo(String variable) {
        this(RiskCqsInfo.class, forVariable(variable), INITS);
    }

    public QRiskCqsInfo(Path<? extends RiskCqsInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRiskCqsInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRiskCqsInfo(PathMetadata metadata, PathInits inits) {
        this(RiskCqsInfo.class, metadata, inits);
    }

    public QRiskCqsInfo(Class<? extends RiskCqsInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.riskInfo = inits.isInitialized("riskInfo") ? new QRiskInfo(forProperty("riskInfo")) : null;
    }

}

