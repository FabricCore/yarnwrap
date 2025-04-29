package yarnwrap.network.packet.c2s.play;
public class AdvancementTabC2SPacket { public net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket wrapperContained; public AdvancementTabC2SPacket(net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier tabToOpen() { return new yarnwrap.util.Identifier(wrapperContained.tabToOpen); }
// public void tabToOpen(yarnwrap.util.Identifier value) { wrapperContained.tabToOpen = value.wrapperContained; }
// public static yarnwrap.util.Identifier tabToOpen() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket.tabToOpen); }
// public static void tabToOpen(yarnwrap.util.Identifier value, ) { net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket.tabToOpen = value.wrapperContained; }

// public Object action() { return wrapperContained.action; }
// // public void action(Object value) { wrapperContained.action = value; }
// // public static Object action() { return net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket.action; }
// // public static void action(Object value, ) { net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket.action = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket.CODEC = value.wrapperContained; }

// public AdvancementTabC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket(buf.wrapperContained); }
// public AdvancementTabC2SPacket(Object action,yarnwrap.util.Identifier tab) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket(action,tab.wrapperContained); }
// public yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket close() { return new yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket(wrapperContained.close()); }
public static yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket close() { return new yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket(net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket.close()); }
public Object getAction() { return wrapperContained.getAction(); }
// public static Object getAction() { return net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket.getAction(); }
public yarnwrap.util.Identifier getTabToOpen() { return new yarnwrap.util.Identifier(wrapperContained.getTabToOpen()); }
// public static yarnwrap.util.Identifier getTabToOpen() { return new yarnwrap.util.Identifier(net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket.getTabToOpen()); }
// public yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket open(yarnwrap.advancement.AdvancementEntry advancement) { return new yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket(wrapperContained.open(advancement.wrapperContained)); }
// public static yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket open(yarnwrap.advancement.AdvancementEntry advancement, ) { return new yarnwrap.network.packet.c2s.play.AdvancementTabC2SPacket(net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket.open(advancement.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.AdvancementTabC2SPacket.write(buf.wrapperContained); }

}