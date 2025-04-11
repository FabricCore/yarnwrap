package yarnwrap.datafixer.fix;
public class BlockEntityBlockStateFix { public net.minecraft.datafixer.fix.BlockEntityBlockStateFix wrapperContained; public BlockEntityBlockStateFix(net.minecraft.datafixer.fix.BlockEntityBlockStateFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BlockEntityBlockStateFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockEntityBlockStateFix(outputSchema,changesType); }

}