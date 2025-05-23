package yarnwrap.loot.function;
public class ToggleTooltipsLootFunction { public net.minecraft.loot.function.ToggleTooltipsLootFunction wrapperContained; public ToggleTooltipsLootFunction(net.minecraft.loot.function.ToggleTooltipsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.ToggleTooltipsLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.ToggleTooltipsLootFunction.CODEC = value; }

// public java.util.Map toggles() { return wrapperContained.toggles; }
// public void toggles(java.util.Map value) { wrapperContained.toggles = value; }
// public static java.util.Map toggles() { return net.minecraft.loot.function.ToggleTooltipsLootFunction.toggles; }
// public static void toggles(java.util.Map value, ) { net.minecraft.loot.function.ToggleTooltipsLootFunction.toggles = value; }

// public ToggleTooltipsLootFunction(java.util.List conditions,java.util.Map toggles) { this.wrapperContained = new net.minecraft.loot.function.ToggleTooltipsLootFunction(conditions,toggles); }
// public java.util.Map method_58465(yarnwrap.loot.function.ToggleTooltipsLootFunction lootFunction) { return wrapperContained.method_58465(lootFunction.wrapperContained); }
// public static java.util.Map method_58465(yarnwrap.loot.function.ToggleTooltipsLootFunction lootFunction, ) { return net.minecraft.loot.function.ToggleTooltipsLootFunction.method_58465(lootFunction.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_58467(Object instance) { return wrapperContained.method_58467(instance); }
// public static com.mojang.datafixers.kinds.App method_58467(Object instance, ) { return net.minecraft.loot.function.ToggleTooltipsLootFunction.method_58467(instance); }

}