package yarnwrap.network.packet.s2c.common;
public class ResourcePackSendS2CPacket { public net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket wrapperContained; public ResourcePackSendS2CPacket(net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_HASH_LENGTH() { return wrapperContained.MAX_HASH_LENGTH; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }

}