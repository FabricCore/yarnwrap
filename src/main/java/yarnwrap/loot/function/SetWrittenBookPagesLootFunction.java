package yarnwrap.loot.function;
public class SetWrittenBookPagesLootFunction { public net.minecraft.loot.function.SetWrittenBookPagesLootFunction wrapperContained; public SetWrittenBookPagesLootFunction(net.minecraft.loot.function.SetWrittenBookPagesLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.List pages() { return wrapperContained.pages; }
// public void pages(java.util.List value) { wrapperContained.pages = value; }
// public yarnwrap.util.collection.ListOperation operation() { return new yarnwrap.util.collection.ListOperation(wrapperContained.operation); }
// public void operation(yarnwrap.util.collection.ListOperation value) { wrapperContained.operation = value.wrapperContained; }
public com.mojang.serialization.Codec TEXT_CODEC() { return wrapperContained.TEXT_CODEC; }
// public void TEXT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TEXT_CODEC = value; }
public yarnwrap.component.type.WrittenBookContentComponent apply(yarnwrap.component.type.WrittenBookContentComponent current) { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.apply(current.wrapperContained)); }

}