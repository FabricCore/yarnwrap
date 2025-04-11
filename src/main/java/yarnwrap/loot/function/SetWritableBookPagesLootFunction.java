package yarnwrap.loot.function;
public class SetWritableBookPagesLootFunction { public net.minecraft.loot.function.SetWritableBookPagesLootFunction wrapperContained; public SetWritableBookPagesLootFunction(net.minecraft.loot.function.SetWritableBookPagesLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.List pages() { return wrapperContained.pages; }
// public void pages(java.util.List value) { wrapperContained.pages = value; }
// public yarnwrap.util.collection.ListOperation operation() { return new yarnwrap.util.collection.ListOperation(wrapperContained.operation); }
// public void operation(yarnwrap.util.collection.ListOperation value) { wrapperContained.operation = value.wrapperContained; }
public yarnwrap.component.type.WritableBookContentComponent apply(yarnwrap.component.type.WritableBookContentComponent current) { return new yarnwrap.component.type.WritableBookContentComponent(wrapperContained.apply(current.wrapperContained)); }

}