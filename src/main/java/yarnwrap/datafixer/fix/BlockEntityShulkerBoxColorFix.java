package yarnwrap.datafixer.fix;
public class BlockEntityShulkerBoxColorFix { public net.minecraft.datafixer.fix.BlockEntityShulkerBoxColorFix wrapperContained; public BlockEntityShulkerBoxColorFix(net.minecraft.datafixer.fix.BlockEntityShulkerBoxColorFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BlockEntityShulkerBoxColorFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockEntityShulkerBoxColorFix(outputSchema,changesType); }

}