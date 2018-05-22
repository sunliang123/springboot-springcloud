(function($) {
    'use strict';
    
    $('[data-toggle="tooltip"]').tooltip();
    
    $(document).ready(function() {
        var $scroller = $('#scrollToTop'),
            $main = $('body,html'),
            $window = $(window);
        $scroller.css('display', 'none');
        $window.scroll(function() {
            if ($(this).scrollTop() > 0) {
                $scroller.fadeIn();
            } else {
                $scroller.fadeOut();
            }
        });
        $scroller.click(function() {
            $main.animate({
                scrollTop: 0
            }, 400);
            return false;
        });
    });
    
	var $container = $('.postList').infiniteScroll({
		path : function() {
			return '/next/' + this.pageIndex;
		},
		responseType : 'document',
		status : '.postLoader',
		history : false,
	});

	$container.on('load.infiniteScroll', function(event, response) {
		var $posts = $(response).find('.post');
		if($posts.length==0){
			 $container.infiniteScroll('option', {
			      loadOnScroll: false,
			 });
		}
		$container.infiniteScroll('appendItems', $posts);
	});
})(jQuery)

