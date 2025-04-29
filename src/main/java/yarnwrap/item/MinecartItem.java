package yarnwrap.item;
public class MinecartItem { public net.minecraft.item.MinecartItem wrapperContained; public MinecartItem(net.minecraft.item.MinecartItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.DispenserBehavior DISPENSER_BEHAVIOR() { return new yarnwrap.block.dispenser.DispenserBehavior(wrapperContained.DISPENSER_BEHAVIOR); }
// public void DISPENSER_BEHAVIOR(yarnwrap.block.dispenser.DispenserBehavior value) { wrapperContained.DISPENSER_BEHAVIOR = value.wrapperContained; }
// public static yarnwrap.block.dispenser.DispenserBehavior DISPENSER_BEHAVIOR() { return new yarnwrap.block.dispenser.DispenserBehavior(net.minecraft.item.MinecartItem.DISPENSER_BEHAVIOR); }
// public static void DISPENSER_BEHAVIOR(yarnwrap.block.dispenser.DispenserBehavior value, ) { net.minecraft.item.MinecartItem.DISPENSER_BEHAVIOR = value.wrapperContained; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.item.MinecartItem.type; }
// // public static void type(Object value, ) { net.minecraft.item.MinecartItem.type = value; }

// public MinecartItem(Object type,Object settings) { this.wrapperContained = new net.minecraft.item.MinecartItem(type,settings); }

}