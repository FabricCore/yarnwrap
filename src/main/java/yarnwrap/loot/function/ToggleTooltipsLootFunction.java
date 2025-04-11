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
// public ToggleTooltipsLootFunction(java.util.List conditions,java.util.Map toggles) { this.wrapperContained = new net.minecraft.loot.function.ToggleTooltipsLootFunction(conditions,toggles); }
// public void method_58463(yarnwrap.item.ItemStack componentType,Object showInTooltip) { wrapperContained.method_58463(componentType.wrapperContained,showInTooltip); }
// public Object method_58464(Object toggle) { return wrapperContained.method_58464(toggle); }
// public java.util.Map method_58465(yarnwrap.loot.function.ToggleTooltipsLootFunction lootFunction) { return wrapperContained.method_58465(lootFunction.wrapperContained); }
// public com.mojang.serialization.DataResult method_58466(yarnwrap.component.ComponentType componentType) { return wrapperContained.method_58466(componentType.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_58467(Object instance) { return wrapperContained.method_58467(instance); }

}