package yarnwrap.loot.function;
public class SetBookCoverLootFunction { public net.minecraft.loot.function.SetBookCoverLootFunction wrapperContained; public SetBookCoverLootFunction(net.minecraft.loot.function.SetBookCoverLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.Optional author() { return wrapperContained.author; }
// public java.util.Optional title() { return wrapperContained.title; }
// public java.util.Optional generation() { return wrapperContained.generation; }
// public yarnwrap.component.type.WrittenBookContentComponent apply(yarnwrap.component.type.WrittenBookContentComponent current) { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.apply(current.wrapperContained)); }

}