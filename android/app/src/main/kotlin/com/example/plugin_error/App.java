package com.example.plugin_error;

import io.flutter.app.FlutterApplication;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.view.FlutterMain;

public class App extends FlutterApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        // create flutter engine
        // it will register plugin automatically using reflection
        // FlutterEngine.java:301
        FlutterEngine engine = new FlutterEngine(this);

        // just for debug mode
        // executing startExample() function in main.dart
        engine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint(FlutterMain.findAppBundlePath(), "startExample"));
    }
}
