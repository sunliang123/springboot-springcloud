package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMobileInfo is a Querydsl query type for MobileInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMobileInfo extends EntityPathBase<MobileInfo> {

    private static final long serialVersionUID = -1638990894L;

    public static final QMobileInfo mobileInfo = new QMobileInfo("mobileInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath areaName = createString("areaName");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath idCard = createString("idCard");

    public final BooleanPath identical = createBoolean("identical");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath mobile = createString("mobile");

    public final StringPath name = createString("name");

    public final EnumPath<com.fengmangbilu.microservice.oa.enums.Provider> provider = createEnum("provider", com.fengmangbilu.microservice.oa.enums.Provider.class);

    public QMobileInfo(String variable) {
        super(MobileInfo.class, forVariable(variable));
    }

    public QMobileInfo(Path<? extends MobileInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMobileInfo(PathMetadata metadata) {
        super(MobileInfo.class, metadata);
    }

}

