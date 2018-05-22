package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRiskZxsInfo is a Querydsl query type for RiskZxsInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRiskZxsInfo extends EntityPathBase<RiskZxsInfo> {

    private static final long serialVersionUID = 1830297170L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRiskZxsInfo riskZxsInfo = new QRiskZxsInfo("riskZxsInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath ah = createString("ah");

    public final StringPath ajzt = createString("ajzt");

    public final StringPath bt = createString("bt");

    public final StringPath bzxr = createString("bzxr");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath lasj = createString("lasj");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QRiskInfo riskInfo;

    public final StringPath zjhm = createString("zjhm");

    public final StringPath zxbd = createString("zxbd");

    public final StringPath zxfy = createString("zxfy");

    public QRiskZxsInfo(String variable) {
        this(RiskZxsInfo.class, forVariable(variable), INITS);
    }

    public QRiskZxsInfo(Path<? extends RiskZxsInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRiskZxsInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRiskZxsInfo(PathMetadata metadata, PathInits inits) {
        this(RiskZxsInfo.class, metadata, inits);
    }

    public QRiskZxsInfo(Class<? extends RiskZxsInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.riskInfo = inits.isInitialized("riskInfo") ? new QRiskInfo(forProperty("riskInfo")) : null;
    }

}

