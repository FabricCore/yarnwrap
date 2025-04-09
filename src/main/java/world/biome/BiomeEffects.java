package yarnwrap.world.biome;
public class BiomeEffects { public net.minecraft.world.biome.BiomeEffects wrapperContained; public BiomeEffects(net.minecraft.world.biome.BiomeEffects wrapperContained) { this.wrapperContained = wrapperContained; }

// public int fogColor() { return wrapperContained.fogColor; }
// public int waterColor() { return wrapperContained.waterColor; }
// public int waterFogColor() { return wrapperContained.waterFogColor; }
// public java.util.Optional particleConfig() { return wrapperContained.particleConfig; }
// public java.util.Optional loopSound() { return wrapperContained.loopSound; }
// public java.util.Optional moodSound() { return wrapperContained.moodSound; }
// public java.util.Optional additionsSound() { return wrapperContained.additionsSound; }
// public java.util.Optional music() { return wrapperContained.music; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public int skyColor() { return wrapperContained.skyColor; }
// public java.util.Optional foliageColor() { return wrapperContained.foliageColor; }
// public java.util.Optional grassColor() { return wrapperContained.grassColor; }
// public Object grassColorModifier() { return wrapperContained.grassColorModifier; }
public int getFogColor() { return wrapperContained.getFogColor(); }
public int getWaterColor() { return wrapperContained.getWaterColor(); }
public int getWaterFogColor() { return wrapperContained.getWaterFogColor(); }
public java.util.Optional getParticleConfig() { return wrapperContained.getParticleConfig(); }
public java.util.Optional getLoopSound() { return wrapperContained.getLoopSound(); }
public java.util.Optional getMoodSound() { return wrapperContained.getMoodSound(); }
public java.util.Optional getAdditionsSound() { return wrapperContained.getAdditionsSound(); }
public java.util.Optional getMusic() { return wrapperContained.getMusic(); }
public int getSkyColor() { return wrapperContained.getSkyColor(); }
public java.util.Optional getFoliageColor() { return wrapperContained.getFoliageColor(); }
public java.util.Optional getGrassColor() { return wrapperContained.getGrassColor(); }
public Object getGrassColorModifier() { return wrapperContained.getGrassColorModifier(); }

}