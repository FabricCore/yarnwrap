package yarnwrap.item;
public class AirBlockItem { public net.minecraft.item.AirBlockItem wrapperContained; public AirBlockItem(net.minecraft.item.AirBlockItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.Block block() { return new yarnwrap.block.Block(net.minecraft.item.AirBlockItem.block); }
// public static void block(yarnwrap.block.Block value, ) { net.minecraft.item.AirBlockItem.block = value.wrapperContained; }

// public AirBlockItem(yarnwrap.block.Block block,Object settings) { this.wrapperContained = new net.minecraft.item.AirBlockItem(block.wrapperContained,settings); }

}