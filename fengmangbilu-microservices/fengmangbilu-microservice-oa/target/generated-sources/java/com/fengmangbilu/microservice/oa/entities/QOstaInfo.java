package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOstaInfo is a Querydsl query type for OstaInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOstaInfo extends EntityPathBase<OstaInfo> {

    private static final long serialVersionUID = 1672683393L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOstaInfo ostaInfo = new QOstaInfo("ostaInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath avgNationalSalary = createString("avgNationalSalary");

    public final StringPath banZhengRiQi = createString("banZhengRiQi");

    public final StringPath certificateID = createString("certificateID");

    public final StringPath cityName = createString("cityName");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath idCard = createString("idCard");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath level = createString("level");

    public final StringPath name = createString("name");

    public final StringPath occupation = createString("occupation");

    public final QReportInfo reportInfo;

    public final StringPath submitOrgName = createString("submitOrgName");

    public QOstaInfo(String variable) {
        this(OstaInfo.class, forVariable(variable), INITS);
    }

    public QOstaInfo(Path<? extends OstaInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOstaInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOstaInfo(PathMetadata metadata, PathInits inits) {
        this(OstaInfo.class, metadata, inits);
    }

    public QOstaInfo(Class<? extends OstaInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.reportInfo = inits.isInitialized("reportInfo") ? new QReportInfo(forProperty("reportInfo"), inits.get("reportInfo")) : null;
    }

}

