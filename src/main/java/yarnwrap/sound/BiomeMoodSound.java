package yarnwrap.sound;
public class BiomeMoodSound { public net.minecraft.sound.BiomeMoodSound wrapperContained; public BiomeMoodSound(net.minecraft.sound.BiomeMoodSound wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.sound.BiomeMoodSound CAVE() { return new yarnwrap.sound.BiomeMoodSound(wrapperContained.CAVE); }
// public void CAVE(yarnwrap.sound.BiomeMoodSound value) { wrapperContained.CAVE = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public void sound(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.sound = value.wrapperContained; }
// public int cultivationTicks() { return wrapperContained.cultivationTicks; }
// public void cultivationTicks(int value) { wrapperContained.cultivationTicks = value; }
// public int spawnRange() { return wrapperContained.spawnRange; }
// public void spawnRange(int value) { wrapperContained.spawnRange = value; }
// public double extraDistance() { return wrapperContained.extraDistance; }
// public void extraDistance(double value) { wrapperContained.extraDistance = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public int getCultivationTicks() { return wrapperContained.getCultivationTicks(); }
public int getSpawnRange() { return wrapperContained.getSpawnRange(); }
public double getExtraDistance() { return wrapperContained.getExtraDistance(); }

}