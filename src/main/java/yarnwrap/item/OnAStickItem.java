package yarnwrap.item;
public class OnAStickItem { public net.minecraft.item.OnAStickItem wrapperContained; public OnAStickItem(net.minecraft.item.OnAStickItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityType target() { return new yarnwrap.entity.EntityType(wrapperContained.target); }
// public void target(yarnwrap.entity.EntityType value) { wrapperContained.target = value.wrapperContained; }
// public static yarnwrap.entity.EntityType target() { return new yarnwrap.entity.EntityType(net.minecraft.item.OnAStickItem.target); }
// public static void target(yarnwrap.entity.EntityType value, ) { net.minecraft.item.OnAStickItem.target = value.wrapperContained; }

// public int damagePerUse() { return wrapperContained.damagePerUse; }
// public void damagePerUse(int value) { wrapperContained.damagePerUse = value; }
// public static int damagePerUse() { return net.minecraft.item.OnAStickItem.damagePerUse; }
// public static void damagePerUse(int value, ) { net.minecraft.item.OnAStickItem.damagePerUse = value; }

// public OnAStickItem(Object settings,yarnwrap.entity.EntityType target,int damagePerUse) { this.wrapperContained = new net.minecraft.item.OnAStickItem(settings,target.wrapperContained,damagePerUse); }

}