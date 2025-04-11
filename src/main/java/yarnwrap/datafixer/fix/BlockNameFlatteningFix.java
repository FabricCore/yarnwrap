package yarnwrap.datafixer.fix;
public class BlockNameFlatteningFix { public net.minecraft.datafixer.fix.BlockNameFlatteningFix wrapperContained; public BlockNameFlatteningFix(net.minecraft.datafixer.fix.BlockNameFlatteningFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BlockNameFlatteningFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockNameFlatteningFix(outputSchema,changesType); }

}