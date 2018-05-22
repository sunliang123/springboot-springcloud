package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCompanyAuth is a Querydsl query type for CompanyAuth
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompanyAuth extends EntityPathBase<CompanyAuth> {

    private static final long serialVersionUID = 1556201635L;

    public static final QCompanyAuth companyAuth = new QCompanyAuth("companyAuth");

    public final com.fengmangbilu.domain.QBaseEntity _super = new com.fengmangbilu.domain.QBaseEntity(this);

    public final StringPath businessLicense = createString("businessLicense");

    public final StringPath companyName = createString("companyName");

    public final StringPath compayScale = createString("compayScale");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath dept = createString("dept");

    public final StringPath failureReason = createString("failureReason");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath idCard = createString("idCard");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final StringPath position = createString("position");

    public final EnumPath<com.fengmangbilu.microservice.oa.enums.AuthStatus> status = createEnum("status", com.fengmangbilu.microservice.oa.enums.AuthStatus.class);

    public QCompanyAuth(String variable) {
        super(CompanyAuth.class, forVariable(variable));
    }

    public QCompanyAuth(Path<? extends CompanyAuth> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCompanyAuth(PathMetadata metadata) {
        super(CompanyAuth.class, metadata);
    }

}

