package yarnwrap.datafixer.fix;
public class EntityHorseSplitFix { public net.minecraft.datafixer.fix.EntityHorseSplitFix wrapperContained; public EntityHorseSplitFix(net.minecraft.datafixer.fix.EntityHorseSplitFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityHorseSplitFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityHorseSplitFix(outputSchema,changesType); }

}