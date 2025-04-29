package yarnwrap.network.packet.s2c.play;
public class PlayerListS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerListS2CPacket wrapperContained; public PlayerListS2CPacket(net.minecraft.network.packet.s2c.play.PlayerListS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public static java.util.List entries() { return net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.entries; }
// public static void entries(java.util.List value, ) { net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.entries = value; }

// public java.util.EnumSet actions() { return wrapperContained.actions; }
// public void actions(java.util.EnumSet value) { wrapperContained.actions = value; }
// public static java.util.EnumSet actions() { return net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.actions; }
// public static void actions(java.util.EnumSet value, ) { net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.actions = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.CODEC = value.wrapperContained; }

public PlayerListS2CPacket(java.util.EnumSet actions,java.util.Collection players) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerListS2CPacket(actions,players); }
// public PlayerListS2CPacket(Object action,yarnwrap.server.network.ServerPlayerEntity player) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerListS2CPacket(action,player.wrapperContained); }
// public PlayerListS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerListS2CPacket(buf.wrapperContained); }
// public yarnwrap.network.packet.s2c.play.PlayerListS2CPacket entryFromPlayer(java.util.Collection players) { return new yarnwrap.network.packet.s2c.play.PlayerListS2CPacket(wrapperContained.entryFromPlayer(players)); }
// public static yarnwrap.network.packet.s2c.play.PlayerListS2CPacket entryFromPlayer(java.util.Collection players, ) { return new yarnwrap.network.packet.s2c.play.PlayerListS2CPacket(net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.entryFromPlayer(players)); }
// public void method_46326(yarnwrap.network.PacketByteBuf buf2,Object entry) { wrapperContained.method_46326(buf2.wrapperContained,entry); }
// public static void method_46326(yarnwrap.network.PacketByteBuf buf2,Object entry, ) { net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.method_46326(buf2.wrapperContained,entry); }
public java.util.EnumSet getActions() { return wrapperContained.getActions(); }
// public static java.util.EnumSet getActions() { return net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.getActions(); }
// public Object method_46328(yarnwrap.network.PacketByteBuf buf2) { return wrapperContained.method_46328(buf2.wrapperContained); }
// public static Object method_46328(yarnwrap.network.PacketByteBuf buf2, ) { return net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.method_46328(buf2.wrapperContained); }
public java.util.List getEntries() { return wrapperContained.getEntries(); }
// public static java.util.List getEntries() { return net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.getEntries(); }
public java.util.List getPlayerAdditionEntries() { return wrapperContained.getPlayerAdditionEntries(); }
// public static java.util.List getPlayerAdditionEntries() { return net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.getPlayerAdditionEntries(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.PlayerListS2CPacket.write(buf.wrapperContained); }

}