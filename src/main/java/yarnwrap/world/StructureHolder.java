package yarnwrap.world;
public class StructureHolder { public net.minecraft.world.StructureHolder wrapperContained; public StructureHolder(net.minecraft.world.StructureHolder wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map getStructureReferences() { return wrapperContained.getStructureReferences(); }
// public static java.util.Map getStructureReferences() { return net.minecraft.world.StructureHolder.getStructureReferences(); }
public it.unimi.dsi.fastutil.longs.LongSet getStructureReferences(yarnwrap.world.gen.structure.Structure structure) { return wrapperContained.getStructureReferences(structure.wrapperContained); }
// public static it.unimi.dsi.fastutil.longs.LongSet getStructureReferences(yarnwrap.world.gen.structure.Structure structure, ) { return net.minecraft.world.StructureHolder.getStructureReferences(structure.wrapperContained); }
public yarnwrap.structure.StructureStart getStructureStart(yarnwrap.world.gen.structure.Structure structure) { return new yarnwrap.structure.StructureStart(wrapperContained.getStructureStart(structure.wrapperContained)); }
// public static yarnwrap.structure.StructureStart getStructureStart(yarnwrap.world.gen.structure.Structure structure, ) { return new yarnwrap.structure.StructureStart(net.minecraft.world.StructureHolder.getStructureStart(structure.wrapperContained)); }
public void addStructureReference(yarnwrap.world.gen.structure.Structure structure,long reference) { wrapperContained.addStructureReference(structure.wrapperContained,reference); }
// public static void addStructureReference(yarnwrap.world.gen.structure.Structure structure,long reference, ) { net.minecraft.world.StructureHolder.addStructureReference(structure.wrapperContained,reference); }
public void setStructureReferences(java.util.Map structureReferences) { wrapperContained.setStructureReferences(structureReferences); }
// public static void setStructureReferences(java.util.Map structureReferences, ) { net.minecraft.world.StructureHolder.setStructureReferences(structureReferences); }
public void setStructureStart(yarnwrap.world.gen.structure.Structure structure,yarnwrap.structure.StructureStart start) { wrapperContained.setStructureStart(structure.wrapperContained,start.wrapperContained); }
// public static void setStructureStart(yarnwrap.world.gen.structure.Structure structure,yarnwrap.structure.StructureStart start, ) { net.minecraft.world.StructureHolder.setStructureStart(structure.wrapperContained,start.wrapperContained); }

}