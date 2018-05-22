package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRiskSxsInfo is a Querydsl query type for RiskSxsInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRiskSxsInfo extends EntityPathBase<RiskSxsInfo> {

    private static final long serialVersionUID = -87261301L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRiskSxsInfo riskSxsInfo = new QRiskSxsInfo("riskSxsInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath ah = createString("ah");

    public final StringPath bt = createString("bt");

    public final StringPath bzxr = createString("bzxr");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath fbsj = createString("fbsj");

    public final StringPath flwsyw = createString("flwsyw");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath lasj = createString("lasj");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath lxqk = createString("lxqk");

    public final StringPath nl = createString("nl");

    public final QRiskInfo riskInfo;

    public final StringPath sf = createString("sf");

    public final StringPath wlx = createString("wlx");

    public final StringPath xb = createString("xb");

    public final StringPath xwjtqx = createString("xwjtqx");

    public final StringPath yjdw = createString("yjdw");

    public final StringPath yjwh = createString("yjwh");

    public final StringPath ylx = createString("ylx");

    public final StringPath zjhm = createString("zjhm");

    public final StringPath zxfy = createString("zxfy");

    public QRiskSxsInfo(String variable) {
        this(RiskSxsInfo.class, forVariable(variable), INITS);
    }

    public QRiskSxsInfo(Path<? extends RiskSxsInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRiskSxsInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRiskSxsInfo(PathMetadata metadata, PathInits inits) {
        this(RiskSxsInfo.class, metadata, inits);
    }

    public QRiskSxsInfo(Class<? extends RiskSxsInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.riskInfo = inits.isInitialized("riskInfo") ? new QRiskInfo(forProperty("riskInfo")) : null;
    }

}

