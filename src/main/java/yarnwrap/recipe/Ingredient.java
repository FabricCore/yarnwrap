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
public yarnwrap.recipe.Ingredient ofStacks(java.util.stream.Stream stacks) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofStacks(stacks)); }
public yarnwrap.recipe.Ingredient empty() { return new yarnwrap.recipe.Ingredient(wrapperContained.empty()); }
// public com.mojang.serialization.Codec createCodec(boolean allowEmpty) { return wrapperContained.createCodec(allowEmpty); }
public yarnwrap.recipe.Ingredient ofItems(net.minecraft.item.ItemConvertible[] items) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofItems(items)); }
// public yarnwrap.recipe.Ingredient ofEntries(java.util.stream.Stream entries) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofEntries(entries)); }
public it.unimi.dsi.fastutil.ints.IntList getMatchingItemIds() { return wrapperContained.getMatchingItemIds(); }
public yarnwrap.recipe.Ingredient ofStacks(net.minecraft.item.ItemStack[] stacks) { return new yarnwrap.recipe.Ingredient(wrapperContained.ofStacks(stacks)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public net.minecraft.item.ItemStack[] getMatchingStacks() { return wrapperContained.getMatchingStacks(); }
public yarnwrap.recipe.Ingredient fromTag(yarnwrap.registry.tag.TagKey tag) { return new yarnwrap.recipe.Ingredient(wrapperContained.fromTag(tag.wrapperContained)); }

}