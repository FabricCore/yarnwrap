package yarnwrap.recipe;
public class Ingredient { public net.minecraft.recipe.Ingredient wrapperContained; public Ingredient(net.minecraft.recipe.Ingredient wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntryList entries() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.entries); }
// public void entries(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.entries = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntryList entries() { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.recipe.Ingredient.entries); }
// public static void entries(yarnwrap.registry.entry.RegistryEntryList value, ) { net.minecraft.recipe.Ingredient.entries = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.recipe.Ingredient.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.recipe.Ingredient.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.Ingredient.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.Ingredient.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_PACKET_CODEC); }
// public void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.Ingredient.OPTIONAL_PACKET_CODEC); }
// public static void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.Ingredient.OPTIONAL_PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec ENTRIES_CODEC() { return wrapperContained.ENTRIES_CODEC; }
// public void ENTRIES_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRIES_CODEC = value; }
public static com.mojang.serialization.Codec ENTRIES_CODEC() { return net.minecraft.recipe.Ingredient.ENTRIES_CODEC; }
// public static void ENTRIES_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.recipe.Ingredient.ENTRIES_CODEC = value; }

// public Ingredient(yarnwrap.registry.entry.RegistryEntryList entries) { this.wrapperContained = new net.minecraft.recipe.Ingredient(entries.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.recipe.Ingredient.equals(o); }
// public yarnwrap.recipe.Ingredient ofItems(net.minecraft.item.ItemConvertible[] items) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofItems(items)); }
// public static yarnwrap.recipe.Ingredient ofItems(net.minecraft.item.ItemConvertible[] items, ) { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.Ingredient.ofItems(items)); }
// public yarnwrap.recipe.Ingredient ofItem(yarnwrap.item.ItemConvertible item) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofItem(item.wrapperContained)); }
// public static yarnwrap.recipe.Ingredient ofItem(yarnwrap.item.ItemConvertible item, ) { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.Ingredient.ofItem(item.wrapperContained)); }
public java.util.stream.Stream getMatchingItems() { return wrapperContained.getMatchingItems(); }
// public static java.util.stream.Stream getMatchingItems() { return net.minecraft.recipe.Ingredient.getMatchingItems(); }
// public yarnwrap.recipe.Ingredient ofTag(yarnwrap.registry.entry.RegistryEntryList tag) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofTag(tag.wrapperContained)); }
// public static yarnwrap.recipe.Ingredient ofTag(yarnwrap.registry.entry.RegistryEntryList tag, ) { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.Ingredient.ofTag(tag.wrapperContained)); }
// public yarnwrap.recipe.Ingredient ofItems(java.util.stream.Stream stacks) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofItems(stacks)); }
// public static yarnwrap.recipe.Ingredient ofItems(java.util.stream.Stream stacks, ) { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.Ingredient.ofItems(stacks)); }
// public java.lang.Boolean method_61672(yarnwrap.item.ItemStack ingredient2) { return wrapperContained.method_61672(ingredient2.wrapperContained); }
// public static java.lang.Boolean method_61672(yarnwrap.item.ItemStack ingredient2, ) { return net.minecraft.recipe.Ingredient.method_61672(ingredient2.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntryList method_61673(yarnwrap.recipe.Ingredient ingredient) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.method_61673(ingredient.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntryList method_61673(yarnwrap.recipe.Ingredient ingredient, ) { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.recipe.Ingredient.method_61673(ingredient.wrapperContained)); }
// public void method_61674(java.util.List list) { wrapperContained.method_61674(list); }
// public static void method_61674(java.util.List list, ) { net.minecraft.recipe.Ingredient.method_61674(list); }
// public yarnwrap.registry.entry.RegistryEntryList method_61675(java.util.Optional optional) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.method_61675(optional)); }
// public static yarnwrap.registry.entry.RegistryEntryList method_61675(java.util.Optional optional, ) { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.recipe.Ingredient.method_61675(optional)); }
// public boolean matches(java.util.Optional ingredient,yarnwrap.item.ItemStack stack) { return wrapperContained.matches(ingredient,stack.wrapperContained); }
// public static boolean matches(java.util.Optional ingredient,yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.Ingredient.matches(ingredient,stack.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntryList method_61677(yarnwrap.recipe.Ingredient ingredient) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.method_61677(ingredient.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntryList method_61677(yarnwrap.recipe.Ingredient ingredient, ) { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.recipe.Ingredient.method_61677(ingredient.wrapperContained)); }
// public Object method_61678(yarnwrap.item.ItemConvertible item) { return wrapperContained.method_61678(item.wrapperContained); }
// public static Object method_61678(yarnwrap.item.ItemConvertible item, ) { return net.minecraft.recipe.Ingredient.method_61678(item.wrapperContained); }
// public java.util.Optional method_61679(yarnwrap.registry.entry.RegistryEntryList entries) { return wrapperContained.method_61679(entries.wrapperContained); }
// public static java.util.Optional method_61679(yarnwrap.registry.entry.RegistryEntryList entries, ) { return net.minecraft.recipe.Ingredient.method_61679(entries.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntryList method_61680(yarnwrap.recipe.Ingredient ingredient) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.method_61680(ingredient.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntryList method_61680(yarnwrap.recipe.Ingredient ingredient, ) { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.recipe.Ingredient.method_61680(ingredient.wrapperContained)); }
// public java.lang.Record method_64672(java.util.List items) { return wrapperContained.method_64672(items); }
// public static java.lang.Record method_64672(java.util.List items, ) { return net.minecraft.recipe.Ingredient.method_64672(items); }
public yarnwrap.recipe.display.SlotDisplay toDisplay() { return new yarnwrap.recipe.display.SlotDisplay(wrapperContained.toDisplay()); }
// public static yarnwrap.recipe.display.SlotDisplay toDisplay() { return new yarnwrap.recipe.display.SlotDisplay(net.minecraft.recipe.Ingredient.toDisplay()); }
// public yarnwrap.recipe.display.SlotDisplay toDisplay(java.util.Optional ingredient) { return new yarnwrap.recipe.display.SlotDisplay(wrapperContained.toDisplay(ingredient)); }
// public static yarnwrap.recipe.display.SlotDisplay toDisplay(java.util.Optional ingredient, ) { return new yarnwrap.recipe.display.SlotDisplay(net.minecraft.recipe.Ingredient.toDisplay(ingredient)); }
// public yarnwrap.recipe.display.SlotDisplay createDisplayWithRemainder(yarnwrap.registry.entry.RegistryEntry displayedItem) { return new yarnwrap.recipe.display.SlotDisplay(wrapperContained.createDisplayWithRemainder(displayedItem.wrapperContained)); }
// public static yarnwrap.recipe.display.SlotDisplay createDisplayWithRemainder(yarnwrap.registry.entry.RegistryEntry displayedItem, ) { return new yarnwrap.recipe.display.SlotDisplay(net.minecraft.recipe.Ingredient.createDisplayWithRemainder(displayedItem.wrapperContained)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.recipe.Ingredient.isEmpty(); }
// public boolean test(java.lang.Object stack) { return wrapperContained.test(stack); }
// public static boolean test(java.lang.Object stack, ) { return net.minecraft.recipe.Ingredient.test(stack); }

}