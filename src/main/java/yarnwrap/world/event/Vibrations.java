package yarnwrap.world.event;
public class Vibrations { public net.minecraft.world.event.Vibrations wrapperContained; public Vibrations(net.minecraft.world.event.Vibrations wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List RESONATIONS() { return wrapperContained.RESONATIONS; }
// public void RESONATIONS(java.util.List value) { wrapperContained.RESONATIONS = value; }
public java.util.function.ToIntFunction FREQUENCIES() { return wrapperContained.FREQUENCIES; }
// public void FREQUENCIES(java.util.function.ToIntFunction value) { wrapperContained.FREQUENCIES = value; }
public int DEFAULT_FREQUENCY() { return wrapperContained.DEFAULT_FREQUENCY; }
// public void DEFAULT_FREQUENCY(int value) { wrapperContained.DEFAULT_FREQUENCY = value; }
public Object getVibrationListenerData() { return wrapperContained.getVibrationListenerData(); }
public Object getVibrationCallback() { return wrapperContained.getVibrationCallback(); }
// public void method_51383(it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap frequencies) { wrapperContained.method_51383(frequencies); }
// public int getSignalStrength(float distance,int range) { return wrapperContained.getSignalStrength(distance,range); }
// public int getFrequency(yarnwrap.registry.RegistryKey gameEvent) { return wrapperContained.getFrequency(gameEvent.wrapperContained); }
// public yarnwrap.registry.RegistryKey getResonation(int frequency) { return new yarnwrap.registry.RegistryKey(wrapperContained.getResonation(frequency)); }
// public int getFrequency(yarnwrap.registry.entry.RegistryEntry gameEvent) { return wrapperContained.getFrequency(gameEvent.wrapperContained); }

}