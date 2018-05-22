package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSchoolInfo is a Querydsl query type for SchoolInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSchoolInfo extends EntityPathBase<SchoolInfo> {

    private static final long serialVersionUID = 385879460L;

    public static final QSchoolInfo schoolInfo = new QSchoolInfo("schoolInfo");

    public final StringPath address = createString("address");

    public final StringPath dept = createString("dept");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath is211 = createBoolean("is211");

    public final BooleanPath is985 = createBoolean("is985");

    public final StringPath level = createString("level");

    public final StringPath name = createString("name");

    public final StringPath nature = createString("nature");

    public final BooleanPath topSubject = createBoolean("topSubject");

    public final BooleanPath topUniversity = createBoolean("topUniversity");

    public final StringPath url = createString("url");

    public QSchoolInfo(String variable) {
        super(SchoolInfo.class, forVariable(variable));
    }

    public QSchoolInfo(Path<? extends SchoolInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSchoolInfo(PathMetadata metadata) {
        super(SchoolInfo.class, metadata);
    }

}

