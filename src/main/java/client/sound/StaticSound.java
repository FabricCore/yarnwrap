package yarnwrap.client.sound;
public class StaticSound { public net.minecraft.client.sound.StaticSound wrapperContained; public StaticSound(net.minecraft.client.sound.StaticSound wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.nio.ByteBuffer sample() { return wrapperContained.sample; }
// public javax.sound.sampled.AudioFormat format() { return wrapperContained.format; }
// public boolean hasBuffer() { return wrapperContained.hasBuffer; }
// public int streamBufferPointer() { return wrapperContained.streamBufferPointer; }
// public java.util.OptionalInt getStreamBufferPointer() { return wrapperContained.getStreamBufferPointer(); }
public void close() { wrapperContained.close(); }
public java.util.OptionalInt takeStreamBufferPointer() { return wrapperContained.takeStreamBufferPointer(); }

}