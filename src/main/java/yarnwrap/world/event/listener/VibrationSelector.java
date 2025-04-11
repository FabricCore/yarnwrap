package yarnwrap.world.event.listener;
public class VibrationSelector { public net.minecraft.world.event.listener.VibrationSelector wrapperContained; public VibrationSelector(net.minecraft.world.event.listener.VibrationSelector wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.Optional current() { return wrapperContained.current; }
// public void current(java.util.Optional value) { wrapperContained.current = value; }
public void clear() { wrapperContained.clear(); }
public java.util.Optional getVibrationToTick(long currentTick) { return wrapperContained.getVibrationToTick(currentTick); }
public void tryAccept(yarnwrap.world.event.listener.Vibration vibration,long tick) { wrapperContained.tryAccept(vibration.wrapperContained,tick); }
// public boolean shouldSelect(yarnwrap.world.event.listener.Vibration vibration,long tick) { return wrapperContained.shouldSelect(vibration.wrapperContained,tick); }

}