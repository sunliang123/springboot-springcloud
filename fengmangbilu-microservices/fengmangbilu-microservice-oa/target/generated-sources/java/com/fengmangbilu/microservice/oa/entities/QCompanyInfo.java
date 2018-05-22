package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCompanyInfo is a Querydsl query type for CompanyInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompanyInfo extends EntityPathBase<CompanyInfo> {

    private static final long serialVersionUID = 1556432809L;

    public static final QCompanyInfo companyInfo = new QCompanyInfo("companyInfo");

    public final com.fengmangbilu.domain.QBaseEntity _super = new com.fengmangbilu.domain.QBaseEntity(this);

    public final StringPath actualCapital = createString("actualCapital");

    public final DateTimePath<java.util.Date> approvedTime = createDateTime("approvedTime", java.util.Date.class);

    public final StringPath businessLicense = createString("businessLicense");

    public final StringPath businessScope = createString("businessScope");

    public final StringPath categoryScore = createString("categoryScore");

    public final StringPath companyId = createString("companyId");

    public final StringPath companyOrgType = createString("companyOrgType");

    public final StringPath compayScale = createString("compayScale");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath creditCode = createString("creditCode");

    public final StringPath estiblishTime = createString("estiblishTime");

    public final DateTimePath<java.util.Date> fromTime = createDateTime("fromTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath industry = createString("industry");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath legalPersonId = createString("legalPersonId");

    public final StringPath legalPersonName = createString("legalPersonName");

    public final StringPath name = createString("name");

    public final StringPath orgApprovedInstitute = createString("orgApprovedInstitute");

    public final StringPath orgNumber = createString("orgNumber");

    public final StringPath percentileScore = createString("percentileScore");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath regCapital = createString("regCapital");

    public final StringPath regInstitute = createString("regInstitute");

    public final StringPath regLocation = createString("regLocation");

    public final StringPath regNumber = createString("regNumber");

    public final StringPath regStatus = createString("regStatus");

    public final StringPath toTime = createString("toTime");

    public final StringPath type = createString("type");

    public final StringPath websiteList = createString("websiteList");

    public QCompanyInfo(String variable) {
        super(CompanyInfo.class, forVariable(variable));
    }

    public QCompanyInfo(Path<? extends CompanyInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCompanyInfo(PathMetadata metadata) {
        super(CompanyInfo.class, metadata);
    }

}

