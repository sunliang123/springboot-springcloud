package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRiskWdyqsInfo is a Querydsl query type for RiskWdyqsInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRiskWdyqsInfo extends EntityPathBase<RiskWdyqsInfo> {

    private static final long serialVersionUID = 788893579L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRiskWdyqsInfo riskWdyqsInfo = new QRiskWdyqsInfo("riskWdyqsInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath bjbx = createString("bjbx");

    public final StringPath bt = createString("bt");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath dksj = createString("dksj");

    public final StringPath gxsj = createString("gxsj");

    public final StringPath hkzt = createString("hkzt");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath jgdz = createString("jgdz");

    public final StringPath jzdh = createString("jzdh");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath photo = createString("photo");

    public final StringPath photoType = createString("photoType");

    public final QRiskInfo riskInfo;

    public final StringPath sjlydwmc = createString("sjlydwmc");

    public final StringPath whfx = createString("whfx");

    public final StringPath xm = createString("xm");

    public final StringPath yhje = createString("yhje");

    public final StringPath zfzh = createString("zfzh");

    public QRiskWdyqsInfo(String variable) {
        this(RiskWdyqsInfo.class, forVariable(variable), INITS);
    }

    public QRiskWdyqsInfo(Path<? extends RiskWdyqsInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRiskWdyqsInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRiskWdyqsInfo(PathMetadata metadata, PathInits inits) {
        this(RiskWdyqsInfo.class, metadata, inits);
    }

    public QRiskWdyqsInfo(Class<? extends RiskWdyqsInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.riskInfo = inits.isInitialized("riskInfo") ? new QRiskInfo(forProperty("riskInfo")) : null;
    }

}

