package yarnwrap.network.packet.s2c.common;
public class SynchronizeTagsS2CPacket { public net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket wrapperContained; public SynchronizeTagsS2CPacket(net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map groups() { return wrapperContained.groups; }
// public void groups(java.util.Map value) { wrapperContained.groups = value; }
// public static java.util.Map groups() { return net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket.groups; }
// public static void groups(java.util.Map value, ) { net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket.groups = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket.CODEC = value.wrapperContained; }

public SynchronizeTagsS2CPacket(java.util.Map groups) { this.wrapperContained = new net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket(groups); }
// public SynchronizeTagsS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket(buf.wrapperContained); }
public java.util.Map getGroups() { return wrapperContained.getGroups(); }
// public static java.util.Map getGroups() { return net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket.getGroups(); }
// public void method_34203(yarnwrap.network.PacketByteBuf bufx,Object serializedGroup) { wrapperContained.method_34203(bufx.wrapperContained,serializedGroup); }
// public static void method_34203(yarnwrap.network.PacketByteBuf bufx,Object serializedGroup, ) { net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket.method_34203(bufx.wrapperContained,serializedGroup); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket.write(buf.wrapperContained); }

}