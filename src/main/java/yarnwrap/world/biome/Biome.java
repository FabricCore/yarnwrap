package yarnwrap.world.biome;
public class Biome { public net.minecraft.world.biome.Biome wrapperContained; public Biome(net.minecraft.world.biome.Biome wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.ThreadLocal temperatureCache() { return wrapperContained.temperatureCache; }
// public void temperatureCache(java.lang.ThreadLocal value) { wrapperContained.temperatureCache = value; }
// public yarnwrap.world.biome.BiomeEffects effects() { return new yarnwrap.world.biome.BiomeEffects(wrapperContained.effects); }
// public void effects(yarnwrap.world.biome.BiomeEffects value) { wrapperContained.effects = value.wrapperContained; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.noise.OctaveSimplexNoiseSampler FROZEN_OCEAN_NOISE() { return new yarnwrap.util.math.noise.OctaveSimplexNoiseSampler(wrapperContained.FROZEN_OCEAN_NOISE); }
// public void FROZEN_OCEAN_NOISE(yarnwrap.util.math.noise.OctaveSimplexNoiseSampler value) { wrapperContained.FROZEN_OCEAN_NOISE = value.wrapperContained; }
// public Object weather() { return wrapperContained.weather; }
// // public void weather(Object value) { wrapperContained.weather = value; }
// public yarnwrap.world.biome.SpawnSettings spawnSettings() { return new yarnwrap.world.biome.SpawnSettings(wrapperContained.spawnSettings); }
// public void spawnSettings(yarnwrap.world.biome.SpawnSettings value) { wrapperContained.spawnSettings = value.wrapperContained; }
public com.mojang.serialization.Codec NETWORK_CODEC() { return wrapperContained.NETWORK_CODEC; }
// public void NETWORK_CODEC(com.mojang.serialization.Codec value) { wrapperContained.NETWORK_CODEC = value; }
// public yarnwrap.world.biome.GenerationSettings generationSettings() { return new yarnwrap.world.biome.GenerationSettings(wrapperContained.generationSettings); }
// public void generationSettings(yarnwrap.world.biome.GenerationSettings value) { wrapperContained.generationSettings = value.wrapperContained; }
public com.mojang.serialization.Codec REGISTRY_ENTRY_LIST_CODEC() { return wrapperContained.REGISTRY_ENTRY_LIST_CODEC; }
// public void REGISTRY_ENTRY_LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_ENTRY_LIST_CODEC = value; }
// public int MAX_TEMPERATURE_CACHE_SIZE() { return wrapperContained.MAX_TEMPERATURE_CACHE_SIZE; }
// public void MAX_TEMPERATURE_CACHE_SIZE(int value) { wrapperContained.MAX_TEMPERATURE_CACHE_SIZE = value; }
// public yarnwrap.util.math.noise.OctaveSimplexNoiseSampler FOLIAGE_NOISE() { return new yarnwrap.util.math.noise.OctaveSimplexNoiseSampler(wrapperContained.FOLIAGE_NOISE); }
// // public void FOLIAGE_NOISE(yarnwrap.util.math.noise.OctaveSimplexNoiseSampler value) { wrapperContained.FOLIAGE_NOISE = value.wrapperContained; }
// public yarnwrap.util.math.noise.OctaveSimplexNoiseSampler TEMPERATURE_NOISE() { return new yarnwrap.util.math.noise.OctaveSimplexNoiseSampler(wrapperContained.TEMPERATURE_NOISE); }
// public void TEMPERATURE_NOISE(yarnwrap.util.math.noise.OctaveSimplexNoiseSampler value) { wrapperContained.TEMPERATURE_NOISE = value.wrapperContained; }
// public float getTemperature(yarnwrap.util.math.BlockPos blockPos) { return wrapperContained.getTemperature(blockPos.wrapperContained); }
public int getFogColor() { return wrapperContained.getFogColor(); }
public yarnwrap.world.biome.BiomeEffects getEffects() { return new yarnwrap.world.biome.BiomeEffects(wrapperContained.getEffects()); }
public java.util.Optional getParticleConfig() { return wrapperContained.getParticleConfig(); }
public java.util.Optional getLoopSound() { return wrapperContained.getLoopSound(); }
public java.util.Optional getMoodSound() { return wrapperContained.getMoodSound(); }
public java.util.Optional getAdditionsSound() { return wrapperContained.getAdditionsSound(); }
public java.util.Optional getMusic() { return wrapperContained.getMusic(); }
// public int getDefaultGrassColor() { return wrapperContained.getDefaultGrassColor(); }
// public int getDefaultFoliageColor() { return wrapperContained.getDefaultFoliageColor(); }
public yarnwrap.world.biome.SpawnSettings getSpawnSettings() { return new yarnwrap.world.biome.SpawnSettings(wrapperContained.getSpawnSettings()); }
public yarnwrap.world.biome.GenerationSettings getGenerationSettings() { return new yarnwrap.world.biome.GenerationSettings(wrapperContained.getGenerationSettings()); }
public boolean isCold(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isCold(pos.wrapperContained); }
public boolean doesNotSnow(yarnwrap.util.math.BlockPos pos) { return wrapperContained.doesNotSnow(pos.wrapperContained); }
public boolean shouldGenerateLowerFrozenOceanSurface(yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldGenerateLowerFrozenOceanSurface(pos.wrapperContained); }
public Object getPrecipitation(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPrecipitation(pos.wrapperContained); }
public boolean hasPrecipitation() { return wrapperContained.hasPrecipitation(); }
public boolean canSetIce(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,boolean doWaterCheck) { return wrapperContained.canSetIce(world.wrapperContained,pos.wrapperContained,doWaterCheck); }
public int getWaterColor() { return wrapperContained.getWaterColor(); }
public boolean canSetSnow(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canSetSnow(world.wrapperContained,pos.wrapperContained); }
public int getSkyColor() { return wrapperContained.getSkyColor(); }
public int getFoliageColor() { return wrapperContained.getFoliageColor(); }
public boolean canSetIce(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos blockPos) { return wrapperContained.canSetIce(world.wrapperContained,blockPos.wrapperContained); }
// public float computeTemperature(yarnwrap.util.math.BlockPos pos) { return wrapperContained.computeTemperature(pos.wrapperContained); }
public int getGrassColorAt(double x,double z) { return wrapperContained.getGrassColorAt(x,z); }
public float getTemperature() { return wrapperContained.getTemperature(); }
public int getWaterFogColor() { return wrapperContained.getWaterFogColor(); }

}