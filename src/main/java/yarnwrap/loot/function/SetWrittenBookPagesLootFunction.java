package yarnwrap.loot.function;
public class SetWrittenBookPagesLootFunction { public net.minecraft.loot.function.SetWrittenBookPagesLootFunction wrapperContained; public SetWrittenBookPagesLootFunction(net.minecraft.loot.function.SetWrittenBookPagesLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.SetWrittenBookPagesLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.SetWrittenBookPagesLootFunction.CODEC = value; }

// public java.util.List pages() { return wrapperContained.pages; }
// public void pages(java.util.List value) { wrapperContained.pages = value; }
// public static java.util.List pages() { return net.minecraft.loot.function.SetWrittenBookPagesLootFunction.pages; }
// public static void pages(java.util.List value, ) { net.minecraft.loot.function.SetWrittenBookPagesLootFunction.pages = value; }

// public yarnwrap.util.collection.ListOperation operation() { return new yarnwrap.util.collection.ListOperation(wrapperContained.operation); }
// public void operation(yarnwrap.util.collection.ListOperation value) { wrapperContained.operation = value.wrapperContained; }
// public static yarnwrap.util.collection.ListOperation operation() { return new yarnwrap.util.collection.ListOperation(net.minecraft.loot.function.SetWrittenBookPagesLootFunction.operation); }
// public static void operation(yarnwrap.util.collection.ListOperation value, ) { net.minecraft.loot.function.SetWrittenBookPagesLootFunction.operation = value.wrapperContained; }

// public com.mojang.serialization.Codec TEXT_CODEC() { return wrapperContained.TEXT_CODEC; }
// public void TEXT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TEXT_CODEC = value; }
public static com.mojang.serialization.Codec TEXT_CODEC() { return net.minecraft.loot.function.SetWrittenBookPagesLootFunction.TEXT_CODEC; }
// public static void TEXT_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.function.SetWrittenBookPagesLootFunction.TEXT_CODEC = value; }

// public SetWrittenBookPagesLootFunction(java.util.List conditions,java.util.List pages,yarnwrap.util.collection.ListOperation operation) { this.wrapperContained = new net.minecraft.loot.function.SetWrittenBookPagesLootFunction(conditions,pages,operation.wrapperContained); }
public yarnwrap.component.type.WrittenBookContentComponent apply(yarnwrap.component.type.WrittenBookContentComponent current) { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.apply(current.wrapperContained)); }
// public static yarnwrap.component.type.WrittenBookContentComponent apply(yarnwrap.component.type.WrittenBookContentComponent current, ) { return new yarnwrap.component.type.WrittenBookContentComponent(net.minecraft.loot.function.SetWrittenBookPagesLootFunction.apply(current.wrapperContained)); }
// public yarnwrap.util.collection.ListOperation method_58222(yarnwrap.loot.function.SetWrittenBookPagesLootFunction function) { return new yarnwrap.util.collection.ListOperation(wrapperContained.method_58222(function.wrapperContained)); }
// public static yarnwrap.util.collection.ListOperation method_58222(yarnwrap.loot.function.SetWrittenBookPagesLootFunction function, ) { return new yarnwrap.util.collection.ListOperation(net.minecraft.loot.function.SetWrittenBookPagesLootFunction.method_58222(function.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_58223(Object instance) { return wrapperContained.method_58223(instance); }
// public static com.mojang.datafixers.kinds.App method_58223(Object instance, ) { return net.minecraft.loot.function.SetWrittenBookPagesLootFunction.method_58223(instance); }
// public java.util.List method_58224(yarnwrap.loot.function.SetWrittenBookPagesLootFunction function) { return wrapperContained.method_58224(function.wrapperContained); }
// public static java.util.List method_58224(yarnwrap.loot.function.SetWrittenBookPagesLootFunction function, ) { return net.minecraft.loot.function.SetWrittenBookPagesLootFunction.method_58224(function.wrapperContained); }
// public com.mojang.serialization.DataResult method_58461(yarnwrap.text.Text text) { return wrapperContained.method_58461(text.wrapperContained); }
// public static com.mojang.serialization.DataResult method_58461(yarnwrap.text.Text text, ) { return net.minecraft.loot.function.SetWrittenBookPagesLootFunction.method_58461(text.wrapperContained); }
// public yarnwrap.text.Text method_58462(yarnwrap.text.Text value) { return new yarnwrap.text.Text(wrapperContained.method_58462(value.wrapperContained)); }
// public static yarnwrap.text.Text method_58462(yarnwrap.text.Text value, ) { return new yarnwrap.text.Text(net.minecraft.loot.function.SetWrittenBookPagesLootFunction.method_58462(value.wrapperContained)); }

}