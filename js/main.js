//Main for Strawberry Group

var audioCanvas, audioCanvasCtx;

window.onload = function() {
	audioCanvas = document.getElementById("audioCanvas");
	audioCanvas.width = window.innerWidth;
	audioCanvas.height = window.innerHeight;
	audioCanvasCtx = audioCanvas.getContext("2d");
	window.wallpaperRegisterAudioListener(wallpaperAudioListener);
	window.requestAnimationFrame(draw);
	
	loadStrawberry();

	window.wallpaperPropertyListener = {
		applyUserProperties: wallpaperPropertyListener
	}
};

window.onresize = function(event) {
	if(audioCanvas != null) {
		audioCanvas.width = window.innerWidth;
		audioCanvas.height = window.innerHeight;
	}
}

function draw(timestrap) {	
	if(lastAudioArray == null) {
		window.requestAnimationFrame(draw);
		return;
	}

	lerpAudioArray();

	 // Clears the rectangle
	 audioCanvasCtx.clearRect(0, 0, audioCanvas.width, audioCanvas.height);
	 
	 drawStrawberryGroup();
	 
	window.requestAnimationFrame(draw);
}