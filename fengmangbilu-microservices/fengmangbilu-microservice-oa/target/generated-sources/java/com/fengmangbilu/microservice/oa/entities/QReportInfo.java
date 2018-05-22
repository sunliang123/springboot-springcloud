package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReportInfo is a Querydsl query type for ReportInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReportInfo extends EntityPathBase<ReportInfo> {

    private static final long serialVersionUID = -1881659548L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReportInfo reportInfo = new QReportInfo("reportInfo");

    public final com.fengmangbilu.domain.QBaseEntity _super = new com.fengmangbilu.domain.QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEducationInfo educationInfo;

    public final QEnterpriseInfo enterpriseInfo;

    public final StringPath idCard = createString("idCard");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath mobile = createString("mobile");

    public final QMobileInfo mobileInfo;

    public final StringPath name = createString("name");

    public final SetPath<OstaInfo, QOstaInfo> ostaInfos = this.<OstaInfo, QOstaInfo>createSet("ostaInfos", OstaInfo.class, QOstaInfo.class, PathInits.DIRECT2);

    public final QPersonInfo personInfo;

    public final StringPath reportId = createString("reportId");

    public final QRiskAssessInfo riskAssessInfo;

    public final QRiskInfo riskInfo;

    public final EnumPath<com.fengmangbilu.microservice.oa.enums.ReportType> type = createEnum("type", com.fengmangbilu.microservice.oa.enums.ReportType.class);

    public QReportInfo(String variable) {
        this(ReportInfo.class, forVariable(variable), INITS);
    }

    public QReportInfo(Path<? extends ReportInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReportInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReportInfo(PathMetadata metadata, PathInits inits) {
        this(ReportInfo.class, metadata, inits);
    }

    public QReportInfo(Class<? extends ReportInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.educationInfo = inits.isInitialized("educationInfo") ? new QEducationInfo(forProperty("educationInfo"), inits.get("educationInfo")) : null;
        this.enterpriseInfo = inits.isInitialized("enterpriseInfo") ? new QEnterpriseInfo(forProperty("enterpriseInfo")) : null;
        this.mobileInfo = inits.isInitialized("mobileInfo") ? new QMobileInfo(forProperty("mobileInfo")) : null;
        this.personInfo = inits.isInitialized("personInfo") ? new QPersonInfo(forProperty("personInfo")) : null;
        this.riskAssessInfo = inits.isInitialized("riskAssessInfo") ? new QRiskAssessInfo(forProperty("riskAssessInfo")) : null;
        this.riskInfo = inits.isInitialized("riskInfo") ? new QRiskInfo(forProperty("riskInfo")) : null;
    }

}

