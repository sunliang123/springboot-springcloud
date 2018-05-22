package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QReportPushInfo is a Querydsl query type for ReportPushInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReportPushInfo extends EntityPathBase<ReportPushInfo> {

    private static final long serialVersionUID = 1850794654L;

    public static final QReportPushInfo reportPushInfo = new QReportPushInfo("reportPushInfo");

    public final com.fengmangbilu.domain.QBaseEntity _super = new com.fengmangbilu.domain.QBaseEntity(this);

    public final StringPath backImage = createString("backImage");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath companyName = createString("companyName");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> deptId = createNumber("deptId", Long.class);

    public final StringPath deptName = createString("deptName");

    public final StringPath frontImage = createString("frontImage");

    public final StringPath headImage = createString("headImage");

    public final StringPath idCard = createString("idCard");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath leaveProve = createString("leaveProve");

    public final StringPath mobile = createString("mobile");

    public final StringPath name = createString("name");

    public final StringPath position = createString("position");

    public final NumberPath<Long> pushId = createNumber("pushId", Long.class);

    public final StringPath reportId = createString("reportId");

    public final EnumPath<com.fengmangbilu.microservice.oa.enums.ReportStatus> status = createEnum("status", com.fengmangbilu.microservice.oa.enums.ReportStatus.class);

    public final EnumPath<com.fengmangbilu.microservice.oa.enums.ReportType> type = createEnum("type", com.fengmangbilu.microservice.oa.enums.ReportType.class);

    public final StringPath userId = createString("userId");

    public QReportPushInfo(String variable) {
        super(ReportPushInfo.class, forVariable(variable));
    }

    public QReportPushInfo(Path<? extends ReportPushInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReportPushInfo(PathMetadata metadata) {
        super(ReportPushInfo.class, metadata);
    }

}

