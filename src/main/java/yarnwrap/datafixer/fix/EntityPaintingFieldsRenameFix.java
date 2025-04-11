package yarnwrap.datafixer.fix;
public class EntityPaintingFieldsRenameFix { public net.minecraft.datafixer.fix.EntityPaintingFieldsRenameFix wrapperContained; public EntityPaintingFieldsRenameFix(net.minecraft.datafixer.fix.EntityPaintingFieldsRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityPaintingFieldsRenameFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityPaintingFieldsRenameFix(outputSchema); }
public com.mojang.serialization.Dynamic rename(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.rename(dynamic); }

}