package yarnwrap.client.sound;
public class SoundListenerTransform { public net.minecraft.client.sound.SoundListenerTransform wrapperContained; public SoundListenerTransform(net.minecraft.client.sound.SoundListenerTransform wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.sound.SoundListenerTransform DEFAULT() { return new yarnwrap.client.sound.SoundListenerTransform(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.client.sound.SoundListenerTransform value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.client.sound.SoundListenerTransform DEFAULT() { return new yarnwrap.client.sound.SoundListenerTransform(net.minecraft.client.sound.SoundListenerTransform.DEFAULT); }
// public static void DEFAULT(yarnwrap.client.sound.SoundListenerTransform value, ) { net.minecraft.client.sound.SoundListenerTransform.DEFAULT = value.wrapperContained; }

public yarnwrap.util.math.Vec3d right() { return new yarnwrap.util.math.Vec3d(wrapperContained.right()); }
// public static yarnwrap.util.math.Vec3d right() { return new yarnwrap.util.math.Vec3d(net.minecraft.client.sound.SoundListenerTransform.right()); }

}