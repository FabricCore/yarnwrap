package yarnwrap.client.sound;
public class SoundListenerTransform { public net.minecraft.client.sound.SoundListenerTransform wrapperContained; public SoundListenerTransform(net.minecraft.client.sound.SoundListenerTransform wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.sound.SoundListenerTransform DEFAULT() { return new yarnwrap.client.sound.SoundListenerTransform(wrapperContained.DEFAULT); }
public yarnwrap.util.math.Vec3d right() { return new yarnwrap.util.math.Vec3d(wrapperContained.right()); }

}