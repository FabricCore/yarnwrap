package yarnwrap.client.render.debug;
public class StructureDebugRenderer { public net.minecraft.client.render.debug.StructureDebugRenderer wrapperContained; public StructureDebugRenderer(net.minecraft.client.render.debug.StructureDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RANGE() { return wrapperContained.RANGE; }
// public void RANGE(int value) { wrapperContained.RANGE = value; }
// public static int RANGE() { return net.minecraft.client.render.debug.StructureDebugRenderer.RANGE; }
// public static void RANGE(int value, ) { net.minecraft.client.render.debug.StructureDebugRenderer.RANGE = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.render.debug.StructureDebugRenderer.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.render.debug.StructureDebugRenderer.client = value.wrapperContained; }

// public java.util.Map structureBoundingBoxes() { return wrapperContained.structureBoundingBoxes; }
// public void structureBoundingBoxes(java.util.Map value) { wrapperContained.structureBoundingBoxes = value; }
// public static java.util.Map structureBoundingBoxes() { return net.minecraft.client.render.debug.StructureDebugRenderer.structureBoundingBoxes; }
// public static void structureBoundingBoxes(java.util.Map value, ) { net.minecraft.client.render.debug.StructureDebugRenderer.structureBoundingBoxes = value; }

// public java.util.Map structurePiecesBoundingBoxes() { return wrapperContained.structurePiecesBoundingBoxes; }
// public void structurePiecesBoundingBoxes(java.util.Map value) { wrapperContained.structurePiecesBoundingBoxes = value; }
// public static java.util.Map structurePiecesBoundingBoxes() { return net.minecraft.client.render.debug.StructureDebugRenderer.structurePiecesBoundingBoxes; }
// public static void structurePiecesBoundingBoxes(java.util.Map value, ) { net.minecraft.client.render.debug.StructureDebugRenderer.structurePiecesBoundingBoxes = value; }

public StructureDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.StructureDebugRenderer(client.wrapperContained); }
public void addStructure(yarnwrap.util.math.BlockBox boundingBox,java.util.List pieces,yarnwrap.registry.RegistryKey dimensionKey) { wrapperContained.addStructure(boundingBox.wrapperContained,pieces,dimensionKey.wrapperContained); }
// public static void addStructure(yarnwrap.util.math.BlockBox boundingBox,java.util.List pieces,yarnwrap.registry.RegistryKey dimensionKey, ) { net.minecraft.client.render.debug.StructureDebugRenderer.addStructure(boundingBox.wrapperContained,pieces,dimensionKey.wrapperContained); }
// public java.util.Map method_52842(yarnwrap.registry.RegistryKey dimension) { return wrapperContained.method_52842(dimension.wrapperContained); }
// public static java.util.Map method_52842(yarnwrap.registry.RegistryKey dimension, ) { return net.minecraft.client.render.debug.StructureDebugRenderer.method_52842(dimension.wrapperContained); }
// public java.util.Map method_52843(yarnwrap.registry.RegistryKey dimension) { return wrapperContained.method_52843(dimension.wrapperContained); }
// public static java.util.Map method_52843(yarnwrap.registry.RegistryKey dimension, ) { return net.minecraft.client.render.debug.StructureDebugRenderer.method_52843(dimension.wrapperContained); }

}