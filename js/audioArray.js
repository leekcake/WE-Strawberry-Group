//Audio Array/Spectrum Processing for Strawberry Group

var lastAudioArray, audioArray;

function lerpAudioArray() {
	/*
    if(useLerp) {
		for(var i = 0; i < lastAudioArray.length; i++) {
			audioArray[i] = lerp(audioArray[i], lastAudioArray[i], lerpPower);
		}
	} else {
		*/
		audioArray = lastAudioArray;
	//}
}

function wallpaperAudioListener(audio) {
	lastAudioArray = audio;
	if(audioArray == null) {
		audioArray = audio;
	}
}