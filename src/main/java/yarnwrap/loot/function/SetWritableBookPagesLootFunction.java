package yarnwrap.loot.function;
public class SetWritableBookPagesLootFunction { public net.minecraft.loot.function.SetWritableBookPagesLootFunction wrapperContained; public SetWritableBookPagesLootFunction(net.minecraft.loot.function.SetWritableBookPagesLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.List pages() { return wrapperContained.pages; }
// public void pages(java.util.List value) { wrapperContained.pages = value; }
// public yarnwrap.util.collection.ListOperation operation() { return new yarnwrap.util.collection.ListOperation(wrapperContained.operation); }
// public void operation(yarnwrap.util.collection.ListOperation value) { wrapperContained.operation = value.wrapperContained; }
// public SetWritableBookPagesLootFunction(java.util.List conditions,java.util.List pages,yarnwrap.util.collection.ListOperation operation) { this.wrapperContained = new net.minecraft.loot.function.SetWritableBookPagesLootFunction(conditions,pages,operation.wrapperContained); }
public yarnwrap.component.type.WritableBookContentComponent apply(yarnwrap.component.type.WritableBookContentComponent current) { return new yarnwrap.component.type.WritableBookContentComponent(wrapperContained.apply(current.wrapperContained)); }
// public yarnwrap.util.collection.ListOperation method_58218(yarnwrap.loot.function.SetWritableBookPagesLootFunction function) { return new yarnwrap.util.collection.ListOperation(wrapperContained.method_58218(function.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_58219(Object instance) { return wrapperContained.method_58219(instance); }
// public java.util.List method_58220(yarnwrap.loot.function.SetWritableBookPagesLootFunction function) { return wrapperContained.method_58220(function.wrapperContained); }

}