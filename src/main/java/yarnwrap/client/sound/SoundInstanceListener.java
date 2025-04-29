package yarnwrap.client.sound;
public class SoundInstanceListener { public net.minecraft.client.sound.SoundInstanceListener wrapperContained; public SoundInstanceListener(net.minecraft.client.sound.SoundInstanceListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onSoundPlayed(yarnwrap.client.sound.SoundInstance sound,yarnwrap.client.sound.WeightedSoundSet soundSet,float range) { wrapperContained.onSoundPlayed(sound.wrapperContained,soundSet.wrapperContained,range); }
// public static void onSoundPlayed(yarnwrap.client.sound.SoundInstance sound,yarnwrap.client.sound.WeightedSoundSet soundSet,float range, ) { net.minecraft.client.sound.SoundInstanceListener.onSoundPlayed(sound.wrapperContained,soundSet.wrapperContained,range); }

}