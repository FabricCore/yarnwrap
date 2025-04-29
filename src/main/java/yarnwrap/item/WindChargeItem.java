package yarnwrap.item;
public class WindChargeItem { public net.minecraft.item.WindChargeItem wrapperContained; public WindChargeItem(net.minecraft.item.WindChargeItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public int COOLDOWN() { return wrapperContained.COOLDOWN; }
// public void COOLDOWN(int value) { wrapperContained.COOLDOWN = value; }
// public static int COOLDOWN() { return net.minecraft.item.WindChargeItem.COOLDOWN; }
// public static void COOLDOWN(int value, ) { net.minecraft.item.WindChargeItem.COOLDOWN = value; }

// public yarnwrap.util.math.Position method_58670(yarnwrap.util.math.BlockPointer pointer,yarnwrap.util.math.Direction facing) { return new yarnwrap.util.math.Position(wrapperContained.method_58670(pointer.wrapperContained,facing.wrapperContained)); }
// public static yarnwrap.util.math.Position method_58670(yarnwrap.util.math.BlockPointer pointer,yarnwrap.util.math.Direction facing, ) { return new yarnwrap.util.math.Position(net.minecraft.item.WindChargeItem.method_58670(pointer.wrapperContained,facing.wrapperContained)); }

}