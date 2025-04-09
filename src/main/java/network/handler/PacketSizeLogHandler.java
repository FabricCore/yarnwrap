package yarnwrap.network.handler;
public class PacketSizeLogHandler { public net.minecraft.network.handler.PacketSizeLogHandler wrapperContained; public PacketSizeLogHandler(net.minecraft.network.handler.PacketSizeLogHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.handler.PacketSizeLogger logger() { return new yarnwrap.network.handler.PacketSizeLogger(wrapperContained.logger); }

}