;(function () {
	function application () {
	var application = document.getElementById('application');
			var cover = document.getElementById('cover')
			var icon = document.getElementById('icon')
			var close = document.getElementById('close')
			application.onclick = function () {
				cover.style.display = 'block';
				icon.style.display = 'block';
				return false;
			}
			close.onclick = function () {
				cover.style.display = 'none';
				icon.style.display = 'none';
				return false;
			}
		}
	window.application = application;
})()
application();