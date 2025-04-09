package yarnwrap.network.packet.c2s.play;
public class AdvancementTabC2SPacket { public net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket wrapperContained; public AdvancementTabC2SPacket(net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier tabToOpen() { return new yarnwrap.util.Identifier(wrapperContained.tabToOpen); }
// public Object action() { return wrapperContained.action; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket close() { return new yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket(wrapperContained.close()); }
public Object getAction() { return wrapperContained.getAction(); }
public yarnwrap.util.Identifier getTabToOpen() { return new yarnwrap.util.Identifier(wrapperContained.getTabToOpen()); }
public yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket open(yarnwrap.advancement.AdvancementEntry advancement) { return new yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket(wrapperContained.open(advancement.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}