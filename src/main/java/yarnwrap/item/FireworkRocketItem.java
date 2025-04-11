package yarnwrap.item;
public class FireworkRocketItem { public net.minecraft.item.FireworkRocketItem wrapperContained; public FireworkRocketItem(net.minecraft.item.FireworkRocketItem wrapperContained) { this.wrapperContained = wrapperContained; }

public double OFFSET_POS_MULTIPLIER() { return wrapperContained.OFFSET_POS_MULTIPLIER; }
// public void OFFSET_POS_MULTIPLIER(double value) { wrapperContained.OFFSET_POS_MULTIPLIER = value; }
public byte[] FLIGHT_VALUES() { return wrapperContained.FLIGHT_VALUES; }
// public void FLIGHT_VALUES(byte[] value) { wrapperContained.FLIGHT_VALUES = value; }
// public yarnwrap.util.math.Vec3d position(yarnwrap.util.math.BlockPointer pointer,yarnwrap.util.math.Direction facing) { return new yarnwrap.util.math.Vec3d(wrapperContained.position(pointer.wrapperContained,facing.wrapperContained)); }

}