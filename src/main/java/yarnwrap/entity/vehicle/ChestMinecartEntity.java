package yarnwrap.entity.vehicle;
public class ChestMinecartEntity { public net.minecraft.entity.vehicle.ChestMinecartEntity wrapperContained; public ChestMinecartEntity(net.minecraft.entity.vehicle.ChestMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public ChestMinecartEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.vehicle.ChestMinecartEntity(world.wrapperContained,x,y,z); }

}