package yarnwrap.network.packet.s2c.play;
public class GameJoinS2CPacket { public net.minecraft.network.packet.s2c.play.GameJoinS2CPacket wrapperContained; public GameJoinS2CPacket(net.minecraft.network.packet.s2c.play.GameJoinS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean showDeathScreen() { return wrapperContained.showDeathScreen; }
// public int playerEntityId() { return wrapperContained.playerEntityId; }
// public boolean hardcore() { return wrapperContained.hardcore; }
// public java.util.Set dimensionIds() { return wrapperContained.dimensionIds; }
// public int maxPlayers() { return wrapperContained.maxPlayers; }
// public int viewDistance() { return wrapperContained.viewDistance; }
// public boolean reducedDebugInfo() { return wrapperContained.reducedDebugInfo; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public boolean showDeathScreen() { return wrapperContained.showDeathScreen(); }
// public int playerEntityId() { return wrapperContained.playerEntityId(); }
// public boolean hardcore() { return wrapperContained.hardcore(); }
// public java.util.Set dimensionIds() { return wrapperContained.dimensionIds(); }
// public int maxPlayers() { return wrapperContained.maxPlayers(); }
// public int viewDistance() { return wrapperContained.viewDistance(); }
// public boolean reducedDebugInfo() { return wrapperContained.reducedDebugInfo(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}