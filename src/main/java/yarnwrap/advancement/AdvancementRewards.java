package yarnwrap.advancement;
public class AdvancementRewards { public net.minecraft.advancement.AdvancementRewards wrapperContained; public AdvancementRewards(net.minecraft.advancement.AdvancementRewards wrapperContained) { this.wrapperContained = wrapperContained; }

// public int experience() { return wrapperContained.experience; }
// public void experience(int value) { wrapperContained.experience = value; }
// public java.util.List loot() { return wrapperContained.loot; }
// public void loot(java.util.List value) { wrapperContained.loot = value; }
// public java.util.List recipes() { return wrapperContained.recipes; }
// public void recipes(java.util.List value) { wrapperContained.recipes = value; }
// public java.util.Optional function() { return wrapperContained.function; }
// public void function(java.util.Optional value) { wrapperContained.function = value; }
public yarnwrap.advancement.AdvancementRewards NONE() { return new yarnwrap.advancement.AdvancementRewards(wrapperContained.NONE); }
// public void NONE(yarnwrap.advancement.AdvancementRewards value) { wrapperContained.NONE = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public int experience() { return wrapperContained.experience(); }
// public java.util.List loot() { return wrapperContained.loot(); }
// public java.util.List recipes() { return wrapperContained.recipes(); }
// public java.util.Optional function() { return wrapperContained.function(); }
public void apply(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.apply(player.wrapperContained); }

}