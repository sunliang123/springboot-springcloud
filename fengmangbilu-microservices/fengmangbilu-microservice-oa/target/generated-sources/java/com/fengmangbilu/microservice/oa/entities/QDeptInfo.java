package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDeptInfo is a Querydsl query type for DeptInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDeptInfo extends EntityPathBase<DeptInfo> {

    private static final long serialVersionUID = 44519541L;

    public static final QDeptInfo deptInfo = new QDeptInfo("deptInfo");

    public final com.fengmangbilu.domain.QBaseEntity _super = new com.fengmangbilu.domain.QBaseEntity(this);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> deptId = createNumber("deptId", Long.class);

    public final BooleanPath hasSubDept = createBoolean("hasSubDept");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final NumberPath<Long> sortFactor = createNumber("sortFactor", Long.class);

    public final NumberPath<Long> superId = createNumber("superId", Long.class);

    public QDeptInfo(String variable) {
        super(DeptInfo.class, forVariable(variable));
    }

    public QDeptInfo(Path<? extends DeptInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDeptInfo(PathMetadata metadata) {
        super(DeptInfo.class, metadata);
    }

}

