package com.fengmangbilu.microservice.finance.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QInvoiceSetting is a Querydsl query type for InvoiceSetting
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInvoiceSetting extends EntityPathBase<InvoiceSetting> {

    private static final long serialVersionUID = 709057611L;

    public static final QInvoiceSetting invoiceSetting = new QInvoiceSetting("invoiceSetting");

    public final com.fengmangbilu.domain.QBaseEntity _super = new com.fengmangbilu.domain.QBaseEntity(this);

    public final StringPath bank = createString("bank");

    public final StringPath bankNo = createString("bankNo");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath id = createString("id");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath operatingLicenseAddress = createString("operatingLicenseAddress");

    public final StringPath operatingLicensePhone = createString("operatingLicensePhone");

    public final StringPath reason = createString("reason");

    public final EnumPath<com.fengmangbilu.microservice.finance.enums.AuditStatus> status = createEnum("status", com.fengmangbilu.microservice.finance.enums.AuditStatus.class);

    public final StringPath taxRegisterNo = createString("taxRegisterNo");

    public final StringPath title = createString("title");

    public final EnumPath<com.fengmangbilu.microservice.finance.enums.InvoiceType> type = createEnum("type", com.fengmangbilu.microservice.finance.enums.InvoiceType.class);

    public QInvoiceSetting(String variable) {
        super(InvoiceSetting.class, forVariable(variable));
    }

    public QInvoiceSetting(Path<? extends InvoiceSetting> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInvoiceSetting(PathMetadata metadata) {
        super(InvoiceSetting.class, metadata);
    }

}

