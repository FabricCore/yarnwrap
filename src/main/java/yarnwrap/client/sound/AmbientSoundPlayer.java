package yarnwrap.client.sound;
public class AmbientSoundPlayer { public net.minecraft.client.sound.AmbientSoundPlayer wrapperContained; public AmbientSoundPlayer(net.minecraft.client.sound.AmbientSoundPlayer wrapperContained) { this.wrapperContained = wrapperContained; }

public float MAX_TICKS_FOR_BASE_SOUND_LOOP() { return wrapperContained.MAX_TICKS_FOR_BASE_SOUND_LOOP; }
// public void MAX_TICKS_FOR_BASE_SOUND_LOOP(float value) { wrapperContained.MAX_TICKS_FOR_BASE_SOUND_LOOP = value; }
public float MAX_TICKS_FOR_RARE_SOUND_LOOP() { return wrapperContained.MAX_TICKS_FOR_RARE_SOUND_LOOP; }
// public void MAX_TICKS_FOR_RARE_SOUND_LOOP(float value) { wrapperContained.MAX_TICKS_FOR_RARE_SOUND_LOOP = value; }
public float MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP() { return wrapperContained.MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP; }
// public void MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP(float value) { wrapperContained.MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP = value; }
// public int DEFAULT_TICKS_UNTIL_PLAY() { return wrapperContained.DEFAULT_TICKS_UNTIL_PLAY; }
// public void DEFAULT_TICKS_UNTIL_PLAY(int value) { wrapperContained.DEFAULT_TICKS_UNTIL_PLAY = value; }
// public yarnwrap.client.sound.SoundManager soundManager() { return new yarnwrap.client.sound.SoundManager(wrapperContained.soundManager); }
// public void soundManager(yarnwrap.client.sound.SoundManager value) { wrapperContained.soundManager = value.wrapperContained; }
// public int ticksUntilPlay() { return wrapperContained.ticksUntilPlay; }
// public void ticksUntilPlay(int value) { wrapperContained.ticksUntilPlay = value; }
// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.client.network.ClientPlayerEntity value) { wrapperContained.player = value.wrapperContained; }

}