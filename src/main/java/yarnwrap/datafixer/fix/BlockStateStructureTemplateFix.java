package yarnwrap.datafixer.fix;
public class BlockStateStructureTemplateFix { public net.minecraft.datafixer.fix.BlockStateStructureTemplateFix wrapperContained; public BlockStateStructureTemplateFix(net.minecraft.datafixer.fix.BlockStateStructureTemplateFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BlockStateStructureTemplateFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockStateStructureTemplateFix(outputSchema,changesType); }

}