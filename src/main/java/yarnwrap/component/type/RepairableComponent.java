package yarnwrap.component.type;
public class RepairableComponent { public net.minecraft.component.type.RepairableComponent wrapperContained; public RepairableComponent(net.minecraft.component.type.RepairableComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.RepairableComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.RepairableComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.RepairableComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.RepairableComponent.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_61712(Object instance) { return wrapperContained.method_61712(instance); }
// public static com.mojang.datafixers.kinds.App method_61712(Object instance, ) { return net.minecraft.component.type.RepairableComponent.method_61712(instance); }
public boolean matches(yarnwrap.item.ItemStack stack) { return wrapperContained.matches(stack.wrapperContained); }
// public static boolean matches(yarnwrap.item.ItemStack stack, ) { return net.minecraft.component.type.RepairableComponent.matches(stack.wrapperContained); }

}