package yarnwrap.client.sound;
public class AudioStream { public net.minecraft.client.sound.AudioStream wrapperContained; public AudioStream(net.minecraft.client.sound.AudioStream wrapperContained) { this.wrapperContained = wrapperContained; }

public javax.sound.sampled.AudioFormat getFormat() { return wrapperContained.getFormat(); }
// public static javax.sound.sampled.AudioFormat getFormat() { return net.minecraft.client.sound.AudioStream.getFormat(); }
// public java.nio.ByteBuffer read(int size) { return wrapperContained.read(size); }
// public static java.nio.ByteBuffer read(int size, ) { return net.minecraft.client.sound.AudioStream.read(size); }

}