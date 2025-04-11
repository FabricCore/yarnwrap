package yarnwrap.util.profiling.jfr.event;
public class NetworkSummaryEvent { public net.minecraft.util.profiling.jfr.event.NetworkSummaryEvent wrapperContained; public NetworkSummaryEvent(net.minecraft.util.profiling.jfr.event.NetworkSummaryEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public NetworkSummaryEvent(java.lang.String remoteAddress) { this.wrapperContained = new net.minecraft.util.profiling.jfr.event.NetworkSummaryEvent(remoteAddress); }

}