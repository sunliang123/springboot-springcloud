package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QIdCardInfo is a Querydsl query type for IdCardInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIdCardInfo extends EntityPathBase<IdCardInfo> {

    private static final long serialVersionUID = 1022436731L;

    public static final QIdCardInfo idCardInfo = new QIdCardInfo("idCardInfo");

    public final com.fengmangbilu.domain.QBaseEntity _super = new com.fengmangbilu.domain.QBaseEntity(this);

    public final StringPath backImage = createString("backImage");

    public final DateTimePath<java.util.Date> birthday = createDateTime("birthday", java.util.Date.class);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath frontImage = createString("frontImage");

    public final NumberPath<Integer> gender = createNumber("gender", Integer.class);

    public final StringPath headImage = createString("headImage");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath idCard = createString("idCard");

    public final StringPath idIssued = createString("idIssued");

    public final StringPath issuedData = createString("issuedData");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath mobile = createString("mobile");

    public final StringPath name = createString("name");

    public final StringPath nation = createString("nation");

    public final StringPath OriginalAddress = createString("OriginalAddress");

    public final StringPath validDate = createString("validDate");

    public QIdCardInfo(String variable) {
        super(IdCardInfo.class, forVariable(variable));
    }

    public QIdCardInfo(Path<? extends IdCardInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIdCardInfo(PathMetadata metadata) {
        super(IdCardInfo.class, metadata);
    }

}

