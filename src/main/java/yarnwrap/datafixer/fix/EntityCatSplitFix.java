package yarnwrap.datafixer.fix;
public class EntityCatSplitFix { public net.minecraft.datafixer.fix.EntityCatSplitFix wrapperContained; public EntityCatSplitFix(net.minecraft.datafixer.fix.EntityCatSplitFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityCatSplitFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityCatSplitFix(outputSchema,changesType); }

}