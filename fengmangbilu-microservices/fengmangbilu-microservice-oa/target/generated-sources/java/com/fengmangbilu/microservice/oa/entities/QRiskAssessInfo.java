package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRiskAssessInfo is a Querydsl query type for RiskAssessInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRiskAssessInfo extends EntityPathBase<RiskAssessInfo> {

    private static final long serialVersionUID = 2072804547L;

    public static final QRiskAssessInfo riskAssessInfo = new QRiskAssessInfo("riskAssessInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath idCard = createString("idCard");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final StringPath result = createString("result");

    public QRiskAssessInfo(String variable) {
        super(RiskAssessInfo.class, forVariable(variable));
    }

    public QRiskAssessInfo(Path<? extends RiskAssessInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRiskAssessInfo(PathMetadata metadata) {
        super(RiskAssessInfo.class, metadata);
    }

}

