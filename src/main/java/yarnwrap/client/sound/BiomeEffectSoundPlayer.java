package yarnwrap.client.sound;
public class BiomeEffectSoundPlayer { public net.minecraft.client.sound.BiomeEffectSoundPlayer wrapperContained; public BiomeEffectSoundPlayer(net.minecraft.client.sound.BiomeEffectSoundPlayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.client.network.ClientPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(net.minecraft.client.sound.BiomeEffectSoundPlayer.player); }
// public static void player(yarnwrap.client.network.ClientPlayerEntity value, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.player = value.wrapperContained; }

// public yarnwrap.client.sound.SoundManager soundManager() { return new yarnwrap.client.sound.SoundManager(wrapperContained.soundManager); }
// public void soundManager(yarnwrap.client.sound.SoundManager value) { wrapperContained.soundManager = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundManager soundManager() { return new yarnwrap.client.sound.SoundManager(net.minecraft.client.sound.BiomeEffectSoundPlayer.soundManager); }
// public static void soundManager(yarnwrap.client.sound.SoundManager value, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.soundManager = value.wrapperContained; }

// public yarnwrap.world.biome.source.BiomeAccess biomeAccess() { return new yarnwrap.world.biome.source.BiomeAccess(wrapperContained.biomeAccess); }
// public void biomeAccess(yarnwrap.world.biome.source.BiomeAccess value) { wrapperContained.biomeAccess = value.wrapperContained; }
// public static yarnwrap.world.biome.source.BiomeAccess biomeAccess() { return new yarnwrap.world.biome.source.BiomeAccess(net.minecraft.client.sound.BiomeEffectSoundPlayer.biomeAccess); }
// public static void biomeAccess(yarnwrap.world.biome.source.BiomeAccess value, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.biomeAccess = value.wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.client.sound.BiomeEffectSoundPlayer.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.random = value.wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap soundLoops() { return wrapperContained.soundLoops; }
// public void soundLoops(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap value) { wrapperContained.soundLoops = value; }
// public static it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap soundLoops() { return net.minecraft.client.sound.BiomeEffectSoundPlayer.soundLoops; }
// public static void soundLoops(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap value, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.soundLoops = value; }

// public java.util.Optional moodSound() { return wrapperContained.moodSound; }
// public void moodSound(java.util.Optional value) { wrapperContained.moodSound = value; }
// public static java.util.Optional moodSound() { return net.minecraft.client.sound.BiomeEffectSoundPlayer.moodSound; }
// public static void moodSound(java.util.Optional value, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.moodSound = value; }

// public java.util.Optional additionsSound() { return wrapperContained.additionsSound; }
// public void additionsSound(java.util.Optional value) { wrapperContained.additionsSound = value; }
// public static java.util.Optional additionsSound() { return net.minecraft.client.sound.BiomeEffectSoundPlayer.additionsSound; }
// public static void additionsSound(java.util.Optional value, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.additionsSound = value; }

// public yarnwrap.world.biome.Biome activeBiome() { return new yarnwrap.world.biome.Biome(wrapperContained.activeBiome); }
// public void activeBiome(yarnwrap.world.biome.Biome value) { wrapperContained.activeBiome = value.wrapperContained; }
// public static yarnwrap.world.biome.Biome activeBiome() { return new yarnwrap.world.biome.Biome(net.minecraft.client.sound.BiomeEffectSoundPlayer.activeBiome); }
// public static void activeBiome(yarnwrap.world.biome.Biome value, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.activeBiome = value.wrapperContained; }

// public float moodPercentage() { return wrapperContained.moodPercentage; }
// public void moodPercentage(float value) { wrapperContained.moodPercentage = value; }
// public static float moodPercentage() { return net.minecraft.client.sound.BiomeEffectSoundPlayer.moodPercentage; }
// public static void moodPercentage(float value, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.moodPercentage = value; }

// public int MAX_STRENGTH() { return wrapperContained.MAX_STRENGTH; }
// public void MAX_STRENGTH(int value) { wrapperContained.MAX_STRENGTH = value; }
// public static int MAX_STRENGTH() { return net.minecraft.client.sound.BiomeEffectSoundPlayer.MAX_STRENGTH; }
// public static void MAX_STRENGTH(int value, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.MAX_STRENGTH = value; }

public BiomeEffectSoundPlayer(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.client.sound.SoundManager soundManager,yarnwrap.world.biome.source.BiomeAccess biomeAccess) { this.wrapperContained = new net.minecraft.client.sound.BiomeEffectSoundPlayer(player.wrapperContained,soundManager.wrapperContained,biomeAccess.wrapperContained); }
// public Object method_25459(yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.world.biome.Biome loop) { return wrapperContained.method_25459(sound.wrapperContained,loop.wrapperContained); }
// public static Object method_25459(yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.world.biome.Biome loop, ) { return net.minecraft.client.sound.BiomeEffectSoundPlayer.method_25459(sound.wrapperContained,loop.wrapperContained); }
// public void method_25460(yarnwrap.world.biome.Biome sound) { wrapperContained.method_25460(sound.wrapperContained); }
// public static void method_25460(yarnwrap.world.biome.Biome sound, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.method_25460(sound.wrapperContained); }
// public void method_26270(yarnwrap.sound.BiomeAdditionsSound sound) { wrapperContained.method_26270(sound.wrapperContained); }
// public static void method_26270(yarnwrap.sound.BiomeAdditionsSound sound, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.method_26270(sound.wrapperContained); }
// public void method_26271(yarnwrap.sound.BiomeMoodSound sound) { wrapperContained.method_26271(sound.wrapperContained); }
// public static void method_26271(yarnwrap.sound.BiomeMoodSound sound, ) { net.minecraft.client.sound.BiomeEffectSoundPlayer.method_26271(sound.wrapperContained); }
public float getMoodPercentage() { return wrapperContained.getMoodPercentage(); }
// public static float getMoodPercentage() { return net.minecraft.client.sound.BiomeEffectSoundPlayer.getMoodPercentage(); }

}