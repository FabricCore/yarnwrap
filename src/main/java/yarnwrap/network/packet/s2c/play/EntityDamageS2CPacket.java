package yarnwrap.network.packet.s2c.play;
public class EntityDamageS2CPacket { public net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket wrapperContained; public EntityDamageS2CPacket(net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket.CODEC = value.wrapperContained; }

public EntityDamageS2CPacket(yarnwrap.entity.Entity entity,yarnwrap.entity.damage.DamageSource damageSource) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket(entity.wrapperContained,damageSource.wrapperContained); }
// public EntityDamageS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket(buf.wrapperContained); }
public yarnwrap.entity.damage.DamageSource createDamageSource(yarnwrap.world.World world) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.createDamageSource(world.wrapperContained)); }
// public static yarnwrap.entity.damage.DamageSource createDamageSource(yarnwrap.world.World world, ) { return new yarnwrap.entity.damage.DamageSource(net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket.createDamageSource(world.wrapperContained)); }
// public void writeOffsetVarInt(yarnwrap.network.PacketByteBuf buf,int value) { wrapperContained.writeOffsetVarInt(buf.wrapperContained,value); }
// public static void writeOffsetVarInt(yarnwrap.network.PacketByteBuf buf,int value, ) { net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket.writeOffsetVarInt(buf.wrapperContained,value); }
// public void method_49073(yarnwrap.network.PacketByteBuf bufx,yarnwrap.util.math.Vec3d pos) { wrapperContained.method_49073(bufx.wrapperContained,pos.wrapperContained); }
// public static void method_49073(yarnwrap.network.PacketByteBuf bufx,yarnwrap.util.math.Vec3d pos, ) { net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket.method_49073(bufx.wrapperContained,pos.wrapperContained); }
// public int readOffsetVarInt(yarnwrap.network.PacketByteBuf buf) { return wrapperContained.readOffsetVarInt(buf.wrapperContained); }
// public static int readOffsetVarInt(yarnwrap.network.PacketByteBuf buf, ) { return net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket.readOffsetVarInt(buf.wrapperContained); }
// public yarnwrap.util.math.Vec3d method_49076(yarnwrap.network.PacketByteBuf pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.method_49076(pos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d method_49076(yarnwrap.network.PacketByteBuf pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket.method_49076(pos.wrapperContained)); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket.write(buf.wrapperContained); }

}