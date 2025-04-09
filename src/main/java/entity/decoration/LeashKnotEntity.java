package yarnwrap.entity.decoration;
public class LeashKnotEntity { public net.minecraft.entity.decoration.LeashKnotEntity wrapperContained; public LeashKnotEntity(net.minecraft.entity.decoration.LeashKnotEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public void onPlace() { wrapperContained.onPlace(); }
public yarnwrap.entity.decoration.LeashKnotEntity getOrCreate(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.decoration.LeashKnotEntity(wrapperContained.getOrCreate(world.wrapperContained,pos.wrapperContained)); }

}