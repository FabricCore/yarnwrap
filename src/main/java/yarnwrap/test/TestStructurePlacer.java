package yarnwrap.test;
public class TestStructurePlacer { public net.minecraft.test.TestStructurePlacer wrapperContained; public TestStructurePlacer(net.minecraft.test.TestStructurePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MARGIN_X() { return wrapperContained.MARGIN_X; }
// public void MARGIN_X(int value) { wrapperContained.MARGIN_X = value; }
// public static int MARGIN_X() { return net.minecraft.test.TestStructurePlacer.MARGIN_X; }
// public static void MARGIN_X(int value, ) { net.minecraft.test.TestStructurePlacer.MARGIN_X = value; }

// public int MARGIN_Z() { return wrapperContained.MARGIN_Z; }
// public void MARGIN_Z(int value) { wrapperContained.MARGIN_Z = value; }
// public static int MARGIN_Z() { return net.minecraft.test.TestStructurePlacer.MARGIN_Z; }
// public static void MARGIN_Z(int value, ) { net.minecraft.test.TestStructurePlacer.MARGIN_Z = value; }

// public int testsPerRow() { return wrapperContained.testsPerRow; }
// public void testsPerRow(int value) { wrapperContained.testsPerRow = value; }
// public static int testsPerRow() { return net.minecraft.test.TestStructurePlacer.testsPerRow; }
// public static void testsPerRow(int value, ) { net.minecraft.test.TestStructurePlacer.testsPerRow = value; }

// public int testsInCurrentRow() { return wrapperContained.testsInCurrentRow; }
// public void testsInCurrentRow(int value) { wrapperContained.testsInCurrentRow = value; }
// public static int testsInCurrentRow() { return net.minecraft.test.TestStructurePlacer.testsInCurrentRow; }
// public static void testsInCurrentRow(int value, ) { net.minecraft.test.TestStructurePlacer.testsInCurrentRow = value; }

// public yarnwrap.util.math.Box box() { return new yarnwrap.util.math.Box(wrapperContained.box); }
// public void box(yarnwrap.util.math.Box value) { wrapperContained.box = value.wrapperContained; }
// public static yarnwrap.util.math.Box box() { return new yarnwrap.util.math.Box(net.minecraft.test.TestStructurePlacer.box); }
// public static void box(yarnwrap.util.math.Box value, ) { net.minecraft.test.TestStructurePlacer.box = value.wrapperContained; }

// public Object mutablePos() { return wrapperContained.mutablePos; }
// // public void mutablePos(Object value) { wrapperContained.mutablePos = value; }
// // public static Object mutablePos() { return net.minecraft.test.TestStructurePlacer.mutablePos; }
// // public static void mutablePos(Object value, ) { net.minecraft.test.TestStructurePlacer.mutablePos = value; }

// public yarnwrap.util.math.BlockPos origin() { return new yarnwrap.util.math.BlockPos(wrapperContained.origin); }
// public void origin(yarnwrap.util.math.BlockPos value) { wrapperContained.origin = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos origin() { return new yarnwrap.util.math.BlockPos(net.minecraft.test.TestStructurePlacer.origin); }
// public static void origin(yarnwrap.util.math.BlockPos value, ) { net.minecraft.test.TestStructurePlacer.origin = value.wrapperContained; }

// public boolean clearBeforeBatch() { return wrapperContained.clearBeforeBatch; }
// public void clearBeforeBatch(boolean value) { wrapperContained.clearBeforeBatch = value; }
// public static boolean clearBeforeBatch() { return net.minecraft.test.TestStructurePlacer.clearBeforeBatch; }
// public static void clearBeforeBatch(boolean value, ) { net.minecraft.test.TestStructurePlacer.clearBeforeBatch = value; }

// public float maxX() { return wrapperContained.maxX; }
// public void maxX(float value) { wrapperContained.maxX = value; }
// public static float maxX() { return net.minecraft.test.TestStructurePlacer.maxX; }
// public static void maxX(float value, ) { net.minecraft.test.TestStructurePlacer.maxX = value; }

// public java.util.Collection statesToClear() { return wrapperContained.statesToClear; }
// public void statesToClear(java.util.Collection value) { wrapperContained.statesToClear = value; }
// public static java.util.Collection statesToClear() { return net.minecraft.test.TestStructurePlacer.statesToClear; }
// public static void statesToClear(java.util.Collection value, ) { net.minecraft.test.TestStructurePlacer.statesToClear = value; }

public TestStructurePlacer(yarnwrap.util.math.BlockPos origin,int testsPerRow,boolean clearBeforeBatch) { this.wrapperContained = new net.minecraft.test.TestStructurePlacer(origin.wrapperContained,testsPerRow,clearBeforeBatch); }
// public void method_61101(yarnwrap.server.world.ServerWorld state) { wrapperContained.method_61101(state.wrapperContained); }
// public static void method_61101(yarnwrap.server.world.ServerWorld state, ) { net.minecraft.test.TestStructurePlacer.method_61101(state.wrapperContained); }

}