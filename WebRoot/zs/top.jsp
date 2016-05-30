<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>CSS Mac Dock</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/interface.js"></script>

<!--[if lt IE 7]>
 <style type="text/css">
 div, img { behavior: url(iepngfix.htc) }
 </style>
<![endif]-->

<link href="css/dockstyle.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="dock" id="dock">
  <div class="dock-container">
  <a class="dock-item" href="#" onclick="alert('扩展功能待开发')"><img src="images/home.png" alt="home" /><span>Home</span></a> 
  <a class="dock-item" href="#" onclick="alert('扩展功能待开发')"><img src="images/email.png" alt="contact" /><span>Contact</span></a> 
  <a class="dock-item" href="#" onclick="alert('扩展功能待开发')"><img src="images/portfolio.png" alt="portfolio" /><span>Portfolio</span></a> 
  <a class="dock-item" href="#" onclick="alert('扩展功能待开发')"><img src="images/music.png" alt="music" /><span>Music</span></a> 
  <a class="dock-item" href="#" onclick="alert('扩展功能待开发')"><img src="images/video.png" alt="video" /><span>Video</span></a> 
  <a class="dock-item" href="#" onclick="alert('扩展功能待开发')"><img src="images/history.png" alt="history" /><span>History</span></a> 
  <a class="dock-item" href="#" onclick="alert('扩展功能待开发')"><img src="images/calendar.png" alt="calendar" /><span>Calendar</span></a> 
  <a class="dock-item" href="#" onclick="alert('扩展功能待开发')"><img src="images/rss.png" alt="rss" /><span>RSS</span></a> 
</div>
</div>
<script type="text/javascript">
	
	$(document).ready(
		function()
		{
			$('#dock').Fisheye(
				{
					maxWidth: 50,
					items: 'a',
					itemsText: 'span',
					container: '.dock-container',
					itemWidth: 40,
					proximity: 90,
					halign : 'center'
				}
			)
		}
	);

</script>
</body>
</html>