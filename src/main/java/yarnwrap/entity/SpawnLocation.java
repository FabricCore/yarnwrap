package yarnwrap.entity;
public class SpawnLocation { public net.minecraft.entity.SpawnLocation wrapperContained; public SpawnLocation(net.minecraft.entity.SpawnLocation wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isSpawnPositionOk(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType) { return wrapperContained.isSpawnPositionOk(world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public static boolean isSpawnPositionOk(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType, ) { return net.minecraft.entity.SpawnLocation.isSpawnPositionOk(world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
public yarnwrap.util.math.BlockPos adjustPosition(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.adjustPosition(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos adjustPosition(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.SpawnLocation.adjustPosition(world.wrapperContained,pos.wrapperContained)); }

}