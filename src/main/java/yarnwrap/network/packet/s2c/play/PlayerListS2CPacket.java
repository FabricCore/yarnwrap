package yarnwrap.network.packet.s2c.play;
public class PlayerListS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerListS2CPacket wrapperContained; public PlayerListS2CPacket(net.minecraft.network.packet.s2c.play.PlayerListS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public java.util.EnumSet actions() { return wrapperContained.actions; }
// public void actions(java.util.EnumSet value) { wrapperContained.actions = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public PlayerListS2CPacket(java.util.EnumSet actions,java.util.Collection players) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerListS2CPacket(actions,players); }
// public PlayerListS2CPacket(Object action,yarnwrap.server.network.ServerPlayerEntity player) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerListS2CPacket(action,player.wrapperContained); }
// public PlayerListS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlayerListS2CPacket(buf.wrapperContained); }
public yarnwrap.network.packet.s2c.play.PlayerListS2CPacket entryFromPlayer(java.util.Collection players) { return new yarnwrap.network.packet.s2c.play.PlayerListS2CPacket(wrapperContained.entryFromPlayer(players)); }
// public void method_46326(yarnwrap.network.PacketByteBuf buf2,Object entry) { wrapperContained.method_46326(buf2.wrapperContained,entry); }
public java.util.EnumSet getActions() { return wrapperContained.getActions(); }
// public Object method_46328(yarnwrap.network.PacketByteBuf buf2) { return wrapperContained.method_46328(buf2.wrapperContained); }
public java.util.List getEntries() { return wrapperContained.getEntries(); }
public java.util.List getPlayerAdditionEntries() { return wrapperContained.getPlayerAdditionEntries(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}