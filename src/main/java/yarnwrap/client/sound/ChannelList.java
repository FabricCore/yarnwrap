package yarnwrap.client.sound;
public class ChannelList { public net.minecraft.client.sound.ChannelList wrapperContained; public ChannelList(net.minecraft.client.sound.ChannelList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List buffers() { return wrapperContained.buffers; }
// public void buffers(java.util.List value) { wrapperContained.buffers = value; }
// public static java.util.List buffers() { return net.minecraft.client.sound.ChannelList.buffers; }
// public static void buffers(java.util.List value, ) { net.minecraft.client.sound.ChannelList.buffers = value; }

// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.client.sound.ChannelList.size; }
// public static void size(int value, ) { net.minecraft.client.sound.ChannelList.size = value; }

// public int currentBufferSize() { return wrapperContained.currentBufferSize; }
// public void currentBufferSize(int value) { wrapperContained.currentBufferSize = value; }
// public static int currentBufferSize() { return net.minecraft.client.sound.ChannelList.currentBufferSize; }
// public static void currentBufferSize(int value, ) { net.minecraft.client.sound.ChannelList.currentBufferSize = value; }

// public java.nio.ByteBuffer buffer() { return wrapperContained.buffer; }
// public void buffer(java.nio.ByteBuffer value) { wrapperContained.buffer = value; }
// public static java.nio.ByteBuffer buffer() { return net.minecraft.client.sound.ChannelList.buffer; }
// public static void buffer(java.nio.ByteBuffer value, ) { net.minecraft.client.sound.ChannelList.buffer = value; }

public ChannelList(int size) { this.wrapperContained = new net.minecraft.client.sound.ChannelList(size); }
public void accept(float value) { wrapperContained.accept(value); }
// public static void accept(float value, ) { net.minecraft.client.sound.ChannelList.accept(value); }
public java.nio.ByteBuffer getBuffer() { return wrapperContained.getBuffer(); }
// public static java.nio.ByteBuffer getBuffer() { return net.minecraft.client.sound.ChannelList.getBuffer(); }
public int getCurrentBufferSize() { return wrapperContained.getCurrentBufferSize(); }
// public static int getCurrentBufferSize() { return net.minecraft.client.sound.ChannelList.getCurrentBufferSize(); }

}