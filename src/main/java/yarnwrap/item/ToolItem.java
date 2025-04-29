package yarnwrap.item;
public class ToolItem { public net.minecraft.item.ToolItem wrapperContained; public ToolItem(net.minecraft.item.ToolItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ToolMaterial material() { return new yarnwrap.item.ToolMaterial(wrapperContained.material); }
// public void material(yarnwrap.item.ToolMaterial value) { wrapperContained.material = value.wrapperContained; }
// public static yarnwrap.item.ToolMaterial material() { return new yarnwrap.item.ToolMaterial(net.minecraft.item.ToolItem.material); }
// public static void material(yarnwrap.item.ToolMaterial value, ) { net.minecraft.item.ToolItem.material = value.wrapperContained; }

// public ToolItem(yarnwrap.item.ToolMaterial material,Object settings) { this.wrapperContained = new net.minecraft.item.ToolItem(material.wrapperContained,settings); }
public yarnwrap.item.ToolMaterial getMaterial() { return new yarnwrap.item.ToolMaterial(wrapperContained.getMaterial()); }
// public static yarnwrap.item.ToolMaterial getMaterial() { return new yarnwrap.item.ToolMaterial(net.minecraft.item.ToolItem.getMaterial()); }

}