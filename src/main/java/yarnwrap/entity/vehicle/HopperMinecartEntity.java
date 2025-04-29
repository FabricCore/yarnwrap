package yarnwrap.entity.vehicle;
public class HopperMinecartEntity { public net.minecraft.entity.vehicle.HopperMinecartEntity wrapperContained; public HopperMinecartEntity(net.minecraft.entity.vehicle.HopperMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean enabled() { return wrapperContained.enabled; }
// public void enabled(boolean value) { wrapperContained.enabled = value; }
// public static boolean enabled() { return net.minecraft.entity.vehicle.HopperMinecartEntity.enabled; }
// public static void enabled(boolean value, ) { net.minecraft.entity.vehicle.HopperMinecartEntity.enabled = value; }

public HopperMinecartEntity(yarnwrap.world.World world,double x,double y,double z) { this.wrapperContained = new net.minecraft.entity.vehicle.HopperMinecartEntity(world.wrapperContained,x,y,z); }
public void setEnabled(boolean enabled) { wrapperContained.setEnabled(enabled); }
// public static void setEnabled(boolean enabled, ) { net.minecraft.entity.vehicle.HopperMinecartEntity.setEnabled(enabled); }
public boolean isEnabled() { return wrapperContained.isEnabled(); }
// public static boolean isEnabled() { return net.minecraft.entity.vehicle.HopperMinecartEntity.isEnabled(); }
public boolean canOperate() { return wrapperContained.canOperate(); }
// public static boolean canOperate() { return net.minecraft.entity.vehicle.HopperMinecartEntity.canOperate(); }

}