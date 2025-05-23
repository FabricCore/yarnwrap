package yarnwrap.item;
public class AirBlockItem { public net.minecraft.item.AirBlockItem wrapperContained; public AirBlockItem(net.minecraft.item.AirBlockItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public AirBlockItem(yarnwrap.block.Block block,Object settings) { this.wrapperContained = new net.minecraft.item.AirBlockItem(block.wrapperContained,settings); }

}