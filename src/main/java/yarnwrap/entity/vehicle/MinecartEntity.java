package yarnwrap.entity.vehicle;
public class MinecartEntity { public net.minecraft.entity.vehicle.MinecartEntity wrapperContained; public MinecartEntity(net.minecraft.entity.vehicle.MinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public MinecartEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.vehicle.MinecartEntity(world.wrapperContained,x,y,z); }

}