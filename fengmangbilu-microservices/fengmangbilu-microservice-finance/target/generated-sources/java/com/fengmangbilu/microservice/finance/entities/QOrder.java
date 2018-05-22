package com.fengmangbilu.microservice.finance.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = 1433619558L;

    public static final QOrder order = new QOrder("order1");

    public final com.fengmangbilu.domain.QBaseEntity _super = new com.fengmangbilu.domain.QBaseEntity(this);

    public final StringPath buyerId = createString("buyerId");

    public final StringPath buyerName = createString("buyerName");

    public final EnumPath<com.fengmangbilu.microservice.finance.enums.ChargeType> chargeType = createEnum("chargeType", com.fengmangbilu.microservice.finance.enums.ChargeType.class);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final EnumPath<com.fengmangbilu.microservice.finance.enums.Currency> currency = createEnum("currency", com.fengmangbilu.microservice.finance.enums.Currency.class);

    public final NumberPath<java.math.BigDecimal> discount = createNumber("discount", java.math.BigDecimal.class);

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> orderId = createNumber("orderId", Long.class);

    public final EnumPath<com.fengmangbilu.microservice.finance.enums.OrderStatus> orderStatus = createEnum("orderStatus", com.fengmangbilu.microservice.finance.enums.OrderStatus.class);

    public final EnumPath<com.fengmangbilu.microservice.finance.enums.OrderType> orderType = createEnum("orderType", com.fengmangbilu.microservice.finance.enums.OrderType.class);

    public final NumberPath<java.math.BigDecimal> originalAmount = createNumber("originalAmount", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> payAmount = createNumber("payAmount", java.math.BigDecimal.class);

    public final DateTimePath<java.util.Date> payDate = createDateTime("payDate", java.util.Date.class);

    public final StringPath payerId = createString("payerId");

    public final StringPath productCode = createString("productCode");

    public final StringPath productName = createString("productName");

    public QOrder(String variable) {
        super(Order.class, forVariable(variable));
    }

    public QOrder(Path<? extends Order> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOrder(PathMetadata metadata) {
        super(Order.class, metadata);
    }

}

