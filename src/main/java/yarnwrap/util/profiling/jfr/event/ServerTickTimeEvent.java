package yarnwrap.util.profiling.jfr.event;
public class ServerTickTimeEvent { public net.minecraft.util.profiling.jfr.event.ServerTickTimeEvent wrapperContained; public ServerTickTimeEvent(net.minecraft.util.profiling.jfr.event.ServerTickTimeEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public ServerTickTimeEvent(float averageTickMilliseconds) { this.wrapperContained = new net.minecraft.util.profiling.jfr.event.ServerTickTimeEvent(averageTickMilliseconds); }

}