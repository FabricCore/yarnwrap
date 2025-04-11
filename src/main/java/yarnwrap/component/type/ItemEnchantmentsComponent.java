package yarnwrap.component.type;
public class ItemEnchantmentsComponent { public net.minecraft.component.type.ItemEnchantmentsComponent wrapperContained; public ItemEnchantmentsComponent(net.minecraft.component.type.ItemEnchantmentsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.ItemEnchantmentsComponent DEFAULT() { return new yarnwrap.component.type.ItemEnchantmentsComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.ItemEnchantmentsComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public com.mojang.serialization.Codec ENCHANTMENT_LEVEL_CODEC() { return wrapperContained.ENCHANTMENT_LEVEL_CODEC; }
// public void ENCHANTMENT_LEVEL_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENCHANTMENT_LEVEL_CODEC = value; }
// public it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap enchantments() { return wrapperContained.enchantments; }
// public void enchantments(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap value) { wrapperContained.enchantments = value; }
// public boolean showInTooltip() { return wrapperContained.showInTooltip; }
// public void showInTooltip(boolean value) { wrapperContained.showInTooltip = value; }
// public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public void INLINE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INLINE_CODEC = value; }
// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
public java.util.Set getEnchantments() { return wrapperContained.getEnchantments(); }
public int getLevel(yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.getLevel(enchantment.wrapperContained); }
public java.util.Set getEnchantmentEntries() { return wrapperContained.getEnchantmentEntries(); }
public int getSize() { return wrapperContained.getSize(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public yarnwrap.component.type.ItemEnchantmentsComponent withShowInTooltip(boolean showInTooltip) { return new yarnwrap.component.type.ItemEnchantmentsComponent(wrapperContained.withShowInTooltip(showInTooltip)); }
// public yarnwrap.registry.entry.RegistryEntryList getTooltipOrderList(Object registryLookup,yarnwrap.registry.RegistryKey registryRef,yarnwrap.registry.tag.TagKey tooltipOrderTag) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.getTooltipOrderList(registryLookup,registryRef.wrapperContained,tooltipOrderTag.wrapperContained)); }

}