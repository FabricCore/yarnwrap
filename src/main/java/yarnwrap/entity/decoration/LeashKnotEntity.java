package yarnwrap.entity.decoration;
public class LeashKnotEntity { public net.minecraft.entity.decoration.LeashKnotEntity wrapperContained; public LeashKnotEntity(net.minecraft.entity.decoration.LeashKnotEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public LeashKnotEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.entity.decoration.LeashKnotEntity(world.wrapperContained,pos.wrapperContained); }
public void onPlace() { wrapperContained.onPlace(); }
// public static void onPlace() { net.minecraft.entity.decoration.LeashKnotEntity.onPlace(); }
// public boolean method_61164(yarnwrap.entity.player.PlayerEntity entity) { return wrapperContained.method_61164(entity.wrapperContained); }
// public static boolean method_61164(yarnwrap.entity.player.PlayerEntity entity, ) { return net.minecraft.entity.decoration.LeashKnotEntity.method_61164(entity.wrapperContained); }
// public yarnwrap.entity.decoration.LeashKnotEntity getOrCreate(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.decoration.LeashKnotEntity(wrapperContained.getOrCreate(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.entity.decoration.LeashKnotEntity getOrCreate(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.decoration.LeashKnotEntity(net.minecraft.entity.decoration.LeashKnotEntity.getOrCreate(world.wrapperContained,pos.wrapperContained)); }

}