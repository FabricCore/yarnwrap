package yarnwrap.block.entity;
public class ComparatorBlockEntity { public net.minecraft.block.entity.ComparatorBlockEntity wrapperContained; public ComparatorBlockEntity(net.minecraft.block.entity.ComparatorBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int outputSignal() { return wrapperContained.outputSignal; }
// public void outputSignal(int value) { wrapperContained.outputSignal = value; }
public void setOutputSignal(int outputSignal) { wrapperContained.setOutputSignal(outputSignal); }
public int getOutputSignal() { return wrapperContained.getOutputSignal(); }

}