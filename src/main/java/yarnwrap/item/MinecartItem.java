package yarnwrap.item;
public class MinecartItem { public net.minecraft.item.MinecartItem wrapperContained; public MinecartItem(net.minecraft.item.MinecartItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityType type() { return new yarnwrap.entity.EntityType(wrapperContained.type); }
// public void type(yarnwrap.entity.EntityType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.entity.EntityType type() { return new yarnwrap.entity.EntityType(net.minecraft.item.MinecartItem.type); }
// public static void type(yarnwrap.entity.EntityType value, ) { net.minecraft.item.MinecartItem.type = value.wrapperContained; }

// public MinecartItem(yarnwrap.entity.EntityType type,Object settings) { this.wrapperContained = new net.minecraft.item.MinecartItem(type.wrapperContained,settings); }

}