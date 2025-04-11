package yarnwrap.item;
public class PickaxeItem { public net.minecraft.item.PickaxeItem wrapperContained; public PickaxeItem(net.minecraft.item.PickaxeItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public PickaxeItem(yarnwrap.item.ToolMaterial material) { this.wrapperContained = new net.minecraft.item.PickaxeItem(material.wrapperContained); }

}