package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStaffInfo is a Querydsl query type for StaffInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStaffInfo extends EntityPathBase<StaffInfo> {

    private static final long serialVersionUID = -392330228L;

    public static final QStaffInfo staffInfo = new QStaffInfo("staffInfo");

    public final com.fengmangbilu.domain.QBaseEntity _super = new com.fengmangbilu.domain.QBaseEntity(this);

    public final NumberPath<Long> alCount = createNumber("alCount", Long.class);

    public final StringPath backImage = createString("backImage");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath companyName = createString("companyName");

    public final NumberPath<Long> cqggCount = createNumber("cqggCount", Long.class);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> deptId = createNumber("deptId", Long.class);

    public final StringPath deptName = createString("deptName");

    public final DateTimePath<java.util.Date> dimissionDate = createDateTime("dimissionDate", java.util.Date.class);

    public final StringPath education = createString("education");

    public final DateTimePath<java.util.Date> entryDate = createDateTime("entryDate", java.util.Date.class);

    public final StringPath frontImage = createString("frontImage");

    public final StringPath graduate = createString("graduate");

    public final StringPath headImage = createString("headImage");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath idCard = createString("idCard");

    public final BooleanPath isActive = createBoolean("isActive");

    public final BooleanPath isLeave = createBoolean("isLeave");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath leaveProve = createString("leaveProve");

    public final StringPath mobile = createString("mobile");

    public final StringPath name = createString("name");

    public final StringPath position = createString("position");

    public final StringPath specialityName = createString("specialityName");

    public final NumberPath<Long> swCount = createNumber("swCount", Long.class);

    public final NumberPath<Long> sxCount = createNumber("sxCount", Long.class);

    public final StringPath userId = createString("userId");

    public final NumberPath<Long> wdyqCount = createNumber("wdyqCount", Long.class);

    public final NumberPath<Long> zxCount = createNumber("zxCount", Long.class);

    public final NumberPath<Long> zyzgCount = createNumber("zyzgCount", Long.class);

    public QStaffInfo(String variable) {
        super(StaffInfo.class, forVariable(variable));
    }

    public QStaffInfo(Path<? extends StaffInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStaffInfo(PathMetadata metadata) {
        super(StaffInfo.class, metadata);
    }

}

