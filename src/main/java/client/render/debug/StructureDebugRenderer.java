package yarnwrap.client.render.debug;
public class StructureDebugRenderer { public net.minecraft.client.render.debug.StructureDebugRenderer wrapperContained; public StructureDebugRenderer(net.minecraft.client.render.debug.StructureDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RANGE() { return wrapperContained.RANGE; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.Map structureBoundingBoxes() { return wrapperContained.structureBoundingBoxes; }
// public java.util.Map structurePiecesBoundingBoxes() { return wrapperContained.structurePiecesBoundingBoxes; }
public void addStructure(yarnwrap.util.math.BlockBox boundingBox,java.util.List pieces,yarnwrap.registry.RegistryKey dimensionKey) { wrapperContained.addStructure(boundingBox.wrapperContained,pieces,dimensionKey.wrapperContained); }

}