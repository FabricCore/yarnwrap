package yarnwrap.network.packet.s2c.common;
public class SynchronizeTagsS2CPacket { public net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket wrapperContained; public SynchronizeTagsS2CPacket(net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map groups() { return wrapperContained.groups; }
// public void groups(java.util.Map value) { wrapperContained.groups = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public SynchronizeTagsS2CPacket(java.util.Map groups) { this.wrapperContained = new net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket(groups); }
// public SynchronizeTagsS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.common.SynchronizeTagsS2CPacket(buf.wrapperContained); }
public java.util.Map getGroups() { return wrapperContained.getGroups(); }
// public void method_34203(yarnwrap.network.PacketByteBuf bufx,Object serializedGroup) { wrapperContained.method_34203(bufx.wrapperContained,serializedGroup); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}