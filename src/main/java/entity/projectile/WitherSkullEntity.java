package yarnwrap.entity.projectile;
public class WitherSkullEntity { public net.minecraft.entity.projectile.WitherSkullEntity wrapperContained; public WitherSkullEntity(net.minecraft.entity.projectile.WitherSkullEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData CHARGED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHARGED); }
public void setCharged(boolean charged) { wrapperContained.setCharged(charged); }
public boolean isCharged() { return wrapperContained.isCharged(); }

}