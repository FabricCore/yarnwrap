package yarnwrap.datafixer.fix;
public class EntityBrushableBlockFieldsRenameFix { public net.minecraft.datafixer.fix.EntityBrushableBlockFieldsRenameFix wrapperContained; public EntityBrushableBlockFieldsRenameFix(net.minecraft.datafixer.fix.EntityBrushableBlockFieldsRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityBrushableBlockFieldsRenameFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityBrushableBlockFieldsRenameFix(outputSchema); }
public com.mojang.serialization.Dynamic renameFields(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.renameFields(dynamic); }
// public static com.mojang.serialization.Dynamic renameFields(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.EntityBrushableBlockFieldsRenameFix.renameFields(dynamic); }

}