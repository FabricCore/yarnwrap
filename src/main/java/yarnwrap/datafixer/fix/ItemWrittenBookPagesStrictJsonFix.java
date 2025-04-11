package yarnwrap.datafixer.fix;
public class ItemWrittenBookPagesStrictJsonFix { public net.minecraft.datafixer.fix.ItemWrittenBookPagesStrictJsonFix wrapperContained; public ItemWrittenBookPagesStrictJsonFix(net.minecraft.datafixer.fix.ItemWrittenBookPagesStrictJsonFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ItemWrittenBookPagesStrictJsonFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemWrittenBookPagesStrictJsonFix(outputSchema,changesType); }
// public java.util.stream.Stream method_5084(java.util.stream.Stream pages) { return wrapperContained.method_5084(pages); }
public com.mojang.serialization.Dynamic fixBookPages(com.mojang.serialization.Dynamic tagDynamic) { return wrapperContained.fixBookPages(tagDynamic); }
// public com.mojang.datafixers.Typed method_5086(com.mojang.datafixers.OpticFinder itemStackTyped) { return wrapperContained.method_5086(itemStackTyped); }
// public com.mojang.datafixers.Typed method_5088(com.mojang.datafixers.Typed tagTyped) { return wrapperContained.method_5088(tagTyped); }
// public com.mojang.serialization.Dynamic method_5089(com.mojang.serialization.Dynamic pagesDynamic) { return wrapperContained.method_5089(pagesDynamic); }

}