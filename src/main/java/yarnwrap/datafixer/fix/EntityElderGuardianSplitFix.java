package yarnwrap.datafixer.fix;
public class EntityElderGuardianSplitFix { public net.minecraft.datafixer.fix.EntityElderGuardianSplitFix wrapperContained; public EntityElderGuardianSplitFix(net.minecraft.datafixer.fix.EntityElderGuardianSplitFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityElderGuardianSplitFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityElderGuardianSplitFix(outputSchema,changesType); }

}