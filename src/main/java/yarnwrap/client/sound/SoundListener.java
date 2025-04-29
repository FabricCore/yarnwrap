package yarnwrap.client.sound;
public class SoundListener { public net.minecraft.client.sound.SoundListener wrapperContained; public SoundListener(net.minecraft.client.sound.SoundListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public float volume() { return wrapperContained.volume; }
// public void volume(float value) { wrapperContained.volume = value; }
// public static float volume() { return net.minecraft.client.sound.SoundListener.volume; }
// public static void volume(float value, ) { net.minecraft.client.sound.SoundListener.volume = value; }

// public yarnwrap.client.sound.SoundListenerTransform transform() { return new yarnwrap.client.sound.SoundListenerTransform(wrapperContained.transform); }
// public void transform(yarnwrap.client.sound.SoundListenerTransform value) { wrapperContained.transform = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundListenerTransform transform() { return new yarnwrap.client.sound.SoundListenerTransform(net.minecraft.client.sound.SoundListener.transform); }
// public static void transform(yarnwrap.client.sound.SoundListenerTransform value, ) { net.minecraft.client.sound.SoundListener.transform = value.wrapperContained; }

public float getVolume() { return wrapperContained.getVolume(); }
// public static float getVolume() { return net.minecraft.client.sound.SoundListener.getVolume(); }
public void setVolume(float volume) { wrapperContained.setVolume(volume); }
// public static void setVolume(float volume, ) { net.minecraft.client.sound.SoundListener.setVolume(volume); }
public void init() { wrapperContained.init(); }
// public static void init() { net.minecraft.client.sound.SoundListener.init(); }
public void setTransform(yarnwrap.client.sound.SoundListenerTransform transform) { wrapperContained.setTransform(transform.wrapperContained); }
// public static void setTransform(yarnwrap.client.sound.SoundListenerTransform transform, ) { net.minecraft.client.sound.SoundListener.setTransform(transform.wrapperContained); }
public yarnwrap.client.sound.SoundListenerTransform getTransform() { return new yarnwrap.client.sound.SoundListenerTransform(wrapperContained.getTransform()); }
// public static yarnwrap.client.sound.SoundListenerTransform getTransform() { return new yarnwrap.client.sound.SoundListenerTransform(net.minecraft.client.sound.SoundListener.getTransform()); }

}