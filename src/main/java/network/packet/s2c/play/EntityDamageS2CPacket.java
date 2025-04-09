package yarnwrap.network.packet.s2c.play;
public class EntityDamageS2CPacket { public net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket wrapperContained; public EntityDamageS2CPacket(net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.entity.damage.DamageSource createDamageSource(yarnwrap.world.World world) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.createDamageSource(world.wrapperContained)); }
// public void writeOffsetVarInt(yarnwrap.network.PacketByteBuf buf,int value) { wrapperContained.writeOffsetVarInt(buf.wrapperContained,value); }
// public int readOffsetVarInt(yarnwrap.network.PacketByteBuf buf) { return wrapperContained.readOffsetVarInt(buf.wrapperContained); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}