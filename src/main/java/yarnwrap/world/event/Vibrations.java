package yarnwrap.world.event;
public class Vibrations { public net.minecraft.world.event.Vibrations wrapperContained; public Vibrations(net.minecraft.world.event.Vibrations wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List RESONATIONS() { return wrapperContained.RESONATIONS; }
// public void RESONATIONS(java.util.List value) { wrapperContained.RESONATIONS = value; }
public static java.util.List RESONATIONS() { return net.minecraft.world.event.Vibrations.RESONATIONS; }
// public static void RESONATIONS(java.util.List value, ) { net.minecraft.world.event.Vibrations.RESONATIONS = value; }

// public java.util.function.ToIntFunction FREQUENCIES() { return wrapperContained.FREQUENCIES; }
// public void FREQUENCIES(java.util.function.ToIntFunction value) { wrapperContained.FREQUENCIES = value; }
public static java.util.function.ToIntFunction FREQUENCIES() { return net.minecraft.world.event.Vibrations.FREQUENCIES; }
// public static void FREQUENCIES(java.util.function.ToIntFunction value, ) { net.minecraft.world.event.Vibrations.FREQUENCIES = value; }

// public int DEFAULT_FREQUENCY() { return wrapperContained.DEFAULT_FREQUENCY; }
// public void DEFAULT_FREQUENCY(int value) { wrapperContained.DEFAULT_FREQUENCY = value; }
public static int DEFAULT_FREQUENCY() { return net.minecraft.world.event.Vibrations.DEFAULT_FREQUENCY; }
// public static void DEFAULT_FREQUENCY(int value, ) { net.minecraft.world.event.Vibrations.DEFAULT_FREQUENCY = value; }

public Object getVibrationListenerData() { return wrapperContained.getVibrationListenerData(); }
// public static Object getVibrationListenerData() { return net.minecraft.world.event.Vibrations.getVibrationListenerData(); }
public Object getVibrationCallback() { return wrapperContained.getVibrationCallback(); }
// public static Object getVibrationCallback() { return net.minecraft.world.event.Vibrations.getVibrationCallback(); }
// public void method_51383(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap frequencies) { wrapperContained.method_51383(frequencies); }
// public static void method_51383(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap frequencies, ) { net.minecraft.world.event.Vibrations.method_51383(frequencies); }
// public int getSignalStrength(float distance,int range) { return wrapperContained.getSignalStrength(distance,range); }
// public static int getSignalStrength(float distance,int range, ) { return net.minecraft.world.event.Vibrations.getSignalStrength(distance,range); }
// public int getFrequency(yarnwrap.registry.RegistryKey gameEvent) { return wrapperContained.getFrequency(gameEvent.wrapperContained); }
// public static int getFrequency(yarnwrap.registry.RegistryKey gameEvent, ) { return net.minecraft.world.event.Vibrations.getFrequency(gameEvent.wrapperContained); }
// public yarnwrap.registry.RegistryKey getResonation(int frequency) { return new yarnwrap.registry.RegistryKey(wrapperContained.getResonation(frequency)); }
// public static yarnwrap.registry.RegistryKey getResonation(int frequency, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.world.event.Vibrations.getResonation(frequency)); }
// public int getFrequency(yarnwrap.registry.entry.RegistryEntry gameEvent) { return wrapperContained.getFrequency(gameEvent.wrapperContained); }
// public static int getFrequency(yarnwrap.registry.entry.RegistryEntry gameEvent, ) { return net.minecraft.world.event.Vibrations.getFrequency(gameEvent.wrapperContained); }

}