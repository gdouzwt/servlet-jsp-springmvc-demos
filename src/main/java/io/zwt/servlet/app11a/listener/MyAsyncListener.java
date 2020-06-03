package io.zwt.servlet.app11a.listener;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;

// do not annotate with @WebListener
public class MyAsyncListener implements AsyncListener {

    @Override
    public void onComplete(AsyncEvent asyncEvent) {
        System.out.println("onComplete");
    }

    @Override
    public void onError(AsyncEvent asyncEvent) {
        System.out.println("onError");
    }

    @Override
    public void onStartAsync(AsyncEvent asyncEvent) {
        System.out.println("onStartAsync");
    }

    @Override
    public void onTimeout(AsyncEvent asyncEvent) {
        System.out.println("onTimeout");
    }
}
