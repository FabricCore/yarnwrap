package yarnwrap.client.sound;
public class AmbientSoundPlayer { public net.minecraft.client.sound.AmbientSoundPlayer wrapperContained; public AmbientSoundPlayer(net.minecraft.client.sound.AmbientSoundPlayer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.sound.SoundManager soundManager() { return new yarnwrap.client.sound.SoundManager(wrapperContained.soundManager); }
// public void soundManager(yarnwrap.client.sound.SoundManager value) { wrapperContained.soundManager = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundManager soundManager() { return new yarnwrap.client.sound.SoundManager(net.minecraft.client.sound.AmbientSoundPlayer.soundManager); }
// public static void soundManager(yarnwrap.client.sound.SoundManager value, ) { net.minecraft.client.sound.AmbientSoundPlayer.soundManager = value.wrapperContained; }

// public int ticksUntilPlay() { return wrapperContained.ticksUntilPlay; }
// public void ticksUntilPlay(int value) { wrapperContained.ticksUntilPlay = value; }
// public static int ticksUntilPlay() { return net.minecraft.client.sound.AmbientSoundPlayer.ticksUntilPlay; }
// public static void ticksUntilPlay(int value, ) { net.minecraft.client.sound.AmbientSoundPlayer.ticksUntilPlay = value; }

// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.client.network.ClientPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(net.minecraft.client.sound.AmbientSoundPlayer.player); }
// public static void player(yarnwrap.client.network.ClientPlayerEntity value, ) { net.minecraft.client.sound.AmbientSoundPlayer.player = value.wrapperContained; }

// public float MAX_TICKS_FOR_BASE_SOUND_LOOP() { return wrapperContained.MAX_TICKS_FOR_BASE_SOUND_LOOP; }
// public void MAX_TICKS_FOR_BASE_SOUND_LOOP(float value) { wrapperContained.MAX_TICKS_FOR_BASE_SOUND_LOOP = value; }
public static float MAX_TICKS_FOR_BASE_SOUND_LOOP() { return net.minecraft.client.sound.AmbientSoundPlayer.MAX_TICKS_FOR_BASE_SOUND_LOOP; }
// public static void MAX_TICKS_FOR_BASE_SOUND_LOOP(float value, ) { net.minecraft.client.sound.AmbientSoundPlayer.MAX_TICKS_FOR_BASE_SOUND_LOOP = value; }

// public float MAX_TICKS_FOR_RARE_SOUND_LOOP() { return wrapperContained.MAX_TICKS_FOR_RARE_SOUND_LOOP; }
// public void MAX_TICKS_FOR_RARE_SOUND_LOOP(float value) { wrapperContained.MAX_TICKS_FOR_RARE_SOUND_LOOP = value; }
public static float MAX_TICKS_FOR_RARE_SOUND_LOOP() { return net.minecraft.client.sound.AmbientSoundPlayer.MAX_TICKS_FOR_RARE_SOUND_LOOP; }
// public static void MAX_TICKS_FOR_RARE_SOUND_LOOP(float value, ) { net.minecraft.client.sound.AmbientSoundPlayer.MAX_TICKS_FOR_RARE_SOUND_LOOP = value; }

// public float MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP() { return wrapperContained.MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP; }
// public void MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP(float value) { wrapperContained.MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP = value; }
public static float MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP() { return net.minecraft.client.sound.AmbientSoundPlayer.MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP; }
// public static void MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP(float value, ) { net.minecraft.client.sound.AmbientSoundPlayer.MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP = value; }

// public int DEFAULT_TICKS_UNTIL_PLAY() { return wrapperContained.DEFAULT_TICKS_UNTIL_PLAY; }
// public void DEFAULT_TICKS_UNTIL_PLAY(int value) { wrapperContained.DEFAULT_TICKS_UNTIL_PLAY = value; }
// public static int DEFAULT_TICKS_UNTIL_PLAY() { return net.minecraft.client.sound.AmbientSoundPlayer.DEFAULT_TICKS_UNTIL_PLAY; }
// public static void DEFAULT_TICKS_UNTIL_PLAY(int value, ) { net.minecraft.client.sound.AmbientSoundPlayer.DEFAULT_TICKS_UNTIL_PLAY = value; }

public AmbientSoundPlayer(yarnwrap.client.network.ClientPlayerEntity player,yarnwrap.client.sound.SoundManager soundManager) { this.wrapperContained = new net.minecraft.client.sound.AmbientSoundPlayer(player.wrapperContained,soundManager.wrapperContained); }

}