//Configure Loader for Strawberry Group

//WallpaperEngine.Prop {
	var backgroundImg = null
	var backColor = 'rgb(0,0,0)';
//}

function readColorfromEngine(str) {
	var schemeColor = str.split(' ');
	schemeColor = schemeColor.map(function(c)
		 { return Math.ceil(c * 255); });
	return 'rgb(' + schemeColor + ')';
}

function updateBackground() {
	document.body.style.backgroundColor = backColor;
	if(backgroundImg != null && backgroundImg != "") {
		document.getElementById("background").setAttribute("src", "file:///" + decodeURI(backgroundImg));
		document.getElementById("background").style.display = 'block';
	} else {
		document.getElementById("background").removeAttribute("src")
		document.getElementById("background").style.display = 'none';
	}
}

function wallpaperPropertyListener(prop) {
	if(prop.backgroundImg) {
		backgroundImg = prop.backgroundImg.value;
	}
    //Color
	if(prop.backColor) {
		backColor = readColorfromEngine(prop.backColor.value);
	}
	updateBackground();
	
}