package yarnwrap.network.packet.s2c.play;
public class SelectAdvancementTabS2CPacket { public net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket wrapperContained; public SelectAdvancementTabS2CPacket(net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier tabId() { return new yarnwrap.util.Identifier(wrapperContained.tabId); }
// public void tabId(yarnwrap.util.Identifier value) { wrapperContained.tabId = value.wrapperContained; }
// public static yarnwrap.util.Identifier tabId() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket.tabId); }
// public static void tabId(yarnwrap.util.Identifier value, ) { net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket.tabId = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket.CODEC = value.wrapperContained; }

// public SelectAdvancementTabS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket(buf.wrapperContained); }
public SelectAdvancementTabS2CPacket(yarnwrap.util.Identifier tabId) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket(tabId.wrapperContained); }
public yarnwrap.util.Identifier getTabId() { return new yarnwrap.util.Identifier(wrapperContained.getTabId()); }
// public static yarnwrap.util.Identifier getTabId() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket.getTabId()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket.write(buf.wrapperContained); }

}