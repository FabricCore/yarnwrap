package yarnwrap.loot.function;
public class LootFunctionConsumingBuilder { public net.minecraft.loot.function.LootFunctionConsumingBuilder wrapperContained; public LootFunctionConsumingBuilder(net.minecraft.loot.function.LootFunctionConsumingBuilder wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.function.LootFunctionConsumingBuilder getThisFunctionConsumingBuilder() { return new yarnwrap.loot.function.LootFunctionConsumingBuilder(wrapperContained.getThisFunctionConsumingBuilder()); }
// public static yarnwrap.loot.function.LootFunctionConsumingBuilder getThisFunctionConsumingBuilder() { return new yarnwrap.loot.function.LootFunctionConsumingBuilder(net.minecraft.loot.function.LootFunctionConsumingBuilder.getThisFunctionConsumingBuilder()); }
public yarnwrap.loot.function.LootFunctionConsumingBuilder apply(java.lang.Iterable functions,java.util.function.Function toBuilderFunction) { return new yarnwrap.loot.function.LootFunctionConsumingBuilder(wrapperContained.apply(functions,toBuilderFunction)); }
// public static yarnwrap.loot.function.LootFunctionConsumingBuilder apply(java.lang.Iterable functions,java.util.function.Function toBuilderFunction, ) { return new yarnwrap.loot.function.LootFunctionConsumingBuilder(net.minecraft.loot.function.LootFunctionConsumingBuilder.apply(functions,toBuilderFunction)); }
public yarnwrap.loot.function.LootFunctionConsumingBuilder apply(java.lang.Object[] functions,java.util.function.Function toBuilderFunction) { return new yarnwrap.loot.function.LootFunctionConsumingBuilder(wrapperContained.apply(functions,toBuilderFunction)); }
// public static yarnwrap.loot.function.LootFunctionConsumingBuilder apply(java.lang.Object[] functions,java.util.function.Function toBuilderFunction, ) { return new yarnwrap.loot.function.LootFunctionConsumingBuilder(net.minecraft.loot.function.LootFunctionConsumingBuilder.apply(functions,toBuilderFunction)); }
// public yarnwrap.loot.function.LootFunctionConsumingBuilder apply(Object function) { return new yarnwrap.loot.function.LootFunctionConsumingBuilder(wrapperContained.apply(function)); }
// public static yarnwrap.loot.function.LootFunctionConsumingBuilder apply(Object function, ) { return new yarnwrap.loot.function.LootFunctionConsumingBuilder(net.minecraft.loot.function.LootFunctionConsumingBuilder.apply(function)); }

}