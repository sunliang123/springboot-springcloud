package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRiskInfo is a Querydsl query type for RiskInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRiskInfo extends EntityPathBase<RiskInfo> {

    private static final long serialVersionUID = -1993316353L;

    public static final QRiskInfo riskInfo = new QRiskInfo("riskInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final NumberPath<Integer> alCount = createNumber("alCount", Integer.class);

    public final NumberPath<Integer> cqggCount = createNumber("cqggCount", Integer.class);

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath idCard = createString("idCard");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final SetPath<RiskAlsInfo, QRiskAlsInfo> riskAlsInfos = this.<RiskAlsInfo, QRiskAlsInfo>createSet("riskAlsInfos", RiskAlsInfo.class, QRiskAlsInfo.class, PathInits.DIRECT2);

    public final SetPath<RiskCqsInfo, QRiskCqsInfo> riskCqsInfos = this.<RiskCqsInfo, QRiskCqsInfo>createSet("riskCqsInfos", RiskCqsInfo.class, QRiskCqsInfo.class, PathInits.DIRECT2);

    public final SetPath<RiskSwsInfo, QRiskSwsInfo> riskSwsInfos = this.<RiskSwsInfo, QRiskSwsInfo>createSet("riskSwsInfos", RiskSwsInfo.class, QRiskSwsInfo.class, PathInits.DIRECT2);

    public final SetPath<RiskSxsInfo, QRiskSxsInfo> riskSxsInfos = this.<RiskSxsInfo, QRiskSxsInfo>createSet("riskSxsInfos", RiskSxsInfo.class, QRiskSxsInfo.class, PathInits.DIRECT2);

    public final SetPath<RiskWdyqsInfo, QRiskWdyqsInfo> riskWdyqsInfos = this.<RiskWdyqsInfo, QRiskWdyqsInfo>createSet("riskWdyqsInfos", RiskWdyqsInfo.class, QRiskWdyqsInfo.class, PathInits.DIRECT2);

    public final SetPath<RiskZxsInfo, QRiskZxsInfo> riskZxsInfos = this.<RiskZxsInfo, QRiskZxsInfo>createSet("riskZxsInfos", RiskZxsInfo.class, QRiskZxsInfo.class, PathInits.DIRECT2);

    public final NumberPath<Integer> swCount = createNumber("swCount", Integer.class);

    public final NumberPath<Integer> sxCount = createNumber("sxCount", Integer.class);

    public final NumberPath<Integer> wdyqCount = createNumber("wdyqCount", Integer.class);

    public final NumberPath<Integer> zxCount = createNumber("zxCount", Integer.class);

    public QRiskInfo(String variable) {
        super(RiskInfo.class, forVariable(variable));
    }

    public QRiskInfo(Path<? extends RiskInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRiskInfo(PathMetadata metadata) {
        super(RiskInfo.class, metadata);
    }

}

