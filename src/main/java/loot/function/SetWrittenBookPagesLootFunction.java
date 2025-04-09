package yarnwrap.loot.function;
public class SetWrittenBookPagesLootFunction { public net.minecraft.loot.function.SetWrittenBookPagesLootFunction wrapperContained; public SetWrittenBookPagesLootFunction(net.minecraft.loot.function.SetWrittenBookPagesLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.List pages() { return wrapperContained.pages; }
// public yarnwrap.util.collection.ListOperation operation() { return new yarnwrap.util.collection.ListOperation(wrapperContained.operation); }
public com.mojang.serialization.Codec TEXT_CODEC() { return wrapperContained.TEXT_CODEC; }
public yarnwrap.component.type.WrittenBookContentComponent apply(yarnwrap.component.type.WrittenBookContentComponent current) { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.apply(current.wrapperContained)); }

}