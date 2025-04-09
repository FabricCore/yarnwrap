package yarnwrap.network.packet.s2c.common;
public class SynchronizeTagsS2CPacket { public net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket wrapperContained; public SynchronizeTagsS2CPacket(net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map groups() { return wrapperContained.groups; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public java.util.Map getGroups() { return wrapperContained.getGroups(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}