package yarnwrap.village;
public class TradedItem { public net.minecraft.village.TradedItem wrapperContained; public TradedItem(net.minecraft.village.TradedItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.village.TradedItem.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.village.TradedItem.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.village.TradedItem.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.village.TradedItem.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_PACKET_CODEC); }
// public void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.village.TradedItem.OPTIONAL_PACKET_CODEC); }
// public static void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.village.TradedItem.OPTIONAL_PACKET_CODEC = value.wrapperContained; }

public TradedItem(yarnwrap.item.ItemConvertible item) { this.wrapperContained = new net.minecraft.village.TradedItem(item.wrapperContained); }
public TradedItem(yarnwrap.item.ItemConvertible item,int count) { this.wrapperContained = new net.minecraft.village.TradedItem(item.wrapperContained,count); }
public TradedItem(yarnwrap.registry.entry.RegistryEntry item,int count,yarnwrap.predicate.ComponentPredicate components) { this.wrapperContained = new net.minecraft.village.TradedItem(item.wrapperContained,count,components.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_57551(Object instance) { return wrapperContained.method_57551(instance); }
// public static com.mojang.datafixers.kinds.App method_57551(Object instance, ) { return net.minecraft.village.TradedItem.method_57551(instance); }
public boolean matches(yarnwrap.item.ItemStack stack) { return wrapperContained.matches(stack.wrapperContained); }
// public static boolean matches(yarnwrap.item.ItemStack stack, ) { return net.minecraft.village.TradedItem.matches(stack.wrapperContained); }
// public yarnwrap.item.ItemStack createDisplayStack(yarnwrap.registry.entry.RegistryEntry item,int count,yarnwrap.predicate.ComponentPredicate components) { return new yarnwrap.item.ItemStack(wrapperContained.createDisplayStack(item.wrapperContained,count,components.wrapperContained)); }
// public static yarnwrap.item.ItemStack createDisplayStack(yarnwrap.registry.entry.RegistryEntry item,int count,yarnwrap.predicate.ComponentPredicate components, ) { return new yarnwrap.item.ItemStack(net.minecraft.village.TradedItem.createDisplayStack(item.wrapperContained,count,components.wrapperContained)); }
public yarnwrap.village.TradedItem withComponents(java.util.function.UnaryOperator builderCallback) { return new yarnwrap.village.TradedItem(wrapperContained.withComponents(builderCallback)); }
// public static yarnwrap.village.TradedItem withComponents(java.util.function.UnaryOperator builderCallback, ) { return new yarnwrap.village.TradedItem(net.minecraft.village.TradedItem.withComponents(builderCallback)); }

}