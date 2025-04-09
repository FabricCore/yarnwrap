package yarnwrap.client.sound;
public class AmbientSoundPlayer { public net.minecraft.client.sound.AmbientSoundPlayer wrapperContained; public AmbientSoundPlayer(net.minecraft.client.sound.AmbientSoundPlayer wrapperContained) { this.wrapperContained = wrapperContained; }

public float MAX_TICKS_FOR_BASE_SOUND_LOOP() { return wrapperContained.MAX_TICKS_FOR_BASE_SOUND_LOOP; }
public float MAX_TICKS_FOR_RARE_SOUND_LOOP() { return wrapperContained.MAX_TICKS_FOR_RARE_SOUND_LOOP; }
public float MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP() { return wrapperContained.MAX_TICKS_FOR_ULTRA_RARE_SOUND_LOOP; }
// public int DEFAULT_TICKS_UNTIL_PLAY() { return wrapperContained.DEFAULT_TICKS_UNTIL_PLAY; }
// public yarnwrap.client.sound.SoundManager soundManager() { return new yarnwrap.client.sound.SoundManager(wrapperContained.soundManager); }
// public int ticksUntilPlay() { return wrapperContained.ticksUntilPlay; }
// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }

}