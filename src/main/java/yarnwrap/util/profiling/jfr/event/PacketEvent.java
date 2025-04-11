package yarnwrap.util.profiling.jfr.event;
public class PacketEvent { public net.minecraft.util.profiling.jfr.event.PacketEvent wrapperContained; public PacketEvent(net.minecraft.util.profiling.jfr.event.PacketEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public PacketEvent(java.lang.String protocolId,java.lang.String packetDirection,java.lang.String packetId,java.net.SocketAddress remoteAddress,int bytes) { this.wrapperContained = new net.minecraft.util.profiling.jfr.event.PacketEvent(protocolId,packetDirection,packetId,remoteAddress,bytes); }

}