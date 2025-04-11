package yarnwrap.client.sound;
public class ChannelList { public net.minecraft.client.sound.ChannelList wrapperContained; public ChannelList(net.minecraft.client.sound.ChannelList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List buffers() { return wrapperContained.buffers; }
// public void buffers(java.util.List value) { wrapperContained.buffers = value; }
// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public int currentBufferSize() { return wrapperContained.currentBufferSize; }
// public void currentBufferSize(int value) { wrapperContained.currentBufferSize = value; }
// public java.nio.ByteBuffer buffer() { return wrapperContained.buffer; }
// public void buffer(java.nio.ByteBuffer value) { wrapperContained.buffer = value; }
public ChannelList(int size) { this.wrapperContained = new net.minecraft.client.sound.ChannelList(size); }
public void accept(float value) { wrapperContained.accept(value); }
public java.nio.ByteBuffer getBuffer() { return wrapperContained.getBuffer(); }
public int getCurrentBufferSize() { return wrapperContained.getCurrentBufferSize(); }

}