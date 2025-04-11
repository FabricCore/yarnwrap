package yarnwrap.datafixer.fix;
public class CauldronRenameFix { public net.minecraft.datafixer.fix.CauldronRenameFix wrapperContained; public CauldronRenameFix(net.minecraft.datafixer.fix.CauldronRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public CauldronRenameFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.CauldronRenameFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic rename(com.mojang.serialization.Dynamic cauldronDynamic) { return wrapperContained.rename(cauldronDynamic); }

}