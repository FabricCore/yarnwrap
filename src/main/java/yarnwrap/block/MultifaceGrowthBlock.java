package yarnwrap.block;
public class MultifaceGrowthBlock { public net.minecraft.block.MultifaceGrowthBlock wrapperContained; public MultifaceGrowthBlock(net.minecraft.block.MultifaceGrowthBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.MultifaceGrower getGrower() { return new yarnwrap.block.MultifaceGrower(wrapperContained.getGrower()); }
// public static yarnwrap.block.MultifaceGrower getGrower() { return new yarnwrap.block.MultifaceGrower(net.minecraft.block.MultifaceGrowthBlock.getGrower()); }

}