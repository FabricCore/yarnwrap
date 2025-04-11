package yarnwrap.datafixer.fix;
public class LeavesFix { public net.minecraft.datafixer.fix.LeavesFix wrapperContained; public LeavesFix(net.minecraft.datafixer.fix.LeavesFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set LOGS_MAP() { return wrapperContained.LOGS_MAP; }
// public void LOGS_MAP(java.util.Set value) { wrapperContained.LOGS_MAP = value; }
// public int[][] AXIAL_OFFSETS() { return wrapperContained.AXIAL_OFFSETS; }
// public void AXIAL_OFFSETS(int[][] value) { wrapperContained.AXIAL_OFFSETS = value; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap LEAVES_MAP() { return wrapperContained.LEAVES_MAP; }
// public void LEAVES_MAP(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.LEAVES_MAP = value; }
// public int getZ(int packedLocalPos) { return wrapperContained.getZ(packedLocalPos); }
public int packLocalPos(int localX,int localY,int localZ) { return wrapperContained.packLocalPos(localX,localY,localZ); }
// public int getX(int packedLocalPos) { return wrapperContained.getX(packedLocalPos); }
public int getBoundaryClassBit(boolean westernmost,boolean easternmost,boolean northernmost,boolean southernmost) { return wrapperContained.getBoundaryClassBit(westernmost,easternmost,northernmost,southernmost); }
// public int getY(int packedLocalPos) { return wrapperContained.getY(packedLocalPos); }

}