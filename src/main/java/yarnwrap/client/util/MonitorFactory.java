package yarnwrap.client.util;
public class MonitorFactory { public net.minecraft.client.util.MonitorFactory wrapperContained; public MonitorFactory(net.minecraft.client.util.MonitorFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.util.Monitor createMonitor(long pointer) { return new yarnwrap.client.util.Monitor(wrapperContained.createMonitor(pointer)); }

}