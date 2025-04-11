package yarnwrap.datafixer.fix;
public class BedBlockEntityFix { public net.minecraft.datafixer.fix.BedBlockEntityFix wrapperContained; public BedBlockEntityFix(net.minecraft.datafixer.fix.BedBlockEntityFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BedBlockEntityFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BedBlockEntityFix(outputSchema,changesType); }
// public com.mojang.datafixers.TypeRewriteRule fix(com.mojang.datafixers.types.Type level,Object blockEntities) { return wrapperContained.fix(level,blockEntities); }
// public java.util.Map method_49456(com.mojang.serialization.Dynamic blockData,int index) { return wrapperContained.method_49456(blockData,index); }

}