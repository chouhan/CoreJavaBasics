(function($){
	$(document).ready(function(){
		/* module for breadcrumb bar
		************************************************/
		var bar_m = (function(){
			var bar = $(".horizontal-bar");

			function getWidth(){
				return bar.width();
			}

			function setWidth(width){
				bar.css("width", width+"px");
			}

			function resetWidth(){
				bar.css("width", "100%");
			}

			function barIsFloating(){
				return bar.hasClass("affix");
			}

			function collapseBar(){
				//if(barIsFloating()){
					bar.addClass("no-left");
					resetWidth();
				//}
			}

			function expandBar(){
				if(barIsFloating()){
					bar.removeClass("no-left");
					setWidth(bar.outerWidth()-300);
				}
			}

			return{
				setWidth: setWidth,
				getWidth: getWidth,
				resetWidth: resetWidth,
				collapseBar: collapseBar,
				expandBar: expandBar,
				barIsFloating: barIsFloating
			}
		})();


		/* Resize module - Functions to activate on resizing
		***********************************************/
		var resize_m = (function () {
			var collapse_btn = $("#panel-collapse");
			var content_panel = $(".doc-main-content");
			var content_body = $(".doc-body");
			var win = $(window);
			var mobile_width = 768;


			function adjustBodySize(){
				var current_height = win.height()-45;
				content_body.css("min-height", current_height+"px");
			}

			function initialize(){
				win.resize(function () {
					if(win.width() < mobile_width && !content_panel.hasClass("expand")){
						collapse_btn.click();
					}
					adjustBodySize();
					if(bar_m.barIsFloating()){
						bar_m.setWidth(content_body.outerWidth());
					}else{
						bar_m.resetWidth();
					}
				});
				//do the initial adjust
				adjustBodySize();
			} 

			return{
				init: initialize
			}
		})();

		/* Module for scroll specific functionality
		***********************************************/
		var scroll_m = (function(){
			var win = $(window);
			var content_body = $(".doc-body");

			function handleTheBar(){
				if(bar_m.barIsFloating()){
					bar_m.setWidth(content_body.outerWidth());
				}else{
					bar_m.resetWidth();
				}
			}

			function initialize(){
				win.scroll(function(){
					setTimeout(handleTheBar, 50);	
				});
			}

			return {
				init: initialize
			}
		})();


		/* Module for navigation elements manipulation
		***********************************************/
		var nav_m = (function (){
			// collect element
			var collapse_btn = $("#panel-collapse");
			var expand_btn = $("#panel-expand");
			var content_panel = $(".doc-main-content");
			var hr_current = $(".hr-current");

			function setupHandlers(){
				collapse_btn.on("click", function(){
					content_panel.addClass("expand");
					$(".doc-side-menu accordion").css("z-index", 0);
					$(".doc-side-menu").css("z-index", 0);
					bar_m.collapseBar();
					setTimeout(function(){
						expand_btn.removeClass("hidden");
						hr_current.removeClass("hidden");
					}, 400);
					return false;
				});
				expand_btn.on("click", function(){
					content_panel.removeClass("expand");
					bar_m.expandBar();
					setTimeout(function(){
						expand_btn.addClass("hidden");
						hr_current.addClass("hidden");
						$(".doc-side-menu").css("z-index", 1000);
						$(".doc-side-menu-item.active").css("z-index", 2);	
					}, 400);
					return false;
				});
			}

			function initialize(){
				setupHandlers();
			}

			return{
				init: initialize
			};
		})();

		nav_m.init();
		resize_m.init();
		scroll_m.init();

	});
})(jQuery)
