package yarnwrap.network.packet.s2c.play;
public class GameJoinS2CPacket { public net.minecraft.network.packet.s2c.play.GameJoinS2CPacket wrapperContained; public GameJoinS2CPacket(net.minecraft.network.packet.s2c.play.GameJoinS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int playerEntityId() { return wrapperContained.playerEntityId; }
// public void playerEntityId(int value) { wrapperContained.playerEntityId = value; }
// public static int playerEntityId() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.playerEntityId; }
// public static void playerEntityId(int value, ) { net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.playerEntityId = value; }

// public boolean hardcore() { return wrapperContained.hardcore; }
// public void hardcore(boolean value) { wrapperContained.hardcore = value; }
// public static boolean hardcore() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.hardcore; }
// public static void hardcore(boolean value, ) { net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.hardcore = value; }

// public java.util.Set dimensionIds() { return wrapperContained.dimensionIds; }
// public void dimensionIds(java.util.Set value) { wrapperContained.dimensionIds = value; }
// public static java.util.Set dimensionIds() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.dimensionIds; }
// public static void dimensionIds(java.util.Set value, ) { net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.dimensionIds = value; }

// public int maxPlayers() { return wrapperContained.maxPlayers; }
// public void maxPlayers(int value) { wrapperContained.maxPlayers = value; }
// public static int maxPlayers() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.maxPlayers; }
// public static void maxPlayers(int value, ) { net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.maxPlayers = value; }

// public int viewDistance() { return wrapperContained.viewDistance; }
// public void viewDistance(int value) { wrapperContained.viewDistance = value; }
// public static int viewDistance() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.viewDistance; }
// public static void viewDistance(int value, ) { net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.viewDistance = value; }

// public boolean reducedDebugInfo() { return wrapperContained.reducedDebugInfo; }
// public void reducedDebugInfo(boolean value) { wrapperContained.reducedDebugInfo = value; }
// public static boolean reducedDebugInfo() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.reducedDebugInfo; }
// public static void reducedDebugInfo(boolean value, ) { net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.reducedDebugInfo = value; }

// public boolean showDeathScreen() { return wrapperContained.showDeathScreen; }
// public void showDeathScreen(boolean value) { wrapperContained.showDeathScreen = value; }
// public static boolean showDeathScreen() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.showDeathScreen; }
// public static void showDeathScreen(boolean value, ) { net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.showDeathScreen = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.CODEC = value.wrapperContained; }

// public GameJoinS2CPacket(int playerEntityId) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.GameJoinS2CPacket(playerEntityId); }
// public GameJoinS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.GameJoinS2CPacket(buf.wrapperContained); }
// public int playerEntityId() { return wrapperContained.playerEntityId(); }
// // public static int playerEntityId() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.playerEntityId(); }
// public boolean hardcore() { return wrapperContained.hardcore(); }
// // public static boolean hardcore() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.hardcore(); }
// public java.util.Set dimensionIds() { return wrapperContained.dimensionIds(); }
// // public static java.util.Set dimensionIds() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.dimensionIds(); }
// public int maxPlayers() { return wrapperContained.maxPlayers(); }
// // public static int maxPlayers() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.maxPlayers(); }
// public int viewDistance() { return wrapperContained.viewDistance(); }
// // public static int viewDistance() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.viewDistance(); }
// public boolean reducedDebugInfo() { return wrapperContained.reducedDebugInfo(); }
// // public static boolean reducedDebugInfo() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.reducedDebugInfo(); }
// public boolean showDeathScreen() { return wrapperContained.showDeathScreen(); }
// // public static boolean showDeathScreen() { return net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.showDeathScreen(); }
// public yarnwrap.registry.RegistryKey method_34135(yarnwrap.network.PacketByteBuf b) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_34135(b.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey method_34135(yarnwrap.network.PacketByteBuf b, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.method_34135(b.wrapperContained)); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.GameJoinS2CPacket.write(buf.wrapperContained); }

}