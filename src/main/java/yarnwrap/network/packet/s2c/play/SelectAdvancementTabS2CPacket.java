package yarnwrap.network.packet.s2c.play;
public class SelectAdvancementTabS2CPacket { public net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket wrapperContained; public SelectAdvancementTabS2CPacket(net.minecraft.network.packet.s2c.play.SelectAdvancementTabS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier tabId() { return new yarnwrap.util.Identifier(wrapperContained.tabId); }
// public void tabId(yarnwrap.util.Identifier value) { wrapperContained.tabId = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public yarnwrap.util.Identifier getTabId() { return new yarnwrap.util.Identifier(wrapperContained.getTabId()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}