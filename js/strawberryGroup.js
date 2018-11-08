//Strawberry Group for Strawberry Group (?)

var strawBerry = new Image();

var ox = 0, oy = 0;

function loadStrawberry() {
	 strawBerry.src = 'res/strawberry-2850845-lower.png'
}

function drawStrawberryGroup() {
	ox += 1;
	oy += 1;
	if(ox == 96) {
		ox = 0;
	}
	if(oy == 96) {
		oy = 0;
	}
	for(var y = -200; y < audioCanvas.height + 200; y+=96) {
		for(var x = -200; x < audioCanvas.width + 200; x+=96) {
			audioCanvasCtx.drawImage(strawBerry, x+ox, y+oy)
		}
	}
}