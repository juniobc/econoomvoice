package com.speech.activator;

import android.speech.*;
import android.os.*;
import android.content.*;

public class WordActivator implements SpeechActivator, RecognitionListener{
	
	private static final String TAG = "WordActivator";
	
	private Context context;
	private SpeechRecognizer recognizer;
	private SoundsLikeWordMatcher matcher;

	@Override
	public void onReadyForSpeech(Bundle p1)
	{
		// TODO: Implement this method
	}

	@Override
	public void onBeginningOfSpeech()
	{
		// TODO: Implement this method
	}

	@Override
	public void onRmsChanged(float p1)
	{
		// TODO: Implement this method
	}

	@Override
	public void onBufferReceived(byte[] p1)
	{
		// TODO: Implement this method
	}

	@Override
	public void onEndOfSpeech()
	{
		// TODO: Implement this method
	}

	@Override
	public void onError(int p1)
	{
		// TODO: Implement this method
	}

	@Override
	public void onResults(Bundle p1)
	{
		// TODO: Implement this method
	}

	@Override
	public void onPartialResults(Bundle p1)
	{
		// TODO: Implement this method
	}

	@Override
	public void onEvent(int p1, Bundle p2)
	{
		// TODO: Implement this method
	}

	@Override
	public void detectActivator()
	{
		// TODO: Implement this method
	}

	@Override
	public void stop()
	{
		// TODO: Implement this method
	}


	
	
}
