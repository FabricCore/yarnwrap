package yarnwrap.component.type;
public class WeaponComponent { public net.minecraft.component.type.WeaponComponent wrapperContained; public WeaponComponent(net.minecraft.component.type.WeaponComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.WeaponComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.WeaponComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.WeaponComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.WeaponComponent.PACKET_CODEC = value.wrapperContained; }

// public float AXE_DISABLE_BLOCKING_FOR_SECONDS() { return wrapperContained.AXE_DISABLE_BLOCKING_FOR_SECONDS; }
// public void AXE_DISABLE_BLOCKING_FOR_SECONDS(float value) { wrapperContained.AXE_DISABLE_BLOCKING_FOR_SECONDS = value; }
public static float AXE_DISABLE_BLOCKING_FOR_SECONDS() { return net.minecraft.component.type.WeaponComponent.AXE_DISABLE_BLOCKING_FOR_SECONDS; }
// public static void AXE_DISABLE_BLOCKING_FOR_SECONDS(float value, ) { net.minecraft.component.type.WeaponComponent.AXE_DISABLE_BLOCKING_FOR_SECONDS = value; }

public WeaponComponent(int itemDamagePerAttack) { this.wrapperContained = new net.minecraft.component.type.WeaponComponent(itemDamagePerAttack); }
// public com.mojang.datafixers.kinds.App method_66336(Object instance) { return wrapperContained.method_66336(instance); }
// public static com.mojang.datafixers.kinds.App method_66336(Object instance, ) { return net.minecraft.component.type.WeaponComponent.method_66336(instance); }

}