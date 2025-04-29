package yarnwrap.sound;
public class BiomeMoodSound { public net.minecraft.sound.BiomeMoodSound wrapperContained; public BiomeMoodSound(net.minecraft.sound.BiomeMoodSound wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.sound.BiomeMoodSound CAVE() { return new yarnwrap.sound.BiomeMoodSound(wrapperContained.CAVE); }
// public void CAVE(yarnwrap.sound.BiomeMoodSound value) { wrapperContained.CAVE = value.wrapperContained; }
public static yarnwrap.sound.BiomeMoodSound CAVE() { return new yarnwrap.sound.BiomeMoodSound(net.minecraft.sound.BiomeMoodSound.CAVE); }
// public static void CAVE(yarnwrap.sound.BiomeMoodSound value, ) { net.minecraft.sound.BiomeMoodSound.CAVE = value.wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public void sound(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.sound = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.sound.BiomeMoodSound.sound); }
// public static void sound(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.sound.BiomeMoodSound.sound = value.wrapperContained; }

// public int cultivationTicks() { return wrapperContained.cultivationTicks; }
// public void cultivationTicks(int value) { wrapperContained.cultivationTicks = value; }
// public static int cultivationTicks() { return net.minecraft.sound.BiomeMoodSound.cultivationTicks; }
// public static void cultivationTicks(int value, ) { net.minecraft.sound.BiomeMoodSound.cultivationTicks = value; }

// public int spawnRange() { return wrapperContained.spawnRange; }
// public void spawnRange(int value) { wrapperContained.spawnRange = value; }
// public static int spawnRange() { return net.minecraft.sound.BiomeMoodSound.spawnRange; }
// public static void spawnRange(int value, ) { net.minecraft.sound.BiomeMoodSound.spawnRange = value; }

// public double extraDistance() { return wrapperContained.extraDistance; }
// public void extraDistance(double value) { wrapperContained.extraDistance = value; }
// public static double extraDistance() { return net.minecraft.sound.BiomeMoodSound.extraDistance; }
// public static void extraDistance(double value, ) { net.minecraft.sound.BiomeMoodSound.extraDistance = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.sound.BiomeMoodSound.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.sound.BiomeMoodSound.CODEC = value; }

public BiomeMoodSound(yarnwrap.registry.entry.RegistryEntry sound,int cultivationTicks,int spawnRange,double extraDistance) { this.wrapperContained = new net.minecraft.sound.BiomeMoodSound(sound.wrapperContained,cultivationTicks,spawnRange,extraDistance); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
// public static yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.sound.BiomeMoodSound.getSound()); }
public int getCultivationTicks() { return wrapperContained.getCultivationTicks(); }
// public static int getCultivationTicks() { return net.minecraft.sound.BiomeMoodSound.getCultivationTicks(); }
public int getSpawnRange() { return wrapperContained.getSpawnRange(); }
// public static int getSpawnRange() { return net.minecraft.sound.BiomeMoodSound.getSpawnRange(); }
public double getExtraDistance() { return wrapperContained.getExtraDistance(); }
// public static double getExtraDistance() { return net.minecraft.sound.BiomeMoodSound.getExtraDistance(); }
// public java.lang.Double method_28393(yarnwrap.sound.BiomeMoodSound sound) { return wrapperContained.method_28393(sound.wrapperContained); }
// public static java.lang.Double method_28393(yarnwrap.sound.BiomeMoodSound sound, ) { return net.minecraft.sound.BiomeMoodSound.method_28393(sound.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28394(Object instance) { return wrapperContained.method_28394(instance); }
// public static com.mojang.datafixers.kinds.App method_28394(Object instance, ) { return net.minecraft.sound.BiomeMoodSound.method_28394(instance); }
// public java.lang.Integer method_28395(yarnwrap.sound.BiomeMoodSound sound) { return wrapperContained.method_28395(sound.wrapperContained); }
// public static java.lang.Integer method_28395(yarnwrap.sound.BiomeMoodSound sound, ) { return net.minecraft.sound.BiomeMoodSound.method_28395(sound.wrapperContained); }
// public java.lang.Integer method_28396(yarnwrap.sound.BiomeMoodSound sound) { return wrapperContained.method_28396(sound.wrapperContained); }
// public static java.lang.Integer method_28396(yarnwrap.sound.BiomeMoodSound sound, ) { return net.minecraft.sound.BiomeMoodSound.method_28396(sound.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry method_28397(yarnwrap.sound.BiomeMoodSound sound) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28397(sound.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_28397(yarnwrap.sound.BiomeMoodSound sound, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.sound.BiomeMoodSound.method_28397(sound.wrapperContained)); }

}