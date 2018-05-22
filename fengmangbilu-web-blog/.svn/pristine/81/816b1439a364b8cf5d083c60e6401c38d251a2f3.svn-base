<#import "common/page.ftl" as page>
<@page.html title="${blog.title}" app="about">
	<section class="main">
		<div class="container">
             <div class="row">
             	<div class="col-12">
                <article class="blog">
                   <div class="blog-header">
                        <h2 class="blog-title">${blog.title}</h2>
                        <ul class="blog-meta">
                            <li><i class="fas fa-calendar font"></i> ${blog.createdDate?string("yyyy-MM-dd HH:mm")}</li>
                            <li><i class="fas fa-edit font"></i> ${blog.author}</li>
                            <li><i class="fas fa-comment font"></i> 添加评论</li>
                            <li><i class="fas fa-share-alt font"></i> 分享</li>
                        </ul>
                    </div>
                    <div class="blog-detail">${blog.content}</div>
                </article>
                </div>
             </div>
         </div>
	</section>
</@page.html>