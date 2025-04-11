package yarnwrap.entity.vehicle;
public class HopperMinecartEntity { public net.minecraft.entity.vehicle.HopperMinecartEntity wrapperContained; public HopperMinecartEntity(net.minecraft.entity.vehicle.HopperMinecartEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean enabled() { return wrapperContained.enabled; }
// public void enabled(boolean value) { wrapperContained.enabled = value; }
public void setEnabled(boolean enabled) { wrapperContained.setEnabled(enabled); }
public boolean isEnabled() { return wrapperContained.isEnabled(); }
public boolean canOperate() { return wrapperContained.canOperate(); }

}