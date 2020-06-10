package io.zwt.servlet;

import io.zwt.listener.MyAsyncListener;

import javax.servlet.AsyncContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AsyncListenerServlet",
    urlPatterns = {"/asyncListener"},
    asyncSupported = true)
public class AsyncListenerServlet extends HttpServlet {
    private static final long serialVersionUID = 62738L;

    @Override
    public void doGet(final HttpServletRequest request,
                      HttpServletResponse response) {
        final AsyncContext asyncContext = request.startAsync();
        asyncContext.setTimeout(5000);

        asyncContext.addListener(new MyAsyncListener());
        asyncContext.start(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            String greeting = "hi from listener";
            System.out.println("wait....");
            request.setAttribute("greeting", greeting);
            asyncContext.dispatch("/test.jsp");
        });
    }
}
