package yarnwrap.datafixer.fix;
public class ItemWrittenBookPagesStrictJsonFix { public net.minecraft.datafixer.fix.ItemWrittenBookPagesStrictJsonFix wrapperContained; public ItemWrittenBookPagesStrictJsonFix(net.minecraft.datafixer.fix.ItemWrittenBookPagesStrictJsonFix wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic fixBookPages(com.mojang.serialization.Dynamic tagDynamic) { return wrapperContained.fixBookPages(tagDynamic); }

}