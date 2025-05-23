package yarnwrap.item.equipment.trim;
public class ArmorTrimAssets { public net.minecraft.item.equipment.trim.ArmorTrimAssets wrapperContained; public ArmorTrimAssets(net.minecraft.item.equipment.trim.ArmorTrimAssets wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.item.equipment.trim.ArmorTrimAssets.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.item.equipment.trim.ArmorTrimAssets.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.item.equipment.trim.ArmorTrimAssets.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.item.equipment.trim.ArmorTrimAssets.PACKET_CODEC = value.wrapperContained; }

public Object getAssetId(yarnwrap.registry.RegistryKey equipmentAsset) { return wrapperContained.getAssetId(equipmentAsset.wrapperContained); }
// public static Object getAssetId(yarnwrap.registry.RegistryKey equipmentAsset, ) { return net.minecraft.item.equipment.trim.ArmorTrimAssets.getAssetId(equipmentAsset.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_67228(Object instance) { return wrapperContained.method_67228(instance); }
// public static com.mojang.datafixers.kinds.App method_67228(Object instance, ) { return net.minecraft.item.equipment.trim.ArmorTrimAssets.method_67228(instance); }
// public yarnwrap.item.equipment.trim.ArmorTrimAssets of(java.lang.String suffix) { return new yarnwrap.item.equipment.trim.ArmorTrimAssets(wrapperContained.of(suffix)); }
// public static yarnwrap.item.equipment.trim.ArmorTrimAssets of(java.lang.String suffix, ) { return new yarnwrap.item.equipment.trim.ArmorTrimAssets(net.minecraft.item.equipment.trim.ArmorTrimAssets.of(suffix)); }
// public yarnwrap.item.equipment.trim.ArmorTrimAssets of(java.lang.String suffix,java.util.Map overrides) { return new yarnwrap.item.equipment.trim.ArmorTrimAssets(wrapperContained.of(suffix,overrides)); }
// public static yarnwrap.item.equipment.trim.ArmorTrimAssets of(java.lang.String suffix,java.util.Map overrides, ) { return new yarnwrap.item.equipment.trim.ArmorTrimAssets(net.minecraft.item.equipment.trim.ArmorTrimAssets.of(suffix,overrides)); }

}