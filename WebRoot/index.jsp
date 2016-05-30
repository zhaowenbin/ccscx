<script>window.location.href='zs/login2.jsp';</script>
<!-- 

<script>
	var openWindow = function(url, options) {
		var str = "";
		if (options) {
			options.height = options.height || 600;
			options.width = options.width || 800;
			options.left = options.left || ((screen.width - options.width) / 2); //默认为居中
			options.top = options.top || ((screen.height - options.height) / 2); //默认为居中
			for ( var i in options) {
				str += ',' + i + '=' + options[i];
			}
			str = str.substr(1);
		}
		;
		window.open(url, 'connect_window_' + (+new Date), str);//参数1为url,参数2为了能可以重复弹出
		str = null;
	};

	function openwin(url) {
		/*
	    var a = document.createElement("a");  
	    a.setAttribute("href", url);  
	    a.setAttribute("target", "_blank");  
	    a.setAttribute("id", "camnpr");  
	    document.body.appendChild(a);  
	    a.click();  
		*/
		openWindow(url,{
			width:900,
			height:610,
			titlebar:"no",
			toolbar:"no",
			location:"no",
			status:"no",
			menubar:"no",
			resizable:"yes"
		});
	} 

	window.onload=function(){
		document.getElementById("aid").onclick();
	}

	/*
	window.open(
				'zs/table.jsp',
				'NewWinName',
				'titlebar=no,toolbar=no,location=no,status=no,menubar=no,resizable=yes,width=900,height=610,top=10,left=100');
	*/
</script>
<body>
	<a id='aid' href="#" onclick="openwin('zs/table.jsp')"></a>
</body>
 -->