package yarnwrap.advancement;
public class AdvancementRewards { public net.minecraft.advancement.AdvancementRewards wrapperContained; public AdvancementRewards(net.minecraft.advancement.AdvancementRewards wrapperContained) { this.wrapperContained = wrapperContained; }

// public int experience() { return wrapperContained.experience; }
// public void experience(int value) { wrapperContained.experience = value; }
// public static int experience() { return net.minecraft.advancement.AdvancementRewards.experience; }
// public static void experience(int value, ) { net.minecraft.advancement.AdvancementRewards.experience = value; }

// public java.util.List loot() { return wrapperContained.loot; }
// public void loot(java.util.List value) { wrapperContained.loot = value; }
// public static java.util.List loot() { return net.minecraft.advancement.AdvancementRewards.loot; }
// public static void loot(java.util.List value, ) { net.minecraft.advancement.AdvancementRewards.loot = value; }

// public java.util.List recipes() { return wrapperContained.recipes; }
// public void recipes(java.util.List value) { wrapperContained.recipes = value; }
// public static java.util.List recipes() { return net.minecraft.advancement.AdvancementRewards.recipes; }
// public static void recipes(java.util.List value, ) { net.minecraft.advancement.AdvancementRewards.recipes = value; }

// public java.util.Optional function() { return wrapperContained.function; }
// public void function(java.util.Optional value) { wrapperContained.function = value; }
// public static java.util.Optional function() { return net.minecraft.advancement.AdvancementRewards.function; }
// public static void function(java.util.Optional value, ) { net.minecraft.advancement.AdvancementRewards.function = value; }

// public yarnwrap.advancement.AdvancementRewards NONE() { return new yarnwrap.advancement.AdvancementRewards(wrapperContained.NONE); }
// public void NONE(yarnwrap.advancement.AdvancementRewards value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.advancement.AdvancementRewards NONE() { return new yarnwrap.advancement.AdvancementRewards(net.minecraft.advancement.AdvancementRewards.NONE); }
// public static void NONE(yarnwrap.advancement.AdvancementRewards value, ) { net.minecraft.advancement.AdvancementRewards.NONE = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.advancement.AdvancementRewards.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.advancement.AdvancementRewards.CODEC = value; }

// public AdvancementRewards(int experience) { this.wrapperContained = new net.minecraft.advancement.AdvancementRewards(experience); }
// public int experience() { return wrapperContained.experience(); }
// // public static int experience() { return net.minecraft.advancement.AdvancementRewards.experience(); }
// public java.util.List loot() { return wrapperContained.loot(); }
// // public static java.util.List loot() { return net.minecraft.advancement.AdvancementRewards.loot(); }
// public java.util.List recipes() { return wrapperContained.recipes(); }
// // public static java.util.List recipes() { return net.minecraft.advancement.AdvancementRewards.recipes(); }
// public java.util.Optional function() { return wrapperContained.function(); }
// // public static java.util.Optional function() { return net.minecraft.advancement.AdvancementRewards.function(); }
// public void method_17978(yarnwrap.server.MinecraftServer function) { wrapperContained.method_17978(function.wrapperContained); }
// public static void method_17978(yarnwrap.server.MinecraftServer function, ) { net.minecraft.advancement.AdvancementRewards.method_17978(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54930(Object instance) { return wrapperContained.method_54930(instance); }
// public static com.mojang.datafixers.kinds.App method_54930(Object instance, ) { return net.minecraft.advancement.AdvancementRewards.method_54930(instance); }
// public java.util.Optional method_54931(yarnwrap.server.MinecraftServer function) { return wrapperContained.method_54931(function.wrapperContained); }
// public static java.util.Optional method_54931(yarnwrap.server.MinecraftServer function, ) { return net.minecraft.advancement.AdvancementRewards.method_54931(function.wrapperContained); }
public void apply(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.apply(player.wrapperContained); }
// public static void apply(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.advancement.AdvancementRewards.apply(player.wrapperContained); }

}