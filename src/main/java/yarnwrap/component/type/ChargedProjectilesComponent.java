package yarnwrap.component.type;
public class ChargedProjectilesComponent { public net.minecraft.component.type.ChargedProjectilesComponent wrapperContained; public ChargedProjectilesComponent(net.minecraft.component.type.ChargedProjectilesComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.ChargedProjectilesComponent DEFAULT() { return new yarnwrap.component.type.ChargedProjectilesComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.ChargedProjectilesComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public java.util.List projectiles() { return wrapperContained.projectiles; }
// public void projectiles(java.util.List value) { wrapperContained.projectiles = value; }
public java.util.List getProjectiles() { return wrapperContained.getProjectiles(); }
public boolean contains(yarnwrap.item.Item item) { return wrapperContained.contains(item.wrapperContained); }
public yarnwrap.component.type.ChargedProjectilesComponent of(yarnwrap.item.ItemStack projectile) { return new yarnwrap.component.type.ChargedProjectilesComponent(wrapperContained.of(projectile.wrapperContained)); }
public yarnwrap.component.type.ChargedProjectilesComponent of(java.util.List projectiles) { return new yarnwrap.component.type.ChargedProjectilesComponent(wrapperContained.of(projectiles)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }

}