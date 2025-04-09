package yarnwrap.village;
public class TradedItem { public net.minecraft.village.TradedItem wrapperContained; public TradedItem(net.minecraft.village.TradedItem wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_PACKET_CODEC); }
public boolean matches(yarnwrap.item.ItemStack stack) { return wrapperContained.matches(stack.wrapperContained); }
// public yarnwrap.item.ItemStack createDisplayStack(yarnwrap.registry.entry.RegistryEntry item,int count,yarnwrap.predicate.ComponentPredicate components) { return new yarnwrap.item.ItemStack(wrapperContained.createDisplayStack(item.wrapperContained,count,components.wrapperContained)); }
public yarnwrap.village.TradedItem withComponents(java.util.function.UnaryOperator builderCallback) { return new yarnwrap.village.TradedItem(wrapperContained.withComponents(builderCallback)); }

}