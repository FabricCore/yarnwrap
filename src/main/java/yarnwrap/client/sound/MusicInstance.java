package yarnwrap.client.sound;
public class MusicInstance { public net.minecraft.client.sound.MusicInstance wrapperContained; public MusicInstance(net.minecraft.client.sound.MusicInstance wrapperContained) { this.wrapperContained = wrapperContained; }

public MusicInstance(yarnwrap.sound.MusicSound music) { this.wrapperContained = new net.minecraft.client.sound.MusicInstance(music.wrapperContained); }
public boolean shouldReplace(yarnwrap.client.sound.SoundInstance sound) { return wrapperContained.shouldReplace(sound.wrapperContained); }
// public static boolean shouldReplace(yarnwrap.client.sound.SoundInstance sound, ) { return net.minecraft.client.sound.MusicInstance.shouldReplace(sound.wrapperContained); }

}