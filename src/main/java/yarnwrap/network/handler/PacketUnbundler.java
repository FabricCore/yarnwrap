package yarnwrap.network.handler;
public class PacketUnbundler { public net.minecraft.network.handler.PacketUnbundler wrapperContained; public PacketUnbundler(net.minecraft.network.handler.PacketUnbundler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.handler.PacketBundleHandler bundleHandler() { return new yarnwrap.network.handler.PacketBundleHandler(wrapperContained.bundleHandler); }
// public void bundleHandler(yarnwrap.network.handler.PacketBundleHandler value) { wrapperContained.bundleHandler = value.wrapperContained; }
public PacketUnbundler(yarnwrap.network.handler.PacketBundleHandler bundleHandler) { this.wrapperContained = new net.minecraft.network.handler.PacketUnbundler(bundleHandler.wrapperContained); }
// public void encode(io.netty.channel.ChannelHandlerContext context,java.lang.Object packet,java.util.List packets) { wrapperContained.encode(context,packet,packets); }

}