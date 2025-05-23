package yarnwrap.world.timer;
public class TimerCallback { public net.minecraft.world.timer.TimerCallback wrapperContained; public TimerCallback(net.minecraft.world.timer.TimerCallback wrapperContained) { this.wrapperContained = wrapperContained; }

public void call(java.lang.Object server,yarnwrap.world.timer.Timer events,long time) { wrapperContained.call(server,events.wrapperContained,time); }
// public static void call(java.lang.Object server,yarnwrap.world.timer.Timer events,long time, ) { net.minecraft.world.timer.TimerCallback.call(server,events.wrapperContained,time); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.world.timer.TimerCallback.getCodec(); }

}