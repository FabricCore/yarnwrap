package yarnwrap.advancement;
public class AdvancementRewards { public net.minecraft.advancement.AdvancementRewards wrapperContained; public AdvancementRewards(net.minecraft.advancement.AdvancementRewards wrapperContained) { this.wrapperContained = wrapperContained; }

// public int experience() { return wrapperContained.experience; }
// public java.util.List loot() { return wrapperContained.loot; }
// public java.util.List recipes() { return wrapperContained.recipes; }
// public java.util.Optional function() { return wrapperContained.function; }
public yarnwrap.advancement.AdvancementRewards NONE() { return new yarnwrap.advancement.AdvancementRewards(wrapperContained.NONE); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public int experience() { return wrapperContained.experience(); }
// public java.util.List loot() { return wrapperContained.loot(); }
// public java.util.List recipes() { return wrapperContained.recipes(); }
// public java.util.Optional function() { return wrapperContained.function(); }
public void apply(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.apply(player.wrapperContained); }

}