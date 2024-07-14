package stduy.designpattern.trace.proxy.v1_proxy.interface_proxy;

import lombok.RequiredArgsConstructor;
import stduy.designpattern.trace.TraceStatus;
import stduy.designpattern.trace.logtrace.LogTrace;
import stduy.designpattern.trace.app.v1.OrderServiceV1;

@RequiredArgsConstructor
public class OrderServiceInterfaceProxy implements OrderServiceV1 {
    private final OrderServiceV1 target;
    private final LogTrace trace;

    @Override
    public void orderItem(String itemId) {
        TraceStatus status = null;
        try {
            status  = trace.begin("OrderService.orderItem()");

            target.orderItem(itemId);
            trace.end(status);
        } catch (Exception e) {
            trace.exception(status, e);
            throw e;
        }
    }
}
