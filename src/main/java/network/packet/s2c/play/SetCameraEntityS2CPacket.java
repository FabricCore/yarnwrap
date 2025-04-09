package yarnwrap.network.packet.s2c.play;
public class SetCameraEntityS2CPacket { public net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket wrapperContained; public SetCameraEntityS2CPacket(net.minecraft.network.packet.s2c.play.SetCameraEntityS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.entity.Entity getEntity(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}