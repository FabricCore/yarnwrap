package yarnwrap.item;
public class AirBlockItem { public net.minecraft.item.AirBlockItem wrapperContained; public AirBlockItem(net.minecraft.item.AirBlockItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }

}