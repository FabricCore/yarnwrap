package yarnwrap.loot.function;
public class SetBookCoverLootFunction { public net.minecraft.loot.function.SetBookCoverLootFunction wrapperContained; public SetBookCoverLootFunction(net.minecraft.loot.function.SetBookCoverLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.SetBookCoverLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.SetBookCoverLootFunction.CODEC = value; }

// public java.util.Optional author() { return wrapperContained.author; }
// public void author(java.util.Optional value) { wrapperContained.author = value; }
// public static java.util.Optional author() { return net.minecraft.loot.function.SetBookCoverLootFunction.author; }
// public static void author(java.util.Optional value, ) { net.minecraft.loot.function.SetBookCoverLootFunction.author = value; }

// public java.util.Optional title() { return wrapperContained.title; }
// public void title(java.util.Optional value) { wrapperContained.title = value; }
// public static java.util.Optional title() { return net.minecraft.loot.function.SetBookCoverLootFunction.title; }
// public static void title(java.util.Optional value, ) { net.minecraft.loot.function.SetBookCoverLootFunction.title = value; }

// public java.util.Optional generation() { return wrapperContained.generation; }
// public void generation(java.util.Optional value) { wrapperContained.generation = value; }
// public static java.util.Optional generation() { return net.minecraft.loot.function.SetBookCoverLootFunction.generation; }
// public static void generation(java.util.Optional value, ) { net.minecraft.loot.function.SetBookCoverLootFunction.generation = value; }

public SetBookCoverLootFunction(java.util.List conditions,java.util.Optional title,java.util.Optional author,java.util.Optional generation) { this.wrapperContained = new net.minecraft.loot.function.SetBookCoverLootFunction(conditions,title,author,generation); }
// public yarnwrap.component.type.WrittenBookContentComponent apply(yarnwrap.component.type.WrittenBookContentComponent current) { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.apply(current.wrapperContained)); }
// public static yarnwrap.component.type.WrittenBookContentComponent apply(yarnwrap.component.type.WrittenBookContentComponent current, ) { return new yarnwrap.component.type.WrittenBookContentComponent(net.minecraft.loot.function.SetBookCoverLootFunction.apply(current.wrapperContained)); }
// public java.util.Optional method_58201(yarnwrap.loot.function.SetBookCoverLootFunction function) { return wrapperContained.method_58201(function.wrapperContained); }
// public static java.util.Optional method_58201(yarnwrap.loot.function.SetBookCoverLootFunction function, ) { return net.minecraft.loot.function.SetBookCoverLootFunction.method_58201(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_58202(Object instance) { return wrapperContained.method_58202(instance); }
// public static com.mojang.datafixers.kinds.App method_58202(Object instance, ) { return net.minecraft.loot.function.SetBookCoverLootFunction.method_58202(instance); }
// public java.util.Optional method_58203(yarnwrap.loot.function.SetBookCoverLootFunction function) { return wrapperContained.method_58203(function.wrapperContained); }
// public static java.util.Optional method_58203(yarnwrap.loot.function.SetBookCoverLootFunction function, ) { return net.minecraft.loot.function.SetBookCoverLootFunction.method_58203(function.wrapperContained); }
// public java.util.Optional method_58204(yarnwrap.loot.function.SetBookCoverLootFunction function) { return wrapperContained.method_58204(function.wrapperContained); }
// public static java.util.Optional method_58204(yarnwrap.loot.function.SetBookCoverLootFunction function, ) { return net.minecraft.loot.function.SetBookCoverLootFunction.method_58204(function.wrapperContained); }

}