package yarnwrap.item;
public class OnAStickItem { public net.minecraft.item.OnAStickItem wrapperContained; public OnAStickItem(net.minecraft.item.OnAStickItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityType target() { return new yarnwrap.entity.EntityType(wrapperContained.target); }
// public void target(yarnwrap.entity.EntityType value) { wrapperContained.target = value.wrapperContained; }
// public int damagePerUse() { return wrapperContained.damagePerUse; }
// public void damagePerUse(int value) { wrapperContained.damagePerUse = value; }

}