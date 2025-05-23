package yarnwrap.loot.function;
public class FurnaceSmeltLootFunction { public net.minecraft.loot.function.FurnaceSmeltLootFunction wrapperContained; public FurnaceSmeltLootFunction(net.minecraft.loot.function.FurnaceSmeltLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.loot.function.FurnaceSmeltLootFunction.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.loot.function.FurnaceSmeltLootFunction.LOGGER = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.FurnaceSmeltLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.FurnaceSmeltLootFunction.CODEC = value; }

// public FurnaceSmeltLootFunction(java.util.List conditions) { this.wrapperContained = new net.minecraft.loot.function.FurnaceSmeltLootFunction(conditions); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.loot.function.FurnaceSmeltLootFunction.builder(); }
// public com.mojang.datafixers.kinds.App method_53400(Object instance) { return wrapperContained.method_53400(instance); }
// public static com.mojang.datafixers.kinds.App method_53400(Object instance, ) { return net.minecraft.loot.function.FurnaceSmeltLootFunction.method_53400(instance); }

}