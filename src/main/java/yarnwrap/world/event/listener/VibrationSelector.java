package yarnwrap.world.event.listener;
public class VibrationSelector { public net.minecraft.world.event.listener.VibrationSelector wrapperContained; public VibrationSelector(net.minecraft.world.event.listener.VibrationSelector wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.event.listener.VibrationSelector.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.event.listener.VibrationSelector.CODEC = value; }

// public java.util.Optional current() { return wrapperContained.current; }
// public void current(java.util.Optional value) { wrapperContained.current = value; }
// public static java.util.Optional current() { return net.minecraft.world.event.listener.VibrationSelector.current; }
// public static void current(java.util.Optional value, ) { net.minecraft.world.event.listener.VibrationSelector.current = value; }

public VibrationSelector(java.util.Optional vibration,long tick) { this.wrapperContained = new net.minecraft.world.event.listener.VibrationSelector(vibration,tick); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.world.event.listener.VibrationSelector.clear(); }
public java.util.Optional getVibrationToTick(long currentTick) { return wrapperContained.getVibrationToTick(currentTick); }
// public static java.util.Optional getVibrationToTick(long currentTick, ) { return net.minecraft.world.event.listener.VibrationSelector.getVibrationToTick(currentTick); }
// public org.apache.commons.lang3.tuple.Pair method_45503(long vibration2) { return wrapperContained.method_45503(vibration2); }
// public static org.apache.commons.lang3.tuple.Pair method_45503(long vibration2, ) { return net.minecraft.world.event.listener.VibrationSelector.method_45503(vibration2); }
// public com.mojang.datafixers.kinds.App method_45504(Object instance) { return wrapperContained.method_45504(instance); }
// public static com.mojang.datafixers.kinds.App method_45504(Object instance, ) { return net.minecraft.world.event.listener.VibrationSelector.method_45504(instance); }
public void tryAccept(yarnwrap.world.event.listener.Vibration vibration,long tick) { wrapperContained.tryAccept(vibration.wrapperContained,tick); }
// public static void tryAccept(yarnwrap.world.event.listener.Vibration vibration,long tick, ) { net.minecraft.world.event.listener.VibrationSelector.tryAccept(vibration.wrapperContained,tick); }
// public boolean shouldSelect(yarnwrap.world.event.listener.Vibration vibration,long tick) { return wrapperContained.shouldSelect(vibration.wrapperContained,tick); }
// public static boolean shouldSelect(yarnwrap.world.event.listener.Vibration vibration,long tick, ) { return net.minecraft.world.event.listener.VibrationSelector.shouldSelect(vibration.wrapperContained,tick); }

}