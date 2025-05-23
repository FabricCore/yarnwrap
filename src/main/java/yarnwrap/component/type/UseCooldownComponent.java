package yarnwrap.component.type;
public class UseCooldownComponent { public net.minecraft.component.type.UseCooldownComponent wrapperContained; public UseCooldownComponent(net.minecraft.component.type.UseCooldownComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.UseCooldownComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.UseCooldownComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.UseCooldownComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.UseCooldownComponent.PACKET_CODEC = value.wrapperContained; }

public UseCooldownComponent(float seconds) { this.wrapperContained = new net.minecraft.component.type.UseCooldownComponent(seconds); }
public int getCooldownTicks() { return wrapperContained.getCooldownTicks(); }
// public static int getCooldownTicks() { return net.minecraft.component.type.UseCooldownComponent.getCooldownTicks(); }
// public com.mojang.datafixers.kinds.App method_62861(Object instance) { return wrapperContained.method_62861(instance); }
// public static com.mojang.datafixers.kinds.App method_62861(Object instance, ) { return net.minecraft.component.type.UseCooldownComponent.method_62861(instance); }
public void set(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user) { wrapperContained.set(stack.wrapperContained,user.wrapperContained); }
// public static void set(yarnwrap.item.ItemStack stack,yarnwrap.entity.LivingEntity user, ) { net.minecraft.component.type.UseCooldownComponent.set(stack.wrapperContained,user.wrapperContained); }

}