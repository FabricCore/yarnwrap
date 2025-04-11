package yarnwrap.world.border;
public class WorldBorderListener { public net.minecraft.world.border.WorldBorderListener wrapperContained; public WorldBorderListener(net.minecraft.world.border.WorldBorderListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onDamagePerBlockChanged(yarnwrap.world.border.WorldBorder border,double damagePerBlock) { wrapperContained.onDamagePerBlockChanged(border.wrapperContained,damagePerBlock); }
public void onCenterChanged(yarnwrap.world.border.WorldBorder border,double centerX,double centerZ) { wrapperContained.onCenterChanged(border.wrapperContained,centerX,centerZ); }
public void onInterpolateSize(yarnwrap.world.border.WorldBorder border,double fromSize,double toSize,long time) { wrapperContained.onInterpolateSize(border.wrapperContained,fromSize,toSize,time); }
public void onWarningTimeChanged(yarnwrap.world.border.WorldBorder border,int warningTime) { wrapperContained.onWarningTimeChanged(border.wrapperContained,warningTime); }
public void onWarningBlocksChanged(yarnwrap.world.border.WorldBorder border,int warningBlockDistance) { wrapperContained.onWarningBlocksChanged(border.wrapperContained,warningBlockDistance); }
public void onSizeChange(yarnwrap.world.border.WorldBorder border,double size) { wrapperContained.onSizeChange(border.wrapperContained,size); }
public void onSafeZoneChanged(yarnwrap.world.border.WorldBorder border,double safeZoneRadius) { wrapperContained.onSafeZoneChanged(border.wrapperContained,safeZoneRadius); }

}