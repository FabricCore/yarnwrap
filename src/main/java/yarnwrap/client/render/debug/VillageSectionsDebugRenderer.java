package yarnwrap.client.render.debug;
public class VillageSectionsDebugRenderer { public net.minecraft.client.render.debug.VillageSectionsDebugRenderer wrapperContained; public VillageSectionsDebugRenderer(net.minecraft.client.render.debug.VillageSectionsDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set sections() { return wrapperContained.sections; }
// public void sections(java.util.Set value) { wrapperContained.sections = value; }
// public static java.util.Set sections() { return net.minecraft.client.render.debug.VillageSectionsDebugRenderer.sections; }
// public static void sections(java.util.Set value, ) { net.minecraft.client.render.debug.VillageSectionsDebugRenderer.sections = value; }

// public int RANGE() { return wrapperContained.RANGE; }
// public void RANGE(int value) { wrapperContained.RANGE = value; }
// public static int RANGE() { return net.minecraft.client.render.debug.VillageSectionsDebugRenderer.RANGE; }
// public static void RANGE(int value, ) { net.minecraft.client.render.debug.VillageSectionsDebugRenderer.RANGE = value; }

public void addSection(yarnwrap.util.math.ChunkSectionPos pos) { wrapperContained.addSection(pos.wrapperContained); }
// public static void addSection(yarnwrap.util.math.ChunkSectionPos pos, ) { net.minecraft.client.render.debug.VillageSectionsDebugRenderer.addSection(pos.wrapperContained); }
public void removeSection(yarnwrap.util.math.ChunkSectionPos pos) { wrapperContained.removeSection(pos.wrapperContained); }
// public static void removeSection(yarnwrap.util.math.ChunkSectionPos pos, ) { net.minecraft.client.render.debug.VillageSectionsDebugRenderer.removeSection(pos.wrapperContained); }
// public void drawBoxAtCenterOf(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.ChunkSectionPos sectionPos) { wrapperContained.drawBoxAtCenterOf(matrices.wrapperContained,vertexConsumers.wrapperContained,sectionPos.wrapperContained); }
// public static void drawBoxAtCenterOf(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.ChunkSectionPos sectionPos, ) { net.minecraft.client.render.debug.VillageSectionsDebugRenderer.drawBoxAtCenterOf(matrices.wrapperContained,vertexConsumers.wrapperContained,sectionPos.wrapperContained); }
// public void method_49049(yarnwrap.util.math.BlockPos section) { wrapperContained.method_49049(section.wrapperContained); }
// public static void method_49049(yarnwrap.util.math.BlockPos section, ) { net.minecraft.client.render.debug.VillageSectionsDebugRenderer.method_49049(section.wrapperContained); }

}