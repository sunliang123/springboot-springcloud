<#macro html title app>
<!DOCTYPE html>
<html lang="zh">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="//image.fengmangbilu.com/static/favicon.ico">
<title>${title!'锋芒毕露工作室-博客'}</title>
<link href="/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css">
<link href="/css/bootstrap-reboot.min.css" rel="stylesheet" type="text/css">
<link href="${urls.getForLookupPath('/css/style.css')}" rel="stylesheet" type="text/css" />
<script src="/js/fontawesome-all.min.js"></script>
<style></style>
</head>
<body>
	<section class="menu">
		<nav class="navbar navbar-expand beta-menu navbar-dropdown align-items-center navbar-fixed-top navbar-toggleable-sm">
			<button class="navbar-toggler navbar-toggler-right collapsed" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<div class="hamburger">
					<span></span> <span></span> <span></span> <span></span>
				</div>
			</button>
			<div class="menu-logo">
				<div class="navbar-brand">
					<span class="navbar-caption-wrap"><a class="navbar-caption display-5" href="https://thematic.me/agent"><i
							class="fab fa-blogger"></i></a></span>
				</div>
			</div>
			<div class="navbar-collapse collapse" id="navbarSupportedContent">
				<ul class="navbar-nav nav-dropdown" data-app-modern-menu="true">
					<li class="nav-item dropdown"><a class="nav-link link display-4 <#if app="index">active</#if>" href="/" aria-expanded="false">首页</a></li>
					<li class="nav-item"><a class="nav-link link display-4 <#if app="about">active</#if>" href="about">关于我们</a></li>
				</ul>
			</div>
		</nav>
	</section>
	<#nested>
	<section class="foot">
		<div class="container-fluid text-center ft-copyright">
			<p>© 2017 <a href="">锋芒毕露工作室 </a> - All rights reserved.</p>
		</div>
	</section>
	<section class="tool">
		<div class="corner">
			<button type="button" class="btn btn-outline-secondary"  data-toggle="tooltip" data-placement="left" title="意见反馈"><i class="fas fa-inbox fa-fw"></i></button>
		</div>
		<div class="corner" id="scrollToTop">
			<button type="button" class="btn btn-outline-secondary"  data-toggle="tooltip" data-placement="left" title="回到顶部"><i class="fa fa-arrow-up fa-fw"></i></button>
		</div>
	</section>
	<script src="/js/jquery.min.js"></script>
	<script src="/js/popper.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/dropdown.min.js"></script>
	<script src="https://unpkg.com/infinite-scroll@3/dist/infinite-scroll.pkgd.js"></script>
	<script src="/js/jquery.app.js"></script>
</body>
</html>
</#macro>