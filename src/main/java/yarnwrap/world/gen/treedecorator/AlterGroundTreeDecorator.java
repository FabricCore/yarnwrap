package yarnwrap.world.gen.treedecorator;
public class AlterGroundTreeDecorator { public net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator wrapperContained; public AlterGroundTreeDecorator(net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.stateprovider.BlockStateProvider provider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.provider); }
// public void provider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.provider = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public AlterGroundTreeDecorator(yarnwrap.world.gen.stateprovider.BlockStateProvider provider) { this.wrapperContained = new net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator(provider.wrapperContained); }
// public boolean method_23460(int pos) { return wrapperContained.method_23460(pos); }
// public void method_23461(Object pos) { wrapperContained.method_23461(pos); }
// public void setArea(Object generator,yarnwrap.util.math.BlockPos origin) { wrapperContained.setArea(generator,origin.wrapperContained); }
// public void setColumn(Object generator,yarnwrap.util.math.BlockPos origin) { wrapperContained.setColumn(generator,origin.wrapperContained); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_28889(yarnwrap.world.gen.treedecorator.AlterGroundTreeDecorator decorator) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_28889(decorator.wrapperContained)); }

}