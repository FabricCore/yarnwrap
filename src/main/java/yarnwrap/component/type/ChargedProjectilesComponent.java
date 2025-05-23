package yarnwrap.component.type;
public class ChargedProjectilesComponent { public net.minecraft.component.type.ChargedProjectilesComponent wrapperContained; public ChargedProjectilesComponent(net.minecraft.component.type.ChargedProjectilesComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.ChargedProjectilesComponent DEFAULT() { return new yarnwrap.component.type.ChargedProjectilesComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.ChargedProjectilesComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.ChargedProjectilesComponent DEFAULT() { return new yarnwrap.component.type.ChargedProjectilesComponent(net.minecraft.component.type.ChargedProjectilesComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.ChargedProjectilesComponent value, ) { net.minecraft.component.type.ChargedProjectilesComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.ChargedProjectilesComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.ChargedProjectilesComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.ChargedProjectilesComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.ChargedProjectilesComponent.PACKET_CODEC = value.wrapperContained; }

// public java.util.List projectiles() { return wrapperContained.projectiles; }
// public void projectiles(java.util.List value) { wrapperContained.projectiles = value; }
// public static java.util.List projectiles() { return net.minecraft.component.type.ChargedProjectilesComponent.projectiles; }
// public static void projectiles(java.util.List value, ) { net.minecraft.component.type.ChargedProjectilesComponent.projectiles = value; }

// public ChargedProjectilesComponent(java.util.List projectiles) { this.wrapperContained = new net.minecraft.component.type.ChargedProjectilesComponent(projectiles); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.component.type.ChargedProjectilesComponent.equals(o); }
public java.util.List getProjectiles() { return wrapperContained.getProjectiles(); }
// public static java.util.List getProjectiles() { return net.minecraft.component.type.ChargedProjectilesComponent.getProjectiles(); }
public boolean contains(yarnwrap.item.Item item) { return wrapperContained.contains(item.wrapperContained); }
// public static boolean contains(yarnwrap.item.Item item, ) { return net.minecraft.component.type.ChargedProjectilesComponent.contains(item.wrapperContained); }
// public yarnwrap.component.type.ChargedProjectilesComponent of(yarnwrap.item.ItemStack projectile) { return new yarnwrap.component.type.ChargedProjectilesComponent(wrapperContained.of(projectile.wrapperContained)); }
// public static yarnwrap.component.type.ChargedProjectilesComponent of(yarnwrap.item.ItemStack projectile, ) { return new yarnwrap.component.type.ChargedProjectilesComponent(net.minecraft.component.type.ChargedProjectilesComponent.of(projectile.wrapperContained)); }
// public java.util.List method_57440(yarnwrap.component.type.ChargedProjectilesComponent component) { return wrapperContained.method_57440(component.wrapperContained); }
// public static java.util.List method_57440(yarnwrap.component.type.ChargedProjectilesComponent component, ) { return net.minecraft.component.type.ChargedProjectilesComponent.method_57440(component.wrapperContained); }
// public yarnwrap.component.type.ChargedProjectilesComponent of(java.util.List projectiles) { return new yarnwrap.component.type.ChargedProjectilesComponent(wrapperContained.of(projectiles)); }
// public static yarnwrap.component.type.ChargedProjectilesComponent of(java.util.List projectiles, ) { return new yarnwrap.component.type.ChargedProjectilesComponent(net.minecraft.component.type.ChargedProjectilesComponent.of(projectiles)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.component.type.ChargedProjectilesComponent.isEmpty(); }
// public void appendProjectileTooltip(Object context,java.util.function.Consumer textConsumer,yarnwrap.item.ItemStack projectile,int count) { wrapperContained.appendProjectileTooltip(context,textConsumer,projectile.wrapperContained,count); }
// public static void appendProjectileTooltip(Object context,java.util.function.Consumer textConsumer,yarnwrap.item.ItemStack projectile,int count, ) { net.minecraft.component.type.ChargedProjectilesComponent.appendProjectileTooltip(context,textConsumer,projectile.wrapperContained,count); }
// public void method_67536(java.util.function.Consumer tooltip) { wrapperContained.method_67536(tooltip); }
// public static void method_67536(java.util.function.Consumer tooltip, ) { net.minecraft.component.type.ChargedProjectilesComponent.method_67536(tooltip); }

}