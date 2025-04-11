package yarnwrap.loot.function;
public class SetBookCoverLootFunction { public net.minecraft.loot.function.SetBookCoverLootFunction wrapperContained; public SetBookCoverLootFunction(net.minecraft.loot.function.SetBookCoverLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.Optional author() { return wrapperContained.author; }
// public void author(java.util.Optional value) { wrapperContained.author = value; }
// public java.util.Optional title() { return wrapperContained.title; }
// public void title(java.util.Optional value) { wrapperContained.title = value; }
// public java.util.Optional generation() { return wrapperContained.generation; }
// public void generation(java.util.Optional value) { wrapperContained.generation = value; }
// public yarnwrap.component.type.WrittenBookContentComponent apply(yarnwrap.component.type.WrittenBookContentComponent current) { return new yarnwrap.component.type.WrittenBookContentComponent(wrapperContained.apply(current.wrapperContained)); }

}