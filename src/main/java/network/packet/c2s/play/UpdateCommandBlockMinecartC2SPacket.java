package yarnwrap.network.packet.c2s.play;
public class UpdateCommandBlockMinecartC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket wrapperContained; public UpdateCommandBlockMinecartC2SPacket(net.minecraft.network.packet.c2s.play.UpdateCommandBlockMinecartC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean trackOutput() { return wrapperContained.trackOutput; }
// public int entityId() { return wrapperContained.entityId; }
// public java.lang.String command() { return wrapperContained.command; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public java.lang.String getCommand() { return wrapperContained.getCommand(); }
public yarnwrap.world.CommandBlockExecutor getMinecartCommandExecutor(yarnwrap.world.World world) { return new yarnwrap.world.CommandBlockExecutor(wrapperContained.getMinecartCommandExecutor(world.wrapperContained)); }
public boolean shouldTrackOutput() { return wrapperContained.shouldTrackOutput(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}