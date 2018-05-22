package com.fengmangbilu.microservice.oa.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEducationInfo is a Querydsl query type for EducationInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEducationInfo extends EntityPathBase<EducationInfo> {

    private static final long serialVersionUID = 1779377620L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEducationInfo educationInfo = new QEducationInfo("educationInfo");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath educationDegree = createString("educationDegree");

    public final StringPath enrolDate = createString("enrolDate");

    public final StringPath graduate = createString("graduate");

    public final StringPath graduateTime = createString("graduateTime");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath idCard = createString("idCard");

    public final StringPath jnlNo = createString("jnlNo");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final StringPath photo = createString("photo");

    public final QSchoolInfo schoolInfo;

    public final StringPath specialityName = createString("specialityName");

    public final StringPath studyResult = createString("studyResult");

    public final StringPath studyStyle = createString("studyStyle");

    public QEducationInfo(String variable) {
        this(EducationInfo.class, forVariable(variable), INITS);
    }

    public QEducationInfo(Path<? extends EducationInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEducationInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEducationInfo(PathMetadata metadata, PathInits inits) {
        this(EducationInfo.class, metadata, inits);
    }

    public QEducationInfo(Class<? extends EducationInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.schoolInfo = inits.isInitialized("schoolInfo") ? new QSchoolInfo(forProperty("schoolInfo")) : null;
    }

}

