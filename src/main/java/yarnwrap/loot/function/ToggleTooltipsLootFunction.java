package yarnwrap.loot.function;
public class ToggleTooltipsLootFunction { public net.minecraft.loot.function.ToggleTooltipsLootFunction wrapperContained; public ToggleTooltipsLootFunction(net.minecraft.loot.function.ToggleTooltipsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.Map TOGGLES() { return wrapperContained.TOGGLES; }
// public void TOGGLES(java.util.Map value) { wrapperContained.TOGGLES = value; }
// public com.mojang.serialization.Codec TOGGLE_CODEC() { return wrapperContained.TOGGLE_CODEC; }
// public void TOGGLE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TOGGLE_CODEC = value; }
// public java.util.Map toggles() { return wrapperContained.toggles; }
// public void toggles(java.util.Map value) { wrapperContained.toggles = value; }

}