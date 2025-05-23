package yarnwrap.block;
public class EyeblossomBlock { public net.minecraft.block.EyeblossomBlock wrapperContained; public EyeblossomBlock(net.minecraft.block.EyeblossomBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.EyeblossomBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.EyeblossomBlock.CODEC = value; }

// public int NOTIFY_RANGE_XZ() { return wrapperContained.NOTIFY_RANGE_XZ; }
// public void NOTIFY_RANGE_XZ(int value) { wrapperContained.NOTIFY_RANGE_XZ = value; }
// public static int NOTIFY_RANGE_XZ() { return net.minecraft.block.EyeblossomBlock.NOTIFY_RANGE_XZ; }
// public static void NOTIFY_RANGE_XZ(int value, ) { net.minecraft.block.EyeblossomBlock.NOTIFY_RANGE_XZ = value; }

// public int NOTIFY_RANGE_Y() { return wrapperContained.NOTIFY_RANGE_Y; }
// public void NOTIFY_RANGE_Y(int value) { wrapperContained.NOTIFY_RANGE_Y = value; }
// public static int NOTIFY_RANGE_Y() { return net.minecraft.block.EyeblossomBlock.NOTIFY_RANGE_Y; }
// public static void NOTIFY_RANGE_Y(int value, ) { net.minecraft.block.EyeblossomBlock.NOTIFY_RANGE_Y = value; }

// public Object state() { return wrapperContained.state; }
// // public void state(Object value) { wrapperContained.state = value; }
// // public static Object state() { return net.minecraft.block.EyeblossomBlock.state; }
// // public static void state(Object value, ) { net.minecraft.block.EyeblossomBlock.state = value; }

// public EyeblossomBlock(Object state,Object settings) { this.wrapperContained = new net.minecraft.block.EyeblossomBlock(state,settings); }
// public EyeblossomBlock(boolean open,Object settings) { this.wrapperContained = new net.minecraft.block.EyeblossomBlock(open,settings); }
// public void method_65149(yarnwrap.server.world.ServerWorld otherPos) { wrapperContained.method_65149(otherPos.wrapperContained); }
// public static void method_65149(yarnwrap.server.world.ServerWorld otherPos, ) { net.minecraft.block.EyeblossomBlock.method_65149(otherPos.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_65150(Object instance) { return wrapperContained.method_65150(instance); }
// public static com.mojang.datafixers.kinds.App method_65150(Object instance, ) { return net.minecraft.block.EyeblossomBlock.method_65150(instance); }
// public java.lang.Boolean method_65151(yarnwrap.block.EyeblossomBlock block) { return wrapperContained.method_65151(block.wrapperContained); }
// public static java.lang.Boolean method_65151(yarnwrap.block.EyeblossomBlock block, ) { return net.minecraft.block.EyeblossomBlock.method_65151(block.wrapperContained); }
// public boolean updateStateAndNotifyOthers(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.updateStateAndNotifyOthers(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean updateStateAndNotifyOthers(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.block.EyeblossomBlock.updateStateAndNotifyOthers(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}