package yarnwrap.world;
public class StructureHolder { public net.minecraft.world.StructureHolder wrapperContained; public StructureHolder(net.minecraft.world.StructureHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map getStructureReferences() { return wrapperContained.getStructureReferences(); }
public it.unimi.dsi.fastutil.longs.LongSet getStructureReferences(yarnwrap.world.gen.structure.Structure structure) { return wrapperContained.getStructureReferences(structure.wrapperContained); }
public yarnwrap.structure.StructureStart getStructureStart(yarnwrap.world.gen.structure.Structure structure) { return new yarnwrap.structure.StructureStart(wrapperContained.getStructureStart(structure.wrapperContained)); }
public void addStructureReference(yarnwrap.world.gen.structure.Structure structure,long reference) { wrapperContained.addStructureReference(structure.wrapperContained,reference); }
public void setStructureReferences(java.util.Map structureReferences) { wrapperContained.setStructureReferences(structureReferences); }
public void setStructureStart(yarnwrap.world.gen.structure.Structure structure,yarnwrap.structure.StructureStart start) { wrapperContained.setStructureStart(structure.wrapperContained,start.wrapperContained); }

}