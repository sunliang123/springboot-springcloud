package com.fengmangbilu.microservice.user.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1883597146L;

    public static final QUser user = new QUser("user");

    public final com.fengmangbilu.domain.QDateEntity _super = new com.fengmangbilu.domain.QDateEntity(this);

    public final BooleanPath accountNonExpired = createBoolean("accountNonExpired");

    public final BooleanPath accountNonLocked = createBoolean("accountNonLocked");

    public final StringPath avatar = createString("avatar");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final BooleanPath credentialsNonExpired = createBoolean("credentialsNonExpired");

    public final StringPath email = createString("email");

    public final BooleanPath enabled = createBoolean("enabled");

    public final BooleanPath isCertified = createBoolean("isCertified");

    public final DateTimePath<java.util.Date> lastLoginDate = createDateTime("lastLoginDate", java.util.Date.class);

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final DateTimePath<java.util.Date> lastPasswordResetDate = createDateTime("lastPasswordResetDate", java.util.Date.class);

    public final StringPath mobile = createString("mobile");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final SetPath<Role, QRole> roles = this.<Role, QRole>createSet("roles", Role.class, QRole.class, PathInits.DIRECT2);

    public final StringPath userId = createString("userId");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

