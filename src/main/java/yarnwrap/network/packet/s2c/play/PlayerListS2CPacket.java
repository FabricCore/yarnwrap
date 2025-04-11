package yarnwrap.network.packet.s2c.play;
public class PlayerListS2CPacket { public net.minecraft.network.packet.s2c.play.PlayerListS2CPacket wrapperContained; public PlayerListS2CPacket(net.minecraft.network.packet.s2c.play.PlayerListS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List entries() { return wrapperContained.entries; }
// public void entries(java.util.List value) { wrapperContained.entries = value; }
// public java.util.EnumSet actions() { return wrapperContained.actions; }
// public void actions(java.util.EnumSet value) { wrapperContained.actions = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public yarnwrap.network.packet.s2c.play.PlayerListS2CPacket entryFromPlayer(java.util.Collection players) { return new yarnwrap.network.packet.s2c.play.PlayerListS2CPacket(wrapperContained.entryFromPlayer(players)); }
public java.util.EnumSet getActions() { return wrapperContained.getActions(); }
public java.util.List getEntries() { return wrapperContained.getEntries(); }
public java.util.List getPlayerAdditionEntries() { return wrapperContained.getPlayerAdditionEntries(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}