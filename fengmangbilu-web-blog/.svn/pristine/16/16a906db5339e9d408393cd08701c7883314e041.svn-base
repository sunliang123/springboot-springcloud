<#import "common/page.ftl" as page>
<@page.html app="index">
	<section class="main">
		<div class="container">
			<div class="row">
				<div class="col-sm-8">
				   <div class="postList">
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
				    </div> 
				    <div class="postLoader">
					    <article class="post">
								<div class="post-header">
									<div class="title"></div>
								</div>
							<div class="post-content">
								<div class="text"></div>
								<div class="text animation-delay"></div>
								<div class="text short-text"></div>
							</div>
						</article>
					</div> 
				</div>
				<div class="col-sm-4">
					<div class="sidebar">
						<aside class="widget">
							<div class="widget-title">关于我们</div>

							<div class="about-widget">
								<img src="/img/swords_128.png" alt="About Me">

								<p class="text-left">锋芒毕露工作室由忠信信息技术团队主办，每期都会邀请忠信大咖及其他互联网公司的技术专家分享来自一线的实践经验，覆盖各主要技术领域。</p>

								<a href="about" class="btn-read-more mt-2">查看更多 <i class="fas fa-long-arrow-alt-right"></i></a>
								<ul class="socials mt-3">
									<li><a href="http://qq.com"><i class="fab fa-qq"></i></a></li>
									<li><a href="http://weixin.com"><i class="fab fa-weixin"></i></a></li>
									<li><a href="http://weibo.com"><i class="fab fa-weibo"></i></a></li>
								</ul>
							</div>
						</aside>

						<aside class="widget widget_archive">
							<div class="widget-title">文章存档</div>
							<ul>
								<#list archives as archive>
								<li><a href="#">${archive[0]?string("yyyy年MM月")}</a> <span class="float-right">(${archive[1]})</span></li>
								</#list>
							</ul>

						</aside>

						<aside class="widget widget_tag">
							<div class="widget-title">文章标签</div>
							<div class="tag">
								<#list tags as tag>
								<a href="tags/${tag.id}">${tag.name}</a> 
								</#list>
							</div>
						</aside>
						
						
					</div>
				</div>
			</div>
		</div>
	</section>
	
</@page.html>