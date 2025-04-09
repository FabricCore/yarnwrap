package yarnwrap.block;
public class PlantBlock { public net.minecraft.block.PlantBlock wrapperContained; public PlantBlock(net.minecraft.block.PlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canPlantOnTop(yarnwrap.block.BlockState floor,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canPlantOnTop(floor.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}