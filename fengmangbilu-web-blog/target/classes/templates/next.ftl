<#list blogs.content as blog> 
 	<article class="post">
		<div class="post-header">
			<h2 class="post-title">
				<a href="/blog/${blog.id}">${blog.title}</a>
			</h2>
			<ul class="post-meta">
				<li><i class="fas fa-calendar"></i> ${blog.createdDate?string("yyyy-MM-dd HH:mm")}</li>
				<li><i class="fas fa-edit"></i> ${blog.author}</li>
				<li><i class="fas fa-comment"></i> 添加评论</li>
        		<li><i class="fas fa-share-alt"></i> 分享</li>
			</ul>
		</div>
		<div class="post-content"><p>${blog.summary}</p></div>
	</article>
</#list> 
