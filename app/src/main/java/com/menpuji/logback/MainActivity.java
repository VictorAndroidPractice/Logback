package com.menpuji.logback;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger logger = LoggerFactory.getLogger("logtest");
        logger.trace("angcyo-->{}", "trace");
        logger.debug("angcyo-->{}", "debug");
        logger.info("angcyo-->{}", "info");
        logger.warn("angcyo-->{}", "warn");
        logger.error("angcyo-->{}", "error");
    }
}
