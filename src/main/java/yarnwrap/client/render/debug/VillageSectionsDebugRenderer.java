package yarnwrap.client.render.debug;
public class VillageSectionsDebugRenderer { public net.minecraft.client.render.debug.VillageSectionsDebugRenderer wrapperContained; public VillageSectionsDebugRenderer(net.minecraft.client.render.debug.VillageSectionsDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set sections() { return wrapperContained.sections; }
// public void sections(java.util.Set value) { wrapperContained.sections = value; }
// public int RANGE() { return wrapperContained.RANGE; }
// public void RANGE(int value) { wrapperContained.RANGE = value; }
public void addSection(yarnwrap.util.math.ChunkSectionPos pos) { wrapperContained.addSection(pos.wrapperContained); }
public void removeSection(yarnwrap.util.math.ChunkSectionPos pos) { wrapperContained.removeSection(pos.wrapperContained); }
// public void drawBoxAtCenterOf(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.ChunkSectionPos sectionPos) { wrapperContained.drawBoxAtCenterOf(matrices.wrapperContained,vertexConsumers.wrapperContained,sectionPos.wrapperContained); }

}