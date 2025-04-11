package yarnwrap.structure.processor;
public class StructureProcessorList { public net.minecraft.structure.processor.StructureProcessorList wrapperContained; public StructureProcessorList(net.minecraft.structure.processor.StructureProcessorList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List list() { return wrapperContained.list; }
// public void list(java.util.List value) { wrapperContained.list = value; }
public StructureProcessorList(java.util.List list) { this.wrapperContained = new net.minecraft.structure.processor.StructureProcessorList(list); }
public java.util.List getList() { return wrapperContained.getList(); }

}