package yarnwrap.sound;
public class MusicSound { public net.minecraft.sound.MusicSound wrapperContained; public MusicSound(net.minecraft.sound.MusicSound wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public void sound(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.sound = value.wrapperContained; }
// public int minDelay() { return wrapperContained.minDelay; }
// public void minDelay(int value) { wrapperContained.minDelay = value; }
// public int maxDelay() { return wrapperContained.maxDelay; }
// public void maxDelay(int value) { wrapperContained.maxDelay = value; }
// public boolean replaceCurrentMusic() { return wrapperContained.replaceCurrentMusic; }
// public void replaceCurrentMusic(boolean value) { wrapperContained.replaceCurrentMusic = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public int getMinDelay() { return wrapperContained.getMinDelay(); }
public int getMaxDelay() { return wrapperContained.getMaxDelay(); }
public boolean shouldReplaceCurrentMusic() { return wrapperContained.shouldReplaceCurrentMusic(); }

}