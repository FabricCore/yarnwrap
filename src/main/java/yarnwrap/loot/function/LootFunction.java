package yarnwrap.loot.function;
public class LootFunction { public net.minecraft.loot.function.LootFunction wrapperContained; public LootFunction(net.minecraft.loot.function.LootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.function.LootFunctionType getType() { return new yarnwrap.loot.function.LootFunctionType(wrapperContained.getType()); }
// public static yarnwrap.loot.function.LootFunctionType getType() { return new yarnwrap.loot.function.LootFunctionType(net.minecraft.loot.function.LootFunction.getType()); }
// public java.util.function.Consumer apply(java.util.function.BiFunction itemApplier,java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context) { return wrapperContained.apply(itemApplier,lootConsumer,context.wrapperContained); }
// public static java.util.function.Consumer apply(java.util.function.BiFunction itemApplier,java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context, ) { return net.minecraft.loot.function.LootFunction.apply(itemApplier,lootConsumer,context.wrapperContained); }
// public void method_514(java.util.function.Consumer stack) { wrapperContained.method_514(stack); }
// public static void method_514(java.util.function.Consumer stack, ) { net.minecraft.loot.function.LootFunction.method_514(stack); }

}