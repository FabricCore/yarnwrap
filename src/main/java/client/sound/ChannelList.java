package yarnwrap.client.sound;
public class ChannelList { public net.minecraft.client.sound.ChannelList wrapperContained; public ChannelList(net.minecraft.client.sound.ChannelList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List buffers() { return wrapperContained.buffers; }
// public int size() { return wrapperContained.size; }
// public int currentBufferSize() { return wrapperContained.currentBufferSize; }
// public java.nio.ByteBuffer buffer() { return wrapperContained.buffer; }
public java.nio.ByteBuffer getBuffer() { return wrapperContained.getBuffer(); }
public int getCurrentBufferSize() { return wrapperContained.getCurrentBufferSize(); }

}