package com.example.jsoupsample;

import android.app.Activity;
import android.os.Bundle;

public class JsoupActivity extends Activity {

	private JsoupTask task;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jsoup);
		
		
		
		task =new JsoupTask(this);
		
		task.execute("http://ohmynobu.net/index.php");
		
		
		
		
		
		
//
//		String url = "https://www.google.co.jp/";
//
//		try {
//			document = Jsoup.connect(url).get();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		String element_title = document.getElementsByTag("title").text();
//		String title = document.title();
//		
//		TextView txt =(TextView)findViewById(R.id.parseResultView);
//		
//		txt.setText(title);
//		
		
		
		
	}

}
