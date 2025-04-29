package yarnwrap.block.entity;
public class ComparatorBlockEntity { public net.minecraft.block.entity.ComparatorBlockEntity wrapperContained; public ComparatorBlockEntity(net.minecraft.block.entity.ComparatorBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int outputSignal() { return wrapperContained.outputSignal; }
// public void outputSignal(int value) { wrapperContained.outputSignal = value; }
// public static int outputSignal() { return net.minecraft.block.entity.ComparatorBlockEntity.outputSignal; }
// public static void outputSignal(int value, ) { net.minecraft.block.entity.ComparatorBlockEntity.outputSignal = value; }

public ComparatorBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.ComparatorBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void setOutputSignal(int outputSignal) { wrapperContained.setOutputSignal(outputSignal); }
// public static void setOutputSignal(int outputSignal, ) { net.minecraft.block.entity.ComparatorBlockEntity.setOutputSignal(outputSignal); }
public int getOutputSignal() { return wrapperContained.getOutputSignal(); }
// public static int getOutputSignal() { return net.minecraft.block.entity.ComparatorBlockEntity.getOutputSignal(); }

}