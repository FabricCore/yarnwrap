package yarnwrap.datafixer.fix;
public class EntityBrushableBlockFieldsRenameFix { public net.minecraft.datafixer.fix.EntityBrushableBlockFieldsRenameFix wrapperContained; public EntityBrushableBlockFieldsRenameFix(net.minecraft.datafixer.fix.EntityBrushableBlockFieldsRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic renameFields(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.renameFields(dynamic); }

}