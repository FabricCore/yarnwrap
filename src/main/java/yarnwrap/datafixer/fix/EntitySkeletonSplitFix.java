package yarnwrap.datafixer.fix;
public class EntitySkeletonSplitFix { public net.minecraft.datafixer.fix.EntitySkeletonSplitFix wrapperContained; public EntitySkeletonSplitFix(net.minecraft.datafixer.fix.EntitySkeletonSplitFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntitySkeletonSplitFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntitySkeletonSplitFix(outputSchema,changesType); }

}