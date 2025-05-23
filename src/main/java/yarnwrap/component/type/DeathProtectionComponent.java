package yarnwrap.component.type;
public class DeathProtectionComponent { public net.minecraft.component.type.DeathProtectionComponent wrapperContained; public DeathProtectionComponent(net.minecraft.component.type.DeathProtectionComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.DeathProtectionComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.DeathProtectionComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.DeathProtectionComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.DeathProtectionComponent.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.component.type.DeathProtectionComponent TOTEM_OF_UNDYING() { return new yarnwrap.component.type.DeathProtectionComponent(wrapperContained.TOTEM_OF_UNDYING); }
// public void TOTEM_OF_UNDYING(yarnwrap.component.type.DeathProtectionComponent value) { wrapperContained.TOTEM_OF_UNDYING = value.wrapperContained; }
public static yarnwrap.component.type.DeathProtectionComponent TOTEM_OF_UNDYING() { return new yarnwrap.component.type.DeathProtectionComponent(net.minecraft.component.type.DeathProtectionComponent.TOTEM_OF_UNDYING); }
// public static void TOTEM_OF_UNDYING(yarnwrap.component.type.DeathProtectionComponent value, ) { net.minecraft.component.type.DeathProtectionComponent.TOTEM_OF_UNDYING = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_64200(Object instance) { return wrapperContained.method_64200(instance); }
// public static com.mojang.datafixers.kinds.App method_64200(Object instance, ) { return net.minecraft.component.type.DeathProtectionComponent.method_64200(instance); }
public void applyDeathEffects(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity entity) { wrapperContained.applyDeathEffects(stack.wrapperContained,entity.wrapperContained); }
// public static void applyDeathEffects(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity entity, ) { net.minecraft.component.type.DeathProtectionComponent.applyDeathEffects(stack.wrapperContained,entity.wrapperContained); }

}