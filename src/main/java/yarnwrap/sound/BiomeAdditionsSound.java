package yarnwrap.sound;
public class BiomeAdditionsSound { public net.minecraft.sound.BiomeAdditionsSound wrapperContained; public BiomeAdditionsSound(net.minecraft.sound.BiomeAdditionsSound wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public void sound(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.sound = value.wrapperContained; }
// public double chance() { return wrapperContained.chance; }
// public void chance(double value) { wrapperContained.chance = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public BiomeAdditionsSound(yarnwrap.registry.entry.RegistryEntry sound,double chance) { this.wrapperContained = new net.minecraft.sound.BiomeAdditionsSound(sound.wrapperContained,chance); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public double getChance() { return wrapperContained.getChance(); }
// public java.lang.Double method_28390(yarnwrap.sound.BiomeAdditionsSound sound) { return wrapperContained.method_28390(sound.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28391(Object instance) { return wrapperContained.method_28391(instance); }
// public yarnwrap.registry.entry.RegistryEntry method_28392(yarnwrap.sound.BiomeAdditionsSound sound) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28392(sound.wrapperContained)); }

}