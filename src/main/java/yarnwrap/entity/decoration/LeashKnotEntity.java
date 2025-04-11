package yarnwrap.entity.decoration;
public class LeashKnotEntity { public net.minecraft.entity.decoration.LeashKnotEntity wrapperContained; public LeashKnotEntity(net.minecraft.entity.decoration.LeashKnotEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public LeashKnotEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.entity.decoration.LeashKnotEntity(world.wrapperContained,pos.wrapperContained); }
public void onPlace() { wrapperContained.onPlace(); }
// public boolean method_61164(yarnwrap.entity.player.PlayerEntity entity) { return wrapperContained.method_61164(entity.wrapperContained); }
public yarnwrap.entity.decoration.LeashKnotEntity getOrCreate(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.decoration.LeashKnotEntity(wrapperContained.getOrCreate(world.wrapperContained,pos.wrapperContained)); }

}