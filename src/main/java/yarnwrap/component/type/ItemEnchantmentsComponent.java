package yarnwrap.component.type;
public class ItemEnchantmentsComponent { public net.minecraft.component.type.ItemEnchantmentsComponent wrapperContained; public ItemEnchantmentsComponent(net.minecraft.component.type.ItemEnchantmentsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.ItemEnchantmentsComponent DEFAULT() { return new yarnwrap.component.type.ItemEnchantmentsComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.ItemEnchantmentsComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.ItemEnchantmentsComponent DEFAULT() { return new yarnwrap.component.type.ItemEnchantmentsComponent(net.minecraft.component.type.ItemEnchantmentsComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.ItemEnchantmentsComponent value, ) { net.minecraft.component.type.ItemEnchantmentsComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.ItemEnchantmentsComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.ItemEnchantmentsComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.ItemEnchantmentsComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.ItemEnchantmentsComponent.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec ENCHANTMENT_LEVEL_CODEC() { return wrapperContained.ENCHANTMENT_LEVEL_CODEC; }
// public void ENCHANTMENT_LEVEL_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENCHANTMENT_LEVEL_CODEC = value; }
// public static com.mojang.serialization.Codec ENCHANTMENT_LEVEL_CODEC() { return net.minecraft.component.type.ItemEnchantmentsComponent.ENCHANTMENT_LEVEL_CODEC; }
// public static void ENCHANTMENT_LEVEL_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.ItemEnchantmentsComponent.ENCHANTMENT_LEVEL_CODEC = value; }

// public it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap enchantments() { return wrapperContained.enchantments; }
// public void enchantments(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap value) { wrapperContained.enchantments = value; }
// public static it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap enchantments() { return net.minecraft.component.type.ItemEnchantmentsComponent.enchantments; }
// public static void enchantments(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap value, ) { net.minecraft.component.type.ItemEnchantmentsComponent.enchantments = value; }

// public ItemEnchantmentsComponent(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap enchantments) { this.wrapperContained = new net.minecraft.component.type.ItemEnchantmentsComponent(enchantments); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.component.type.ItemEnchantmentsComponent.equals(o); }
public java.util.Set getEnchantments() { return wrapperContained.getEnchantments(); }
// public static java.util.Set getEnchantments() { return net.minecraft.component.type.ItemEnchantmentsComponent.getEnchantments(); }
public int getLevel(yarnwrap.registry.entry.RegistryEntry enchantment) { return wrapperContained.getLevel(enchantment.wrapperContained); }
// public static int getLevel(yarnwrap.registry.entry.RegistryEntry enchantment, ) { return net.minecraft.component.type.ItemEnchantmentsComponent.getLevel(enchantment.wrapperContained); }
public java.util.Set getEnchantmentEntries() { return wrapperContained.getEnchantmentEntries(); }
// public static java.util.Set getEnchantmentEntries() { return net.minecraft.component.type.ItemEnchantmentsComponent.getEnchantmentEntries(); }
// public it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap method_57540(yarnwrap.component.type.ItemEnchantmentsComponent component) { return wrapperContained.method_57540(component.wrapperContained); }
// public static it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap method_57540(yarnwrap.component.type.ItemEnchantmentsComponent component, ) { return net.minecraft.component.type.ItemEnchantmentsComponent.method_57540(component.wrapperContained); }
public int getSize() { return wrapperContained.getSize(); }
// public static int getSize() { return net.minecraft.component.type.ItemEnchantmentsComponent.getSize(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.component.type.ItemEnchantmentsComponent.isEmpty(); }
// public yarnwrap.registry.entry.RegistryEntryList getTooltipOrderList(Object registries,yarnwrap.registry.RegistryKey registryRef,yarnwrap.registry.tag.TagKey tooltipOrderTag) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.getTooltipOrderList(registries,registryRef.wrapperContained,tooltipOrderTag.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntryList getTooltipOrderList(Object registries,yarnwrap.registry.RegistryKey registryRef,yarnwrap.registry.tag.TagKey tooltipOrderTag, ) { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.component.type.ItemEnchantmentsComponent.getTooltipOrderList(registries,registryRef.wrapperContained,tooltipOrderTag.wrapperContained)); }

}