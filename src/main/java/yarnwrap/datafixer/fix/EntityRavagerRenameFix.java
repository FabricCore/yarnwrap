package yarnwrap.datafixer.fix;
public class EntityRavagerRenameFix { public net.minecraft.datafixer.fix.EntityRavagerRenameFix wrapperContained; public EntityRavagerRenameFix(net.minecraft.datafixer.fix.EntityRavagerRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map ITEMS() { return wrapperContained.ITEMS; }
// public void ITEMS(java.util.Map value) { wrapperContained.ITEMS = value; }
public EntityRavagerRenameFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityRavagerRenameFix(outputSchema,changesType); }

}