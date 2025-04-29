package yarnwrap.world.gen.treedecorator;
public class AlterGroundTreeDecorator { public net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator wrapperContained; public AlterGroundTreeDecorator(net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.stateprovider.BlockStateProvider provider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.provider); }
// public void provider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.provider = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider provider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator.provider); }
// public static void provider(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator.provider = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator.CODEC = value; }

public AlterGroundTreeDecorator(yarnwrap.world.gen.stateprovider.BlockStateProvider provider) { this.wrapperContained = new net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator(provider.wrapperContained); }
// public boolean method_23460(int pos) { return wrapperContained.method_23460(pos); }
// public static boolean method_23460(int pos, ) { return net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator.method_23460(pos); }
// public void method_23461(Object pos) { wrapperContained.method_23461(pos); }
// public static void method_23461(Object pos, ) { net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator.method_23461(pos); }
// public void setArea(Object generator,yarnwrap.util.math.BlockPos origin) { wrapperContained.setArea(generator,origin.wrapperContained); }
// public static void setArea(Object generator,yarnwrap.util.math.BlockPos origin, ) { net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator.setArea(generator,origin.wrapperContained); }
// public void setColumn(Object generator,yarnwrap.util.math.BlockPos origin) { wrapperContained.setColumn(generator,origin.wrapperContained); }
// public static void setColumn(Object generator,yarnwrap.util.math.BlockPos origin, ) { net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator.setColumn(generator,origin.wrapperContained); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_28889(yarnwrap.world.gen.treedecorator.AlterGroundTreeDecorator decorator) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_28889(decorator.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider method_28889(yarnwrap.world.gen.treedecorator.AlterGroundTreeDecorator decorator, ) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator.method_28889(decorator.wrapperContained)); }

}