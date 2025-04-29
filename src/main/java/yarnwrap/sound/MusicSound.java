package yarnwrap.sound;
public class MusicSound { public net.minecraft.sound.MusicSound wrapperContained; public MusicSound(net.minecraft.sound.MusicSound wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public void sound(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.sound = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.sound.MusicSound.sound); }
// public static void sound(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.sound.MusicSound.sound = value.wrapperContained; }

// public int minDelay() { return wrapperContained.minDelay; }
// public void minDelay(int value) { wrapperContained.minDelay = value; }
// public static int minDelay() { return net.minecraft.sound.MusicSound.minDelay; }
// public static void minDelay(int value, ) { net.minecraft.sound.MusicSound.minDelay = value; }

// public int maxDelay() { return wrapperContained.maxDelay; }
// public void maxDelay(int value) { wrapperContained.maxDelay = value; }
// public static int maxDelay() { return net.minecraft.sound.MusicSound.maxDelay; }
// public static void maxDelay(int value, ) { net.minecraft.sound.MusicSound.maxDelay = value; }

// public boolean replaceCurrentMusic() { return wrapperContained.replaceCurrentMusic; }
// public void replaceCurrentMusic(boolean value) { wrapperContained.replaceCurrentMusic = value; }
// public static boolean replaceCurrentMusic() { return net.minecraft.sound.MusicSound.replaceCurrentMusic; }
// public static void replaceCurrentMusic(boolean value, ) { net.minecraft.sound.MusicSound.replaceCurrentMusic = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.sound.MusicSound.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.sound.MusicSound.CODEC = value; }

public MusicSound(yarnwrap.registry.entry.RegistryEntry sound,int minDelay,int maxDelay,boolean replaceCurrentMusic) { this.wrapperContained = new net.minecraft.sound.MusicSound(sound.wrapperContained,minDelay,maxDelay,replaceCurrentMusic); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
// public static yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.sound.MusicSound.getSound()); }
public int getMinDelay() { return wrapperContained.getMinDelay(); }
// public static int getMinDelay() { return net.minecraft.sound.MusicSound.getMinDelay(); }
public int getMaxDelay() { return wrapperContained.getMaxDelay(); }
// public static int getMaxDelay() { return net.minecraft.sound.MusicSound.getMaxDelay(); }
public boolean shouldReplaceCurrentMusic() { return wrapperContained.shouldReplaceCurrentMusic(); }
// public static boolean shouldReplaceCurrentMusic() { return net.minecraft.sound.MusicSound.shouldReplaceCurrentMusic(); }
// public java.lang.Boolean method_28127(yarnwrap.sound.MusicSound sound) { return wrapperContained.method_28127(sound.wrapperContained); }
// public static java.lang.Boolean method_28127(yarnwrap.sound.MusicSound sound, ) { return net.minecraft.sound.MusicSound.method_28127(sound.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28128(Object instance) { return wrapperContained.method_28128(instance); }
// public static com.mojang.datafixers.kinds.App method_28128(Object instance, ) { return net.minecraft.sound.MusicSound.method_28128(instance); }
// public java.lang.Integer method_28129(yarnwrap.sound.MusicSound sound) { return wrapperContained.method_28129(sound.wrapperContained); }
// public static java.lang.Integer method_28129(yarnwrap.sound.MusicSound sound, ) { return net.minecraft.sound.MusicSound.method_28129(sound.wrapperContained); }
// public java.lang.Integer method_28130(yarnwrap.sound.MusicSound sound) { return wrapperContained.method_28130(sound.wrapperContained); }
// public static java.lang.Integer method_28130(yarnwrap.sound.MusicSound sound, ) { return net.minecraft.sound.MusicSound.method_28130(sound.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_28131(yarnwrap.sound.MusicSound sound) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28131(sound.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_28131(yarnwrap.sound.MusicSound sound, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.sound.MusicSound.method_28131(sound.wrapperContained)); }

}