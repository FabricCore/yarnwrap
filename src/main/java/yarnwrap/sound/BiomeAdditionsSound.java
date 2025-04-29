package yarnwrap.sound;
public class BiomeAdditionsSound { public net.minecraft.sound.BiomeAdditionsSound wrapperContained; public BiomeAdditionsSound(net.minecraft.sound.BiomeAdditionsSound wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public void sound(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.sound = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.sound.BiomeAdditionsSound.sound); }
// public static void sound(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.sound.BiomeAdditionsSound.sound = value.wrapperContained; }

// public double chance() { return wrapperContained.chance; }
// public void chance(double value) { wrapperContained.chance = value; }
// public static double chance() { return net.minecraft.sound.BiomeAdditionsSound.chance; }
// public static void chance(double value, ) { net.minecraft.sound.BiomeAdditionsSound.chance = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.sound.BiomeAdditionsSound.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.sound.BiomeAdditionsSound.CODEC = value; }

public BiomeAdditionsSound(yarnwrap.registry.entry.RegistryEntry sound,double chance) { this.wrapperContained = new net.minecraft.sound.BiomeAdditionsSound(sound.wrapperContained,chance); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
// public static yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.sound.BiomeAdditionsSound.getSound()); }
public double getChance() { return wrapperContained.getChance(); }
// public static double getChance() { return net.minecraft.sound.BiomeAdditionsSound.getChance(); }
// public java.lang.Double method_28390(yarnwrap.sound.BiomeAdditionsSound sound) { return wrapperContained.method_28390(sound.wrapperContained); }
// public static java.lang.Double method_28390(yarnwrap.sound.BiomeAdditionsSound sound, ) { return net.minecraft.sound.BiomeAdditionsSound.method_28390(sound.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28391(Object instance) { return wrapperContained.method_28391(instance); }
// public static com.mojang.datafixers.kinds.App method_28391(Object instance, ) { return net.minecraft.sound.BiomeAdditionsSound.method_28391(instance); }
// public yarnwrap.registry.entry.RegistryEntry method_28392(yarnwrap.sound.BiomeAdditionsSound sound) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28392(sound.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_28392(yarnwrap.sound.BiomeAdditionsSound sound, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.sound.BiomeAdditionsSound.method_28392(sound.wrapperContained)); }

}