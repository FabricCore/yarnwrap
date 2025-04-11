package yarnwrap.village;
public class TradedItem { public net.minecraft.village.TradedItem wrapperContained; public TradedItem(net.minecraft.village.TradedItem wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_PACKET_CODEC); }
// public void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_PACKET_CODEC = value.wrapperContained; }
public boolean matches(yarnwrap.item.ItemStack stack) { return wrapperContained.matches(stack.wrapperContained); }
// public yarnwrap.item.ItemStack createDisplayStack(yarnwrap.registry.entry.RegistryEntry item,int count,yarnwrap.predicate.ComponentPredicate components) { return new yarnwrap.item.ItemStack(wrapperContained.createDisplayStack(item.wrapperContained,count,components.wrapperContained)); }
public yarnwrap.village.TradedItem withComponents(java.util.function.UnaryOperator builderCallback) { return new yarnwrap.village.TradedItem(wrapperContained.withComponents(builderCallback)); }

}