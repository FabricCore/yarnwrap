package yarnwrap.entity.projectile;
public class TridentEntity { public net.minecraft.entity.projectile.TridentEntity wrapperContained; public TridentEntity(net.minecraft.entity.projectile.TridentEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData ENCHANTED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ENCHANTED); }
// public yarnwrap.entity.data.TrackedData LOYALTY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LOYALTY); }
// public boolean dealtDamage() { return wrapperContained.dealtDamage; }
public int returnTimer() { return wrapperContained.returnTimer; }
public boolean isEnchanted() { return wrapperContained.isEnchanted(); }
// public byte getLoyalty(yarnwrap.item.ItemStack stack) { return wrapperContained.getLoyalty(stack.wrapperContained); }
// public boolean isOwnerAlive() { return wrapperContained.isOwnerAlive(); }

}