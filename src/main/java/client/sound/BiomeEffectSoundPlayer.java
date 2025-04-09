package yarnwrap.client.sound;
public class BiomeEffectSoundPlayer { public net.minecraft.client.sound.BiomeEffectSoundPlayer wrapperContained; public BiomeEffectSoundPlayer(net.minecraft.client.sound.BiomeEffectSoundPlayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public yarnwrap.client.sound.SoundManager soundManager() { return new yarnwrap.client.sound.SoundManager(wrapperContained.soundManager); }
// public yarnwrap.world.biome.source.BiomeAccess biomeAccess() { return new yarnwrap.world.biome.source.BiomeAccess(wrapperContained.biomeAccess); }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap soundLoops() { return wrapperContained.soundLoops; }
// public java.util.Optional moodSound() { return wrapperContained.moodSound; }
// public java.util.Optional additionsSound() { return wrapperContained.additionsSound; }
// public yarnwrap.world.biome.Biome activeBiome() { return new yarnwrap.world.biome.Biome(wrapperContained.activeBiome); }
// public float moodPercentage() { return wrapperContained.moodPercentage; }
// public int MAX_STRENGTH() { return wrapperContained.MAX_STRENGTH; }
public float getMoodPercentage() { return wrapperContained.getMoodPercentage(); }

}