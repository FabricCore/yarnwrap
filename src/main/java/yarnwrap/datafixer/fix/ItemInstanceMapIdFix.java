package yarnwrap.datafixer.fix;
public class ItemInstanceMapIdFix { public net.minecraft.datafixer.fix.ItemInstanceMapIdFix wrapperContained; public ItemInstanceMapIdFix(net.minecraft.datafixer.fix.ItemInstanceMapIdFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ItemInstanceMapIdFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemInstanceMapIdFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_5032(com.mojang.datafixers.OpticFinder itemStack) { return wrapperContained.method_5032(itemStack); }

}