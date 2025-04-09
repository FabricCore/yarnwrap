package yarnwrap.network.packet.s2c.play;
public class EntityStatusS2CPacket { public net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket wrapperContained; public EntityStatusS2CPacket(net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte status() { return wrapperContained.status; }
// public int entityId() { return wrapperContained.entityId; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.entity.Entity getEntity(yarnwrap.world.World world) { return new yarnwrap.entity.Entity(wrapperContained.getEntity(world.wrapperContained)); }
public byte getStatus() { return wrapperContained.getStatus(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}