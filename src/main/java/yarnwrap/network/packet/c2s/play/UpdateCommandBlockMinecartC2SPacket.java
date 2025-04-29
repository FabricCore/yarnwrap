package yarnwrap.network.packet.c2s.play;
public class UpdateCommandBlockMinecartC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket wrapperContained; public UpdateCommandBlockMinecartC2SPacket(net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean trackOutput() { return wrapperContained.trackOutput; }
// public void trackOutput(boolean value) { wrapperContained.trackOutput = value; }
// public static boolean trackOutput() { return net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.trackOutput; }
// public static void trackOutput(boolean value, ) { net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.trackOutput = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.entityId = value; }

// public java.lang.String command() { return wrapperContained.command; }
// public void command(java.lang.String value) { wrapperContained.command = value; }
// public static java.lang.String command() { return net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.command; }
// public static void command(java.lang.String value, ) { net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.command = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.CODEC = value.wrapperContained; }

public UpdateCommandBlockMinecartC2SPacket(int entityId,java.lang.String command,boolean trackOutput) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket(entityId,command,trackOutput); }
// public UpdateCommandBlockMinecartC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket(buf.wrapperContained); }
public java.lang.String getCommand() { return wrapperContained.getCommand(); }
// public static java.lang.String getCommand() { return net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.getCommand(); }
public yarnwrap.world.CommandBlockExecutor getMinecartCommandExecutor(yarnwrap.world.World world) { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.getMinecartCommandExecutor(world.wrapperContained)); }
// public static yarnwrap.world.CommandBlockExecutor getMinecartCommandExecutor(yarnwrap.world.World world, ) { return new yarnwrap.world.CommandBlockExecutor(net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.getMinecartCommandExecutor(world.wrapperContained)); }
public boolean shouldTrackOutput() { return wrapperContained.shouldTrackOutput(); }
// public static boolean shouldTrackOutput() { return net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.shouldTrackOutput(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket.write(buf.wrapperContained); }

}