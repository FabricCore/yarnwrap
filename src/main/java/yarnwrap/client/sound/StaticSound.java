package yarnwrap.client.sound;
public class StaticSound { public net.minecraft.client.sound.StaticSound wrapperContained; public StaticSound(net.minecraft.client.sound.StaticSound wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.ByteBuffer sample() { return wrapperContained.sample; }
// public void sample(java.nio.ByteBuffer value) { wrapperContained.sample = value; }
// public static java.nio.ByteBuffer sample() { return net.minecraft.client.sound.StaticSound.sample; }
// public static void sample(java.nio.ByteBuffer value, ) { net.minecraft.client.sound.StaticSound.sample = value; }

// public javax.sound.sampled.AudioFormat format() { return wrapperContained.format; }
// public void format(javax.sound.sampled.AudioFormat value) { wrapperContained.format = value; }
// public static javax.sound.sampled.AudioFormat format() { return net.minecraft.client.sound.StaticSound.format; }
// public static void format(javax.sound.sampled.AudioFormat value, ) { net.minecraft.client.sound.StaticSound.format = value; }

// public boolean hasBuffer() { return wrapperContained.hasBuffer; }
// public void hasBuffer(boolean value) { wrapperContained.hasBuffer = value; }
// public static boolean hasBuffer() { return net.minecraft.client.sound.StaticSound.hasBuffer; }
// public static void hasBuffer(boolean value, ) { net.minecraft.client.sound.StaticSound.hasBuffer = value; }

// public int streamBufferPointer() { return wrapperContained.streamBufferPointer; }
// public void streamBufferPointer(int value) { wrapperContained.streamBufferPointer = value; }
// public static int streamBufferPointer() { return net.minecraft.client.sound.StaticSound.streamBufferPointer; }
// public static void streamBufferPointer(int value, ) { net.minecraft.client.sound.StaticSound.streamBufferPointer = value; }

public StaticSound(java.nio.ByteBuffer sample,javax.sound.sampled.AudioFormat format) { this.wrapperContained = new net.minecraft.client.sound.StaticSound(sample,format); }
// public java.util.OptionalInt getStreamBufferPointer() { return wrapperContained.getStreamBufferPointer(); }
// public static java.util.OptionalInt getStreamBufferPointer() { return net.minecraft.client.sound.StaticSound.getStreamBufferPointer(); }
public void close() { wrapperContained.close(); }
// public static void close() { net.minecraft.client.sound.StaticSound.close(); }
public java.util.OptionalInt takeStreamBufferPointer() { return wrapperContained.takeStreamBufferPointer(); }
// public static java.util.OptionalInt takeStreamBufferPointer() { return net.minecraft.client.sound.StaticSound.takeStreamBufferPointer(); }

}