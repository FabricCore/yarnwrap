package yarnwrap.structure.processor;
public class StructureProcessorList { public net.minecraft.structure.processor.StructureProcessorList wrapperContained; public StructureProcessorList(net.minecraft.structure.processor.StructureProcessorList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List list() { return wrapperContained.list; }
public java.util.List getList() { return wrapperContained.getList(); }

}