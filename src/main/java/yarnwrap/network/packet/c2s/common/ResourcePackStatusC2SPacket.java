package yarnwrap.network.packet.c2s.common;
public class ResourcePackStatusC2SPacket { public net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket wrapperContained; public ResourcePackStatusC2SPacket(net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object status() { return wrapperContained.status; }
// // public void status(Object value) { wrapperContained.status = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public ResourcePackStatusC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket(buf.wrapperContained); }
// public Object status() { return wrapperContained.status(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}