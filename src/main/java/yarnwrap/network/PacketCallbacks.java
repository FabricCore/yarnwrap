package yarnwrap.network;
public class PacketCallbacks { public net.minecraft.network.PacketCallbacks wrapperContained; public PacketCallbacks(net.minecraft.network.PacketCallbacks wrapperContained) { this.wrapperContained = wrapperContained; }

public void onSuccess() { wrapperContained.onSuccess(); }
// public static void onSuccess() { net.minecraft.network.PacketCallbacks.onSuccess(); }
// public yarnwrap.network.PacketCallbacks always(java.lang.Runnable runnable) { return new yarnwrap.network.PacketCallbacks(wrapperContained.always(runnable)); }
// public static yarnwrap.network.PacketCallbacks always(java.lang.Runnable runnable, ) { return new yarnwrap.network.PacketCallbacks(net.minecraft.network.PacketCallbacks.always(runnable)); }
// public yarnwrap.network.PacketCallbacks of(java.util.function.Supplier failurePacket) { return new yarnwrap.network.PacketCallbacks(wrapperContained.of(failurePacket)); }
// public static yarnwrap.network.PacketCallbacks of(java.util.function.Supplier failurePacket, ) { return new yarnwrap.network.PacketCallbacks(net.minecraft.network.PacketCallbacks.of(failurePacket)); }
public yarnwrap.network.packet.Packet getFailurePacket() { return new yarnwrap.network.packet.Packet(wrapperContained.getFailurePacket()); }
// public static yarnwrap.network.packet.Packet getFailurePacket() { return new yarnwrap.network.packet.Packet(net.minecraft.network.PacketCallbacks.getFailurePacket()); }

}