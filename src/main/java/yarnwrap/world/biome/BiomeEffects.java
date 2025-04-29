package yarnwrap.world.biome;
public class BiomeEffects { public net.minecraft.world.biome.BiomeEffects wrapperContained; public BiomeEffects(net.minecraft.world.biome.BiomeEffects wrapperContained) { this.wrapperContained = wrapperContained; }

// public int fogColor() { return wrapperContained.fogColor; }
// public void fogColor(int value) { wrapperContained.fogColor = value; }
// public static int fogColor() { return net.minecraft.world.biome.BiomeEffects.fogColor; }
// public static void fogColor(int value, ) { net.minecraft.world.biome.BiomeEffects.fogColor = value; }

// public int waterColor() { return wrapperContained.waterColor; }
// public void waterColor(int value) { wrapperContained.waterColor = value; }
// public static int waterColor() { return net.minecraft.world.biome.BiomeEffects.waterColor; }
// public static void waterColor(int value, ) { net.minecraft.world.biome.BiomeEffects.waterColor = value; }

// public int waterFogColor() { return wrapperContained.waterFogColor; }
// public void waterFogColor(int value) { wrapperContained.waterFogColor = value; }
// public static int waterFogColor() { return net.minecraft.world.biome.BiomeEffects.waterFogColor; }
// public static void waterFogColor(int value, ) { net.minecraft.world.biome.BiomeEffects.waterFogColor = value; }

// public java.util.Optional particleConfig() { return wrapperContained.particleConfig; }
// public void particleConfig(java.util.Optional value) { wrapperContained.particleConfig = value; }
// public static java.util.Optional particleConfig() { return net.minecraft.world.biome.BiomeEffects.particleConfig; }
// public static void particleConfig(java.util.Optional value, ) { net.minecraft.world.biome.BiomeEffects.particleConfig = value; }

// public java.util.Optional loopSound() { return wrapperContained.loopSound; }
// public void loopSound(java.util.Optional value) { wrapperContained.loopSound = value; }
// public static java.util.Optional loopSound() { return net.minecraft.world.biome.BiomeEffects.loopSound; }
// public static void loopSound(java.util.Optional value, ) { net.minecraft.world.biome.BiomeEffects.loopSound = value; }

// public java.util.Optional moodSound() { return wrapperContained.moodSound; }
// public void moodSound(java.util.Optional value) { wrapperContained.moodSound = value; }
// public static java.util.Optional moodSound() { return net.minecraft.world.biome.BiomeEffects.moodSound; }
// public static void moodSound(java.util.Optional value, ) { net.minecraft.world.biome.BiomeEffects.moodSound = value; }

// public java.util.Optional additionsSound() { return wrapperContained.additionsSound; }
// public void additionsSound(java.util.Optional value) { wrapperContained.additionsSound = value; }
// public static java.util.Optional additionsSound() { return net.minecraft.world.biome.BiomeEffects.additionsSound; }
// public static void additionsSound(java.util.Optional value, ) { net.minecraft.world.biome.BiomeEffects.additionsSound = value; }

// public java.util.Optional music() { return wrapperContained.music; }
// public void music(java.util.Optional value) { wrapperContained.music = value; }
// public static java.util.Optional music() { return net.minecraft.world.biome.BiomeEffects.music; }
// public static void music(java.util.Optional value, ) { net.minecraft.world.biome.BiomeEffects.music = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.biome.BiomeEffects.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.biome.BiomeEffects.CODEC = value; }

// public int skyColor() { return wrapperContained.skyColor; }
// public void skyColor(int value) { wrapperContained.skyColor = value; }
// public static int skyColor() { return net.minecraft.world.biome.BiomeEffects.skyColor; }
// public static void skyColor(int value, ) { net.minecraft.world.biome.BiomeEffects.skyColor = value; }

// public java.util.Optional foliageColor() { return wrapperContained.foliageColor; }
// public void foliageColor(java.util.Optional value) { wrapperContained.foliageColor = value; }
// public static java.util.Optional foliageColor() { return net.minecraft.world.biome.BiomeEffects.foliageColor; }
// public static void foliageColor(java.util.Optional value, ) { net.minecraft.world.biome.BiomeEffects.foliageColor = value; }

// public java.util.Optional grassColor() { return wrapperContained.grassColor; }
// public void grassColor(java.util.Optional value) { wrapperContained.grassColor = value; }
// public static java.util.Optional grassColor() { return net.minecraft.world.biome.BiomeEffects.grassColor; }
// public static void grassColor(java.util.Optional value, ) { net.minecraft.world.biome.BiomeEffects.grassColor = value; }

// public Object grassColorModifier() { return wrapperContained.grassColorModifier; }
// // public void grassColorModifier(Object value) { wrapperContained.grassColorModifier = value; }
// // public static Object grassColorModifier() { return net.minecraft.world.biome.BiomeEffects.grassColorModifier; }
// // public static void grassColorModifier(Object value, ) { net.minecraft.world.biome.BiomeEffects.grassColorModifier = value; }

// public BiomeEffects(int fogColor,int waterColor,int waterFogColor,int skyColor,java.util.Optional foliageColor,java.util.Optional grassColor,Object grassColorModifier,java.util.Optional particleConfig,java.util.Optional loopSound,java.util.Optional moodSound,java.util.Optional additionsSound,java.util.Optional music) { this.wrapperContained = new net.minecraft.world.biome.BiomeEffects(fogColor,waterColor,waterFogColor,skyColor,foliageColor,grassColor,grassColorModifier,particleConfig,loopSound,moodSound,additionsSound,music); }
public int getFogColor() { return wrapperContained.getFogColor(); }
// public static int getFogColor() { return net.minecraft.world.biome.BiomeEffects.getFogColor(); }
public int getWaterColor() { return wrapperContained.getWaterColor(); }
// public static int getWaterColor() { return net.minecraft.world.biome.BiomeEffects.getWaterColor(); }
public int getWaterFogColor() { return wrapperContained.getWaterFogColor(); }
// public static int getWaterFogColor() { return net.minecraft.world.biome.BiomeEffects.getWaterFogColor(); }
public java.util.Optional getParticleConfig() { return wrapperContained.getParticleConfig(); }
// public static java.util.Optional getParticleConfig() { return net.minecraft.world.biome.BiomeEffects.getParticleConfig(); }
public java.util.Optional getLoopSound() { return wrapperContained.getLoopSound(); }
// public static java.util.Optional getLoopSound() { return net.minecraft.world.biome.BiomeEffects.getLoopSound(); }
public java.util.Optional getMoodSound() { return wrapperContained.getMoodSound(); }
// public static java.util.Optional getMoodSound() { return net.minecraft.world.biome.BiomeEffects.getMoodSound(); }
public java.util.Optional getAdditionsSound() { return wrapperContained.getAdditionsSound(); }
// public static java.util.Optional getAdditionsSound() { return net.minecraft.world.biome.BiomeEffects.getAdditionsSound(); }
public java.util.Optional getMusic() { return wrapperContained.getMusic(); }
// public static java.util.Optional getMusic() { return net.minecraft.world.biome.BiomeEffects.getMusic(); }
// public java.util.Optional method_28444(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28444(effects.wrapperContained); }
// public static java.util.Optional method_28444(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_28444(effects.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28445(Object instance) { return wrapperContained.method_28445(instance); }
// public static com.mojang.datafixers.kinds.App method_28445(Object instance, ) { return net.minecraft.world.biome.BiomeEffects.method_28445(instance); }
// public java.util.Optional method_28446(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28446(effects.wrapperContained); }
// public static java.util.Optional method_28446(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_28446(effects.wrapperContained); }
// public java.util.Optional method_28447(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28447(effects.wrapperContained); }
// public static java.util.Optional method_28447(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_28447(effects.wrapperContained); }
// public java.util.Optional method_28448(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28448(effects.wrapperContained); }
// public static java.util.Optional method_28448(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_28448(effects.wrapperContained); }
// public java.util.Optional method_28449(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28449(effects.wrapperContained); }
// public static java.util.Optional method_28449(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_28449(effects.wrapperContained); }
// public java.lang.Integer method_28450(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28450(effects.wrapperContained); }
// public static java.lang.Integer method_28450(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_28450(effects.wrapperContained); }
// public java.lang.Integer method_28451(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28451(effects.wrapperContained); }
// public static java.lang.Integer method_28451(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_28451(effects.wrapperContained); }
// public java.lang.Integer method_28452(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28452(effects.wrapperContained); }
// public static java.lang.Integer method_28452(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_28452(effects.wrapperContained); }
public int getSkyColor() { return wrapperContained.getSkyColor(); }
// public static int getSkyColor() { return net.minecraft.world.biome.BiomeEffects.getSkyColor(); }
public java.util.Optional getFoliageColor() { return wrapperContained.getFoliageColor(); }
// public static java.util.Optional getFoliageColor() { return net.minecraft.world.biome.BiomeEffects.getFoliageColor(); }
public java.util.Optional getGrassColor() { return wrapperContained.getGrassColor(); }
// public static java.util.Optional getGrassColor() { return net.minecraft.world.biome.BiomeEffects.getGrassColor(); }
// public Object method_30813(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_30813(effects.wrapperContained); }
// public static Object method_30813(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_30813(effects.wrapperContained); }
public Object getGrassColorModifier() { return wrapperContained.getGrassColorModifier(); }
// public static Object getGrassColorModifier() { return net.minecraft.world.biome.BiomeEffects.getGrassColorModifier(); }
// public java.util.Optional method_30815(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_30815(effects.wrapperContained); }
// public static java.util.Optional method_30815(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_30815(effects.wrapperContained); }
// public java.util.Optional method_30816(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_30816(effects.wrapperContained); }
// public static java.util.Optional method_30816(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_30816(effects.wrapperContained); }
// public java.lang.Integer method_30817(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_30817(effects.wrapperContained); }
// public static java.lang.Integer method_30817(yarnwrap.world.biome.BiomeEffects effects, ) { return net.minecraft.world.biome.BiomeEffects.method_30817(effects.wrapperContained); }

}