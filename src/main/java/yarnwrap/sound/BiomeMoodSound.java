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
public BiomeMoodSound(yarnwrap.registry.entry.RegistryEntry sound,int cultivationTicks,int spawnRange,double extraDistance) { this.wrapperContained = new net.minecraft.sound.BiomeMoodSound(sound.wrapperContained,cultivationTicks,spawnRange,extraDistance); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public int getCultivationTicks() { return wrapperContained.getCultivationTicks(); }
public int getSpawnRange() { return wrapperContained.getSpawnRange(); }
public double getExtraDistance() { return wrapperContained.getExtraDistance(); }
// public java.lang.Double method_28393(yarnwrap.sound.BiomeMoodSound sound) { return wrapperContained.method_28393(sound.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28394(Object instance) { return wrapperContained.method_28394(instance); }
// public java.lang.Integer method_28395(yarnwrap.sound.BiomeMoodSound sound) { return wrapperContained.method_28395(sound.wrapperContained); }
// public java.lang.Integer method_28396(yarnwrap.sound.BiomeMoodSound sound) { return wrapperContained.method_28396(sound.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_28397(yarnwrap.sound.BiomeMoodSound sound) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28397(sound.wrapperContained)); }

}