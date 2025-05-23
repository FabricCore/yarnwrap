package yarnwrap.block.entity;
public class StructureBoxRendering { public net.minecraft.block.entity.StructureBoxRendering wrapperContained; public StructureBoxRendering(net.minecraft.block.entity.StructureBoxRendering wrapperContained) { this.wrapperContained = wrapperContained; }

public Object getRenderMode() { return wrapperContained.getRenderMode(); }
// public static Object getRenderMode() { return net.minecraft.block.entity.StructureBoxRendering.getRenderMode(); }
public Object getStructureBox() { return wrapperContained.getStructureBox(); }
// public static Object getStructureBox() { return net.minecraft.block.entity.StructureBoxRendering.getStructureBox(); }

}