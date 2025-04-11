package yarnwrap.network.packet.s2c.play;
public class GameJoinS2CPacket { public net.minecraft.network.packet.s2c.play.GameJoinS2CPacket wrapperContained; public GameJoinS2CPacket(net.minecraft.network.packet.s2c.play.GameJoinS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean showDeathScreen() { return wrapperContained.showDeathScreen; }
// public void showDeathScreen(boolean value) { wrapperContained.showDeathScreen = value; }
// public int playerEntityId() { return wrapperContained.playerEntityId; }
// public void playerEntityId(int value) { wrapperContained.playerEntityId = value; }
// public boolean hardcore() { return wrapperContained.hardcore; }
// public void hardcore(boolean value) { wrapperContained.hardcore = value; }
// public java.util.Set dimensionIds() { return wrapperContained.dimensionIds; }
// public void dimensionIds(java.util.Set value) { wrapperContained.dimensionIds = value; }
// public int maxPlayers() { return wrapperContained.maxPlayers; }
// public void maxPlayers(int value) { wrapperContained.maxPlayers = value; }
// public int viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(int value) { wrapperContained.viewDistance = value; }
// public boolean reducedDebugInfo() { return wrapperContained.reducedDebugInfo; }
// public void reducedDebugInfo(boolean value) { wrapperContained.reducedDebugInfo = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public boolean showDeathScreen() { return wrapperContained.showDeathScreen(); }
// public int playerEntityId() { return wrapperContained.playerEntityId(); }
// public boolean hardcore() { return wrapperContained.hardcore(); }
// public java.util.Set dimensionIds() { return wrapperContained.dimensionIds(); }
// public int maxPlayers() { return wrapperContained.maxPlayers(); }
// public int viewDistance() { return wrapperContained.viewDistance(); }
// public boolean reducedDebugInfo() { return wrapperContained.reducedDebugInfo(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}