package yarnwrap.client.render.entity.model;
public class EndermiteEntityModel { public net.minecraft.client.render.entity.model.EndermiteEntityModel wrapperContained; public EndermiteEntityModel(net.minecraft.client.render.entity.model.EndermiteEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public static yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(net.minecraft.client.render.entity.model.EndermiteEntityModel.root); }
// public static void root(yarnwrap.client.model.ModelPart value, ) { net.minecraft.client.render.entity.model.EndermiteEntityModel.root = value.wrapperContained; }

// public int BODY_SEGMENTS_COUNT() { return wrapperContained.BODY_SEGMENTS_COUNT; }
// public void BODY_SEGMENTS_COUNT(int value) { wrapperContained.BODY_SEGMENTS_COUNT = value; }
// public static int BODY_SEGMENTS_COUNT() { return net.minecraft.client.render.entity.model.EndermiteEntityModel.BODY_SEGMENTS_COUNT; }
// public static void BODY_SEGMENTS_COUNT(int value, ) { net.minecraft.client.render.entity.model.EndermiteEntityModel.BODY_SEGMENTS_COUNT = value; }

// public int[][] SEGMENT_DIMENSIONS() { return wrapperContained.SEGMENT_DIMENSIONS; }
// public void SEGMENT_DIMENSIONS(int[][] value) { wrapperContained.SEGMENT_DIMENSIONS = value; }
// public static int[][] SEGMENT_DIMENSIONS() { return net.minecraft.client.render.entity.model.EndermiteEntityModel.SEGMENT_DIMENSIONS; }
// public static void SEGMENT_DIMENSIONS(int[][] value, ) { net.minecraft.client.render.entity.model.EndermiteEntityModel.SEGMENT_DIMENSIONS = value; }

// public net.minecraft.client.model.ModelPart[] bodySegments() { return wrapperContained.bodySegments; }
// public void bodySegments(net.minecraft.client.model.ModelPart[] value) { wrapperContained.bodySegments = value; }
// public static net.minecraft.client.model.ModelPart[] bodySegments() { return net.minecraft.client.render.entity.model.EndermiteEntityModel.bodySegments; }
// public static void bodySegments(net.minecraft.client.model.ModelPart[] value, ) { net.minecraft.client.render.entity.model.EndermiteEntityModel.bodySegments = value; }

// public int[][] SEGMENT_UVS() { return wrapperContained.SEGMENT_UVS; }
// public void SEGMENT_UVS(int[][] value) { wrapperContained.SEGMENT_UVS = value; }
// public static int[][] SEGMENT_UVS() { return net.minecraft.client.render.entity.model.EndermiteEntityModel.SEGMENT_UVS; }
// public static void SEGMENT_UVS(int[][] value, ) { net.minecraft.client.render.entity.model.EndermiteEntityModel.SEGMENT_UVS = value; }

public EndermiteEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.EndermiteEntityModel(root.wrapperContained); }
// public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
public static yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(net.minecraft.client.render.entity.model.EndermiteEntityModel.getTexturedModelData()); }
// public java.lang.String getSegmentName(int index) { return wrapperContained.getSegmentName(index); }
// public static java.lang.String getSegmentName(int index, ) { return net.minecraft.client.render.entity.model.EndermiteEntityModel.getSegmentName(index); }

}