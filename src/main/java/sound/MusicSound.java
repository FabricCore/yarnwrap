package yarnwrap.sound;
public class MusicSound { public net.minecraft.sound.MusicSound wrapperContained; public MusicSound(net.minecraft.sound.MusicSound wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public int minDelay() { return wrapperContained.minDelay; }
// public int maxDelay() { return wrapperContained.maxDelay; }
// public boolean replaceCurrentMusic() { return wrapperContained.replaceCurrentMusic; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public int getMinDelay() { return wrapperContained.getMinDelay(); }
public int getMaxDelay() { return wrapperContained.getMaxDelay(); }
public boolean shouldReplaceCurrentMusic() { return wrapperContained.shouldReplaceCurrentMusic(); }

}