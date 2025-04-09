package yarnwrap.component.type;
public class ItemEnchantmentsComponent { public net.minecraft.component.type.ItemEnchantmentsComponent wrapperContained; public ItemEnchantmentsComponent(net.minecraft.component.type.ItemEnchantmentsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.ItemEnchantmentsComponent DEFAULT() { return new yarnwrap.component.type.ItemEnchantmentsComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public com.mojang.serialization.Codec ENCHANTMENT_LEVEL_CODEC() { return wrapperContained.ENCHANTMENT_LEVEL_CODEC; }
// public it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap enchantments() { return wrapperContained.enchantments; }
// public boolean showInTooltip() { return wrapperContained.showInTooltip; }
// public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
public java.util.Set getEnchantments() { return wrapperContained.getEnchantments(); }
public int getLevel(yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.getLevel(enchantment.wrapperContained); }
public java.util.Set getEnchantmentEntries() { return wrapperContained.getEnchantmentEntries(); }
public int getSize() { return wrapperContained.getSize(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public yarnwrap.component.type.ItemEnchantmentsComponent withShowInTooltip(boolean showInTooltip) { return new yarnwrap.component.type.ItemEnchantmentsComponent(wrapperContained.withShowInTooltip(showInTooltip)); }
// public yarnwrap.registry.entry.RegistryEntryList getTooltipOrderList(Object registryLookup,yarnwrap.registry.RegistryKey registryRef,yarnwrap.registry.tag.TagKey tooltipOrderTag) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.getTooltipOrderList(registryLookup,registryRef.wrapperContained,tooltipOrderTag.wrapperContained)); }

}