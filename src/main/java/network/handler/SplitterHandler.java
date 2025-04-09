package yarnwrap.network.handler;
public class SplitterHandler { public net.minecraft.network.handler.SplitterHandler wrapperContained; public SplitterHandler(net.minecraft.network.handler.SplitterHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int LENGTH_BYTES() { return wrapperContained.LENGTH_BYTES; }
// public io.netty.buffer.ByteBuf reusableBuf() { return wrapperContained.reusableBuf; }
// public yarnwrap.network.handler.PacketSizeLogger packetSizeLogger() { return new yarnwrap.network.handler.PacketSizeLogger(wrapperContained.packetSizeLogger); }
// public boolean shouldSplit(io.netty.buffer.ByteBuf source,io.netty.buffer.ByteBuf sizeBuf) { return wrapperContained.shouldSplit(source,sizeBuf); }

}