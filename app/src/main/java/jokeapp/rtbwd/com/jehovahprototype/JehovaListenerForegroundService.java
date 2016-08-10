package jokeapp.rtbwd.com.jehovahprototype;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import root.gast.speech.activation.SpeechActivationService;

public class JehovaListenerForegroundService extends SpeechActivationService {
    public JehovaListenerForegroundService() {
    }


    @Override
    protected Notification getNotification(Intent intent){
        // TODO: Add code to build notification

        return null;
    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
