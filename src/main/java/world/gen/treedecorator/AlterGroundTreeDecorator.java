package yarnwrap.world.gen.treedecorator;
public class AlterGroundTreeDecorator { public net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator wrapperContained; public AlterGroundTreeDecorator(net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.stateprovider.BlockStateProvider provider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.provider); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void setArea(Object generator,yarnwrap.util.math.BlockPos origin) { wrapperContained.setArea(generator,origin.wrapperContained); }
// public void setColumn(Object generator,yarnwrap.util.math.BlockPos origin) { wrapperContained.setColumn(generator,origin.wrapperContained); }

}