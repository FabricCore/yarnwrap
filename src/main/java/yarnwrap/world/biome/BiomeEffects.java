package yarnwrap.world.biome;
public class BiomeEffects { public net.minecraft.world.biome.BiomeEffects wrapperContained; public BiomeEffects(net.minecraft.world.biome.BiomeEffects wrapperContained) { this.wrapperContained = wrapperContained; }

// public int fogColor() { return wrapperContained.fogColor; }
// public void fogColor(int value) { wrapperContained.fogColor = value; }
// public int waterColor() { return wrapperContained.waterColor; }
// public void waterColor(int value) { wrapperContained.waterColor = value; }
// public int waterFogColor() { return wrapperContained.waterFogColor; }
// public void waterFogColor(int value) { wrapperContained.waterFogColor = value; }
// public java.util.Optional particleConfig() { return wrapperContained.particleConfig; }
// public void particleConfig(java.util.Optional value) { wrapperContained.particleConfig = value; }
// public java.util.Optional loopSound() { return wrapperContained.loopSound; }
// public void loopSound(java.util.Optional value) { wrapperContained.loopSound = value; }
// public java.util.Optional moodSound() { return wrapperContained.moodSound; }
// public void moodSound(java.util.Optional value) { wrapperContained.moodSound = value; }
// public java.util.Optional additionsSound() { return wrapperContained.additionsSound; }
// public void additionsSound(java.util.Optional value) { wrapperContained.additionsSound = value; }
// public java.util.Optional music() { return wrapperContained.music; }
// public void music(java.util.Optional value) { wrapperContained.music = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public int skyColor() { return wrapperContained.skyColor; }
// public void skyColor(int value) { wrapperContained.skyColor = value; }
// public java.util.Optional foliageColor() { return wrapperContained.foliageColor; }
// public void foliageColor(java.util.Optional value) { wrapperContained.foliageColor = value; }
// public java.util.Optional grassColor() { return wrapperContained.grassColor; }
// public void grassColor(java.util.Optional value) { wrapperContained.grassColor = value; }
// public Object grassColorModifier() { return wrapperContained.grassColorModifier; }
// // public void grassColorModifier(Object value) { wrapperContained.grassColorModifier = value; }
// public BiomeEffects(int fogColor,int waterColor,int waterFogColor,int skyColor,java.util.Optional foliageColor,java.util.Optional grassColor,Object grassColorModifier,java.util.Optional particleConfig,java.util.Optional loopSound,java.util.Optional moodSound,java.util.Optional additionsSound,java.util.Optional music) { this.wrapperContained = new net.minecraft.world.biome.BiomeEffects(fogColor,waterColor,waterFogColor,skyColor,foliageColor,grassColor,grassColorModifier,particleConfig,loopSound,moodSound,additionsSound,music); }
public int getFogColor() { return wrapperContained.getFogColor(); }
public int getWaterColor() { return wrapperContained.getWaterColor(); }
public int getWaterFogColor() { return wrapperContained.getWaterFogColor(); }
public java.util.Optional getParticleConfig() { return wrapperContained.getParticleConfig(); }
public java.util.Optional getLoopSound() { return wrapperContained.getLoopSound(); }
public java.util.Optional getMoodSound() { return wrapperContained.getMoodSound(); }
public java.util.Optional getAdditionsSound() { return wrapperContained.getAdditionsSound(); }
public java.util.Optional getMusic() { return wrapperContained.getMusic(); }
// public java.util.Optional method_28444(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28444(effects.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28445(Object instance) { return wrapperContained.method_28445(instance); }
// public java.util.Optional method_28446(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28446(effects.wrapperContained); }
// public java.util.Optional method_28447(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28447(effects.wrapperContained); }
// public java.util.Optional method_28448(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28448(effects.wrapperContained); }
// public java.util.Optional method_28449(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28449(effects.wrapperContained); }
// public java.lang.Integer method_28450(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28450(effects.wrapperContained); }
// public java.lang.Integer method_28451(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28451(effects.wrapperContained); }
// public java.lang.Integer method_28452(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_28452(effects.wrapperContained); }
public int getSkyColor() { return wrapperContained.getSkyColor(); }
public java.util.Optional getFoliageColor() { return wrapperContained.getFoliageColor(); }
public java.util.Optional getGrassColor() { return wrapperContained.getGrassColor(); }
// public Object method_30813(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_30813(effects.wrapperContained); }
public Object getGrassColorModifier() { return wrapperContained.getGrassColorModifier(); }
// public java.util.Optional method_30815(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_30815(effects.wrapperContained); }
// public java.util.Optional method_30816(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_30816(effects.wrapperContained); }
// public java.lang.Integer method_30817(yarnwrap.world.biome.BiomeEffects effects) { return wrapperContained.method_30817(effects.wrapperContained); }

}