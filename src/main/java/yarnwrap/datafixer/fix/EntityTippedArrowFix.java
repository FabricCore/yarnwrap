package yarnwrap.datafixer.fix;
public class EntityTippedArrowFix { public net.minecraft.datafixer.fix.EntityTippedArrowFix wrapperContained; public EntityTippedArrowFix(net.minecraft.datafixer.fix.EntityTippedArrowFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityTippedArrowFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityTippedArrowFix(outputSchema,changesType); }

}