package yarnwrap.entity.spawn;
public class SpawnContext { public net.minecraft.entity.spawn.SpawnContext wrapperContained; public SpawnContext(net.minecraft.entity.spawn.SpawnContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.ServerWorldAccess world() { return new yarnwrap.world.ServerWorldAccess(wrapperContained.world); }
// public void world(yarnwrap.world.ServerWorldAccess value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.ServerWorldAccess world() { return new yarnwrap.world.ServerWorldAccess(net.minecraft.entity.spawn.SpawnContext.world); }
// public static void world(yarnwrap.world.ServerWorldAccess value, ) { net.minecraft.entity.spawn.SpawnContext.world = value.wrapperContained; }

// public yarnwrap.world.ServerWorldAccess world() { return new yarnwrap.world.ServerWorldAccess(wrapperContained.world()); }
// // public static yarnwrap.world.ServerWorldAccess world() { return new yarnwrap.world.ServerWorldAccess(net.minecraft.entity.spawn.SpawnContext.world()); }
// public yarnwrap.entity.spawn.SpawnContext of(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.spawn.SpawnContext(wrapperContained.of(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.spawn.SpawnContext of(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.spawn.SpawnContext(net.minecraft.entity.spawn.SpawnContext.of(world.wrapperContained,pos.wrapperContained)); }

}