package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPersonInfo is a Querydsl query type for PersonInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPersonInfo extends EntityPathBase<PersonInfo> {

    private static final long serialVersionUID = 1160606981L;

    public static final QPersonInfo personInfo = new QPersonInfo("personInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath birthday = createString("birthday");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath gender = createString("gender");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath idCard = createString("idCard");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final StringPath originalAddress = createString("originalAddress");

    public final StringPath photo = createString("photo");

    public QPersonInfo(String variable) {
        super(PersonInfo.class, forVariable(variable));
    }

    public QPersonInfo(Path<? extends PersonInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPersonInfo(PathMetadata metadata) {
        super(PersonInfo.class, metadata);
    }

}

