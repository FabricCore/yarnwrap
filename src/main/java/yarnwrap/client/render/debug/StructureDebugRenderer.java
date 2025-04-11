package yarnwrap.client.render.debug;
public class StructureDebugRenderer { public net.minecraft.client.render.debug.StructureDebugRenderer wrapperContained; public StructureDebugRenderer(net.minecraft.client.render.debug.StructureDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RANGE() { return wrapperContained.RANGE; }
// public void RANGE(int value) { wrapperContained.RANGE = value; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.Map structureBoundingBoxes() { return wrapperContained.structureBoundingBoxes; }
// public void structureBoundingBoxes(java.util.Map value) { wrapperContained.structureBoundingBoxes = value; }
// public java.util.Map structurePiecesBoundingBoxes() { return wrapperContained.structurePiecesBoundingBoxes; }
// public void structurePiecesBoundingBoxes(java.util.Map value) { wrapperContained.structurePiecesBoundingBoxes = value; }
public void addStructure(yarnwrap.util.math.BlockBox boundingBox,java.util.List pieces,yarnwrap.registry.RegistryKey dimensionKey) { wrapperContained.addStructure(boundingBox.wrapperContained,pieces,dimensionKey.wrapperContained); }

}