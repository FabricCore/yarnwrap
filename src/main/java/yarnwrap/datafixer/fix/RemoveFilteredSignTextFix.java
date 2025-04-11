package yarnwrap.datafixer.fix;
public class RemoveFilteredSignTextFix { public net.minecraft.datafixer.fix.RemoveFilteredSignTextFix wrapperContained; public RemoveFilteredSignTextFix(net.minecraft.datafixer.fix.RemoveFilteredSignTextFix wrapperContained) { this.wrapperContained = wrapperContained; }

public RemoveFilteredSignTextFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.RemoveFilteredSignTextFix(outputSchema); }
// public com.mojang.serialization.Dynamic method_44190(com.mojang.serialization.Dynamic blockEntity) { return wrapperContained.method_44190(blockEntity); }

}