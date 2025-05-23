package yarnwrap.test;
public class BlockBasedTestInstance { public net.minecraft.test.BlockBasedTestInstance wrapperContained; public BlockBasedTestInstance(net.minecraft.test.BlockBasedTestInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.test.BlockBasedTestInstance.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.test.BlockBasedTestInstance.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_66906(Object instance) { return wrapperContained.method_66906(instance); }
// public static com.mojang.datafixers.kinds.App method_66906(Object instance, ) { return net.minecraft.test.BlockBasedTestInstance.method_66906(instance); }
// public void method_66908(yarnwrap.test.TestContext testBlockEntity) { wrapperContained.method_66908(testBlockEntity.wrapperContained); }
// public static void method_66908(yarnwrap.test.TestContext testBlockEntity, ) { net.minecraft.test.BlockBasedTestInstance.method_66908(testBlockEntity.wrapperContained); }
// public void method_66910(yarnwrap.test.TestContext pos) { wrapperContained.method_66910(pos.wrapperContained); }
// public static void method_66910(yarnwrap.test.TestContext pos, ) { net.minecraft.test.BlockBasedTestInstance.method_66910(pos.wrapperContained); }
// public void handleTrigger(yarnwrap.test.TestContext context,yarnwrap.block.enums.TestBlockMode mode,java.util.function.Consumer callback) { wrapperContained.handleTrigger(context.wrapperContained,mode.wrapperContained,callback); }
// public static void handleTrigger(yarnwrap.test.TestContext context,yarnwrap.block.enums.TestBlockMode mode,java.util.function.Consumer callback, ) { net.minecraft.test.BlockBasedTestInstance.handleTrigger(context.wrapperContained,mode.wrapperContained,callback); }
// public java.util.List findTestBlocks(yarnwrap.test.TestContext context,yarnwrap.block.enums.TestBlockMode mode) { return wrapperContained.findTestBlocks(context.wrapperContained,mode.wrapperContained); }
// public static java.util.List findTestBlocks(yarnwrap.test.TestContext context,yarnwrap.block.enums.TestBlockMode mode, ) { return net.minecraft.test.BlockBasedTestInstance.findTestBlocks(context.wrapperContained,mode.wrapperContained); }
// public yarnwrap.block.entity.TestBlockEntity method_67481(yarnwrap.test.TestContext pos) { return new yarnwrap.block.entity.TestBlockEntity(wrapperContained.method_67481(pos.wrapperContained)); }
// public static yarnwrap.block.entity.TestBlockEntity method_67481(yarnwrap.test.TestContext pos, ) { return new yarnwrap.block.entity.TestBlockEntity(net.minecraft.test.BlockBasedTestInstance.method_67481(pos.wrapperContained)); }
// public yarnwrap.util.math.BlockPos findStartBlockPos(yarnwrap.test.TestContext context) { return new yarnwrap.util.math.BlockPos(wrapperContained.findStartBlockPos(context.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos findStartBlockPos(yarnwrap.test.TestContext context, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.test.BlockBasedTestInstance.findStartBlockPos(context.wrapperContained)); }

}