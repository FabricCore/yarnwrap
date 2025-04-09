package yarnwrap.sound;
public class BiomeAdditionsSound { public net.minecraft.sound.BiomeAdditionsSound wrapperContained; public BiomeAdditionsSound(net.minecraft.sound.BiomeAdditionsSound wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public double chance() { return wrapperContained.chance; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public double getChance() { return wrapperContained.getChance(); }

}