package yarnwrap.network.handler;
public class PacketCodecDispatcher { public net.minecraft.network.handler.PacketCodecDispatcher wrapperContained; public PacketCodecDispatcher(net.minecraft.network.handler.PacketCodecDispatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public int UNKNOWN_PACKET_INDEX() { return wrapperContained.UNKNOWN_PACKET_INDEX; }
// public java.util.function.Function packetIdGetter() { return wrapperContained.packetIdGetter; }
// public java.util.List packetTypes() { return wrapperContained.packetTypes; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap typeToIndex() { return wrapperContained.typeToIndex; }
public Object builder(java.util.function.Function packetIdGetter) { return wrapperContained.builder(packetIdGetter); }

}