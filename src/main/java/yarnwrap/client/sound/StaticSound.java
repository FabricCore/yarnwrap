package yarnwrap.client.sound;
public class StaticSound { public net.minecraft.client.sound.StaticSound wrapperContained; public StaticSound(net.minecraft.client.sound.StaticSound wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.ByteBuffer sample() { return wrapperContained.sample; }
// public void sample(java.nio.ByteBuffer value) { wrapperContained.sample = value; }
// public javax.sound.sampled.AudioFormat format() { return wrapperContained.format; }
// public void format(javax.sound.sampled.AudioFormat value) { wrapperContained.format = value; }
// public boolean hasBuffer() { return wrapperContained.hasBuffer; }
// public void hasBuffer(boolean value) { wrapperContained.hasBuffer = value; }
// public int streamBufferPointer() { return wrapperContained.streamBufferPointer; }
// public void streamBufferPointer(int value) { wrapperContained.streamBufferPointer = value; }
public StaticSound(java.nio.ByteBuffer sample,javax.sound.sampled.AudioFormat format) { this.wrapperContained = new net.minecraft.client.sound.StaticSound(sample,format); }
// public java.util.OptionalInt getStreamBufferPointer() { return wrapperContained.getStreamBufferPointer(); }
public void close() { wrapperContained.close(); }
public java.util.OptionalInt takeStreamBufferPointer() { return wrapperContained.takeStreamBufferPointer(); }

}