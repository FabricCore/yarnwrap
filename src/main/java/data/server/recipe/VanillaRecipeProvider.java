package yarnwrap.data.server.recipe;
public class VanillaRecipeProvider { public net.minecraft.data.server.recipe.VanillaRecipeProvider wrapperContained; public VanillaRecipeProvider(net.minecraft.data.server.recipe.VanillaRecipeProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList COAL_ORES() { return wrapperContained.COAL_ORES; }
// public com.google.common.collect.ImmutableList IRON_ORES() { return wrapperContained.IRON_ORES; }
// public com.google.common.collect.ImmutableList COPPER_ORES() { return wrapperContained.COPPER_ORES; }
// public com.google.common.collect.ImmutableList GOLD_ORES() { return wrapperContained.GOLD_ORES; }
// public com.google.common.collect.ImmutableList DIAMOND_ORES() { return wrapperContained.DIAMOND_ORES; }
// public com.google.common.collect.ImmutableList LAPIS_ORES() { return wrapperContained.LAPIS_ORES; }
// public com.google.common.collect.ImmutableList REDSTONE_ORES() { return wrapperContained.REDSTONE_ORES; }
// public com.google.common.collect.ImmutableList EMERALD_ORES() { return wrapperContained.EMERALD_ORES; }
public java.util.stream.Stream streamSmithingTemplates() { return wrapperContained.streamSmithingTemplates(); }

}