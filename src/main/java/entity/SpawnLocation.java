package yarnwrap.entity;
public class SpawnLocation { public net.minecraft.entity.SpawnLocation wrapperContained; public SpawnLocation(net.minecraft.entity.SpawnLocation wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.BlockPos adjustPosition(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.adjustPosition(world.wrapperContained,pos.wrapperContained)); }

}