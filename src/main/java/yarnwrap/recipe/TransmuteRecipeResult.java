package yarnwrap.recipe;
public class TransmuteRecipeResult { public net.minecraft.recipe.TransmuteRecipeResult wrapperContained; public TransmuteRecipeResult(net.minecraft.recipe.TransmuteRecipeResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry itemEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.itemEntry); }
// public void itemEntry(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.itemEntry = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry itemEntry() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.recipe.TransmuteRecipeResult.itemEntry); }
// public static void itemEntry(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.recipe.TransmuteRecipeResult.itemEntry = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.recipe.TransmuteRecipeResult.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.recipe.TransmuteRecipeResult.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.TransmuteRecipeResult.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.TransmuteRecipeResult.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
// public static com.mojang.serialization.Codec BASE_CODEC() { return net.minecraft.recipe.TransmuteRecipeResult.BASE_CODEC; }
// public static void BASE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.recipe.TransmuteRecipeResult.BASE_CODEC = value; }

public TransmuteRecipeResult(yarnwrap.item.Item item) { this.wrapperContained = new net.minecraft.recipe.TransmuteRecipeResult(item.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry itemEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.itemEntry()); }
// // public static yarnwrap.registry.entry.RegistryEntry itemEntry() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.recipe.TransmuteRecipeResult.itemEntry()); }
public yarnwrap.recipe.display.SlotDisplay createSlotDisplay() { return new yarnwrap.recipe.display.SlotDisplay(wrapperContained.createSlotDisplay()); }
// public static yarnwrap.recipe.display.SlotDisplay createSlotDisplay() { return new yarnwrap.recipe.display.SlotDisplay(net.minecraft.recipe.TransmuteRecipeResult.createSlotDisplay()); }
// public com.mojang.datafixers.kinds.App method_66339(Object instance) { return wrapperContained.method_66339(instance); }
// public static com.mojang.datafixers.kinds.App method_66339(Object instance, ) { return net.minecraft.recipe.TransmuteRecipeResult.method_66339(instance); }
public yarnwrap.item.ItemStack apply(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.apply(stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack apply(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.recipe.TransmuteRecipeResult.apply(stack.wrapperContained)); }
// public com.mojang.serialization.DataResult validate(yarnwrap.recipe.TransmuteRecipeResult result) { return wrapperContained.validate(result.wrapperContained); }
// public static com.mojang.serialization.DataResult validate(yarnwrap.recipe.TransmuteRecipeResult result, ) { return net.minecraft.recipe.TransmuteRecipeResult.validate(result.wrapperContained); }
// public yarnwrap.recipe.TransmuteRecipeResult method_66342(yarnwrap.recipe.TransmuteRecipeResult stack) { return new yarnwrap.recipe.TransmuteRecipeResult(wrapperContained.method_66342(stack.wrapperContained)); }
// public static yarnwrap.recipe.TransmuteRecipeResult method_66342(yarnwrap.recipe.TransmuteRecipeResult stack, ) { return new yarnwrap.recipe.TransmuteRecipeResult(net.minecraft.recipe.TransmuteRecipeResult.method_66342(stack.wrapperContained)); }
// public yarnwrap.recipe.TransmuteRecipeResult method_66343(yarnwrap.registry.entry.RegistryEntry itemEntry) { return new yarnwrap.recipe.TransmuteRecipeResult(wrapperContained.method_66343(itemEntry.wrapperContained)); }
// public static yarnwrap.recipe.TransmuteRecipeResult method_66343(yarnwrap.registry.entry.RegistryEntry itemEntry, ) { return new yarnwrap.recipe.TransmuteRecipeResult(net.minecraft.recipe.TransmuteRecipeResult.method_66343(itemEntry.wrapperContained)); }
public boolean isEqualToResult(yarnwrap.item.ItemStack stack) { return wrapperContained.isEqualToResult(stack.wrapperContained); }
// public static boolean isEqualToResult(yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.TransmuteRecipeResult.isEqualToResult(stack.wrapperContained); }

}