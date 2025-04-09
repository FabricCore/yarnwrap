package yarnwrap.loot.function;
public class ToggleTooltipsLootFunction { public net.minecraft.loot.function.ToggleTooltipsLootFunction wrapperContained; public ToggleTooltipsLootFunction(net.minecraft.loot.function.ToggleTooltipsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.Map TOGGLES() { return wrapperContained.TOGGLES; }
// public com.mojang.serialization.Codec TOGGLE_CODEC() { return wrapperContained.TOGGLE_CODEC; }
// public java.util.Map toggles() { return wrapperContained.toggles; }

}