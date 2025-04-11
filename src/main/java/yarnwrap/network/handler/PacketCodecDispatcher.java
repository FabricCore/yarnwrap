package yarnwrap.network.handler;
public class PacketCodecDispatcher { public net.minecraft.network.handler.PacketCodecDispatcher wrapperContained; public PacketCodecDispatcher(net.minecraft.network.handler.PacketCodecDispatcher wrapperContained) { this.wrapperContained = wrapperContained; }

// public int UNKNOWN_PACKET_INDEX() { return wrapperContained.UNKNOWN_PACKET_INDEX; }
// public void UNKNOWN_PACKET_INDEX(int value) { wrapperContained.UNKNOWN_PACKET_INDEX = value; }
// public java.util.function.Function packetIdGetter() { return wrapperContained.packetIdGetter; }
// public void packetIdGetter(java.util.function.Function value) { wrapperContained.packetIdGetter = value; }
// public java.util.List packetTypes() { return wrapperContained.packetTypes; }
// public void packetTypes(java.util.List value) { wrapperContained.packetTypes = value; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap typeToIndex() { return wrapperContained.typeToIndex; }
// public void typeToIndex(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.typeToIndex = value; }
// public PacketCodecDispatcher(java.util.function.Function packetIdGetter,java.util.List packetTypes,it.unimi.dsi.fastutil.objects.Object2IntMap typeToIndex) { this.wrapperContained = new net.minecraft.network.handler.PacketCodecDispatcher(packetIdGetter,packetTypes,typeToIndex); }
public Object builder(java.util.function.Function packetIdGetter) { return wrapperContained.builder(packetIdGetter); }

}