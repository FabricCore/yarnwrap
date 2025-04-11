package yarnwrap.recipe;
public class Ingredient { public net.minecraft.recipe.Ingredient wrapperContained; public Ingredient(net.minecraft.recipe.Ingredient wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec ALLOW_EMPTY_CODEC() { return wrapperContained.ALLOW_EMPTY_CODEC; }
// public void ALLOW_EMPTY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ALLOW_EMPTY_CODEC = value; }
public com.mojang.serialization.Codec DISALLOW_EMPTY_CODEC() { return wrapperContained.DISALLOW_EMPTY_CODEC; }
// public void DISALLOW_EMPTY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.DISALLOW_EMPTY_CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public it.unimi.dsi.fastutil.ints.IntList ids() { return wrapperContained.ids; }
// public void ids(it.unimi.dsi.fastutil.ints.IntList value) { wrapperContained.ids = value; }
public yarnwrap.recipe.Ingredient EMPTY() { return new yarnwrap.recipe.Ingredient(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.recipe.Ingredient value) { wrapperContained.EMPTY = value.wrapperContained; }
// public net.minecraft.item.ItemStack[] matchingStacks() { return wrapperContained.matchingStacks; }
// public void matchingStacks(net.minecraft.item.ItemStack[] value) { wrapperContained.matchingStacks = value; }
// public Object entries() { return wrapperContained.entries; }
// // public void entries(Object value) { wrapperContained.entries = value; }
// public Ingredient(java.util.stream.Stream entries) { this.wrapperContained = new net.minecraft.recipe.Ingredient(entries); }
// public Ingredient(Object[] entries) { this.wrapperContained = new net.minecraft.recipe.Ingredient(entries); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.recipe.Ingredient ofStacks(java.util.stream.Stream stacks) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofStacks(stacks)); }
// public boolean method_26965(yarnwrap.item.ItemStack stack) { return wrapperContained.method_26965(stack.wrapperContained); }
public yarnwrap.recipe.Ingredient empty() { return new yarnwrap.recipe.Ingredient(wrapperContained.empty()); }
// public java.util.stream.Stream method_47374(Object entry) { return wrapperContained.method_47374(entry); }
// public yarnwrap.recipe.Ingredient method_53721(Object entry) { return new yarnwrap.recipe.Ingredient(wrapperContained.method_53721(entry)); }
// public yarnwrap.recipe.Ingredient method_53722(com.mojang.datafixers.util.Either either) { return new yarnwrap.recipe.Ingredient(wrapperContained.method_53722(either)); }
// public com.mojang.serialization.DataResult method_53723(boolean ingredient) { return wrapperContained.method_53723(ingredient); }
// public com.mojang.serialization.DataResult method_53724(boolean entries) { return wrapperContained.method_53724(entries); }
// public com.mojang.serialization.Codec createCodec(boolean allowEmpty) { return wrapperContained.createCodec(allowEmpty); }
public yarnwrap.recipe.Ingredient ofItems(net.minecraft.item.ItemConvertible[] items) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofItems(items)); }
// public yarnwrap.recipe.Ingredient ofEntries(java.util.stream.Stream entries) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofEntries(entries)); }
public it.unimi.dsi.fastutil.ints.IntList getMatchingItemIds() { return wrapperContained.getMatchingItemIds(); }
public yarnwrap.recipe.Ingredient ofStacks(net.minecraft.item.ItemStack[] stacks) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofStacks(stacks)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public net.minecraft.item.ItemStack[] getMatchingStacks() { return wrapperContained.getMatchingStacks(); }
public yarnwrap.recipe.Ingredient fromTag(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.recipe.Ingredient(wrapperContained.fromTag(tag.wrapperContained)); }
// public boolean test(java.lang.Object stack) { return wrapperContained.test(stack); }

}