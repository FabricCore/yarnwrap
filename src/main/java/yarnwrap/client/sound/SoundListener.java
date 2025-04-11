package yarnwrap.client.sound;
public class SoundListener { public net.minecraft.client.sound.SoundListener wrapperContained; public SoundListener(net.minecraft.client.sound.SoundListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public float volume() { return wrapperContained.volume; }
// public void volume(float value) { wrapperContained.volume = value; }
// public yarnwrap.client.sound.SoundListenerTransform transform() { return new yarnwrap.client.sound.SoundListenerTransform(wrapperContained.transform); }
// public void transform(yarnwrap.client.sound.SoundListenerTransform value) { wrapperContained.transform = value.wrapperContained; }
public float getVolume() { return wrapperContained.getVolume(); }
public void setVolume(float volume) { wrapperContained.setVolume(volume); }
public void init() { wrapperContained.init(); }
public void setTransform(yarnwrap.client.sound.SoundListenerTransform transform) { wrapperContained.setTransform(transform.wrapperContained); }
public yarnwrap.client.sound.SoundListenerTransform getTransform() { return new yarnwrap.client.sound.SoundListenerTransform(wrapperContained.getTransform()); }

}