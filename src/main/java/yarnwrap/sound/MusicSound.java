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
public MusicSound(yarnwrap.registry.entry.RegistryEntry sound,int minDelay,int maxDelay,boolean replaceCurrentMusic) { this.wrapperContained = new net.minecraft.sound.MusicSound(sound.wrapperContained,minDelay,maxDelay,replaceCurrentMusic); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public int getMinDelay() { return wrapperContained.getMinDelay(); }
public int getMaxDelay() { return wrapperContained.getMaxDelay(); }
public boolean shouldReplaceCurrentMusic() { return wrapperContained.shouldReplaceCurrentMusic(); }
// public java.lang.Boolean method_28127(yarnwrap.sound.MusicSound sound) { return wrapperContained.method_28127(sound.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28128(Object instance) { return wrapperContained.method_28128(instance); }
// public java.lang.Integer method_28129(yarnwrap.sound.MusicSound sound) { return wrapperContained.method_28129(sound.wrapperContained); }
// public java.lang.Integer method_28130(yarnwrap.sound.MusicSound sound) { return wrapperContained.method_28130(sound.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_28131(yarnwrap.sound.MusicSound sound) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28131(sound.wrapperContained)); }

}