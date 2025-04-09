package yarnwrap.sound;
public class BiomeMoodSound { public net.minecraft.sound.BiomeMoodSound wrapperContained; public BiomeMoodSound(net.minecraft.sound.BiomeMoodSound wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.sound.BiomeMoodSound CAVE() { return new yarnwrap.sound.BiomeMoodSound(wrapperContained.CAVE); }
// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public int cultivationTicks() { return wrapperContained.cultivationTicks; }
// public int spawnRange() { return wrapperContained.spawnRange; }
// public double extraDistance() { return wrapperContained.extraDistance; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public int getCultivationTicks() { return wrapperContained.getCultivationTicks(); }
public int getSpawnRange() { return wrapperContained.getSpawnRange(); }
public double getExtraDistance() { return wrapperContained.getExtraDistance(); }

}