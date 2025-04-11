package yarnwrap.datafixer.fix;
public class EntityPufferfishRenameFix { public net.minecraft.datafixer.fix.EntityPufferfishRenameFix wrapperContained; public EntityPufferfishRenameFix(net.minecraft.datafixer.fix.EntityPufferfishRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map RENAMED_FISH() { return wrapperContained.RENAMED_FISH; }
// public void RENAMED_FISH(java.util.Map value) { wrapperContained.RENAMED_FISH = value; }
public EntityPufferfishRenameFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityPufferfishRenameFix(outputSchema,changesType); }

}