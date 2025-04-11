package yarnwrap.entity;
public class SpawnLocationTypes { public net.minecraft.entity.SpawnLocationTypes wrapperContained; public SpawnLocationTypes(net.minecraft.entity.SpawnLocationTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.SpawnLocation UNRESTRICTED() { return new yarnwrap.entity.SpawnLocation(wrapperContained.UNRESTRICTED); }
// public void UNRESTRICTED(yarnwrap.entity.SpawnLocation value) { wrapperContained.UNRESTRICTED = value.wrapperContained; }
public yarnwrap.entity.SpawnLocation IN_WATER() { return new yarnwrap.entity.SpawnLocation(wrapperContained.IN_WATER); }
// public void IN_WATER(yarnwrap.entity.SpawnLocation value) { wrapperContained.IN_WATER = value.wrapperContained; }
public yarnwrap.entity.SpawnLocation IN_LAVA() { return new yarnwrap.entity.SpawnLocation(wrapperContained.IN_LAVA); }
// public void IN_LAVA(yarnwrap.entity.SpawnLocation value) { wrapperContained.IN_LAVA = value.wrapperContained; }
public yarnwrap.entity.SpawnLocation ON_GROUND() { return new yarnwrap.entity.SpawnLocation(wrapperContained.ON_GROUND); }
// public void ON_GROUND(yarnwrap.entity.SpawnLocation value) { wrapperContained.ON_GROUND = value.wrapperContained; }
// public boolean method_56554(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType) { return wrapperContained.method_56554(world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public boolean method_56555(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType) { return wrapperContained.method_56555(world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public boolean method_56556(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType) { return wrapperContained.method_56556(world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }

}