package yarnwrap.datafixer.fix;
public class ItemRemoveBlockEntityTagFix { public net.minecraft.datafixer.fix.ItemRemoveBlockEntityTagFix wrapperContained; public ItemRemoveBlockEntityTagFix(net.minecraft.datafixer.fix.ItemRemoveBlockEntityTagFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set itemIds() { return wrapperContained.itemIds; }
// public void itemIds(java.util.Set value) { wrapperContained.itemIds = value; }
public ItemRemoveBlockEntityTagFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType,java.util.Set itemIds) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemRemoveBlockEntityTagFix(outputSchema,changesType,itemIds); }
// public com.mojang.datafixers.Typed method_45014(com.mojang.datafixers.OpticFinder typed) { return wrapperContained.method_45014(typed); }

}