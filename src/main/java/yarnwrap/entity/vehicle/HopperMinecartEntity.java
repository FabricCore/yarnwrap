package yarnwrap.entity.vehicle;
public class HopperMinecartEntity { public net.minecraft.entity.vehicle.HopperMinecartEntity wrapperContained; public HopperMinecartEntity(net.minecraft.entity.vehicle.HopperMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean enabled() { return wrapperContained.enabled; }
// public void enabled(boolean value) { wrapperContained.enabled = value; }
// public static boolean enabled() { return net.minecraft.entity.vehicle.HopperMinecartEntity.enabled; }
// public static void enabled(boolean value, ) { net.minecraft.entity.vehicle.HopperMinecartEntity.enabled = value; }

// public boolean hopperTicked() { return wrapperContained.hopperTicked; }
// public void hopperTicked(boolean value) { wrapperContained.hopperTicked = value; }
// public static boolean hopperTicked() { return net.minecraft.entity.vehicle.HopperMinecartEntity.hopperTicked; }
// public static void hopperTicked(boolean value, ) { net.minecraft.entity.vehicle.HopperMinecartEntity.hopperTicked = value; }

// public boolean DEFAULT_ENABLED() { return wrapperContained.DEFAULT_ENABLED; }
// public void DEFAULT_ENABLED(boolean value) { wrapperContained.DEFAULT_ENABLED = value; }
// public static boolean DEFAULT_ENABLED() { return net.minecraft.entity.vehicle.HopperMinecartEntity.DEFAULT_ENABLED; }
// public static void DEFAULT_ENABLED(boolean value, ) { net.minecraft.entity.vehicle.HopperMinecartEntity.DEFAULT_ENABLED = value; }

public void setEnabled(boolean enabled) { wrapperContained.setEnabled(enabled); }
// public static void setEnabled(boolean enabled, ) { net.minecraft.entity.vehicle.HopperMinecartEntity.setEnabled(enabled); }
public boolean isEnabled() { return wrapperContained.isEnabled(); }
// public static boolean isEnabled() { return net.minecraft.entity.vehicle.HopperMinecartEntity.isEnabled(); }
public boolean canOperate() { return wrapperContained.canOperate(); }
// public static boolean canOperate() { return net.minecraft.entity.vehicle.HopperMinecartEntity.canOperate(); }
// public void tickHopper() { wrapperContained.tickHopper(); }
// public static void tickHopper() { net.minecraft.entity.vehicle.HopperMinecartEntity.tickHopper(); }

}