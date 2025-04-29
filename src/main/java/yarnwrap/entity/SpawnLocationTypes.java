package yarnwrap.entity;
public class SpawnLocationTypes { public net.minecraft.entity.SpawnLocationTypes wrapperContained; public SpawnLocationTypes(net.minecraft.entity.SpawnLocationTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.SpawnLocation UNRESTRICTED() { return new yarnwrap.entity.SpawnLocation(wrapperContained.UNRESTRICTED); }
// public void UNRESTRICTED(yarnwrap.entity.SpawnLocation value) { wrapperContained.UNRESTRICTED = value.wrapperContained; }
public static yarnwrap.entity.SpawnLocation UNRESTRICTED() { return new yarnwrap.entity.SpawnLocation(net.minecraft.entity.SpawnLocationTypes.UNRESTRICTED); }
// public static void UNRESTRICTED(yarnwrap.entity.SpawnLocation value, ) { net.minecraft.entity.SpawnLocationTypes.UNRESTRICTED = value.wrapperContained; }

// public yarnwrap.entity.SpawnLocation IN_WATER() { return new yarnwrap.entity.SpawnLocation(wrapperContained.IN_WATER); }
// public void IN_WATER(yarnwrap.entity.SpawnLocation value) { wrapperContained.IN_WATER = value.wrapperContained; }
public static yarnwrap.entity.SpawnLocation IN_WATER() { return new yarnwrap.entity.SpawnLocation(net.minecraft.entity.SpawnLocationTypes.IN_WATER); }
// public static void IN_WATER(yarnwrap.entity.SpawnLocation value, ) { net.minecraft.entity.SpawnLocationTypes.IN_WATER = value.wrapperContained; }

// public yarnwrap.entity.SpawnLocation IN_LAVA() { return new yarnwrap.entity.SpawnLocation(wrapperContained.IN_LAVA); }
// public void IN_LAVA(yarnwrap.entity.SpawnLocation value) { wrapperContained.IN_LAVA = value.wrapperContained; }
public static yarnwrap.entity.SpawnLocation IN_LAVA() { return new yarnwrap.entity.SpawnLocation(net.minecraft.entity.SpawnLocationTypes.IN_LAVA); }
// public static void IN_LAVA(yarnwrap.entity.SpawnLocation value, ) { net.minecraft.entity.SpawnLocationTypes.IN_LAVA = value.wrapperContained; }

// public yarnwrap.entity.SpawnLocation ON_GROUND() { return new yarnwrap.entity.SpawnLocation(wrapperContained.ON_GROUND); }
// public void ON_GROUND(yarnwrap.entity.SpawnLocation value) { wrapperContained.ON_GROUND = value.wrapperContained; }
public static yarnwrap.entity.SpawnLocation ON_GROUND() { return new yarnwrap.entity.SpawnLocation(net.minecraft.entity.SpawnLocationTypes.ON_GROUND); }
// public static void ON_GROUND(yarnwrap.entity.SpawnLocation value, ) { net.minecraft.entity.SpawnLocationTypes.ON_GROUND = value.wrapperContained; }

// public boolean method_56554(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType) { return wrapperContained.method_56554(world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public static boolean method_56554(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType, ) { return net.minecraft.entity.SpawnLocationTypes.method_56554(world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public boolean method_56555(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType) { return wrapperContained.method_56555(world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public static boolean method_56555(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType, ) { return net.minecraft.entity.SpawnLocationTypes.method_56555(world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public boolean method_56556(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType) { return wrapperContained.method_56556(world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }
// public static boolean method_56556(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.EntityType entityType, ) { return net.minecraft.entity.SpawnLocationTypes.method_56556(world.wrapperContained,pos.wrapperContained,entityType.wrapperContained); }

}