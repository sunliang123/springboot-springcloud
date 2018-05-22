package com.fengmangbilu.blog.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBlog is a Querydsl query type for Blog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBlog extends EntityPathBase<Blog> {

    private static final long serialVersionUID = -396390385L;

    public static final QBlog blog = new QBlog("blog");

    public final com.fengmangbilu.domain.QSimpleEntity _super = new com.fengmangbilu.domain.QSimpleEntity(this);

    public final StringPath author = createString("author");

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath summary = createString("summary");

    public final CollectionPath<Tag, QTag> tags = this.<Tag, QTag>createCollection("tags", Tag.class, QTag.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public QBlog(String variable) {
        super(Blog.class, forVariable(variable));
    }

    public QBlog(Path<? extends Blog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBlog(PathMetadata metadata) {
        super(Blog.class, metadata);
    }

}

