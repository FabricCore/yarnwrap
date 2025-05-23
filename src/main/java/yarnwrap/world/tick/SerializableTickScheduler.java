package yarnwrap.world.tick;
public class SerializableTickScheduler { public net.minecraft.world.tick.SerializableTickScheduler wrapperContained; public SerializableTickScheduler(net.minecraft.world.tick.SerializableTickScheduler wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List collectTicks(long time) { return wrapperContained.collectTicks(time); }
// public static java.util.List collectTicks(long time, ) { return net.minecraft.world.tick.SerializableTickScheduler.collectTicks(time); }

}