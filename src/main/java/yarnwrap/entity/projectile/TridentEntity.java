package yarnwrap.entity.projectile;
public class TridentEntity { public net.minecraft.entity.projectile.TridentEntity wrapperContained; public TridentEntity(net.minecraft.entity.projectile.TridentEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData ENCHANTED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ENCHANTED); }
// public void ENCHANTED(yarnwrap.entity.data.TrackedData value) { wrapperContained.ENCHANTED = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData LOYALTY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LOYALTY); }
// public void LOYALTY(yarnwrap.entity.data.TrackedData value) { wrapperContained.LOYALTY = value.wrapperContained; }
// public boolean dealtDamage() { return wrapperContained.dealtDamage; }
// public void dealtDamage(boolean value) { wrapperContained.dealtDamage = value; }
public int returnTimer() { return wrapperContained.returnTimer; }
public void returnTimer(int value) { wrapperContained.returnTimer = value; }
public boolean isEnchanted() { return wrapperContained.isEnchanted(); }
// public byte getLoyalty(yarnwrap.item.ItemStack stack) { return wrapperContained.getLoyalty(stack.wrapperContained); }
// public boolean isOwnerAlive() { return wrapperContained.isOwnerAlive(); }

}